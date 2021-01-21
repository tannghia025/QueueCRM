package com.crm.crmqueue.crmbusiness;

import com.google.common.base.Strings;

public class Utils {
	static String CacheMenu = "CRM_Menu";

	public static boolean IsValidPhoneNumber(String phoneNum, int gencompanyID)
     {
         if (gencompanyID != 11)
         {
             //phoneNum = phoneNum.Trim();
             if (Strings.isNullOrEmpty(phoneNum))
                 return false;
       //      String sPhonePattern = "^((03(\d){8})|(08(\d){8})|(07(\d){8})|(09(\d){8})|(05(\d){8})|(01(\d){9}))$";
       //      return Regex.IsMatch(phoneNum, sPhonePattern);
             return false;
         }
         else
         {
             if (Strings.isNullOrEmpty(phoneNum))
                 return false;

             return phoneNum.length() >= 9 && phoneNum.length() <= 10;

         }

     }

}
