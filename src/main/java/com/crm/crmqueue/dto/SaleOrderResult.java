package com.crm.crmqueue.dto;

import java.util.Date;
import java.util.List;

public class SaleOrderResult {
	public int STATUSLOCK;

	private String ERPSALEORDERID;

	public long SALEORDERONLINEID;

	public String MESSSAGE;
	public String CALLTIME;
	public long CUSTOMERID;

	public int TRUSTCUSTOMER;

	public Date CALLBACKTIME;

	public String MESSAGECALLBACKTIME;

	public List<CCUSTOMERGIFT> lstProductGift;
	public List<CRMSaleProgram> ListProgram;

	public boolean IsVipSamsung;

	public int getSTATUSLOCK() {
		return STATUSLOCK;
	}

	public void setSTATUSLOCK(int sTATUSLOCK) {
		STATUSLOCK = sTATUSLOCK;
	}

	public String getERPSALEORDERID() {
		return ERPSALEORDERID;
	}

	public void setERPSALEORDERID(String eRPSALEORDERID) {
		ERPSALEORDERID = eRPSALEORDERID;
	}

	public long getSALEORDERONLINEID() {
		return SALEORDERONLINEID;
	}

	public void setSALEORDERONLINEID(long sALEORDERONLINEID) {
		SALEORDERONLINEID = sALEORDERONLINEID;
	}

	public String getMESSSAGE() {
		return MESSSAGE;
	}

	public void setMESSSAGE(String mESSSAGE) {
		MESSSAGE = mESSSAGE;
	}

	public String getCALLTIME() {
		return CALLTIME;
	}

	public void setCALLTIME(String cALLTIME) {
		CALLTIME = cALLTIME;
	}

	public long getCUSTOMERID() {
		return CUSTOMERID;
	}

	public void setCUSTOMERID(long cUSTOMERID) {
		CUSTOMERID = cUSTOMERID;
	}

	public int getTRUSTCUSTOMER() {
		return TRUSTCUSTOMER;
	}

	public void setTRUSTCUSTOMER(int tRUSTCUSTOMER) {
		TRUSTCUSTOMER = tRUSTCUSTOMER;
	}

	public Date getCALLBACKTIME() {
		return CALLBACKTIME;
	}

	public void setCALLBACKTIME(Date cALLBACKTIME) {
		CALLBACKTIME = cALLBACKTIME;
	}

	public String getMESSAGECALLBACKTIME() {
		return MESSAGECALLBACKTIME;
	}

	public void setMESSAGECALLBACKTIME(String mESSAGECALLBACKTIME) {
		MESSAGECALLBACKTIME = mESSAGECALLBACKTIME;
	}

	public List<CCUSTOMERGIFT> getLstProductGift() {
		return lstProductGift;
	}

	public void setLstProductGift(List<CCUSTOMERGIFT> lstProductGift) {
		this.lstProductGift = lstProductGift;
	}

	public List<CRMSaleProgram> getListProgram() {
		return ListProgram;
	}

	public void setListProgram(List<CRMSaleProgram> listProgram) {
		ListProgram = listProgram;
	}

	public boolean isIsVipSamsung() {
		return IsVipSamsung;
	}

	public void setIsVipSamsung(boolean isVipSamsung) {
		IsVipSamsung = isVipSamsung;
	}
	
	
	
	
	

}
