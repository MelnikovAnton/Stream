
package ru.melnikov.mypackage1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}InstanceID"/>
 *         &lt;element ref="{}InstanceName"/>
 *         &lt;element ref="{}ProtocolType"/>
 *         &lt;element ref="{}Speed"/>
 *         &lt;element ref="{}RequestedStatus"/>
 *         &lt;element ref="{}OperationalStatus"/>
 *         &lt;element ref="{}Description"/>
 *         &lt;element ref="{}PhysicalAddress"/>
 *         &lt;element ref="{}NetworkAddress" minOccurs="0"/>
 *         &lt;element ref="{}AdditionalInformation"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = ""/*, propOrder = {
    "instanceID",
    "instanceName",
    "protocolType",
    "speed",
    "requestedStatus",
    "operationalStatus",
    "description",
    "physicalAddress",
    "networkAddress",
    "additionalInformation"
}*/)
@XmlRootElement(name = "Cisco_IfEntry")
public class CiscoIfEntry {

//    @XmlElement(name = "InstanceID", required = true)
 //   protected BigInteger instanceID;
    @XmlElement(name = "InstanceName", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String instanceName;
//    @XmlElement(name = "ProtocolType", required = true)
//    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
//    @XmlSchemaType(name = "NCName")
//    protected String protocolType;
    //@XmlElement(name = "Speed", required = true)
//    protected BigInteger speed;
//    @XmlElement(name = "RequestedStatus", required = true)
//    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
//    @XmlSchemaType(name = "NCName")
//    protected String requestedStatus;
//    @XmlElement(name = "OperationalStatus", required = true)
//    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
//    @XmlSchemaType(name = "NCName")
//    protected String operationalStatus;
    //@XmlElement(name = "Description", required = true)
//    protected String description;
    //@XmlElement(name = "PhysicalAddress", required = true)
 //   protected String physicalAddress;
    @XmlElement(name = "NetworkAddress")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String networkAddress;
    //@XmlElement(name = "AdditionalInformation", required = true)
 //   protected AdditionalInformation additionalInformation;

    /**
     * Gets the value of the instanceID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
  /*  public BigInteger getInstanceID() {
        return instanceID;
    }

    *//**
     * Sets the value of the instanceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     *//*
    public void setInstanceID(BigInteger value) {
        this.instanceID = value;
    }

    *//**
     * Gets the value of the instanceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     *//*
  */  public String getInstanceName() {
        return instanceName;
    }

    /**
     * Sets the value of the instanceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceName(String value) {
        this.instanceName = value;
    }

    /**
     * Gets the value of the protocolType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
 /*   public String getProtocolType() {
        return protocolType;
    }

    *//**
     * Sets the value of the protocolType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     *//*
    public void setProtocolType(String value) {
        this.protocolType = value;
    }

    *//**
     * Gets the value of the speed property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     *//*
    public BigInteger getSpeed() {
        return speed;
    }

    *//**
     * Sets the value of the speed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     *//*
    public void setSpeed(BigInteger value) {
        this.speed = value;
    }

    *//**
     * Gets the value of the requestedStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     *//*
    public String getRequestedStatus() {
        return requestedStatus;
    }

    *//**
     * Sets the value of the requestedStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     *//*
    public void setRequestedStatus(String value) {
        this.requestedStatus = value;
    }

    *//**
     * Gets the value of the operationalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     *//*
    public String getOperationalStatus() {
        return operationalStatus;
    }

    *//**
     * Sets the value of the operationalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     *//*
    public void setOperationalStatus(String value) {
        this.operationalStatus = value;
    }

    *//**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     *//*
    public String getDescription() {
        return description;
    }

    *//**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     *//*
    public void setDescription(String value) {
        this.description = value;
    }

    *//**
     * Gets the value of the physicalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     *//*
    public String getPhysicalAddress() {
        return physicalAddress;
    }

    *//**
     * Sets the value of the physicalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     *//*
    public void setPhysicalAddress(String value) {
        this.physicalAddress = value;
    }

    *//**
     * Gets the value of the networkAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     *//*
 */   public String getNetworkAddress() {
        return networkAddress;
    }

    /**
     * Sets the value of the networkAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkAddress(String value) {
        this.networkAddress = value;
    }

    /**
     * Gets the value of the additionalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInformation }
     *     
     */
 /*   public AdditionalInformation getAdditionalInformation() {
        return additionalInformation;
    }

    *//**
     * Sets the value of the additionalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInformation }
     *     
     *//*
    public void setAdditionalInformation(AdditionalInformation value) {
        this.additionalInformation = value;
    }
*/
}
