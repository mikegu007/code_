
package com.creditsafe.globaldata.operations;

import com.creditsafe.globaldata.datatypes.CustomDataSchema;

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
 *         &lt;element name="GetReportCustomDataSchemaResult" type="{http://www.creditsafe.com/globaldata/datatypes}CustomDataSchema" minOccurs="0"/&gt;
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
    "getReportCustomDataSchemaResult"
})
@XmlRootElement(name = "GetReportCustomDataSchemaResponse")
public class GetReportCustomDataSchemaResponse {

    @XmlElementRef(name = "GetReportCustomDataSchemaResult", namespace = "http://www.creditsafe.com/globaldata/operations", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomDataSchema> getReportCustomDataSchemaResult;

    /**
     * 获取getReportCustomDataSchemaResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustomDataSchema }{@code >}
     *     
     */
    public JAXBElement<CustomDataSchema> getGetReportCustomDataSchemaResult() {
        return getReportCustomDataSchemaResult;
    }

    /**
     * 设置getReportCustomDataSchemaResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustomDataSchema }{@code >}
     *     
     */
    public void setGetReportCustomDataSchemaResult(JAXBElement<CustomDataSchema> value) {
        this.getReportCustomDataSchemaResult = value;
    }

}