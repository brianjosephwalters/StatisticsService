
package com.statisticsservice.certificateservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for certificate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="certificate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="certificateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="certificateDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="certificateTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="daysValid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="toolCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "certificate", propOrder = {
    "certificateCode",
    "certificateDescription",
    "certificateTitle",
    "companyCode",
    "daysValid",
    "toolCode"
})
public class Certificate {

    protected String certificateCode;
    protected String certificateDescription;
    protected String certificateTitle;
    protected String companyCode;
    protected int daysValid;
    protected String toolCode;

    /**
     * Gets the value of the certificateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateCode() {
        return certificateCode;
    }

    /**
     * Sets the value of the certificateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateCode(String value) {
        this.certificateCode = value;
    }

    /**
     * Gets the value of the certificateDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateDescription() {
        return certificateDescription;
    }

    /**
     * Sets the value of the certificateDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateDescription(String value) {
        this.certificateDescription = value;
    }

    /**
     * Gets the value of the certificateTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateTitle() {
        return certificateTitle;
    }

    /**
     * Sets the value of the certificateTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateTitle(String value) {
        this.certificateTitle = value;
    }

    /**
     * Gets the value of the companyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * Sets the value of the companyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyCode(String value) {
        this.companyCode = value;
    }

    /**
     * Gets the value of the daysValid property.
     * 
     */
    public int getDaysValid() {
        return daysValid;
    }

    /**
     * Sets the value of the daysValid property.
     * 
     */
    public void setDaysValid(int value) {
        this.daysValid = value;
    }

    /**
     * Gets the value of the toolCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToolCode() {
        return toolCode;
    }

    /**
     * Sets the value of the toolCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToolCode(String value) {
        this.toolCode = value;
    }

}
