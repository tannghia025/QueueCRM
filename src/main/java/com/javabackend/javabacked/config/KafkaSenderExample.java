package com.javabackend.javabacked.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;


@Component
public class KafkaSenderExample {
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public void send(String topicName,int patition, String message) {
		ListenableFuture<SendResult<String, String>> future = kafkaTemplate.send(topicName, message);

		future.addCallback(new ListenableFutureCallback<SendResult<String, String>>() {
			@Override
			public void onSuccess(SendResult<String, String> result) {
				System.out.println("offset: "+result.getRecordMetadata().offset());
				System.out.println("partitions: "+result.getRecordMetadata().partition());
				System.out.println("Topic: "+result.getRecordMetadata().topic());
				System.out.println("TOpic: "+result.getProducerRecord().topic());
			}

			@Override
			public void onFailure(Throwable ex) {
				System.out.println("offset failed check again ");
			}
		});
	}
}
