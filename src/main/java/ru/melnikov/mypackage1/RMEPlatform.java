
package ru.melnikov.mypackage1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence>
 *         &lt;element ref="{}Cisco_Chassis"/>
 *         &lt;element ref="{}Cisco_NetworkElement"/>
 *         &lt;element ref="{}Cisco_ComputerSystemPackage"/>
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
    "ciscoChassis",
    "ciscoNetworkElement",
    "ciscoComputerSystemPackage"
}*/)
@XmlRootElement(name = "RMEPlatform")
public class RMEPlatform {

  //  @XmlElement(name = "Cisco_Chassis", required = true)
//    protected CiscoChassis ciscoChassis;
    @XmlElement(name = "Cisco_NetworkElement", required = true)
    protected CiscoNetworkElement ciscoNetworkElement;
  //  @XmlElement(name = "Cisco_ComputerSystemPackage", required = true)
 //   protected CiscoComputerSystemPackage ciscoComputerSystemPackage;

    /**
     * Gets the value of the ciscoChassis property.
     * 
     * @return
     *     possible object is
     *     {@link CiscoChassis }
     *     
     */
//    public CiscoChassis getCiscoChassis() {
//        return ciscoChassis;
//    }

    /**
     * Sets the value of the ciscoChassis property.
     * 
     * @param value
     *     allowed object is
     *     {@link CiscoChassis }
     *     
     */
//    public void setCiscoChassis(CiscoChassis value) {
//        this.ciscoChassis = value;
//    }

    /**
     * Gets the value of the ciscoNetworkElement property.
     * 
     * @return
     *     possible object is
     *     {@link CiscoNetworkElement }
     *     
     */
    public CiscoNetworkElement getCiscoNetworkElement() {
        return ciscoNetworkElement;
    }

    /**
     * Sets the value of the ciscoNetworkElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link CiscoNetworkElement }
     *     
     */
    public void setCiscoNetworkElement(CiscoNetworkElement value) {
        this.ciscoNetworkElement = value;
    }

    /**
     * Gets the value of the ciscoComputerSystemPackage property.
     * 
     * @return
     *     possible object is
     *     {@link CiscoComputerSystemPackage }
     *     
     */
//    public CiscoComputerSystemPackage getCiscoComputerSystemPackage() {
//        return ciscoComputerSystemPackage;
//    }

    /**
     * Sets the value of the ciscoComputerSystemPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CiscoComputerSystemPackage }
     *     
     */
//    public void setCiscoComputerSystemPackage(CiscoComputerSystemPackage value) {
//        this.ciscoComputerSystemPackage = value;
//    }

}
