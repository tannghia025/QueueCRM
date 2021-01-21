package com.crm.crmqueue.service;

import org.springframework.stereotype.Service;

import com.crm.crmqueue.crmbusiness.Utils;
import com.crm.crmqueue.dto.SaleOrderOnline2;
import com.crm.crmqueue.dto.SaleOrderResult;
import com.google.common.base.Strings;

@Service
public class OrderService implements IOrderService {

	@Override
	public SaleOrderResult CreateSaleorderOnline(SaleOrderOnline2 objSaleOrderWeb) {
		SaleOrderResult objSaleOrderResult = new SaleOrderResult();
		// var json = JsonConvert.SerializeObject(objSaleOrderWeb);
		String keyRedis_phone_program = "Program_" + objSaleOrderWeb.Phone + "_";
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

		// Nếu web truyền sai thì CRM cập nhật lai đúng hình thức giao
		if (objSaleOrderWeb.DELIVERYTYPEID == 101)
			objSaleOrderWeb.DELIVERYTYPEID = 2;
		// hàm kiểm tra thông tin khách hàng
		infoCustomer(objSaleOrderWeb);

		return null;
	}

	private SaleOrderResult infoCustomer(SaleOrderOnline2 objSaleOrderWeb) {
		// Chuẩn hóa số Phone
		objSaleOrderWeb.Phone = objSaleOrderWeb.Phone.trim();
		objSaleOrderWeb.CONTACTMOBILE = objSaleOrderWeb.CONTACTMOBILE.trim();

		// Kiểm tra hợp lệ
		if (!Utils.IsValidPhoneNumber(objSaleOrderWeb.Phone, objSaleOrderWeb.GENCOMPANYID))
			objSaleOrderWeb.Phone = "";

		if (Strings.isNullOrEmpty(objSaleOrderWeb.Phone)) {
			return InitResultErrorLog("Số điện thoại chưa có hoặc không hợp lệ!"); // trả về Obect SaleOrderResult
		}

		// kiểm tra thông tin email
		if (!Strings.isNullOrEmpty(objSaleOrderWeb.Email)) {
			objSaleOrderWeb.Email = objSaleOrderWeb.Email.trim().toLowerCase();
			objSaleOrderWeb.CONTACTEMAIL = objSaleOrderWeb.CONTACTEMAIL.trim().toLowerCase();

			// Kiểm tra Email Hợp lệ
			if (!Utils.validateEmail(objSaleOrderWeb.Email))
				objSaleOrderWeb.Email = "";
		}

		return null;
	}

	private static SaleOrderResult InitResultErrorLog(String strMess) {
		SaleOrderResult objSaleOrderResult = new SaleOrderResult();
		objSaleOrderResult.SALEORDERONLINEID = -1;
		objSaleOrderResult.MESSSAGE = strMess;
		return objSaleOrderResult;
	}
}
