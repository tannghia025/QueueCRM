package com.crm.crmqueue.dto;

import java.util.Date;

public class CRMSaleProgram {

    public Date StartDate ;

    public Date EndDate ;

    public int SaleProgramID ;
    public int ProductQuantity ;
    public String ProductID ;


    public int MaxQuantity ;
    public Date UpdatedDate ;
    public String ProductName ;
    public int ProductIDRef ;
	public Date getStartDate() {
		return StartDate;
	}
	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}
	public Date getEndDate() {
		return EndDate;
	}
	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}
	public int getSaleProgramID() {
		return SaleProgramID;
	}
	public void setSaleProgramID(int saleProgramID) {
		SaleProgramID = saleProgramID;
	}
	public int getProductQuantity() {
		return ProductQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		ProductQuantity = productQuantity;
	}
	public String getProductID() {
		return ProductID;
	}
	public void setProductID(String productID) {
		ProductID = productID;
	}
	public int getMaxQuantity() {
		return MaxQuantity;
	}
	public void setMaxQuantity(int maxQuantity) {
		MaxQuantity = maxQuantity;
	}
	public Date getUpdatedDate() {
		return UpdatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		UpdatedDate = updatedDate;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public int getProductIDRef() {
		return ProductIDRef;
	}
	public void setProductIDRef(int productIDRef) {
		ProductIDRef = productIDRef;
	}
    
    
}
