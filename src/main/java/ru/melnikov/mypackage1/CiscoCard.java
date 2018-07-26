
package ru.melnikov.mypackage1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
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
 *       &lt;choice>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{}Cisco_Card"/>
 *           &lt;element ref="{}Description"/>
 *           &lt;element ref="{}HardwareVersion"/>
 *           &lt;element ref="{}InstanceID"/>
 *           &lt;element ref="{}Model"/>
 *           &lt;element ref="{}NoOfCommunicationConnectors"/>
 *           &lt;element ref="{}OperationalStatus"/>
 *           &lt;element ref="{}SerialNumber"/>
 *           &lt;element ref="{}CardType"/>
 *           &lt;element ref="{}Cisco_CommunicationConnector"/>
 *           &lt;element ref="{}Cisco_FlashDevice"/>
 *           &lt;element ref="{}Cisco_PhysicalMemory"/>
 *           &lt;element ref="{}FWManufacturer"/>
 *           &lt;element ref="{}LocationWithinContainer"/>
 *           &lt;element ref="{}Manufacturer"/>
 *           &lt;element ref="{}SlotNumber"/>
 *           &lt;element ref="{}SoftwareIdentity"/>
 *         &lt;/choice>
 *         &lt;element ref="{}AdditionalInformation" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ciscoCardOrDescriptionOrHardwareVersion",
    "additionalInformation"
})
@XmlRootElement(name = "Cisco_Card")
public class CiscoCard {

    @XmlElementRefs({
        @XmlElementRef(name = "NoOfCommunicationConnectors", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Model", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Description", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Cisco_PhysicalMemory", type = CiscoPhysicalMemory.class, required = false),
        @XmlElementRef(name = "Cisco_Card", type = CiscoCard.class, required = false),
        @XmlElementRef(name = "Cisco_CommunicationConnector", type = CiscoCommunicationConnector.class, required = false),
        @XmlElementRef(name = "FWManufacturer", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "InstanceID", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Manufacturer", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CardType", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SlotNumber", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Cisco_FlashDevice", type = CiscoFlashDevice.class, required = false),
        @XmlElementRef(name = "SoftwareIdentity", type = SoftwareIdentity.class, required = false),
        @XmlElementRef(name = "OperationalStatus", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LocationWithinContainer", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "HardwareVersion", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SerialNumber", type = JAXBElement.class, required = false)
    })
    protected List<Object> ciscoCardOrDescriptionOrHardwareVersion;
    @XmlElement(name = "AdditionalInformation")
    protected List<AdditionalInformation> additionalInformation;

    /**
     * Gets the value of the ciscoCardOrDescriptionOrHardwareVersion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ciscoCardOrDescriptionOrHardwareVersion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCiscoCardOrDescriptionOrHardwareVersion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link CiscoPhysicalMemory }
     * {@link CiscoCard }
     * {@link CiscoCommunicationConnector }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link CiscoFlashDevice }
     * {@link SoftwareIdentity }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<Object> getCiscoCardOrDescriptionOrHardwareVersion() {
        if (ciscoCardOrDescriptionOrHardwareVersion == null) {
            ciscoCardOrDescriptionOrHardwareVersion = new ArrayList<Object>();
        }
        return this.ciscoCardOrDescriptionOrHardwareVersion;
    }

    /**
     * Gets the value of the additionalInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation }
     * 
     * 
     */
    public List<AdditionalInformation> getAdditionalInformation() {
        if (additionalInformation == null) {
            additionalInformation = new ArrayList<AdditionalInformation>();
        }
        return this.additionalInformation;
    }

}
