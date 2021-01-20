package com.javabackend.javabacked.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

import com.javabackend.javabacked.model.User;


@Component
public class KafkaSenderExample {
	@Autowired
	private KafkaTemplate<String, User> kafkaTemplate;

	public void send(String topicName,int partition,String key, User message) {
		ListenableFuture<SendResult<String,User>> future = kafkaTemplate.send(topicName, partition, key, message);

		future.addCallback(new ListenableFutureCallback<SendResult<String, User>>() {
			@Override
			public void onSuccess(SendResult<String, User> result) {
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
