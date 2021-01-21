package com.crm.crmqueue.controller;


import com.crm.crmqueue.config.KafkaSenderExample;
import com.crm.crmqueue.dto.LogNotDelivery;
import com.crm.crmqueue.dto.SaleOrderOnline2;
import com.crm.crmqueue.model.User;
import com.crm.crmqueue.service.IOrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    private KafkaSenderExample sender;
    
    @Autowired
    private IOrderService service;

    @RequestMapping(value = "/api/pushKafka", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public SaleOrderOnline2 sendMessage(@RequestBody SaleOrderOnline2 json) {
    	service.CreateSaleorderOnline(json);
        return json;
        
    }

    @RequestMapping(value = "/api/testUser", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public User lala(@RequestBody User user) {
        return user;
    }
    @RequestMapping(value = "/api/testMapper", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public LogNotDelivery ok(@RequestBody LogNotDelivery logNotDelivery) {
        return logNotDelivery;
    }
}
