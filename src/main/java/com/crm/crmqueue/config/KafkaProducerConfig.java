package com.crm.crmqueue.config;

import java.util.HashMap;
import java.util.Map;

import com.crm.crmqueue.dto.SaleOrderOnline2;
import com.crm.crmqueue.model.User;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import org.springframework.kafka.support.serializer.JsonSerializer;




@EnableKafka
@Configuration
public class KafkaProducerConfig {
	@Bean
	public ProducerFactory<String, SaleOrderOnline2> producerFactory() {
		Map<String, Object> configProps = new HashMap<>();
		configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
		return new DefaultKafkaProducerFactory<>(configProps);
	}
	@Bean
	public ConsumerFactory<String, String> consumerFactory() {
		Map<String, Object> props = new HashMap<>();
		props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		props.put(ConsumerConfig.GROUP_ID_CONFIG, "group-id");
		props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, false);
		props.put(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG, "100");
		props.put(ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG, "15000");
		props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
		return new DefaultKafkaConsumerFactory<>( props);
	}
	public ConsumerFactory<String, User> userConsumerFactory() {
	    Map<String, Object> props = new HashMap<>();
	    props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,  "localhost:9092");
	    props.put(ConsumerConfig.GROUP_ID_CONFIG, "group-id");
	    
	    return new DefaultKafkaConsumerFactory<>(
	      props,
	      new StringDeserializer(),
	      new JsonDeserializer<>(User.class));
	  }
	
	public ConsumerFactory<String, SaleOrderOnline2> saleOnlineConsumerFactory() {
	    Map<String, Object> props = new HashMap<>();
	    props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,  "localhost:9092");
	    props.put(ConsumerConfig.GROUP_ID_CONFIG, "group-id");
	    
	    return new DefaultKafkaConsumerFactory<>(
	      props,
	      new StringDeserializer(),
	      new JsonDeserializer<>(SaleOrderOnline2.class));
	  }


	@Bean
	public KafkaTemplate<String, SaleOrderOnline2> kafkaTemplate() {
		return new KafkaTemplate<>(producerFactory());
	}
	@Bean
	public ConcurrentKafkaListenerContainerFactory<String, String> kafkaListenerContainerFactory() {
		ConcurrentKafkaListenerContainerFactory<String, String> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(consumerFactory());
		factory.setRecordFilterStrategy(record -> record.value().contains("asea"));
		factory.setReplyTemplate(kafkaTemplate());
		return factory;
	}
	 @Bean
	  public ConcurrentKafkaListenerContainerFactory<String, User> userKafkaListenerContainerFactory() {
	    ConcurrentKafkaListenerContainerFactory<String, User> factory =
	      new ConcurrentKafkaListenerContainerFactory<>();
	    factory.setConsumerFactory(userConsumerFactory());
	    return factory;
	  }
	 
	 @Bean
	  public ConcurrentKafkaListenerContainerFactory<String, SaleOrderOnline2> saleKafkaListenerContainerFactory() {
	    ConcurrentKafkaListenerContainerFactory<String, SaleOrderOnline2> factory =
	      new ConcurrentKafkaListenerContainerFactory<>();
	    factory.setConsumerFactory(saleOnlineConsumerFactory());
	    return factory;
	  }
	
}
