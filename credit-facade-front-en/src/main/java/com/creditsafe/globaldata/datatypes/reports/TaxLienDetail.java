package com.creditsafe.globaldata.datatypes.reports;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxLienDetail", propOrder = {
	"filedDate",
	"filingType",
	"filedBy",
	"status",
	"amount",
	"filingNumber",
	"jurisdiction"
})

public class TaxLienDetail implements Serializable {

	@XmlElement(name = "FiledDate")
	protected String filedDate;
	public String getFiledDate() {return filedDate;}
	public void setFiledDate(String value) {this.filedDate =  value;}

	@XmlElement(name = "FilingType")
	protected String filingType;
	public String getFilingType() {return filingType;}
	public void setFilingType(String value) {this.filingType =  value;}

	@XmlElement(name = "FiledBy")
	protected String filedBy;
	public String getFiledBy() {return filedBy;}
	public void setFiledBy(String value) {this.filedBy =  value;}

	@XmlElement(name = "Status")
	protected String status;
	public String getStatus() {return status;}
	public void setStatus(String value) {this.status =  value;}

	@XmlElement(name = "Amount")
	protected String amount;
	public String getAmount() {return amount;}
	public void setAmount(String value) {this.amount =  value;}

	@XmlElement(name = "FilingNumber")
	protected String filingNumber;
	public String getFilingNumber() {return filingNumber;}
	public void setFilingNumber(String value) {this.filingNumber =  value;}

	@XmlElement(name = "Jurisdiction")
	protected String jurisdiction;
	public String getJurisdiction() {return jurisdiction;}
	public void setJurisdiction(String value) {this.jurisdiction =  value;}

}
