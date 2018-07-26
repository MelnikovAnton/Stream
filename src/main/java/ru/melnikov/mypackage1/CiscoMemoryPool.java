
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
 *         &lt;element ref="{}InstanceName"/>
 *         &lt;element ref="{}PoolType"/>
 *         &lt;element ref="{}AlternatePoolType"/>
 *         &lt;element ref="{}IsValid"/>
 *         &lt;element ref="{}Allocated"/>
 *         &lt;element ref="{}Free"/>
 *         &lt;element ref="{}LargestFree"/>
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
    "instanceName",
    "poolType",
    "alternatePoolType",
    "isValid",
    "allocated",
    "free",
    "largestFree"
})
@XmlRootElement(name = "Cisco_MemoryPool")
public class CiscoMemoryPool {

    @XmlElement(name = "InstanceName", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String instanceName;
    @XmlElement(name = "PoolType", required = true)
    protected BigInteger poolType;
    @XmlElement(name = "AlternatePoolType", required = true)
    protected BigInteger alternatePoolType;
    @XmlElement(name = "IsValid")
    protected boolean isValid;
    @XmlElement(name = "Allocated", required = true)
    protected BigInteger allocated;
    @XmlElement(name = "Free", required = true)
    protected BigInteger free;
    @XmlElement(name = "LargestFree", required = true)
    protected BigInteger largestFree;

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
     * Gets the value of the poolType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPoolType() {
        return poolType;
    }

    /**
     * Sets the value of the poolType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPoolType(BigInteger value) {
        this.poolType = value;
    }

    /**
     * Gets the value of the alternatePoolType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAlternatePoolType() {
        return alternatePoolType;
    }

    /**
     * Sets the value of the alternatePoolType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAlternatePoolType(BigInteger value) {
        this.alternatePoolType = value;
    }

    /**
     * Gets the value of the isValid property.
     * 
     */
    public boolean isIsValid() {
        return isValid;
    }

    /**
     * Sets the value of the isValid property.
     * 
     */
    public void setIsValid(boolean value) {
        this.isValid = value;
    }

    /**
     * Gets the value of the allocated property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAllocated() {
        return allocated;
    }

    /**
     * Sets the value of the allocated property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAllocated(BigInteger value) {
        this.allocated = value;
    }

    /**
     * Gets the value of the free property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFree() {
        return free;
    }

    /**
     * Sets the value of the free property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFree(BigInteger value) {
        this.free = value;
    }

    /**
     * Gets the value of the largestFree property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLargestFree() {
        return largestFree;
    }

    /**
     * Sets the value of the largestFree property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLargestFree(BigInteger value) {
        this.largestFree = value;
    }

}
