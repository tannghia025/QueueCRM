package com.crm.crmqueue.dto;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SaleOrderOnline2 {
	public long SaleOrderOnlineOld;
	public List<String> lstSMSCoupon;
	public String _CARTTOKEN;
	public int _dayTranfer = 0;
	public int SHIPPACKAGETYPE;
	public int DayTranfer;
	public int _transportTypeID = 0;
	public int TransportTypeID;
	public int _storeChangeOrderTypeID = 0;
	public int StoreChangeOrderTypeID;
	public int _tranferStoreID = 0;
	public int TranferStoreID;
	public int _DeliveryPackage = 0;
	public double LATITUDE;
	public double LNGTITUDE;
	public int DeliveryPackage;
	public String _strVOUCHERCONCERN;
	public String VOUCHERCONCERN;
	public Date dtmDEADTIME;
	public int intPAYMENTONLINESTATUSID = 0;
	public int PAYMENTONLINESTATUSID;
	public String STUDENTID;
	public String SCHOOLNAME;
	public List<ProductWeb> lstProductWeb = new ArrayList<>();
	public List<CCUSTOMERGIFT> lstProductGift;
	public int _STEP = 0;
	public String EMPLOYEENOTE;
	public String SYSTEMLOG;
	public String LstProductCodeSim;
	public boolean IsReviewSimCard = false;
	public Date EXPIREDTIME;
	public int DeviceID;
	public int TYPE;
	public int QUEUETYPE;
	public int IsInsurefee;
	public int ISAUTOTRANFERERP;
	public String CompanyName;
	public String CompanyAddress;
	public String CompanyTaxNo;
	public int COUNTMINUTES = 0;
	public String WEBCAMPAIGN;

	public String _WEBMEDIUM;

	public String WEBMEDIUM;
	public String _WEBKEYWORD;
	public String WEBKEYWORD;
	private int _Priority = -1;

	public int Priority = -1;

	public int ERPOrderTypeID = 0;
	private float fDEALPRICE = 0;

	public float DEALPRICE = 0;

	public int OrderWebTypeID = 1;

	public int intSourceid = 1;

	public Date OUTPRODUCTDATE;
	public boolean IsSubmitBuy = true;
	public boolean IsSendSMS = true;
	public int StatusID = 1;
	public long SALEORDERID;
	public String CreateUser;

	public String CreateFullName;

	public int Sourceid;

	public String Fullname;
	public String Address;
	public String BillAddress;
	public String ShippAddress;

	public String Email;

	public String Phone;

	public String PersonalID;

	public String Note;
	public int Gender = -1;

	public int ContactGender = -1;

	public Date Birthdate = null;
	public String TaxNo;

	public String OrderCode;

	public int StoreID = 1;

	public int CountryID = 2;

	public int ProvinceID = 0;

	public int DistrictID = 0;

	public int Payment = 1;

	public int Delivery = 0;

	public double ShippingCost = 0;

	public int CurrencyUnit = 1;
	double dbCurrencyExchange = 0;

	public double CurrencyExchange = 0;

	public String AccountSecretInfo;

	public String CouponCode;
	public float CouponDiscount;

	public String OWNERBANKNAME;

	public Date EXPIRATIONDATEBANKACC;
	public String OutsideOrderID;

	public int TemporaryProvince = 0;
	int intResidenceProvince = 0;

	public int ResidenceProvince = 0;

	public boolean lISKT3 = false;

	public int ResidentDistrictID = 0;// Ho khau thuong tru

	public String CareeStatusCode;// nghe nghiep khach hang su dung cho don hang tra gop

	long longCompanyPartnerID = 0;// doi tac don hang tra gop

	public long CompanyPartnerID = 0;

	public String SourceOrder;
	public double Price = 0;

	public int Quantity = 0;

	public String SaleOrderNote;

	public double PrepaidAmount = 0;

	public String Productcode;

	public String IMEI;

	public int RepaymentMount = 0;

	private float iPREPAIDPERCENT = 0;// Tra trc %

	public float PREPAIDPERCENT = 0;
	private int iREPAYMENTMONTH = 0;// Tra trong vong may thang

	public int REPAYMENTMONTH = 0;
	// Mỗi tháng trả bao nhiêu tiền
	public float REPAYMENTMONTHAMOUNT = 0;

	public long Companyid = 0;

	public String RepaymentProgramCode;

	public int ProgramID = 0;

	public String SOURCECODE;

	public String CONTACTNAME;

	public String CONTACTMOBILE;

	public String CONTACTEMAIL;
	public int SHIPCITY = 0;
	public int SHIPSTATE = 0;

	public int SHIPWARDID = 0;

	public int REFSALEPROGRAMID = 0;

	public int GENCOMPANYID = 1;
	private int intOuputStoreID = 0;
	public Date TIMEEXPECTDELIVERY;

	public int OUTPUTSTOREID = 0;

	private int intPAYMENTSTATUS = 0;

	public int PAYMENTSTATUS = 0;

	public String TRANSACTIONID;

	public int TRANSACTIONTYPE = 0;

	public String PAYMENTMETHOD;

	public Date LOCALDATE;

	public String ORDERDESC;

	public String CLIENTIP;

	public BigDecimal TOTALPAID;

	public BigDecimal DISCOUNT;
	public int DISCOUNTREASONID;

	public List<CRMSOPROMOTIONDISCOUNT> LstPromotionOrder = null;
	public List<CRMSOPROMOTIONDISCOUNT> lstPromotionDiscout = null;
	public List<CRMSOWEBCOUPONDISCOUNT> lstWebCoupon = null;
	public List<CRMSOGIFTVOUCHERISSUE> lstGiftVoucher = null;

	public String ProcessUser;

	public boolean IsNotify = false;

	public int DELIVERYTYPEID = 0;
	// public String UserNote { get; set; }

	public String STAFFUSER;

	public String STAFFUSERNOTE;

	public int STAFFSTATUSID = 0;

	public String PERSONALIDHOUSE;

	private int intAIRTIMETRANSACTIONTYPEID = 0;

	public int CONFIRMSMS = 0;

	public int AIRTIMETRANSACTIONTYPEID = 0;

	/// <summary>
	/// Lãi suất thực
	/// </summary>
	public BigDecimal REALINTERESTRATE;

	/// <summary>
	/// Lãi suất phẳng
	/// </summary>
	public BigDecimal FLATINTERESTRATE;

	/// <summary>
	/// Phí thu hộ
	/// </summary>
	public BigDecimal COLLECTIONFEE;

	/// <summary>
	/// Phí bảo hiểm
	/// </summary>
	public BigDecimal INSUREFEE;

	/// <summary>
	/// Mã giấy tờ
	/// </summary>
	public int PAPERSTYPEID;

	/// <summary>
	/// Phí giấy tờ
	/// </summary>
	public BigDecimal PAPERFEE;

	/// <summary>
	///
	/// </summary>
	public int ISCONFIRM;

	public String GUARANTEEPHONE;
	/// <summary>
	/// Số điện thoại người thân
	/// </summary>
	public String RELATIVEPHONE;
	public long ACCOUNTVUIVUIID;

	public long SHIPADDRESSID;

	public int ISGETPROMOTIONSALEORDER;
	//public EWorking.CRM.CRM.CRMSOONLINEINSTALLMENTINFO INSTALLMENTINFO;
	public String CARTTOKEN;

	public int PayableTypeID;

	public List<MemberPointDetailVV> ListMemberPointDetailVV;
	public int CustomerProvinceID;
	public int CustomerDistrictID;
	public String CustomerAddress;
	public int StorePreview;
	public String Accessories;

	public LogNotDelivery[] ListLogNotDelivery;

	public int IsCheckCouponERP;
	public int OriginateStoreID;
	public int DifferenceAmount;
	public long getSaleOrderOnlineOld() {
		return SaleOrderOnlineOld;
	}
	public void setSaleOrderOnlineOld(long saleOrderOnlineOld) {
		SaleOrderOnlineOld = saleOrderOnlineOld;
	}
	public List<String> getLstSMSCoupon() {
		return lstSMSCoupon;
	}
	public void setLstSMSCoupon(List<String> lstSMSCoupon) {
		this.lstSMSCoupon = lstSMSCoupon;
	}
	public String get_CARTTOKEN() {
		return _CARTTOKEN;
	}
	public void set_CARTTOKEN(String _CARTTOKEN) {
		this._CARTTOKEN = _CARTTOKEN;
	}
	public int get_dayTranfer() {
		return _dayTranfer;
	}
	public void set_dayTranfer(int _dayTranfer) {
		this._dayTranfer = _dayTranfer;
	}
	public int getSHIPPACKAGETYPE() {
		return SHIPPACKAGETYPE;
	}
	public void setSHIPPACKAGETYPE(int sHIPPACKAGETYPE) {
		SHIPPACKAGETYPE = sHIPPACKAGETYPE;
	}
	public int getDayTranfer() {
		return DayTranfer;
	}
	public void setDayTranfer(int dayTranfer) {
		DayTranfer = dayTranfer;
	}
	public int get_transportTypeID() {
		return _transportTypeID;
	}
	public void set_transportTypeID(int _transportTypeID) {
		this._transportTypeID = _transportTypeID;
	}
	public int getTransportTypeID() {
		return TransportTypeID;
	}
	public void setTransportTypeID(int transportTypeID) {
		TransportTypeID = transportTypeID;
	}
	public int get_storeChangeOrderTypeID() {
		return _storeChangeOrderTypeID;
	}
	public void set_storeChangeOrderTypeID(int _storeChangeOrderTypeID) {
		this._storeChangeOrderTypeID = _storeChangeOrderTypeID;
	}
	public int getStoreChangeOrderTypeID() {
		return StoreChangeOrderTypeID;
	}
	public void setStoreChangeOrderTypeID(int storeChangeOrderTypeID) {
		StoreChangeOrderTypeID = storeChangeOrderTypeID;
	}
	public int get_tranferStoreID() {
		return _tranferStoreID;
	}
	public void set_tranferStoreID(int _tranferStoreID) {
		this._tranferStoreID = _tranferStoreID;
	}
	public int getTranferStoreID() {
		return TranferStoreID;
	}
	public void setTranferStoreID(int tranferStoreID) {
		TranferStoreID = tranferStoreID;
	}
	public int get_DeliveryPackage() {
		return _DeliveryPackage;
	}
	public void set_DeliveryPackage(int _DeliveryPackage) {
		this._DeliveryPackage = _DeliveryPackage;
	}
	public double getLATITUDE() {
		return LATITUDE;
	}
	public void setLATITUDE(double lATITUDE) {
		LATITUDE = lATITUDE;
	}
	public double getLNGTITUDE() {
		return LNGTITUDE;
	}
	public void setLNGTITUDE(double lNGTITUDE) {
		LNGTITUDE = lNGTITUDE;
	}
	public int getDeliveryPackage() {
		return DeliveryPackage;
	}
	public void setDeliveryPackage(int deliveryPackage) {
		DeliveryPackage = deliveryPackage;
	}
	public String get_strVOUCHERCONCERN() {
		return _strVOUCHERCONCERN;
	}
	public void set_strVOUCHERCONCERN(String _strVOUCHERCONCERN) {
		this._strVOUCHERCONCERN = _strVOUCHERCONCERN;
	}
	public String getVOUCHERCONCERN() {
		return VOUCHERCONCERN;
	}
	public void setVOUCHERCONCERN(String vOUCHERCONCERN) {
		VOUCHERCONCERN = vOUCHERCONCERN;
	}
	public Date getDtmDEADTIME() {
		return dtmDEADTIME;
	}
	public void setDtmDEADTIME(Date dtmDEADTIME) {
		this.dtmDEADTIME = dtmDEADTIME;
	}
	public int getIntPAYMENTONLINESTATUSID() {
		return intPAYMENTONLINESTATUSID;
	}
	public void setIntPAYMENTONLINESTATUSID(int intPAYMENTONLINESTATUSID) {
		this.intPAYMENTONLINESTATUSID = intPAYMENTONLINESTATUSID;
	}
	public int getPAYMENTONLINESTATUSID() {
		return PAYMENTONLINESTATUSID;
	}
	public void setPAYMENTONLINESTATUSID(int pAYMENTONLINESTATUSID) {
		PAYMENTONLINESTATUSID = pAYMENTONLINESTATUSID;
	}
	public String getSTUDENTID() {
		return STUDENTID;
	}
	public void setSTUDENTID(String sTUDENTID) {
		STUDENTID = sTUDENTID;
	}
	public String getSCHOOLNAME() {
		return SCHOOLNAME;
	}
	public void setSCHOOLNAME(String sCHOOLNAME) {
		SCHOOLNAME = sCHOOLNAME;
	}
	public List<ProductWeb> getLstProductWeb() {
		return lstProductWeb;
	}
	public void setLstProductWeb(List<ProductWeb> lstProductWeb) {
		this.lstProductWeb = lstProductWeb;
	}
	public List<CCUSTOMERGIFT> getLstProductGift() {
		return lstProductGift;
	}
	public void setLstProductGift(List<CCUSTOMERGIFT> lstProductGift) {
		this.lstProductGift = lstProductGift;
	}
	public int get_STEP() {
		return _STEP;
	}
	public void set_STEP(int _STEP) {
		this._STEP = _STEP;
	}
	public String getEMPLOYEENOTE() {
		return EMPLOYEENOTE;
	}
	public void setEMPLOYEENOTE(String eMPLOYEENOTE) {
		EMPLOYEENOTE = eMPLOYEENOTE;
	}
	public String getSYSTEMLOG() {
		return SYSTEMLOG;
	}
	public void setSYSTEMLOG(String sYSTEMLOG) {
		SYSTEMLOG = sYSTEMLOG;
	}
	public String getLstProductCodeSim() {
		return LstProductCodeSim;
	}
	public void setLstProductCodeSim(String lstProductCodeSim) {
		LstProductCodeSim = lstProductCodeSim;
	}
	public boolean isIsReviewSimCard() {
		return IsReviewSimCard;
	}
	public void setIsReviewSimCard(boolean isReviewSimCard) {
		IsReviewSimCard = isReviewSimCard;
	}
	public Date getEXPIREDTIME() {
		return EXPIREDTIME;
	}
	public void setEXPIREDTIME(Date eXPIREDTIME) {
		EXPIREDTIME = eXPIREDTIME;
	}
	public int getDeviceID() {
		return DeviceID;
	}
	public void setDeviceID(int deviceID) {
		DeviceID = deviceID;
	}
	public int getTYPE() {
		return TYPE;
	}
	public void setTYPE(int tYPE) {
		TYPE = tYPE;
	}
	public int getQUEUETYPE() {
		return QUEUETYPE;
	}
	public void setQUEUETYPE(int qUEUETYPE) {
		QUEUETYPE = qUEUETYPE;
	}
	public int getIsInsurefee() {
		return IsInsurefee;
	}
	public void setIsInsurefee(int isInsurefee) {
		IsInsurefee = isInsurefee;
	}
	public int getISAUTOTRANFERERP() {
		return ISAUTOTRANFERERP;
	}
	public void setISAUTOTRANFERERP(int iSAUTOTRANFERERP) {
		ISAUTOTRANFERERP = iSAUTOTRANFERERP;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public String getCompanyAddress() {
		return CompanyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		CompanyAddress = companyAddress;
	}
	public String getCompanyTaxNo() {
		return CompanyTaxNo;
	}
	public void setCompanyTaxNo(String companyTaxNo) {
		CompanyTaxNo = companyTaxNo;
	}
	public int getCOUNTMINUTES() {
		return COUNTMINUTES;
	}
	public void setCOUNTMINUTES(int cOUNTMINUTES) {
		COUNTMINUTES = cOUNTMINUTES;
	}
	public String getWEBCAMPAIGN() {
		return WEBCAMPAIGN;
	}
	public void setWEBCAMPAIGN(String wEBCAMPAIGN) {
		WEBCAMPAIGN = wEBCAMPAIGN;
	}
	public String get_WEBMEDIUM() {
		return _WEBMEDIUM;
	}
	public void set_WEBMEDIUM(String _WEBMEDIUM) {
		this._WEBMEDIUM = _WEBMEDIUM;
	}
	public String getWEBMEDIUM() {
		return WEBMEDIUM;
	}
	public void setWEBMEDIUM(String wEBMEDIUM) {
		WEBMEDIUM = wEBMEDIUM;
	}
	public String get_WEBKEYWORD() {
		return _WEBKEYWORD;
	}
	public void set_WEBKEYWORD(String _WEBKEYWORD) {
		this._WEBKEYWORD = _WEBKEYWORD;
	}
	public String getWEBKEYWORD() {
		return WEBKEYWORD;
	}
	public void setWEBKEYWORD(String wEBKEYWORD) {
		WEBKEYWORD = wEBKEYWORD;
	}
	public int get_Priority() {
		return _Priority;
	}
	public void set_Priority(int _Priority) {
		this._Priority = _Priority;
	}
	public int getPriority() {
		return Priority;
	}
	public void setPriority(int priority) {
		Priority = priority;
	}
	public int getERPOrderTypeID() {
		return ERPOrderTypeID;
	}
	public void setERPOrderTypeID(int eRPOrderTypeID) {
		ERPOrderTypeID = eRPOrderTypeID;
	}
	public float getfDEALPRICE() {
		return fDEALPRICE;
	}
	public void setfDEALPRICE(float fDEALPRICE) {
		this.fDEALPRICE = fDEALPRICE;
	}
	public float getDEALPRICE() {
		return DEALPRICE;
	}
	public void setDEALPRICE(float dEALPRICE) {
		DEALPRICE = dEALPRICE;
	}
	public int getOrderWebTypeID() {
		return OrderWebTypeID;
	}
	public void setOrderWebTypeID(int orderWebTypeID) {
		OrderWebTypeID = orderWebTypeID;
	}
	public int getIntSourceid() {
		return intSourceid;
	}
	public void setIntSourceid(int intSourceid) {
		this.intSourceid = intSourceid;
	}
	public Date getOUTPRODUCTDATE() {
		return OUTPRODUCTDATE;
	}
	public void setOUTPRODUCTDATE(Date oUTPRODUCTDATE) {
		OUTPRODUCTDATE = oUTPRODUCTDATE;
	}
	public boolean isIsSubmitBuy() {
		return IsSubmitBuy;
	}
	public void setIsSubmitBuy(boolean isSubmitBuy) {
		IsSubmitBuy = isSubmitBuy;
	}
	public boolean isIsSendSMS() {
		return IsSendSMS;
	}
	public void setIsSendSMS(boolean isSendSMS) {
		IsSendSMS = isSendSMS;
	}
	public int getStatusID() {
		return StatusID;
	}
	public void setStatusID(int statusID) {
		StatusID = statusID;
	}
	public long getSALEORDERID() {
		return SALEORDERID;
	}
	public void setSALEORDERID(long sALEORDERID) {
		SALEORDERID = sALEORDERID;
	}
	public String getCreateUser() {
		return CreateUser;
	}
	public void setCreateUser(String createUser) {
		CreateUser = createUser;
	}
	public String getCreateFullName() {
		return CreateFullName;
	}
	public void setCreateFullName(String createFullName) {
		CreateFullName = createFullName;
	}
	public int getSourceid() {
		return Sourceid;
	}
	public void setSourceid(int sourceid) {
		Sourceid = sourceid;
	}
	public String getFullname() {
		return Fullname;
	}
	public void setFullname(String fullname) {
		Fullname = fullname;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getBillAddress() {
		return BillAddress;
	}
	public void setBillAddress(String billAddress) {
		BillAddress = billAddress;
	}
	public String getShippAddress() {
		return ShippAddress;
	}
	public void setShippAddress(String shippAddress) {
		ShippAddress = shippAddress;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getPersonalID() {
		return PersonalID;
	}
	public void setPersonalID(String personalID) {
		PersonalID = personalID;
	}
	public String getNote() {
		return Note;
	}
	public void setNote(String note) {
		Note = note;
	}
	public int getGender() {
		return Gender;
	}
	public void setGender(int gender) {
		Gender = gender;
	}
	public int getContactGender() {
		return ContactGender;
	}
	public void setContactGender(int contactGender) {
		ContactGender = contactGender;
	}
	public Date getBirthdate() {
		return Birthdate;
	}
	public void setBirthdate(Date birthdate) {
		Birthdate = birthdate;
	}
	public String getTaxNo() {
		return TaxNo;
	}
	public void setTaxNo(String taxNo) {
		TaxNo = taxNo;
	}
	public String getOrderCode() {
		return OrderCode;
	}
	public void setOrderCode(String orderCode) {
		OrderCode = orderCode;
	}
	public int getStoreID() {
		return StoreID;
	}
	public void setStoreID(int storeID) {
		StoreID = storeID;
	}
	public int getCountryID() {
		return CountryID;
	}
	public void setCountryID(int countryID) {
		CountryID = countryID;
	}
	public int getProvinceID() {
		return ProvinceID;
	}
	public void setProvinceID(int provinceID) {
		ProvinceID = provinceID;
	}
	public int getDistrictID() {
		return DistrictID;
	}
	public void setDistrictID(int districtID) {
		DistrictID = districtID;
	}
	public int getPayment() {
		return Payment;
	}
	public void setPayment(int payment) {
		Payment = payment;
	}
	public int getDelivery() {
		return Delivery;
	}
	public void setDelivery(int delivery) {
		Delivery = delivery;
	}
	public double getShippingCost() {
		return ShippingCost;
	}
	public void setShippingCost(double shippingCost) {
		ShippingCost = shippingCost;
	}
	public int getCurrencyUnit() {
		return CurrencyUnit;
	}
	public void setCurrencyUnit(int currencyUnit) {
		CurrencyUnit = currencyUnit;
	}
	public double getDbCurrencyExchange() {
		return dbCurrencyExchange;
	}
	public void setDbCurrencyExchange(double dbCurrencyExchange) {
		this.dbCurrencyExchange = dbCurrencyExchange;
	}
	public double getCurrencyExchange() {
		return CurrencyExchange;
	}
	public void setCurrencyExchange(double currencyExchange) {
		CurrencyExchange = currencyExchange;
	}
	public String getAccountSecretInfo() {
		return AccountSecretInfo;
	}
	public void setAccountSecretInfo(String accountSecretInfo) {
		AccountSecretInfo = accountSecretInfo;
	}
	public String getCouponCode() {
		return CouponCode;
	}
	public void setCouponCode(String couponCode) {
		CouponCode = couponCode;
	}
	public float getCouponDiscount() {
		return CouponDiscount;
	}
	public void setCouponDiscount(float couponDiscount) {
		CouponDiscount = couponDiscount;
	}
	public String getOWNERBANKNAME() {
		return OWNERBANKNAME;
	}
	public void setOWNERBANKNAME(String oWNERBANKNAME) {
		OWNERBANKNAME = oWNERBANKNAME;
	}
	public Date getEXPIRATIONDATEBANKACC() {
		return EXPIRATIONDATEBANKACC;
	}
	public void setEXPIRATIONDATEBANKACC(Date eXPIRATIONDATEBANKACC) {
		EXPIRATIONDATEBANKACC = eXPIRATIONDATEBANKACC;
	}
	public String getOutsideOrderID() {
		return OutsideOrderID;
	}
	public void setOutsideOrderID(String outsideOrderID) {
		OutsideOrderID = outsideOrderID;
	}
	public int getTemporaryProvince() {
		return TemporaryProvince;
	}
	public void setTemporaryProvince(int temporaryProvince) {
		TemporaryProvince = temporaryProvince;
	}
	public int getIntResidenceProvince() {
		return intResidenceProvince;
	}
	public void setIntResidenceProvince(int intResidenceProvince) {
		this.intResidenceProvince = intResidenceProvince;
	}
	public int getResidenceProvince() {
		return ResidenceProvince;
	}
	public void setResidenceProvince(int residenceProvince) {
		ResidenceProvince = residenceProvince;
	}
	public boolean islISKT3() {
		return lISKT3;
	}
	public void setlISKT3(boolean lISKT3) {
		this.lISKT3 = lISKT3;
	}
	public int getResidentDistrictID() {
		return ResidentDistrictID;
	}
	public void setResidentDistrictID(int residentDistrictID) {
		ResidentDistrictID = residentDistrictID;
	}
	public String getCareeStatusCode() {
		return CareeStatusCode;
	}
	public void setCareeStatusCode(String careeStatusCode) {
		CareeStatusCode = careeStatusCode;
	}
	public long getLongCompanyPartnerID() {
		return longCompanyPartnerID;
	}
	public void setLongCompanyPartnerID(long longCompanyPartnerID) {
		this.longCompanyPartnerID = longCompanyPartnerID;
	}
	public long getCompanyPartnerID() {
		return CompanyPartnerID;
	}
	public void setCompanyPartnerID(long companyPartnerID) {
		CompanyPartnerID = companyPartnerID;
	}
	public String getSourceOrder() {
		return SourceOrder;
	}
	public void setSourceOrder(String sourceOrder) {
		SourceOrder = sourceOrder;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public String getSaleOrderNote() {
		return SaleOrderNote;
	}
	public void setSaleOrderNote(String saleOrderNote) {
		SaleOrderNote = saleOrderNote;
	}
	public double getPrepaidAmount() {
		return PrepaidAmount;
	}
	public void setPrepaidAmount(double prepaidAmount) {
		PrepaidAmount = prepaidAmount;
	}
	public String getProductcode() {
		return Productcode;
	}
	public void setProductcode(String productcode) {
		Productcode = productcode;
	}
	public String getIMEI() {
		return IMEI;
	}
	public void setIMEI(String iMEI) {
		IMEI = iMEI;
	}
	public int getRepaymentMount() {
		return RepaymentMount;
	}
	public void setRepaymentMount(int repaymentMount) {
		RepaymentMount = repaymentMount;
	}
	public float getiPREPAIDPERCENT() {
		return iPREPAIDPERCENT;
	}
	public void setiPREPAIDPERCENT(float iPREPAIDPERCENT) {
		this.iPREPAIDPERCENT = iPREPAIDPERCENT;
	}
	public float getPREPAIDPERCENT() {
		return PREPAIDPERCENT;
	}
	public void setPREPAIDPERCENT(float pREPAIDPERCENT) {
		PREPAIDPERCENT = pREPAIDPERCENT;
	}
	public int getiREPAYMENTMONTH() {
		return iREPAYMENTMONTH;
	}
	public void setiREPAYMENTMONTH(int iREPAYMENTMONTH) {
		this.iREPAYMENTMONTH = iREPAYMENTMONTH;
	}
	public int getREPAYMENTMONTH() {
		return REPAYMENTMONTH;
	}
	public void setREPAYMENTMONTH(int rEPAYMENTMONTH) {
		REPAYMENTMONTH = rEPAYMENTMONTH;
	}
	public float getREPAYMENTMONTHAMOUNT() {
		return REPAYMENTMONTHAMOUNT;
	}
	public void setREPAYMENTMONTHAMOUNT(float rEPAYMENTMONTHAMOUNT) {
		REPAYMENTMONTHAMOUNT = rEPAYMENTMONTHAMOUNT;
	}
	public long getCompanyid() {
		return Companyid;
	}
	public void setCompanyid(long companyid) {
		Companyid = companyid;
	}
	public String getRepaymentProgramCode() {
		return RepaymentProgramCode;
	}
	public void setRepaymentProgramCode(String repaymentProgramCode) {
		RepaymentProgramCode = repaymentProgramCode;
	}
	public int getProgramID() {
		return ProgramID;
	}
	public void setProgramID(int programID) {
		ProgramID = programID;
	}
	public String getSOURCECODE() {
		return SOURCECODE;
	}
	public void setSOURCECODE(String sOURCECODE) {
		SOURCECODE = sOURCECODE;
	}
	public String getCONTACTNAME() {
		return CONTACTNAME;
	}
	public void setCONTACTNAME(String cONTACTNAME) {
		CONTACTNAME = cONTACTNAME;
	}
	public String getCONTACTMOBILE() {
		return CONTACTMOBILE;
	}
	public void setCONTACTMOBILE(String cONTACTMOBILE) {
		CONTACTMOBILE = cONTACTMOBILE;
	}
	public String getCONTACTEMAIL() {
		return CONTACTEMAIL;
	}
	public void setCONTACTEMAIL(String cONTACTEMAIL) {
		CONTACTEMAIL = cONTACTEMAIL;
	}
	public int getSHIPCITY() {
		return SHIPCITY;
	}
	public void setSHIPCITY(int sHIPCITY) {
		SHIPCITY = sHIPCITY;
	}
	public int getSHIPSTATE() {
		return SHIPSTATE;
	}
	public void setSHIPSTATE(int sHIPSTATE) {
		SHIPSTATE = sHIPSTATE;
	}
	public int getSHIPWARDID() {
		return SHIPWARDID;
	}
	public void setSHIPWARDID(int sHIPWARDID) {
		SHIPWARDID = sHIPWARDID;
	}
	public int getREFSALEPROGRAMID() {
		return REFSALEPROGRAMID;
	}
	public void setREFSALEPROGRAMID(int rEFSALEPROGRAMID) {
		REFSALEPROGRAMID = rEFSALEPROGRAMID;
	}
	public int getGENCOMPANYID() {
		return GENCOMPANYID;
	}
	public void setGENCOMPANYID(int gENCOMPANYID) {
		GENCOMPANYID = gENCOMPANYID;
	}
	public int getIntOuputStoreID() {
		return intOuputStoreID;
	}
	public void setIntOuputStoreID(int intOuputStoreID) {
		this.intOuputStoreID = intOuputStoreID;
	}
	public Date getTIMEEXPECTDELIVERY() {
		return TIMEEXPECTDELIVERY;
	}
	public void setTIMEEXPECTDELIVERY(Date tIMEEXPECTDELIVERY) {
		TIMEEXPECTDELIVERY = tIMEEXPECTDELIVERY;
	}
	public int getOUTPUTSTOREID() {
		return OUTPUTSTOREID;
	}
	public void setOUTPUTSTOREID(int oUTPUTSTOREID) {
		OUTPUTSTOREID = oUTPUTSTOREID;
	}
	public int getIntPAYMENTSTATUS() {
		return intPAYMENTSTATUS;
	}
	public void setIntPAYMENTSTATUS(int intPAYMENTSTATUS) {
		this.intPAYMENTSTATUS = intPAYMENTSTATUS;
	}
	public int getPAYMENTSTATUS() {
		return PAYMENTSTATUS;
	}
	public void setPAYMENTSTATUS(int pAYMENTSTATUS) {
		PAYMENTSTATUS = pAYMENTSTATUS;
	}
	public String getTRANSACTIONID() {
		return TRANSACTIONID;
	}
	public void setTRANSACTIONID(String tRANSACTIONID) {
		TRANSACTIONID = tRANSACTIONID;
	}
	public int getTRANSACTIONTYPE() {
		return TRANSACTIONTYPE;
	}
	public void setTRANSACTIONTYPE(int tRANSACTIONTYPE) {
		TRANSACTIONTYPE = tRANSACTIONTYPE;
	}
	public String getPAYMENTMETHOD() {
		return PAYMENTMETHOD;
	}
	public void setPAYMENTMETHOD(String pAYMENTMETHOD) {
		PAYMENTMETHOD = pAYMENTMETHOD;
	}
	public Date getLOCALDATE() {
		return LOCALDATE;
	}
	public void setLOCALDATE(Date lOCALDATE) {
		LOCALDATE = lOCALDATE;
	}
	public String getORDERDESC() {
		return ORDERDESC;
	}
	public void setORDERDESC(String oRDERDESC) {
		ORDERDESC = oRDERDESC;
	}
	public String getCLIENTIP() {
		return CLIENTIP;
	}
	public void setCLIENTIP(String cLIENTIP) {
		CLIENTIP = cLIENTIP;
	}
	public BigDecimal getTOTALPAID() {
		return TOTALPAID;
	}
	public void setTOTALPAID(BigDecimal tOTALPAID) {
		TOTALPAID = tOTALPAID;
	}
	public BigDecimal getDISCOUNT() {
		return DISCOUNT;
	}
	public void setDISCOUNT(BigDecimal dISCOUNT) {
		DISCOUNT = dISCOUNT;
	}
	public int getDISCOUNTREASONID() {
		return DISCOUNTREASONID;
	}
	public void setDISCOUNTREASONID(int dISCOUNTREASONID) {
		DISCOUNTREASONID = dISCOUNTREASONID;
	}
	public List<CRMSOPROMOTIONDISCOUNT> getLstPromotionOrder() {
		return LstPromotionOrder;
	}
	public void setLstPromotionOrder(List<CRMSOPROMOTIONDISCOUNT> lstPromotionOrder) {
		LstPromotionOrder = lstPromotionOrder;
	}
	public List<CRMSOPROMOTIONDISCOUNT> getLstPromotionDiscout() {
		return lstPromotionDiscout;
	}
	public void setLstPromotionDiscout(List<CRMSOPROMOTIONDISCOUNT> lstPromotionDiscout) {
		this.lstPromotionDiscout = lstPromotionDiscout;
	}
	public List<CRMSOWEBCOUPONDISCOUNT> getLstWebCoupon() {
		return lstWebCoupon;
	}
	public void setLstWebCoupon(List<CRMSOWEBCOUPONDISCOUNT> lstWebCoupon) {
		this.lstWebCoupon = lstWebCoupon;
	}
	public List<CRMSOGIFTVOUCHERISSUE> getLstGiftVoucher() {
		return lstGiftVoucher;
	}
	public void setLstGiftVoucher(List<CRMSOGIFTVOUCHERISSUE> lstGiftVoucher) {
		this.lstGiftVoucher = lstGiftVoucher;
	}
	public String getProcessUser() {
		return ProcessUser;
	}
	public void setProcessUser(String processUser) {
		ProcessUser = processUser;
	}
	public boolean isIsNotify() {
		return IsNotify;
	}
	public void setIsNotify(boolean isNotify) {
		IsNotify = isNotify;
	}
	public int getDELIVERYTYPEID() {
		return DELIVERYTYPEID;
	}
	public void setDELIVERYTYPEID(int dELIVERYTYPEID) {
		DELIVERYTYPEID = dELIVERYTYPEID;
	}
	public String getSTAFFUSER() {
		return STAFFUSER;
	}
	public void setSTAFFUSER(String sTAFFUSER) {
		STAFFUSER = sTAFFUSER;
	}
	public String getSTAFFUSERNOTE() {
		return STAFFUSERNOTE;
	}
	public void setSTAFFUSERNOTE(String sTAFFUSERNOTE) {
		STAFFUSERNOTE = sTAFFUSERNOTE;
	}
	public int getSTAFFSTATUSID() {
		return STAFFSTATUSID;
	}
	public void setSTAFFSTATUSID(int sTAFFSTATUSID) {
		STAFFSTATUSID = sTAFFSTATUSID;
	}
	public String getPERSONALIDHOUSE() {
		return PERSONALIDHOUSE;
	}
	public void setPERSONALIDHOUSE(String pERSONALIDHOUSE) {
		PERSONALIDHOUSE = pERSONALIDHOUSE;
	}
	public int getIntAIRTIMETRANSACTIONTYPEID() {
		return intAIRTIMETRANSACTIONTYPEID;
	}
	public void setIntAIRTIMETRANSACTIONTYPEID(int intAIRTIMETRANSACTIONTYPEID) {
		this.intAIRTIMETRANSACTIONTYPEID = intAIRTIMETRANSACTIONTYPEID;
	}
	public int getCONFIRMSMS() {
		return CONFIRMSMS;
	}
	public void setCONFIRMSMS(int cONFIRMSMS) {
		CONFIRMSMS = cONFIRMSMS;
	}
	public int getAIRTIMETRANSACTIONTYPEID() {
		return AIRTIMETRANSACTIONTYPEID;
	}
	public void setAIRTIMETRANSACTIONTYPEID(int aIRTIMETRANSACTIONTYPEID) {
		AIRTIMETRANSACTIONTYPEID = aIRTIMETRANSACTIONTYPEID;
	}
	public BigDecimal getREALINTERESTRATE() {
		return REALINTERESTRATE;
	}
	public void setREALINTERESTRATE(BigDecimal rEALINTERESTRATE) {
		REALINTERESTRATE = rEALINTERESTRATE;
	}
	public BigDecimal getFLATINTERESTRATE() {
		return FLATINTERESTRATE;
	}
	public void setFLATINTERESTRATE(BigDecimal fLATINTERESTRATE) {
		FLATINTERESTRATE = fLATINTERESTRATE;
	}
	public BigDecimal getCOLLECTIONFEE() {
		return COLLECTIONFEE;
	}
	public void setCOLLECTIONFEE(BigDecimal cOLLECTIONFEE) {
		COLLECTIONFEE = cOLLECTIONFEE;
	}
	public BigDecimal getINSUREFEE() {
		return INSUREFEE;
	}
	public void setINSUREFEE(BigDecimal iNSUREFEE) {
		INSUREFEE = iNSUREFEE;
	}
	public int getPAPERSTYPEID() {
		return PAPERSTYPEID;
	}
	public void setPAPERSTYPEID(int pAPERSTYPEID) {
		PAPERSTYPEID = pAPERSTYPEID;
	}
	public BigDecimal getPAPERFEE() {
		return PAPERFEE;
	}
	public void setPAPERFEE(BigDecimal pAPERFEE) {
		PAPERFEE = pAPERFEE;
	}
	public int getISCONFIRM() {
		return ISCONFIRM;
	}
	public void setISCONFIRM(int iSCONFIRM) {
		ISCONFIRM = iSCONFIRM;
	}
	public String getGUARANTEEPHONE() {
		return GUARANTEEPHONE;
	}
	public void setGUARANTEEPHONE(String gUARANTEEPHONE) {
		GUARANTEEPHONE = gUARANTEEPHONE;
	}
	public String getRELATIVEPHONE() {
		return RELATIVEPHONE;
	}
	public void setRELATIVEPHONE(String rELATIVEPHONE) {
		RELATIVEPHONE = rELATIVEPHONE;
	}
	public long getACCOUNTVUIVUIID() {
		return ACCOUNTVUIVUIID;
	}
	public void setACCOUNTVUIVUIID(long aCCOUNTVUIVUIID) {
		ACCOUNTVUIVUIID = aCCOUNTVUIVUIID;
	}
	public long getSHIPADDRESSID() {
		return SHIPADDRESSID;
	}
	public void setSHIPADDRESSID(long sHIPADDRESSID) {
		SHIPADDRESSID = sHIPADDRESSID;
	}
	public int getISGETPROMOTIONSALEORDER() {
		return ISGETPROMOTIONSALEORDER;
	}
	public void setISGETPROMOTIONSALEORDER(int iSGETPROMOTIONSALEORDER) {
		ISGETPROMOTIONSALEORDER = iSGETPROMOTIONSALEORDER;
	}
	public String getCARTTOKEN() {
		return CARTTOKEN;
	}
	public void setCARTTOKEN(String cARTTOKEN) {
		CARTTOKEN = cARTTOKEN;
	}
	public int getPayableTypeID() {
		return PayableTypeID;
	}
	public void setPayableTypeID(int payableTypeID) {
		PayableTypeID = payableTypeID;
	}
	public List<MemberPointDetailVV> getListMemberPointDetailVV() {
		return ListMemberPointDetailVV;
	}
	public void setListMemberPointDetailVV(List<MemberPointDetailVV> listMemberPointDetailVV) {
		ListMemberPointDetailVV = listMemberPointDetailVV;
	}
	public int getCustomerProvinceID() {
		return CustomerProvinceID;
	}
	public void setCustomerProvinceID(int customerProvinceID) {
		CustomerProvinceID = customerProvinceID;
	}
	public int getCustomerDistrictID() {
		return CustomerDistrictID;
	}
	public void setCustomerDistrictID(int customerDistrictID) {
		CustomerDistrictID = customerDistrictID;
	}
	public String getCustomerAddress() {
		return CustomerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		CustomerAddress = customerAddress;
	}
	public int getStorePreview() {
		return StorePreview;
	}
	public void setStorePreview(int storePreview) {
		StorePreview = storePreview;
	}
	public String getAccessories() {
		return Accessories;
	}
	public void setAccessories(String accessories) {
		Accessories = accessories;
	}
	
	public int getIsCheckCouponERP() {
		return IsCheckCouponERP;
	}
	public void setIsCheckCouponERP(int isCheckCouponERP) {
		IsCheckCouponERP = isCheckCouponERP;
	}
	public int getOriginateStoreID() {
		return OriginateStoreID;
	}
	public void setOriginateStoreID(int originateStoreID) {
		OriginateStoreID = originateStoreID;
	}
	public int getDifferenceAmount() {
		return DifferenceAmount;
	}
	public void setDifferenceAmount(int differenceAmount) {
		DifferenceAmount = differenceAmount;
	}
	public LogNotDelivery[] getListLogNotDelivery() {
		return ListLogNotDelivery;
	}
	public void setListLogNotDelivery(LogNotDelivery[] listLogNotDelivery) {
		ListLogNotDelivery = listLogNotDelivery;
	}
	
	
	
}