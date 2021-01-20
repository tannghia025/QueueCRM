package com.javabackend.javabacked.dto;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SaleOrderOnline {
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
	public List<ProductWeb> _lstProductWeb = new ArrayList<>();
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
	public EWorking.CRM.CRM.CRMSOONLINEINSTALLMENTINFO INSTALLMENTINFO;
	public String CARTTOKEN;

	public int PayableTypeID;

	public List<MemberPointDetailVV> ListMemberPointDetailVV = null;
	public int CustomerProvinceID;
	public int CustomerDistrictID;
	public String CustomerAddress;
	public int StorePreview;
	public String Accessories;

	public List<LogNotDelivery> ListLogNotDelivery = null;

	public int IsCheckCouponERP;
	public int OriginateStoreID;
	public int DifferenceAmount;
}