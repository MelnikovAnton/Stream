
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
 *         &lt;element ref="{}ModuleNumber"/>
 *         &lt;element ref="{}ModuleType"/>
 *         &lt;element ref="{}InstanceName"/>
 *         &lt;element ref="{}EnabledStatus" minOccurs="0"/>
 *         &lt;element ref="{}NumberOfPorts"/>
 *         &lt;element ref="{}Cisco_Port" maxOccurs="unbounded"/>
 *         &lt;element ref="{}Cisco_OSElement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "instanceID",
    "moduleNumber",
    "moduleType",
    "instanceName",
    "enabledStatus",
    "numberOfPorts",
    "ciscoPort",
    "ciscoOSElement"
})
@XmlRootElement(name = "Cisco_LogicalModule")
public class CiscoLogicalModule {

    @XmlElement(name = "InstanceID", required = true)
    protected BigInteger instanceID;
    @XmlElement(name = "ModuleNumber", required = true)
    protected BigInteger moduleNumber;
    @XmlElement(name = "ModuleType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String moduleType;
    @XmlElement(name = "InstanceName", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String instanceName;
    @XmlElement(name = "EnabledStatus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String enabledStatus;
    @XmlElement(name = "NumberOfPorts", required = true)
    protected BigInteger numberOfPorts;
    @XmlElement(name = "Cisco_Port", required = true)
    protected List<CiscoPort> ciscoPort;
    @XmlElement(name = "Cisco_OSElement")
    protected CiscoOSElement ciscoOSElement;

    /**
     * Gets the value of the instanceID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInstanceID() {
        return instanceID;
    }

    /**
     * Sets the value of the instanceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInstanceID(BigInteger value) {
        this.instanceID = value;
    }

    /**
     * Gets the value of the moduleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getModuleNumber() {
        return moduleNumber;
    }

    /**
     * Sets the value of the moduleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setModuleNumber(BigInteger value) {
        this.moduleNumber = value;
    }

    /**
     * Gets the value of the moduleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModuleType() {
        return moduleType;
    }

    /**
     * Sets the value of the moduleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModuleType(String value) {
        this.moduleType = value;
    }

    /**
     * Gets the value of the instanceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceName() {
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
     * Gets the value of the enabledStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnabledStatus() {
        return enabledStatus;
    }

    /**
     * Sets the value of the enabledStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnabledStatus(String value) {
        this.enabledStatus = value;
    }

    /**
     * Gets the value of the numberOfPorts property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfPorts() {
        return numberOfPorts;
    }

    /**
     * Sets the value of the numberOfPorts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfPorts(BigInteger value) {
        this.numberOfPorts = value;
    }

    /**
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
     */
    public List<CiscoPort> getCiscoPort() {
        if (ciscoPort == null) {
            ciscoPort = new ArrayList<CiscoPort>();
        }
        return this.ciscoPort;
    }

    /**
     * Gets the value of the ciscoOSElement property.
     * 
     * @return
     *     possible object is
     *     {@link CiscoOSElement }
     *     
     */
    public CiscoOSElement getCiscoOSElement() {
        return ciscoOSElement;
    }

    /**
     * Sets the value of the ciscoOSElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link CiscoOSElement }
     *     
     */
    public void setCiscoOSElement(CiscoOSElement value) {
        this.ciscoOSElement = value;
    }

}
