package com.crm.crmqueue.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.PartitionOffset;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.crm.crmqueue.dto.SaleOrderOnline2;

@Component
public class KafkaConsumer {

	
	
	//Lấy từ partition 0 -- đơn thường
	
	@KafkaListener(groupId = "group-id", containerFactory = "saleKafkaListenerContainerFactory", topicPartitions = {
			@TopicPartition(topic = "TGDD", partitions = {"0" }),

	})
	
	void listenerTopicTGDD_0(SaleOrderOnline2 saleOnline2) {
		System.out.println("Gói dơn hàng thường: " + saleOnline2);
		
		
		
	}
	
	
	//Lấy từ partition 1 -- đơn ràng buộc
	@KafkaListener(groupId = "group-id", containerFactory = "saleKafkaListenerContainerFactory", topicPartitions = {
			@TopicPartition(topic = "TGDD", partitions = {"1"}),

	})
	void listenerTopicTGDD_1(SaleOrderOnline2 saleOnline2) {
		System.out.println("Gói đơn hàng ràng buộc: " + saleOnline2);
	}
}
