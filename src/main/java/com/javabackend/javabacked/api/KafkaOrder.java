package com.javabackend.javabacked.api; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javabackend.javabacked.config.KafkaSenderExample;
import com.javabackend.javabacked.model.MessageDTO;
import com.javabackend.javabacked.service.impl.MessageService;

import io.swagger.annotations.Api;

@RestController
@Api(value = "KafkaOrder", description = "Đẩy dữ liệu vào kafka")
public class KafkaOrder {
	@Autowired
	private KafkaSenderExample sender;
	@Autowired
	private MessageService messageService;	
	
	@PostMapping(value = "/api/kafka/saveSql")
	public MessageDTO save(@RequestParam String message) {
		MessageDTO newDto = new MessageDTO();
		newDto.setMessage(message);
		return messageService.save(newDto);
	}
	
	@PostMapping(value = "/api/kafka/sendMessage")
	public String sendMessage(@RequestParam String message) {
		sender.send("topic-1", message);
		return "Sent to kafka "+message;
	}
	
	
	


}
