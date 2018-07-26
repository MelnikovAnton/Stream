
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
 *         &lt;element ref="{}Model"/>
 *         &lt;element ref="{}HardwareVersion"/>
 *         &lt;element ref="{}SerialNumber"/>
 *         &lt;element ref="{}ChassisSystemType"/>
 *         &lt;element ref="{}NumberOfSlots"/>
 *         &lt;element ref="{}NoOfCommunicationConnectors"/>
 *         &lt;element ref="{}Cisco_Card"/>
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
    "model",
    "hardwareVersion",
    "serialNumber",
    "chassisSystemType",
    "numberOfSlots",
    "noOfCommunicationConnectors",
    "ciscoCard"
})
@XmlRootElement(name = "Cisco_Chassis")
public class CiscoChassis {

    @XmlElement(name = "InstanceID", required = true)
    protected BigInteger instanceID;
    @XmlElement(name = "Model", required = true)
    protected String model;
    @XmlElement(name = "HardwareVersion", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String hardwareVersion;
    @XmlElement(name = "SerialNumber", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String serialNumber;
    @XmlElement(name = "ChassisSystemType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String chassisSystemType;
    @XmlElement(name = "NumberOfSlots", required = true)
    protected BigInteger numberOfSlots;
    @XmlElement(name = "NoOfCommunicationConnectors", required = true)
    protected BigInteger noOfCommunicationConnectors;
    @XmlElement(name = "Cisco_Card", required = true)
    protected CiscoCard ciscoCard;

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
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the hardwareVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHardwareVersion() {
        return hardwareVersion;
    }

    /**
     * Sets the value of the hardwareVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHardwareVersion(String value) {
        this.hardwareVersion = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the chassisSystemType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChassisSystemType() {
        return chassisSystemType;
    }

    /**
     * Sets the value of the chassisSystemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChassisSystemType(String value) {
        this.chassisSystemType = value;
    }

    /**
     * Gets the value of the numberOfSlots property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfSlots() {
        return numberOfSlots;
    }

    /**
     * Sets the value of the numberOfSlots property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfSlots(BigInteger value) {
        this.numberOfSlots = value;
    }

    /**
     * Gets the value of the noOfCommunicationConnectors property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNoOfCommunicationConnectors() {
        return noOfCommunicationConnectors;
    }

    /**
     * Sets the value of the noOfCommunicationConnectors property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNoOfCommunicationConnectors(BigInteger value) {
        this.noOfCommunicationConnectors = value;
    }

    /**
     * Gets the value of the ciscoCard property.
     * 
     * @return
     *     possible object is
     *     {@link CiscoCard }
     *     
     */
    public CiscoCard getCiscoCard() {
        return ciscoCard;
    }

    /**
     * Sets the value of the ciscoCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link CiscoCard }
     *     
     */
    public void setCiscoCard(CiscoCard value) {
        this.ciscoCard = value;
    }

}
