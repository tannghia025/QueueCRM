package com.javabackend.javabacked.consumer;

//import org.elasticsearch.client.RestHighLevelClient;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import com.javabackend.javabacked.model.ProductOB;
//import com.javabackend.javabacked.util.ProductHelper;
//
//
//@Component
//public class Consumer {
//	
//	@Autowired
//	RestHighLevelClient client;
//	
//	@Autowired
//	ProductHelper productHelper;
//	
//	@RabbitListener(queues="${jsa.rabbitmq.queue}", containerFactory="jsaFactory")
//    public void recievedMessage(ProductOB productOB) {
//	
//		   System.out.println("==================================\nNhận đơn hàng từ queue: " + productOB);
//		   productHelper.addDocToElastic(client, productOB, "java_fresher_backend");
//		
//		
//     
//
//    }
//}