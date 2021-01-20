package com.javabackend.javabacked.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
class KafkaTopicConfig {

  @Bean
  public NewTopic topicTGDD() {
    return TopicBuilder.name("TGDD").build();
  }

  @Bean
  public NewTopic topicDMX() {
    return TopicBuilder.name("DMX").build();
  }
  @Bean
  public NewTopic topicBHX() {
    return TopicBuilder.name("BHX").build();
  }

 
}
