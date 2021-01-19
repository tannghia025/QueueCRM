package com.javabackend.javabacked.api; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javabackend.javabacked.config.KafkaSenderExample;

import io.swagger.annotations.Api;

@RestController
@Api(value = "KafkaOrder", description = "Đẩy dữ liệu vào kafka")
public class KafkaOrder {
	@Autowired
	private KafkaSenderExample sender;

	
	@GetMapping(value = "/api/pushOrderIntoKafka")
	public String sendMessage(@RequestParam String orderInforBO) {
		
		//alo
		sender.send("DMX", orderInforBO);
		return "Sent to kafka ";
	}
	
	
	


}
