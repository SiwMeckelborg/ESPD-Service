//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.11 at 11:41:57 AM CET 
//


package oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CorporateRegistrationTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NameType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for CorporateRegistrationSchemeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorporateRegistrationSchemeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CorporateRegistrationTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}JurisdictionRegionAddress" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateRegistrationSchemeType", propOrder = {
    "id",
    "name",
    "corporateRegistrationTypeCode",
    "jurisdictionRegionAddress"
})
public class CorporateRegistrationSchemeType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "Name", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NameType name;
    @XmlElement(name = "CorporateRegistrationTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CorporateRegistrationTypeCodeType corporateRegistrationTypeCode;
    @XmlElement(name = "JurisdictionRegionAddress")
    protected List<AddressType> jurisdictionRegionAddress;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setID(IDType value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setName(NameType value) {
        this.name = value;
    }

    /**
     * Gets the value of the corporateRegistrationTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateRegistrationTypeCodeType }
     *     
     */
    public CorporateRegistrationTypeCodeType getCorporateRegistrationTypeCode() {
        return corporateRegistrationTypeCode;
    }

    /**
     * Sets the value of the corporateRegistrationTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateRegistrationTypeCodeType }
     *     
     */
    public void setCorporateRegistrationTypeCode(CorporateRegistrationTypeCodeType value) {
        this.corporateRegistrationTypeCode = value;
    }

    /**
     * Gets the value of the jurisdictionRegionAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jurisdictionRegionAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJurisdictionRegionAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressType }
     * 
     * 
     */
    public List<AddressType> getJurisdictionRegionAddress() {
        if (jurisdictionRegionAddress == null) {
            jurisdictionRegionAddress = new ArrayList<AddressType>();
        }
        return this.jurisdictionRegionAddress;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            IDType theID;
            theID = this.getID();
            strategy.appendField(locator, this, "id", buffer, theID);
        }
        {
            NameType theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            CorporateRegistrationTypeCodeType theCorporateRegistrationTypeCode;
            theCorporateRegistrationTypeCode = this.getCorporateRegistrationTypeCode();
            strategy.appendField(locator, this, "corporateRegistrationTypeCode", buffer, theCorporateRegistrationTypeCode);
        }
        {
            List<AddressType> theJurisdictionRegionAddress;
            theJurisdictionRegionAddress = (((this.jurisdictionRegionAddress!= null)&&(!this.jurisdictionRegionAddress.isEmpty()))?this.getJurisdictionRegionAddress():null);
            strategy.appendField(locator, this, "jurisdictionRegionAddress", buffer, theJurisdictionRegionAddress);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CorporateRegistrationSchemeType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CorporateRegistrationSchemeType that = ((CorporateRegistrationSchemeType) object);
        {
            IDType lhsID;
            lhsID = this.getID();
            IDType rhsID;
            rhsID = that.getID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsID), LocatorUtils.property(thatLocator, "id", rhsID), lhsID, rhsID)) {
                return false;
            }
        }
        {
            NameType lhsName;
            lhsName = this.getName();
            NameType rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            CorporateRegistrationTypeCodeType lhsCorporateRegistrationTypeCode;
            lhsCorporateRegistrationTypeCode = this.getCorporateRegistrationTypeCode();
            CorporateRegistrationTypeCodeType rhsCorporateRegistrationTypeCode;
            rhsCorporateRegistrationTypeCode = that.getCorporateRegistrationTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "corporateRegistrationTypeCode", lhsCorporateRegistrationTypeCode), LocatorUtils.property(thatLocator, "corporateRegistrationTypeCode", rhsCorporateRegistrationTypeCode), lhsCorporateRegistrationTypeCode, rhsCorporateRegistrationTypeCode)) {
                return false;
            }
        }
        {
            List<AddressType> lhsJurisdictionRegionAddress;
            lhsJurisdictionRegionAddress = (((this.jurisdictionRegionAddress!= null)&&(!this.jurisdictionRegionAddress.isEmpty()))?this.getJurisdictionRegionAddress():null);
            List<AddressType> rhsJurisdictionRegionAddress;
            rhsJurisdictionRegionAddress = (((that.jurisdictionRegionAddress!= null)&&(!that.jurisdictionRegionAddress.isEmpty()))?that.getJurisdictionRegionAddress():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "jurisdictionRegionAddress", lhsJurisdictionRegionAddress), LocatorUtils.property(thatLocator, "jurisdictionRegionAddress", rhsJurisdictionRegionAddress), lhsJurisdictionRegionAddress, rhsJurisdictionRegionAddress)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            IDType theID;
            theID = this.getID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theID), currentHashCode, theID);
        }
        {
            NameType theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            CorporateRegistrationTypeCodeType theCorporateRegistrationTypeCode;
            theCorporateRegistrationTypeCode = this.getCorporateRegistrationTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "corporateRegistrationTypeCode", theCorporateRegistrationTypeCode), currentHashCode, theCorporateRegistrationTypeCode);
        }
        {
            List<AddressType> theJurisdictionRegionAddress;
            theJurisdictionRegionAddress = (((this.jurisdictionRegionAddress!= null)&&(!this.jurisdictionRegionAddress.isEmpty()))?this.getJurisdictionRegionAddress():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "jurisdictionRegionAddress", theJurisdictionRegionAddress), currentHashCode, theJurisdictionRegionAddress);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}