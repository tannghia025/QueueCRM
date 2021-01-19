package com.javabackend.javabacked.mapper;

import org.springframework.stereotype.Component;

import com.javabackend.javabacked.entities.MessageEntity;
import com.javabackend.javabacked.model.MessageDTO;

@Component
public class MessageConvert {

	public MessageEntity toEntity(MessageDTO dto) {
		MessageEntity messageEntity = new MessageEntity();
		messageEntity.setMessage(dto.getMessage());
		return messageEntity;
	}

	public MessageDTO toDto(MessageEntity entity) {
		MessageDTO dto = new MessageDTO();
		dto.setMessage(entity.getMessage());
		return dto;
	}

}
