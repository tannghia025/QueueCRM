package com.crm.crmqueue.config;

import com.crm.crmqueue.dto.SaleOrderOnline2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;




@Component
public class KafkaSenderExample {
	@Autowired
	private KafkaTemplate<String, SaleOrderOnline2> kafkaTemplate;

	public void send(String topicName,int partition,String key, SaleOrderOnline2 message) {
		ListenableFuture<SendResult<String,SaleOrderOnline2>> future = kafkaTemplate.send(topicName, partition, key, message);

		future.addCallback(new ListenableFutureCallback<SendResult<String, SaleOrderOnline2>>() {
			@Override
			public void onSuccess(SendResult<String, SaleOrderOnline2> result) {
				System.out.println("offset: "+result.getRecordMetadata().offset());
				System.out.println("partitions: "+result.getRecordMetadata().partition());
				System.out.println("Topic: "+result.getRecordMetadata().topic());
			}
			@Override
			public void onFailure(Throwable ex) {
				System.out.println("offset failed check again ");
			}
		});
	}
}
