//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.15 at 07:33:07 PM CDT 
//


package Com.JAXBApplication.JAXB;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Marks complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Marks"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Marks" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MaxMarks" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Marks", propOrder = {
    "subject",
    "marks",
    "maxMarks"
})
public class Marks {

    @XmlElement(name = "Subject", required = true)
    protected String subject;
    @XmlElement(name = "Marks")
    protected int marks;
    @XmlElement(name = "MaxMarks")
    protected int maxMarks;

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the marks property.
     * 
     */
    public int getMarks() {
        return marks;
    }

    /**
     * Sets the value of the marks property.
     * 
     */
    public void setMarks(int value) {
        this.marks = value;
    }

    /**
     * Gets the value of the maxMarks property.
     * 
     */
    public int getMaxMarks() {
        return maxMarks;
    }

    /**
     * Sets the value of the maxMarks property.
     * 
     */
    public void setMaxMarks(int value) {
        this.maxMarks = value;
    }

}
