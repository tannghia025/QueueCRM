package com.javabackend.javabacked.consumer;

import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

import com.javabackend.javabacked.model.User;

@Component

public class ConsumerKafka {
	
	
	@KafkaListener(topics = "BHX", groupId = "group-id", containerFactory="userKafkaListenerContainerFactory")
	@KafkaHandler
	public void listen(User user) {
		System.out.println("Received Message in group - group-id: " + user.password +" username: "+ user.username);
	}

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
