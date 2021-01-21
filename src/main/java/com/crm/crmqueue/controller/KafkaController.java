package com.crm.crmqueue.controller;

import com.crm.crmqueue.config.KafkaSenderExample;
import com.crm.crmqueue.dto.LogNotDelivery;
import com.crm.crmqueue.dto.ProductWeb;
import com.crm.crmqueue.dto.SaleOrderOnline2;
import com.crm.crmqueue.model.User;
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

//Kiểm tra loại đơn hàng rồi đưa vào partition thích hợp
	@RequestMapping(value = "/api/pushKafka", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public SaleOrderOnline2 sendMessage(@RequestBody SaleOrderOnline2 json) {
 
		
		for (ProductWeb productWeb : json.getLstProductWeb()) {
			// check saleProgramID = 0 -- đơn hàng thường
			if (productWeb.getSALEPROGRAMID() == 0) {
				sender.send("TGDD", 0, "donhang", json);
				
			} else {
				//check saleProgramID != 0 -- đơn hàng ràng buộc
				sender.send("TGDD", 1, "donhang", json);

			}
		}
		
		
		return json;
	}


}
