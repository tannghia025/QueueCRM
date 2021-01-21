package com.crm.crmqueue.dto;

import java.util.Date;

public class CRMSALEORDERONLINE {
	private String _CARTTOKEN ;
    public int SHIPPACKAGETYPE;

    public int SOURCEPROMOTION;

    public int DELIVERYPACKAGE;
    public String LosginUser;
    public String SYSTEMNOTE;

    public String VOUCHERCONCERN;
    public int ISCONFIRM;
    public Date INPUTTIME;
   
    // Thanh toán online
    private int intPAYMENTONLINESTATUSID = 0;
    public int PAYMENTONLINESTATUSID;

    // Thời hạn thanh toán
    private Date dtPAYMENTONLINEEXPIREDTIME ;
    public Date PAYMENTONLINEEXPIREDTIME;
    public int BOOKQUANTITY;
    //Số điểm tích lũy KH thân thiết
    private double decPOINTPAID = 0;

    public double POINTPAID;

    public String OTHERAPPSVOUCHERID;
    public int CREATEDBYOTHERAPPS;

    public Date CONFIRMSMSTIME;

    public Date EXPIREDTIME;
    public float PRICESUPPORT;
    public String PRICESUPPORTPRODUCTNO ;


    public int TRUSTCUSTOMER;
    private int intCountryID;

    private double _INSTALLMENTPAID = -1;// Số tiền trả trước
    private int _INSTALLMENTPERIOD = -1;//Kỳ hạn vay
    private double _INSTALLMENTMONTHAMOUNT = -1;// Tiền trả hàng tháng
    private String _INSTALLMENTCONTRACT;//Số hợp đồng
    public double FINANCEAMOUNT;//Khoan vay
    private int _PGGROUPID = 0;


    public int COUNTNOANSWER;

    public Date CONFIRMORDERTIME;

    public int CONFIRMORDERTYPE;
    public int COUNTLATER;
    public int DELAYREASONTYPE;
    public int PGGROUPID;
    public double INSTALLMENTPAID ;// số tiền trả trước

    public int INSTALLMENTPERIOD;

    public double INSTALLMENTMONTHAMOUNT;

    public String INSTALLMENTCONTRACT;

    private int intOrderWebType = 0;
    private long longACCOUNTVUIVUIID = 0;

    public long ACCOUNTVUIVUIID;

    private String strSALEORDERTYPENAME;



    private long longSALEORDERONLINEID = 0;
    private double longLAT = 0;
    private double longLNG = 0;
    private String strERPSALEORDERID;
    private String strSYSTEMLOG;
    private int intORDERTYPEID = 0;
    private int intDELIVERYTYPEID = 0;
    private int intPAYABLETYPEID = 0;
    private int intCURRENCYUNITID = 0;
    private float fCURRENCYEXCHANGE = 0;
    private String strSALEORDERTYPECODE;
    private Date dtCALLBACKTIME ;
    private Date dtPAYABLETIME ;
    private long longCUSTOMERID = 0;
    private String strCUSTOMERNAME;
    private String strCUSTOMERMAINMOBILE;
    private String strCUSTOMERMAINEMAIL;
    private String strCUSTOMERPID;
    private String strCUSTOMERTAXNO;



    private String strCONTACTNAME;
    private String strCONTACTMOBILE;
    private String strCONTACTEMAIL;

    private double decTOTALQUANTITY;
    private float fTOTALAMOUNT = 0;
    private double decTOTALPAID = 0;
    private float fSHIPPINGCOST = 0;
    private float fTOTALADVANCE = 0;
    private float fDEBT = 0;
    private float fTOTALPREPAID = 0;
    private float fDISCOUNT = 0;
    private float fPROMOTIONDISCOUNT = 0;
    private int intDISCOUNTREASONID = 0;
    private float fADJUSTAMOUNT = 0;
    private String strCOUPONCODE;
    private float fCOUPONDISCOUNT = 0;
    private int intTIMEPROCESS = 0;
    private int intPROCESSMETHODID = 0;
    private String strPROCESSUSER;
    private String strPROCESSUSERNAME;
    private boolean bISREVIEWED = true;
    private String strREVIEWEDUSER;
    private String strREVIEWEDUSERNAME;
    private Date dtREVIEWEDDATE ;
    private int intSTOREID = 0;
    private int intISOUTPRODUCT = 0;

    private int intOUTPUTSTOREID = 0;
    private String strOUTPUTSTORENAME  ;
    private String strPRODUCT  ;





    private String _SHIPDISTRICTNAME;
    private String _SHIPPROVINCENAME;
    private double _DISTANCE = 0;// Khoảng cách từ siêu thị tới nhà khách hàng



    private int intISDELIVERY = 0;
    private String strDELIVERYUSER;
    private String strDELIVERYUSERNAME ;
    private int intSHIPSTATE = 0;
    private int intSHIPCITY = 0;
    private String strSHIPADDRESS;
    private long intSHIPADDRESSID = 0;
    private int intBILLSTATE = 0;
    private int lBILLCITY = 0;
    private String strBILLADDRESS;
    private Date dtDELIVERYTIME ;
    private Date dtCREATEDDATE ;
    private Date dtPROCESSDATE ;
    private String strCREATEDUSER;
    private int intISDELETED = 0;
    private Date dtUPDATEDDATE ;
    private String strUPDATEDUSER;
    private String strEMPLOYEENOTE;
    private String strCUSTOMERNOTE;
    private int intCUSTOMERGENDER = 2;
    private int intVOUCHERTYPEID = 0;


    private int intSHIPCOUNTRY = 0;
    private int intBILLCOUNTRY = 0;
    private String strCREATEDUSERNAME;
    private String strUPDATEDUSERNAME;
    private String strSTORENAME;
    private long longSourceID = 0;//Ma Cong ty Doi tac       
    private String strSourceOrder;

    private int intIsIncome = 0;

    private int intPackageID = 1;
    private int intPriority = 0;//do uu tien mua hang theo goi.
    private int intSaleProgramID = 0;//chuong trinh ban hang
    private String strVOUCHERCODE;
    private float floatVOUCHERAMOUNT = 0;


    private int intProcessStatusID = 1;


    private Date dtTIMEEXPECTDELIVERY ;
    private Date dtmVOUCHERDATE ;
    private int intTIMEDELIVERY = 0;
    private String strTIMEEXPECTDELIVERYS;

    private int intTOTALNUMBERCOUNT;
    private String strTIMEDELAY;

    private int intERPSALEPROGRAMID;


    private Date dtBIRTHDAY ;
    private float intPREPAIDPERCENT = 0;



    private int intREPAYMENTMONTH = 0;
    private float intREPAYMENTMONTHAMOUNT = 0;
    private int intPROVINCEREPAYMENT = 0;
    private int intPROVICEREPAYMENTTYPE = 0;
    private int intGENCOMPANYID = 1;
    private int intREASONTRACKID = 0;
    private int iDICTRICTRPAYID = 0;


    private int iWARDID = 0;
    private String strPERSONALID;
    private String strREASONCREATE;
    private int intCUSTOMERTYPE = 1;
    private int intPAYMENTSTATUS = 0;
    private Date dtLOCALDATE;
    private int _CountMinutes = 0;
    private int _CONFIRMSMS = 0;
    private int _ISPROMOTIONSALEORDER = 0;
    private Date dtPPFCALLBACKTIME ;

    private int iSTAFFSTATUSID = 0;
    private String strSTAFFUSER;
    private String strSTAFFUSERNOTE;
    private int _JOBID = 0;

    private int intSTOREPREVIEW = 0;
    private int intISCUSTOMERPREVIEW = 0;
    public int NOTIFYSTATUSID;

    public int JOBID;

    private int iTYPEORDER = 1;

    public int TYPEORDER;

    public String STAFFUSERNOTE;

    public String STAFFUSER;

    public int STAFFSTATUSID;

    public Date PPFCALLBACKTIME;



    public String SALEPROGAMENAME;
    public int ISPROMOTIONSALEORDER;


    public int CONFIRMSMS;
    public int COUNTMINUTES;


    public Date LOCALDATE;
   
    private String strORDERDESC;



}
