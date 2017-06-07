
package com.creditsafe.globaldata.operations;

import com.creditsafe.globaldata.datatypes.ReportboxListingFilter;

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
 *         &lt;element name="filter" type="{http://www.creditsafe.com/globaldata/datatypes}ReportboxListingFilter" minOccurs="0"/&gt;
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
    "filter"
})
@XmlRootElement(name = "GetReportboxContents")
public class GetReportboxContents {

    @XmlElementRef(name = "filter", namespace = "http://www.creditsafe.com/globaldata/operations", type = JAXBElement.class, required = false)
    protected JAXBElement<ReportboxListingFilter> filter;

    /**
     * 获取filter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReportboxListingFilter }{@code >}
     *     
     */
    public JAXBElement<ReportboxListingFilter> getFilter() {
        return filter;
    }

    /**
     * 设置filter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReportboxListingFilter }{@code >}
     *     
     */
    public void setFilter(JAXBElement<ReportboxListingFilter> value) {
        this.filter = value;
    }

}