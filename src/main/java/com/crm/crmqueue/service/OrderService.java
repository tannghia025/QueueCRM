package com.crm.crmqueue.service;

import com.crm.crmqueue.dto.SaleOrderOnline2;

public class OrderService implements IOrderService {

	@Override
	public SaleOrderOnline2 CreateSaleorderOnline(SaleOrderOnline2 online) {
		// var json = JsonConvert.SerializeObject(objSaleOrderWeb);
		String keyRedis_phone_program = "Program_" + online.Phone + "_";
		String keyRedis_programInfo = "GetSaleProgramRedis_";
		long longSaleOrderID = 0;
		long longCustomerID = 0;
		int intERPCreatedByOtherAPPS = 1;
		int intOutputtypeID = 8;
		int intVouchertypeID = 724;
		String strProductName = "";
		int iBookQuantity = 0;
		String strCreateUser = "";
		String strProductIDMaxPrice = "";
//		String lstSaleProgramIDSystem = CRM.ConfigHelper.ConfigRepository.Current
//				.GetStrConfigByDB("lstSaleProgramIDSystem", ",55,954,1175,2409,10728,");
		String strCallbackShowWeb = "";

		return null;
	}

}
