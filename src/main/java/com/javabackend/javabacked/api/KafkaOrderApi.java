package com.javabackend.javabacked.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javabackend.javabacked.config.KafkaSenderExample;
import com.javabackend.javabacked.model.User;

import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@Api(value = "KafkaOrder", description = "Đẩy dữ liệu vào kafxka")
public class KafkaOrderApi {

	@Autowired
	private KafkaSenderExample sender;

	@RequestMapping(value = "/api/pushKafka", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public User sendMessage(@RequestBody User json) {
		System.out.println("test" + json.password);
		sender.send("BHX", 0, "donhang", json);
		return json;
	}


}
