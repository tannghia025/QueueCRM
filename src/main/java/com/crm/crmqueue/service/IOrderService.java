package com.crm.crmqueue.service;

import com.crm.crmqueue.dto.SaleOrderOnline2;
import com.crm.crmqueue.dto.SaleOrderResult;

public interface IOrderService {
	SaleOrderResult CreateSaleorderOnline(SaleOrderOnline2 online);

}
