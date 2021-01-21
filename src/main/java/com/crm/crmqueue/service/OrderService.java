package com.crm.crmqueue.service;

import org.springframework.stereotype.Service;

import com.crm.crmqueue.config.LineNotify;
import com.crm.crmqueue.crmbusiness.Utils;
import com.crm.crmqueue.dto.SaleOrderOnline2;
import com.crm.crmqueue.dto.SaleOrderResult;
import com.google.common.base.Strings;

@Service
public class OrderService implements IOrderService {

	@Override
	public SaleOrderOnline2 CreateSaleorderOnline(SaleOrderOnline2 objSaleOrderWeb) {
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
//		infoCustomer(objSaleOrderWeb);

		return null;
	}

//	private void infoCustomer(SaleOrderOnline2 objSaleOrderWeb) {
//		// Chuẩn hóa số Phone
//		objSaleOrderWeb.Phone = objSaleOrderWeb.Phone.trim();
//		objSaleOrderWeb.CONTACTMOBILE = objSaleOrderWeb.CONTACTMOBILE.trim();
//
//		// Kiểm tra hợp lệ
//		if (!Utils.IsValidPhoneNumber(objSaleOrderWeb.Phone, objSaleOrderWeb.GENCOMPANYID))
//			objSaleOrderWeb.Phone = "";
//
//		if (Strings.isNullOrEmpty(objSaleOrderWeb.Phone)) {
//			return InitResultErrorLog(LangHelper.GetText(LangConst.Order.CRM_ORDER_INVALIDPHONE, language), json,
//					"Số điện thoại chưa có hoặc không hợp lệ!", objSaleOrderWeb.GENCOMPANYID);
//		}
//	}
//
//	private static SaleOrderResult InitResultErrorLog(String strMess,
//	            String strOrderJson,
//	            String strTitleLog,
//	            int iGenCompanyID,
//	            bool isRollBackCoupon = true)
//	        {
//
//	            // LineMessage.SendMessage(1, "Lỗi tạo đơn hàng: " + strMess + " - " + strOrderJson);
//
//
//	            SaleOrderResult objSaleOrderResult = new SaleOrderResult();
//	            CRM.LogHelper.LogUtility.Current.AddLog("CreateOrder: " + strTitleLog, strOrderJson, "CRM_FunctionGlobals -> CreateSaleOrder_Obect", "CRMWeb.Services");
//	            objSaleOrderResult.SALEORDERONLINEID = -1;
//	            objSaleOrderResult.MESSSAGE = strMess;
//
//	            return objSaleOrderResult;
//	        }

	public void kiemTraQuanHuyen(SaleOrderOnline2 objSaleOrderWeb) {
		if (objSaleOrderWeb.getDELIVERYTYPEID() == 2 || objSaleOrderWeb.getGENCOMPANYID() == 3) {
			if (objSaleOrderWeb.SHIPSTATE > 0 && objSaleOrderWeb.SHIPCITY > 0) {
				// check từ cache
			}
			if (objSaleOrderWeb.SHIPSTATE > 0 && objSaleOrderWeb.SHIPCITY > 0) {
				// check từ cache
			}

		}
		//Kiểm tra có địa chỉ giao hàng không
		if(objSaleOrderWeb.SHIPCITY > 0&& objSaleOrderWeb.SHIPSTATE <= 0 && objSaleOrderWeb.SHIPWARDID <=0) {
			
			LineNotify.Notify("\"Vui lòng nhập thêm số nhà, tên đường\"");
		}

	}
}
