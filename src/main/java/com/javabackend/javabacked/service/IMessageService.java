package com.javabackend.javabacked.service;

import java.util.List;

import com.javabackend.javabacked.model.MessageDTO;

public interface IMessageService {
 public List<MessageDTO> findall();
 public MessageDTO save(MessageDTO dto);
}
