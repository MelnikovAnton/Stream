
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
 *         &lt;element ref="{}InstanceName"/>
 *         &lt;element ref="{}Upgrade"/>
 *         &lt;element ref="{}NeedsErasure"/>
 *         &lt;element ref="{}PartitionStatus"/>
 *         &lt;element ref="{}FileSystemSize"/>
 *         &lt;element ref="{}AvailableSpace"/>
 *         &lt;element ref="{}FileCount"/>
 *         &lt;element ref="{}Cisco_FlashFile" maxOccurs="unbounded"/>
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
    "upgrade",
    "needsErasure",
    "partitionStatus",
    "fileSystemSize",
    "availableSpace",
    "fileCount",
    "ciscoFlashFile"
})
@XmlRootElement(name = "Cisco_FlashPartition")
public class CiscoFlashPartition {

    @XmlElement(name = "InstanceID", required = true)
    protected BigInteger instanceID;
    @XmlElement(name = "InstanceName", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String instanceName;
    @XmlElement(name = "Upgrade", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String upgrade;
    @XmlElement(name = "NeedsErasure")
    protected boolean needsErasure;
    @XmlElement(name = "PartitionStatus", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String partitionStatus;
    @XmlElement(name = "FileSystemSize", required = true)
    protected BigInteger fileSystemSize;
    @XmlElement(name = "AvailableSpace", required = true)
    protected BigInteger availableSpace;
    @XmlElement(name = "FileCount", required = true)
    protected BigInteger fileCount;
    @XmlElement(name = "Cisco_FlashFile", required = true)
    protected List<CiscoFlashFile> ciscoFlashFile;

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
     * Gets the value of the upgrade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpgrade() {
        return upgrade;
    }

    /**
     * Sets the value of the upgrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpgrade(String value) {
        this.upgrade = value;
    }

    /**
     * Gets the value of the needsErasure property.
     * 
     */
    public boolean isNeedsErasure() {
        return needsErasure;
    }

    /**
     * Sets the value of the needsErasure property.
     * 
     */
    public void setNeedsErasure(boolean value) {
        this.needsErasure = value;
    }

    /**
     * Gets the value of the partitionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartitionStatus() {
        return partitionStatus;
    }

    /**
     * Sets the value of the partitionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartitionStatus(String value) {
        this.partitionStatus = value;
    }

    /**
     * Gets the value of the fileSystemSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFileSystemSize() {
        return fileSystemSize;
    }

    /**
     * Sets the value of the fileSystemSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFileSystemSize(BigInteger value) {
        this.fileSystemSize = value;
    }

    /**
     * Gets the value of the availableSpace property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAvailableSpace() {
        return availableSpace;
    }

    /**
     * Sets the value of the availableSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAvailableSpace(BigInteger value) {
        this.availableSpace = value;
    }

    /**
     * Gets the value of the fileCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFileCount() {
        return fileCount;
    }

    /**
     * Sets the value of the fileCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFileCount(BigInteger value) {
        this.fileCount = value;
    }

    /**
     * Gets the value of the ciscoFlashFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ciscoFlashFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCiscoFlashFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CiscoFlashFile }
     * 
     * 
     */
    public List<CiscoFlashFile> getCiscoFlashFile() {
        if (ciscoFlashFile == null) {
            ciscoFlashFile = new ArrayList<CiscoFlashFile>();
        }
        return this.ciscoFlashFile;
    }

}
