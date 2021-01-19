package com.javabackend.javabacked.consumer;

import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component

public class ConsumerKafka {
	
	
//	@KafkaListener(topics = "topic-1", groupId = "group-id")
//	@KafkaHandler
//	public void listen(String message) {
//		System.out.println("Received Message in group - group-id: " + message);
//	}

//	@KafkaListener(topics = "topic-1",groupId="group-id")
//	@SendTo("topic-2")
//	String listenAndReply(String message) {
//		if(message.startsWith("topic-2")) {
//			String messageSend = message.replace("topic-2", "");
//			System.out.println("Sent to topic-2");
//			return messageSend;
//		}
//		return "";
//		
//	}

}
