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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ExpectedQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LimitationDescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MaximumQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MinimumQuantityType;
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
 * <p>Java class for EconomicOperatorShortListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EconomicOperatorShortListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LimitationDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExpectedQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MinimumQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PreSelectedParty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EconomicOperatorShortListType", propOrder = {
    "limitationDescription",
    "expectedQuantity",
    "maximumQuantity",
    "minimumQuantity",
    "preSelectedParty"
})
public class EconomicOperatorShortListType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "LimitationDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<LimitationDescriptionType> limitationDescription;
    @XmlElement(name = "ExpectedQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ExpectedQuantityType expectedQuantity;
    @XmlElement(name = "MaximumQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MaximumQuantityType maximumQuantity;
    @XmlElement(name = "MinimumQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MinimumQuantityType minimumQuantity;
    @XmlElement(name = "PreSelectedParty")
    protected List<PartyType> preSelectedParty;

    /**
     * Gets the value of the limitationDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the limitationDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLimitationDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LimitationDescriptionType }
     * 
     * 
     */
    public List<LimitationDescriptionType> getLimitationDescription() {
        if (limitationDescription == null) {
            limitationDescription = new ArrayList<LimitationDescriptionType>();
        }
        return this.limitationDescription;
    }

    /**
     * Gets the value of the expectedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedQuantityType }
     *     
     */
    public ExpectedQuantityType getExpectedQuantity() {
        return expectedQuantity;
    }

    /**
     * Sets the value of the expectedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedQuantityType }
     *     
     */
    public void setExpectedQuantity(ExpectedQuantityType value) {
        this.expectedQuantity = value;
    }

    /**
     * Gets the value of the maximumQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumQuantityType }
     *     
     */
    public MaximumQuantityType getMaximumQuantity() {
        return maximumQuantity;
    }

    /**
     * Sets the value of the maximumQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumQuantityType }
     *     
     */
    public void setMaximumQuantity(MaximumQuantityType value) {
        this.maximumQuantity = value;
    }

    /**
     * Gets the value of the minimumQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link MinimumQuantityType }
     *     
     */
    public MinimumQuantityType getMinimumQuantity() {
        return minimumQuantity;
    }

    /**
     * Sets the value of the minimumQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumQuantityType }
     *     
     */
    public void setMinimumQuantity(MinimumQuantityType value) {
        this.minimumQuantity = value;
    }

    /**
     * Gets the value of the preSelectedParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preSelectedParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreSelectedParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyType }
     * 
     * 
     */
    public List<PartyType> getPreSelectedParty() {
        if (preSelectedParty == null) {
            preSelectedParty = new ArrayList<PartyType>();
        }
        return this.preSelectedParty;
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
            List<LimitationDescriptionType> theLimitationDescription;
            theLimitationDescription = (((this.limitationDescription!= null)&&(!this.limitationDescription.isEmpty()))?this.getLimitationDescription():null);
            strategy.appendField(locator, this, "limitationDescription", buffer, theLimitationDescription);
        }
        {
            ExpectedQuantityType theExpectedQuantity;
            theExpectedQuantity = this.getExpectedQuantity();
            strategy.appendField(locator, this, "expectedQuantity", buffer, theExpectedQuantity);
        }
        {
            MaximumQuantityType theMaximumQuantity;
            theMaximumQuantity = this.getMaximumQuantity();
            strategy.appendField(locator, this, "maximumQuantity", buffer, theMaximumQuantity);
        }
        {
            MinimumQuantityType theMinimumQuantity;
            theMinimumQuantity = this.getMinimumQuantity();
            strategy.appendField(locator, this, "minimumQuantity", buffer, theMinimumQuantity);
        }
        {
            List<PartyType> thePreSelectedParty;
            thePreSelectedParty = (((this.preSelectedParty!= null)&&(!this.preSelectedParty.isEmpty()))?this.getPreSelectedParty():null);
            strategy.appendField(locator, this, "preSelectedParty", buffer, thePreSelectedParty);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof EconomicOperatorShortListType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EconomicOperatorShortListType that = ((EconomicOperatorShortListType) object);
        {
            List<LimitationDescriptionType> lhsLimitationDescription;
            lhsLimitationDescription = (((this.limitationDescription!= null)&&(!this.limitationDescription.isEmpty()))?this.getLimitationDescription():null);
            List<LimitationDescriptionType> rhsLimitationDescription;
            rhsLimitationDescription = (((that.limitationDescription!= null)&&(!that.limitationDescription.isEmpty()))?that.getLimitationDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "limitationDescription", lhsLimitationDescription), LocatorUtils.property(thatLocator, "limitationDescription", rhsLimitationDescription), lhsLimitationDescription, rhsLimitationDescription)) {
                return false;
            }
        }
        {
            ExpectedQuantityType lhsExpectedQuantity;
            lhsExpectedQuantity = this.getExpectedQuantity();
            ExpectedQuantityType rhsExpectedQuantity;
            rhsExpectedQuantity = that.getExpectedQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "expectedQuantity", lhsExpectedQuantity), LocatorUtils.property(thatLocator, "expectedQuantity", rhsExpectedQuantity), lhsExpectedQuantity, rhsExpectedQuantity)) {
                return false;
            }
        }
        {
            MaximumQuantityType lhsMaximumQuantity;
            lhsMaximumQuantity = this.getMaximumQuantity();
            MaximumQuantityType rhsMaximumQuantity;
            rhsMaximumQuantity = that.getMaximumQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maximumQuantity", lhsMaximumQuantity), LocatorUtils.property(thatLocator, "maximumQuantity", rhsMaximumQuantity), lhsMaximumQuantity, rhsMaximumQuantity)) {
                return false;
            }
        }
        {
            MinimumQuantityType lhsMinimumQuantity;
            lhsMinimumQuantity = this.getMinimumQuantity();
            MinimumQuantityType rhsMinimumQuantity;
            rhsMinimumQuantity = that.getMinimumQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minimumQuantity", lhsMinimumQuantity), LocatorUtils.property(thatLocator, "minimumQuantity", rhsMinimumQuantity), lhsMinimumQuantity, rhsMinimumQuantity)) {
                return false;
            }
        }
        {
            List<PartyType> lhsPreSelectedParty;
            lhsPreSelectedParty = (((this.preSelectedParty!= null)&&(!this.preSelectedParty.isEmpty()))?this.getPreSelectedParty():null);
            List<PartyType> rhsPreSelectedParty;
            rhsPreSelectedParty = (((that.preSelectedParty!= null)&&(!that.preSelectedParty.isEmpty()))?that.getPreSelectedParty():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preSelectedParty", lhsPreSelectedParty), LocatorUtils.property(thatLocator, "preSelectedParty", rhsPreSelectedParty), lhsPreSelectedParty, rhsPreSelectedParty)) {
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
            List<LimitationDescriptionType> theLimitationDescription;
            theLimitationDescription = (((this.limitationDescription!= null)&&(!this.limitationDescription.isEmpty()))?this.getLimitationDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "limitationDescription", theLimitationDescription), currentHashCode, theLimitationDescription);
        }
        {
            ExpectedQuantityType theExpectedQuantity;
            theExpectedQuantity = this.getExpectedQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "expectedQuantity", theExpectedQuantity), currentHashCode, theExpectedQuantity);
        }
        {
            MaximumQuantityType theMaximumQuantity;
            theMaximumQuantity = this.getMaximumQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maximumQuantity", theMaximumQuantity), currentHashCode, theMaximumQuantity);
        }
        {
            MinimumQuantityType theMinimumQuantity;
            theMinimumQuantity = this.getMinimumQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minimumQuantity", theMinimumQuantity), currentHashCode, theMinimumQuantity);
        }
        {
            List<PartyType> thePreSelectedParty;
            thePreSelectedParty = (((this.preSelectedParty!= null)&&(!this.preSelectedParty.isEmpty()))?this.getPreSelectedParty():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "preSelectedParty", thePreSelectedParty), currentHashCode, thePreSelectedParty);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}