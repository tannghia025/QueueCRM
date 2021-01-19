package com.javabackend.javabacked.producer;

import com.javabackend.javabacked.model.ProductOB;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


/*
 * @Component public class Producer {
 * 
 * @Autowired private AmqpTemplate amqpTemplate;
 * 
 * @Value("${jsa.rabbitmq.exchange}") private String exchange;
 * 
 * @Value("${jsa.rabbitmq.routingkey}") private String routingkey;
 * 
 * public void produce(ProductOB productOB){
 * amqpTemplate.convertAndSend(exchange, routingkey, productOB); System.out.
 * println("================================\nSend message to Queue = " +
 * productOB); } }
 */