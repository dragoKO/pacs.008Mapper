//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.05.18 at 11:38:35 AM EDT 
//


package iso.std.iso._20022.tech.xsd.pacs_008_001;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstructionForNextAgent1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstructionForNextAgent1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cd" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.12}Instruction4Code" minOccurs="0"/&gt;
 *         &lt;element name="InstrInf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.12}Max140Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstructionForNextAgent1", propOrder = {
    "cd",
    "instrInf"
})
public class InstructionForNextAgent1 {

    @XmlElement(name = "Cd")
    @XmlSchemaType(name = "string")
    protected Instruction4Code cd;
    @XmlElement(name = "InstrInf")
    protected String instrInf;

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link Instruction4Code }
     *     
     */
    public Instruction4Code getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Instruction4Code }
     *     
     */
    public void setCd(Instruction4Code value) {
        this.cd = value;
    }

    /**
     * Gets the value of the instrInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrInf() {
        return instrInf;
    }

    /**
     * Sets the value of the instrInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrInf(String value) {
        this.instrInf = value;
    }

}
