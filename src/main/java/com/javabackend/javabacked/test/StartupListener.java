package com.javabackend.javabacked.test;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.javabackend.javabacked.model.MessageDTO;
import com.javabackend.javabacked.service.impl.MessageService;

@Component
public class StartupListener implements ApplicationRunner {
	@Autowired
	private MessageService messageService;	
	   @Autowired
	    private KafkaTemplate<String, String> kafkaTemplate;
	    public void sendMessage(String msg) {
	        kafkaTemplate.send("test", msg);
	    }
//	    @KafkaListener(topics = "test", groupId = "group-id")
//	    public void listen(String message) {
//	    	MessageDTO newDto = new MessageDTO();
//			newDto.setMessage(message);
//			messageService.save(newDto);
//	    }
//	    @Override
	    public void run(ApplicationArguments args) throws Exception {
	    
	        
	    }
}
