package com.javabackend.javabacked.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

//@Component
//public class StartupListener implements ApplicationRunner {
//	   @Autowired
//	    private KafkaTemplate<String, String> kafkaTemplate;
//	    public void sendMessage(String msg) {
//	        kafkaTemplate.send("test", msg);
//	    }
////	    @KafkaListener(topics = "test", groupId = "group-id")
////	    public void listen(String message) {
////	    	MessageDTO newDto = new MessageDTO();
////			newDto.setMessage(message);
////			messageService.save(newDto);
////	    }
////	    @Override
//	    public void run(ApplicationArguments args) throws Exception {
//	    
//	        
//	    }
//}
