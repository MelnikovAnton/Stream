
package ru.melnikov.mypackage1;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.melnikov.mypackage1 package.
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FileStatus_QNAME = new QName("", "FileStatus");
    private final static QName _Address_QNAME = new QName("", "Address");
    private final static QName _InstanceID_QNAME = new QName("", "InstanceID");
    private final static QName _Size_QNAME = new QName("", "Size");
    private final static QName _CreatedAt_QNAME = new QName("", "CreatedAt");
    private final static QName _PartitionStatus_QNAME = new QName("", "PartitionStatus");
    private final static QName _Dependent_QNAME = new QName("", "Dependent");
    private final static QName _Upgrade_QNAME = new QName("", "Upgrade");
    private final static QName _ModuleType_QNAME = new QName("", "ModuleType");
    private final static QName _Capacity_QNAME = new QName("", "Capacity");
    private final static QName _Version_QNAME = new QName("", "Version");
    private final static QName _Checksum_QNAME = new QName("", "Checksum");
    private final static QName _Classification_QNAME = new QName("", "Classification");
    private final static QName _Manufacturer_QNAME = new QName("", "Manufacturer");
    private final static QName _AlternatePoolType_QNAME = new QName("", "AlternatePoolType");
    private final static QName _SubnetMask_QNAME = new QName("", "SubnetMask");
    private final static QName _IsValid_QNAME = new QName("", "IsValid");
    private final static QName _VersionString_QNAME = new QName("", "VersionString");
    private final static QName _PoolType_QNAME = new QName("", "PoolType");
    private final static QName _FileCount_QNAME = new QName("", "FileCount");
    private final static QName _LargestFree_QNAME = new QName("", "LargestFree");
    private final static QName _PhysicalAddress_QNAME = new QName("", "PhysicalAddress");
    private final static QName _OperationalStatus_QNAME = new QName("", "OperationalStatus");
    private final static QName _Allocated_QNAME = new QName("", "Allocated");
    private final static QName _Free_QNAME = new QName("", "Free");
    private final static QName _HardwareVersion_QNAME = new QName("", "HardwareVersion");
    private final static QName _LocationWithinContainer_QNAME = new QName("", "LocationWithinContainer");
    private final static QName _InstanceName_QNAME = new QName("", "InstanceName");
    private final static QName _EnabledStatus_QNAME = new QName("", "EnabledStatus");
    private final static QName _SerialNumber_QNAME = new QName("", "SerialNumber");
    private final static QName _ChassisSystemType_QNAME = new QName("", "ChassisSystemType");
    private final static QName _PortNumber_QNAME = new QName("", "PortNumber");
    private final static QName _NumberOfPartitions_QNAME = new QName("", "NumberOfPartitions");
    private final static QName _FileSystemSize_QNAME = new QName("", "FileSystemSize");
    private final static QName _PortType_QNAME = new QName("", "PortType");
    private final static QName _FileSize_QNAME = new QName("", "FileSize");
    private final static QName _Description_QNAME = new QName("", "Description");
    private final static QName _NumberOfPorts_QNAME = new QName("", "NumberOfPorts");
    private final static QName _NumberOfSlots_QNAME = new QName("", "NumberOfSlots");
    private final static QName _IfInstanceID_QNAME = new QName("", "IfInstanceID");
    private final static QName _ModuleNumber_QNAME = new QName("", "ModuleNumber");
    private final static QName _NetworkAddress_QNAME = new QName("", "NetworkAddress");
    private final static QName _OfficialHostName_QNAME = new QName("", "OfficialHostName");
    private final static QName _RMEServer_QNAME = new QName("", "RMEServer");
    private final static QName _CardType_QNAME = new QName("", "CardType");
    private final static QName _ChipCount_QNAME = new QName("", "ChipCount");
    private final static QName _FWManufacturer_QNAME = new QName("", "FWManufacturer");
    private final static QName _NoOfCommunicationConnectors_QNAME = new QName("", "NoOfCommunicationConnectors");
    private final static QName _SysObjectId_QNAME = new QName("", "SysObjectId");
    private final static QName _MemoryType_QNAME = new QName("", "MemoryType");
    private final static QName _Speed_QNAME = new QName("", "Speed");
    private final static QName _RequestedStatus_QNAME = new QName("", "RequestedStatus");
    private final static QName _ConnectorType_QNAME = new QName("", "ConnectorType");
    private final static QName _SchemaVersion_QNAME = new QName("", "SchemaVersion");
    private final static QName _Removable_QNAME = new QName("", "Removable");
    private final static QName _SlotNumber_QNAME = new QName("", "SlotNumber");
    private final static QName _AvailableSpace_QNAME = new QName("", "AvailableSpace");
    private final static QName _NeedsErasure_QNAME = new QName("", "NeedsErasure");
    private final static QName _ProtocolType_QNAME = new QName("", "ProtocolType");
    private final static QName _OSFamily_QNAME = new QName("", "OSFamily");
    private final static QName _Model_QNAME = new QName("", "Model");
    private final static QName _SysUpTime_QNAME = new QName("", "SysUpTime");
    private final static QName _Antecedent_QNAME = new QName("", "Antecedent");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.melnikov.mypackage1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CiscoCommunicationConnector }
     * 
     */
    public CiscoCommunicationConnector createCiscoCommunicationConnector() {
        return new CiscoCommunicationConnector();
    }

    /**
     * Create an instance of {@link CiscoMemoryPool }
     * 
     */
    public CiscoMemoryPool createCiscoMemoryPool() {
        return new CiscoMemoryPool();
    }

    /**
     * Create an instance of {@link CiscoPort }
     * 
     */
    public CiscoPort createCiscoPort() {
        return new CiscoPort();
    }

    /**
     * Create an instance of {@link InvDetails }
     * 
     */
    public InvDetails createInvDetails() {
        return new InvDetails();
    }

    /**
     * Create an instance of {@link SchemaInfo }
     * 
     */
    public SchemaInfo createSchemaInfo() {
        return new SchemaInfo();
    }

    /**
     * Create an instance of {@link RMEPlatform }
     * 
     */
    public RMEPlatform createRMEPlatform() {
        return new RMEPlatform();
    }

    /**
     * Create an instance of {@link CiscoChassis }
     * 
     */
    public CiscoChassis createCiscoChassis() {
        return new CiscoChassis();
    }

    /**
     * Create an instance of {@link CiscoCard }
     * 
     */
    public CiscoCard createCiscoCard() {
        return new CiscoCard();
    }

    /**
     * Create an instance of {@link CiscoFlashDevice }
     * 
     */
    public CiscoFlashDevice createCiscoFlashDevice() {
        return new CiscoFlashDevice();
    }

    /**
     * Create an instance of {@link CiscoFlashPartition }
     * 
     */
    public CiscoFlashPartition createCiscoFlashPartition() {
        return new CiscoFlashPartition();
    }

    /**
     * Create an instance of {@link CiscoFlashFile }
     * 
     */
    public CiscoFlashFile createCiscoFlashFile() {
        return new CiscoFlashFile();
    }

    /**
     * Create an instance of {@link CiscoPhysicalMemory }
     * 
     */
    public CiscoPhysicalMemory createCiscoPhysicalMemory() {
        return new CiscoPhysicalMemory();
    }

    /**
     * Create an instance of {@link SoftwareIdentity }
     * 
     */
    public SoftwareIdentity createSoftwareIdentity() {
        return new SoftwareIdentity();
    }

    /**
     * Create an instance of {@link AdditionalInformation }
     * 
     */
    public AdditionalInformation createAdditionalInformation() {
        return new AdditionalInformation();
    }

    /**
     * Create an instance of {@link AD }
     * 
     */
    public AD createAD() {
        return new AD();
    }

    /**
     * Create an instance of {@link CiscoNetworkElement }
     * 
     */
    public CiscoNetworkElement createCiscoNetworkElement() {
        return new CiscoNetworkElement();
    }

    /**
     * Create an instance of {@link PrimaryOwnerName }
     * 
     */
    public PrimaryOwnerName createPrimaryOwnerName() {
        return new PrimaryOwnerName();
    }

    /**
     * Create an instance of {@link PhysicalPosition }
     * 
     */
    public PhysicalPosition createPhysicalPosition() {
        return new PhysicalPosition();
    }

    /**
     * Create an instance of {@link CiscoLogicalModule }
     * 
     */
    public CiscoLogicalModule createCiscoLogicalModule() {
        return new CiscoLogicalModule();
    }

    /**
     * Create an instance of {@link CiscoOSElement }
     * 
     */
    public CiscoOSElement createCiscoOSElement() {
        return new CiscoOSElement();
    }

    /**
     * Create an instance of {@link CiscoIfEntry }
     * 
     */
    public CiscoIfEntry createCiscoIfEntry() {
        return new CiscoIfEntry();
    }

    /**
     * Create an instance of {@link CiscoIPProtocolEndpoint }
     * 
     */
    public CiscoIPProtocolEndpoint createCiscoIPProtocolEndpoint() {
        return new CiscoIPProtocolEndpoint();
    }

    /**
     * Create an instance of {@link CiscoComputerSystemPackage }
     * 
     */
    public CiscoComputerSystemPackage createCiscoComputerSystemPackage() {
        return new CiscoComputerSystemPackage();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FileStatus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createFileStatus(String value) {
        return new JAXBElement<String>(_FileStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Address")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAddress(String value) {
        return new JAXBElement<String>(_Address_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "InstanceID")
    public JAXBElement<BigInteger> createInstanceID(BigInteger value) {
        return new JAXBElement<BigInteger>(_InstanceID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Size")
    public JAXBElement<BigInteger> createSize(BigInteger value) {
        return new JAXBElement<BigInteger>(_Size_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CreatedAt")
    public JAXBElement<String> createCreatedAt(String value) {
        return new JAXBElement<String>(_CreatedAt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PartitionStatus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPartitionStatus(String value) {
        return new JAXBElement<String>(_PartitionStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Dependent")
    public JAXBElement<BigInteger> createDependent(BigInteger value) {
        return new JAXBElement<BigInteger>(_Dependent_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Upgrade")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createUpgrade(String value) {
        return new JAXBElement<String>(_Upgrade_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ModuleType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createModuleType(String value) {
        return new JAXBElement<String>(_ModuleType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Capacity")
    public JAXBElement<BigInteger> createCapacity(BigInteger value) {
        return new JAXBElement<BigInteger>(_Capacity_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Version")
    public JAXBElement<String> createVersion(String value) {
        return new JAXBElement<String>(_Version_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Checksum")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createChecksum(String value) {
        return new JAXBElement<String>(_Checksum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Classification")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createClassification(String value) {
        return new JAXBElement<String>(_Classification_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Manufacturer")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createManufacturer(String value) {
        return new JAXBElement<String>(_Manufacturer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AlternatePoolType")
    public JAXBElement<BigInteger> createAlternatePoolType(BigInteger value) {
        return new JAXBElement<BigInteger>(_AlternatePoolType_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SubnetMask")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSubnetMask(String value) {
        return new JAXBElement<String>(_SubnetMask_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IsValid")
    public JAXBElement<Boolean> createIsValid(Boolean value) {
        return new JAXBElement<Boolean>(_IsValid_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "VersionString")
    public JAXBElement<String> createVersionString(String value) {
        return new JAXBElement<String>(_VersionString_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PoolType")
    public JAXBElement<BigInteger> createPoolType(BigInteger value) {
        return new JAXBElement<BigInteger>(_PoolType_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FileCount")
    public JAXBElement<BigInteger> createFileCount(BigInteger value) {
        return new JAXBElement<BigInteger>(_FileCount_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LargestFree")
    public JAXBElement<BigInteger> createLargestFree(BigInteger value) {
        return new JAXBElement<BigInteger>(_LargestFree_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PhysicalAddress")
    public JAXBElement<String> createPhysicalAddress(String value) {
        return new JAXBElement<String>(_PhysicalAddress_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OperationalStatus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createOperationalStatus(String value) {
        return new JAXBElement<String>(_OperationalStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Allocated")
    public JAXBElement<BigInteger> createAllocated(BigInteger value) {
        return new JAXBElement<BigInteger>(_Allocated_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Free")
    public JAXBElement<BigInteger> createFree(BigInteger value) {
        return new JAXBElement<BigInteger>(_Free_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HardwareVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createHardwareVersion(String value) {
        return new JAXBElement<String>(_HardwareVersion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LocationWithinContainer")
    public JAXBElement<BigInteger> createLocationWithinContainer(BigInteger value) {
        return new JAXBElement<BigInteger>(_LocationWithinContainer_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "InstanceName")
    public JAXBElement<String> createInstanceName(String value) {
        return new JAXBElement<String>(_InstanceName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EnabledStatus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEnabledStatus(String value) {
        return new JAXBElement<String>(_EnabledStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SerialNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSerialNumber(String value) {
        return new JAXBElement<String>(_SerialNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ChassisSystemType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createChassisSystemType(String value) {
        return new JAXBElement<String>(_ChassisSystemType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PortNumber")
    public JAXBElement<BigInteger> createPortNumber(BigInteger value) {
        return new JAXBElement<BigInteger>(_PortNumber_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumberOfPartitions")
    public JAXBElement<BigInteger> createNumberOfPartitions(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumberOfPartitions_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FileSystemSize")
    public JAXBElement<BigInteger> createFileSystemSize(BigInteger value) {
        return new JAXBElement<BigInteger>(_FileSystemSize_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PortType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPortType(String value) {
        return new JAXBElement<String>(_PortType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FileSize")
    public JAXBElement<BigInteger> createFileSize(BigInteger value) {
        return new JAXBElement<BigInteger>(_FileSize_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Description")
    public JAXBElement<String> createDescription(String value) {
        return new JAXBElement<String>(_Description_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumberOfPorts")
    public JAXBElement<BigInteger> createNumberOfPorts(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumberOfPorts_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumberOfSlots")
    public JAXBElement<BigInteger> createNumberOfSlots(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumberOfSlots_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IfInstanceID")
    public JAXBElement<BigInteger> createIfInstanceID(BigInteger value) {
        return new JAXBElement<BigInteger>(_IfInstanceID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ModuleNumber")
    public JAXBElement<BigInteger> createModuleNumber(BigInteger value) {
        return new JAXBElement<BigInteger>(_ModuleNumber_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NetworkAddress")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createNetworkAddress(String value) {
        return new JAXBElement<String>(_NetworkAddress_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OfficialHostName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createOfficialHostName(String value) {
        return new JAXBElement<String>(_OfficialHostName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RMEServer")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRMEServer(String value) {
        return new JAXBElement<String>(_RMEServer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CardType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCardType(String value) {
        return new JAXBElement<String>(_CardType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ChipCount")
    public JAXBElement<BigInteger> createChipCount(BigInteger value) {
        return new JAXBElement<BigInteger>(_ChipCount_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FWManufacturer")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createFWManufacturer(String value) {
        return new JAXBElement<String>(_FWManufacturer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NoOfCommunicationConnectors")
    public JAXBElement<BigInteger> createNoOfCommunicationConnectors(BigInteger value) {
        return new JAXBElement<BigInteger>(_NoOfCommunicationConnectors_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SysObjectId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSysObjectId(String value) {
        return new JAXBElement<String>(_SysObjectId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MemoryType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createMemoryType(String value) {
        return new JAXBElement<String>(_MemoryType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Speed")
    public JAXBElement<BigInteger> createSpeed(BigInteger value) {
        return new JAXBElement<BigInteger>(_Speed_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RequestedStatus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRequestedStatus(String value) {
        return new JAXBElement<String>(_RequestedStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ConnectorType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createConnectorType(String value) {
        return new JAXBElement<String>(_ConnectorType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SchemaVersion")
    public JAXBElement<BigDecimal> createSchemaVersion(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SchemaVersion_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Removable")
    public JAXBElement<Boolean> createRemovable(Boolean value) {
        return new JAXBElement<Boolean>(_Removable_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SlotNumber")
    public JAXBElement<BigInteger> createSlotNumber(BigInteger value) {
        return new JAXBElement<BigInteger>(_SlotNumber_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AvailableSpace")
    public JAXBElement<BigInteger> createAvailableSpace(BigInteger value) {
        return new JAXBElement<BigInteger>(_AvailableSpace_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NeedsErasure")
    public JAXBElement<Boolean> createNeedsErasure(Boolean value) {
        return new JAXBElement<Boolean>(_NeedsErasure_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ProtocolType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createProtocolType(String value) {
        return new JAXBElement<String>(_ProtocolType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OSFamily")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createOSFamily(String value) {
        return new JAXBElement<String>(_OSFamily_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Model")
    public JAXBElement<String> createModel(String value) {
        return new JAXBElement<String>(_Model_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SysUpTime")
    public JAXBElement<String> createSysUpTime(String value) {
        return new JAXBElement<String>(_SysUpTime_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Antecedent")
    public JAXBElement<BigInteger> createAntecedent(BigInteger value) {
        return new JAXBElement<BigInteger>(_Antecedent_QNAME, BigInteger.class, null, value);
    }

}
