package com.reimbursment.model;

import java.util.Date;

public class Reimbursment {
	
private String projectName;
private Date date;
private String officeLocation;
private String reimType;
private String receiptId;
private Date receiptDate;
private String conveyanceDetails;
private String timeIn;
private String timeOut;
private String amount;
private String status;
private String empComments;
private String appliedManager;
private String mgrComments;


public Reimbursment() {
	super();
}

public Reimbursment(String projectName, Date date, String officeLocation,
		String reimType, String receiptId, Date receiptDate,
		String conveyanceDetails, String timeIn, String timeOut, String amount,
		String status, String empComments, String appliedManager,
		String mgrComments) {
	super();
	this.projectName = projectName;
	this.date = date;
	this.officeLocation = officeLocation;
	this.reimType = reimType;
	this.receiptId = receiptId;
	this.receiptDate = receiptDate;
	this.conveyanceDetails = conveyanceDetails;
	this.timeIn = timeIn;
	this.timeOut = timeOut;
	this.amount = amount;
	this.status = status;
	this.empComments = empComments;
	this.appliedManager = appliedManager;
	this.mgrComments = mgrComments;
}

public String getProjectName() {
	return projectName;
}
public void setProjectName(String projectName) {
	this.projectName = projectName;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public String getOfficeLocation() {
	return officeLocation;
}
public void setOfficeLocation(String officeLocation) {
	this.officeLocation = officeLocation;
}
public String getReimType() {
	return reimType;
}
public void setReimType(String reimType) {
	this.reimType = reimType;
}
public String getReceiptId() {
	return receiptId;
}
public void setReceiptId(String receiptId) {
	this.receiptId = receiptId;
}
public Date getReceiptDate() {
	return receiptDate;
}
public void setReceiptDate(Date receiptDate) {
	this.receiptDate = receiptDate;
}
public String getConveyanceDetails() {
	return conveyanceDetails;
}
public void setConveyanceDetails(String conveyanceDetails) {
	this.conveyanceDetails = conveyanceDetails;
}
public String getTimeIn() {
	return timeIn;
}
public void setTimeIn(String timeIn) {
	this.timeIn = timeIn;
}
public String getTimeOut() {
	return timeOut;
}
public void setTimeOut(String timeOut) {
	this.timeOut = timeOut;
}
public String getAmount() {
	return amount;
}
public void setAmount(String amount) {
	this.amount = amount;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getEmpComments() {
	return empComments;
}
public void setEmpComments(String empComments) {
	this.empComments = empComments;
}
public String getAppliedManager() {
	return appliedManager;
}
public void setAppliedManager(String appliedManager) {
	this.appliedManager = appliedManager;
}
public String getMgrComments() {
	return mgrComments;
}
public void setMgrComments(String mgrComments) {
	this.mgrComments = mgrComments;
}



}
