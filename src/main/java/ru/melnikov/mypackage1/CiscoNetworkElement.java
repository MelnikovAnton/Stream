
package ru.melnikov.mypackage1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{}Description"/>
 *         &lt;element ref="{}PrimaryOwnerName"/>
 *         &lt;element ref="{}InstanceName"/>
 *         &lt;element ref="{}PhysicalPosition"/>
 *         &lt;element ref="{}SysObjectId"/>
 *         &lt;element ref="{}SysUpTime"/>
 *         &lt;element ref="{}OfficialHostName"/>
 *         &lt;element ref="{}NumberOfPorts"/>
 *         &lt;element ref="{}Cisco_LogicalModule" maxOccurs="unbounded"/>
 *         &lt;element ref="{}Cisco_Port" maxOccurs="unbounded"/>
 *         &lt;element ref="{}Cisco_MemoryPool" maxOccurs="unbounded"/>
 *         &lt;element ref="{}Cisco_IfEntry" maxOccurs="unbounded"/>
 *         &lt;element ref="{}Cisco_IPProtocolEndpoint" maxOccurs="unbounded"/>
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
    "description",
    "primaryOwnerName",
    "instanceName",
    "physicalPosition",
    "sysObjectId",
    "sysUpTime",
    "officialHostName",
    "numberOfPorts",
    "ciscoLogicalModule",
    "ciscoPort",
    "ciscoMemoryPool",
    "ciscoIfEntry",
    "ciscoIPProtocolEndpoint"
}*/)
@XmlRootElement(name = "Cisco_NetworkElement")
public class CiscoNetworkElement {
/*
//    @XmlElement(name = "InstanceID", required = true)
    protected BigInteger instanceID;
//    @XmlElement(name = "Description", required = true)
    protected String description;
//    @XmlElement(name = "PrimaryOwnerName", required = true)
    protected PrimaryOwnerName primaryOwnerName;
//    @XmlElement(name = "InstanceName", required = true)
//    @XmlSchemaType(name = "anyURI")
    protected String instanceName;
//    @XmlElement(name = "PhysicalPosition", required = true)
    protected PhysicalPosition physicalPosition;
//    @XmlElement(name = "SysObjectId", required = true)
 //   @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  //  @XmlSchemaType(name = "NMTOKEN")
    protected String sysObjectId;
//    @XmlElement(name = "SysUpTime", required = true)
    protected String sysUpTime;*/
    @XmlElement(name = "OfficialHostName", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String officialHostName;
//    @XmlElement(name = "NumberOfPorts", required = true)
  /*  protected BigInteger numberOfPorts;
//    @XmlElement(name = "Cisco_LogicalModule", required = true)
    protected List<CiscoLogicalModule> ciscoLogicalModule;
 //   @XmlElement(name = "Cisco_Port", required = true)
    protected List<CiscoPort> ciscoPort;
  //  @XmlElement(name = "Cisco_MemoryPool", required = true)
    protected List<CiscoMemoryPool> ciscoMemoryPool;*/
    @XmlElement(name = "Cisco_IfEntry", required = true)
    protected List<CiscoIfEntry> ciscoIfEntry;
  //  @XmlElement(name = "Cisco_IPProtocolEndpoint", required = true)
//    protected List<CiscoIPProtocolEndpoint> ciscoIPProtocolEndpoint;

    /**
     * Gets the value of the instanceID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
 /*   public BigInteger getInstanceID() {
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
     * Gets the value of the primaryOwnerName property.
     * 
     * @return
     *     possible object is
     *     {@link PrimaryOwnerName }
     *     
     *//*
    public PrimaryOwnerName getPrimaryOwnerName() {
        return primaryOwnerName;
    }

    *//**
     * Sets the value of the primaryOwnerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryOwnerName }
     *     
     *//*
    public void setPrimaryOwnerName(PrimaryOwnerName value) {
        this.primaryOwnerName = value;
    }

    *//**
     * Gets the value of the instanceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     *//*
    public String getInstanceName() {
        return instanceName;
    }

    *//**
     * Sets the value of the instanceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     *//*
    public void setInstanceName(String value) {
        this.instanceName = value;
    }

    *//**
     * Gets the value of the physicalPosition property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalPosition }
     *     
     *//*
    public PhysicalPosition getPhysicalPosition() {
        return physicalPosition;
    }

    *//**
     * Sets the value of the physicalPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalPosition }
     *     
     *//*
    public void setPhysicalPosition(PhysicalPosition value) {
        this.physicalPosition = value;
    }

    *//**
     * Gets the value of the sysObjectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     *//*
    public String getSysObjectId() {
        return sysObjectId;
    }

    *//**
     * Sets the value of the sysObjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     *//*
    public void setSysObjectId(String value) {
        this.sysObjectId = value;
    }

    *//**
     * Gets the value of the sysUpTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     *//*
    public String getSysUpTime() {
        return sysUpTime;
    }

    *//**
     * Sets the value of the sysUpTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     *//*
    public void setSysUpTime(String value) {
        this.sysUpTime = value;
    }

    *//**
     * Gets the value of the officialHostName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficialHostName() {
        return officialHostName;
    }

    /**
     * Sets the value of the officialHostName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficialHostName(String value) {
        this.officialHostName = value;
    }

    /**
     * Gets the value of the numberOfPorts property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
 /*   public BigInteger getNumberOfPorts() {
        return numberOfPorts;
    }

    *//**
     * Sets the value of the numberOfPorts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     *//*
    public void setNumberOfPorts(BigInteger value) {
        this.numberOfPorts = value;
    }

    *//**
     * Gets the value of the ciscoLogicalModule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ciscoLogicalModule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCiscoLogicalModule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CiscoLogicalModule }
     * 
     * 
     *//*
    public List<CiscoLogicalModule> getCiscoLogicalModule() {
        if (ciscoLogicalModule == null) {
            ciscoLogicalModule = new ArrayList<CiscoLogicalModule>();
        }
        return this.ciscoLogicalModule;
    }

    *//**
     * Gets the value of the ciscoPort property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ciscoPort property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCiscoPort().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CiscoPort }
     * 
     * 
     *//*
    public List<CiscoPort> getCiscoPort() {
        if (ciscoPort == null) {
            ciscoPort = new ArrayList<CiscoPort>();
        }
        return this.ciscoPort;
    }

    *//**
     * Gets the value of the ciscoMemoryPool property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ciscoMemoryPool property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCiscoMemoryPool().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CiscoMemoryPool }
     * 
     * 
     *//*
    public List<CiscoMemoryPool> getCiscoMemoryPool() {
        if (ciscoMemoryPool == null) {
            ciscoMemoryPool = new ArrayList<CiscoMemoryPool>();
        }
        return this.ciscoMemoryPool;
    }

    *//**
     * Gets the value of the ciscoIfEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ciscoIfEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCiscoIfEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CiscoIfEntry }
     * 
     * 
  */
    public List<CiscoIfEntry> getCiscoIfEntry() {
        if (ciscoIfEntry == null) {
            ciscoIfEntry = new ArrayList<CiscoIfEntry>();
        }
        return this.ciscoIfEntry;
    }

    /**
     * Gets the value of the ciscoIPProtocolEndpoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ciscoIPProtocolEndpoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCiscoIPProtocolEndpoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CiscoIPProtocolEndpoint }
     * 
     * 
     */
//    public List<CiscoIPProtocolEndpoint> getCiscoIPProtocolEndpoint() {
//        if (ciscoIPProtocolEndpoint == null) {
//            ciscoIPProtocolEndpoint = new ArrayList<CiscoIPProtocolEndpoint>();
//        }
//        return this.ciscoIPProtocolEndpoint;
//    }

}
