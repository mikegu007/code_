
package com.creditsafe.globaldata.operations;

import com.creditsafe.globaldata.datatypes.reports.CompanyReportSet;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetrieveCompanyOnlineReportResult" type="{http://www.creditsafe.com/globaldata/datatypes/reports}CompanyReportSet" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "retrieveCompanyOnlineReportResult"
})
@XmlRootElement(name = "RetrieveCompanyOnlineReportResponse")
public class RetrieveCompanyOnlineReportResponse {

    @XmlElementRef(name = "RetrieveCompanyOnlineReportResult", namespace = "http://www.creditsafe.com/globaldata/operations", type = JAXBElement.class, required = false)
    protected JAXBElement<CompanyReportSet> retrieveCompanyOnlineReportResult;

    /**
     * 获取retrieveCompanyOnlineReportResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CompanyReportSet }{@code >}
     *     
     */
    public JAXBElement<CompanyReportSet> getRetrieveCompanyOnlineReportResult() {
        return retrieveCompanyOnlineReportResult;
    }

    /**
     * 设置retrieveCompanyOnlineReportResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CompanyReportSet }{@code >}
     *     
     */
    public void setRetrieveCompanyOnlineReportResult(JAXBElement<CompanyReportSet> value) {
        this.retrieveCompanyOnlineReportResult = value;
    }

}
