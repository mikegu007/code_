
package com.creditsafe.globaldata.datatypes;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * <p>SearchCriteria complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SearchCriteria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SafeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.creditsafe.com/globaldata/datatypes}QueryString" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://www.creditsafe.com/globaldata/datatypes}CompanyType" minOccurs="0"/&gt;
 *         &lt;element name="OfficeType" type="{http://www.creditsafe.com/globaldata/datatypes}OfficeType" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.creditsafe.com/globaldata/datatypes}CompanyStatus" minOccurs="0"/&gt;
 *         &lt;element name="RegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VatNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://www.creditsafe.com/globaldata/datatypes}AddressCriteria" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchCriteria", propOrder = {
    "id",
    "safeNumber",
    "name",
    "type",
    "officeType",
    "status",
    "registrationNumber",
    "vatNumber",
    "address",
    "phoneNumber"
})
public class SearchCriteria implements Serializable {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "SafeNumber")
    protected String safeNumber;
    @XmlElement(name = "Name")
    protected QueryString name;
    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected CompanyType type;
    @XmlElement(name = "OfficeType")
    @XmlSchemaType(name = "string")
    protected OfficeType officeType;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "RegistrationNumber")
    protected String registrationNumber;
    @XmlElement(name = "VatNumber")
    protected String vatNumber;
    @XmlElement(name = "Address")
    protected AddressCriteria address;
    @XmlElement(name = "PhoneNumber")
    protected String phoneNumber;

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * 获取safeNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSafeNumber() {
        return safeNumber;
    }

    /**
     * 设置safeNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSafeNumber(String value) {
        this.safeNumber = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QueryString }
     *     
     */
    public QueryString getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QueryString }
     *     
     */
    public void setName(QueryString value) {
        this.name = value;
    }

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CompanyType }
     *     
     */
    public CompanyType getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyType }
     *     
     */
    public void setType(CompanyType value) {
        this.type = value;
    }

    /**
     * 获取officeType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OfficeType }
     *     
     */
    public OfficeType getOfficeType() {
        return officeType;
    }

    /**
     * 设置officeType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OfficeType }
     *     
     */
    public void setOfficeType(OfficeType value) {
        this.officeType = value;
    }

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * 获取registrationNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * 设置registrationNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationNumber(String value) {
        this.registrationNumber = value;
    }

    /**
     * 获取vatNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatNumber() {
        return vatNumber;
    }

    /**
     * 设置vatNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatNumber(String value) {
        this.vatNumber = value;
    }

    /**
     * 获取address属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AddressCriteria }
     *     
     */
    public AddressCriteria getAddress() {
        return address;
    }

    /**
     * 设置address属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AddressCriteria }
     *     
     */
    public void setAddress(AddressCriteria value) {
        this.address = value;
    }

    /**
     * 获取phoneNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 设置phoneNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

}
