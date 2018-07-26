
package ru.melnikov.mypackage1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{}Size"/>
 *         &lt;element ref="{}NumberOfPartitions"/>
 *         &lt;element ref="{}ChipCount"/>
 *         &lt;element ref="{}Description"/>
 *         &lt;element ref="{}Removable"/>
 *         &lt;element ref="{}Cisco_FlashPartition"/>
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
    "instanceName",
    "size",
    "numberOfPartitions",
    "chipCount",
    "description",
    "removable",
    "ciscoFlashPartition"
})
@XmlRootElement(name = "Cisco_FlashDevice")
public class CiscoFlashDevice {

    @XmlElement(name = "InstanceID", required = true)
    protected BigInteger instanceID;
    @XmlElement(name = "InstanceName", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String instanceName;
    @XmlElement(name = "Size", required = true)
    protected BigInteger size;
    @XmlElement(name = "NumberOfPartitions", required = true)
    protected BigInteger numberOfPartitions;
    @XmlElement(name = "ChipCount", required = true)
    protected BigInteger chipCount;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "Removable")
    protected boolean removable;
    @XmlElement(name = "Cisco_FlashPartition", required = true)
    protected CiscoFlashPartition ciscoFlashPartition;

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
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSize(BigInteger value) {
        this.size = value;
    }

    /**
     * Gets the value of the numberOfPartitions property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfPartitions() {
        return numberOfPartitions;
    }

    /**
     * Sets the value of the numberOfPartitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfPartitions(BigInteger value) {
        this.numberOfPartitions = value;
    }

    /**
     * Gets the value of the chipCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChipCount() {
        return chipCount;
    }

    /**
     * Sets the value of the chipCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChipCount(BigInteger value) {
        this.chipCount = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the removable property.
     * 
     */
    public boolean isRemovable() {
        return removable;
    }

    /**
     * Sets the value of the removable property.
     * 
     */
    public void setRemovable(boolean value) {
        this.removable = value;
    }

    /**
     * Gets the value of the ciscoFlashPartition property.
     * 
     * @return
     *     possible object is
     *     {@link CiscoFlashPartition }
     *     
     */
    public CiscoFlashPartition getCiscoFlashPartition() {
        return ciscoFlashPartition;
    }

    /**
     * Sets the value of the ciscoFlashPartition property.
     * 
     * @param value
     *     allowed object is
     *     {@link CiscoFlashPartition }
     *     
     */
    public void setCiscoFlashPartition(CiscoFlashPartition value) {
        this.ciscoFlashPartition = value;
    }

}
