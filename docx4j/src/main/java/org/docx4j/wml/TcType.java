/*
 *  Copyright 2007, Plutext Pty Ltd.
 *   
 *  This file is part of docx4j.

    docx4j is free software: you can use it, redistribute it and/or modify
    it under the terms of version 3 of the GNU Affero General Public License 
    as published by the Free Software Foundation.

    docx4j is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License   
    along with docx4j.  If not, see <http://www.fsf.org/licensing/licenses/>.
    
 */

package org.docx4j.wml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.ppp.Child;


/**
 * <p>Java class for CT_Tc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Tc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://schemas.openxmlformats.org/wordprocessingml/2006/main}tcPr" minOccurs="0"/>
 *         &lt;group ref="{http://schemas.openxmlformats.org/wordprocessingml/2006/main}BlockLevelElements" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Tc", propOrder = {
    "tcPr",
    "blockLevelElements"
})
public class TcType
    implements Child
{

    protected TcPr tcPr;
    @XmlElementRefs({
        @XmlElementRef(name = "del", namespace = "http://schemas.openxmlformats.org/wordprocessingml/2006/main", type = JAXBElement.class),
        @XmlElementRef(name = "ins", namespace = "http://schemas.openxmlformats.org/wordprocessingml/2006/main", type = JAXBElement.class),
        @XmlElementRef(name = "p", namespace = "http://schemas.openxmlformats.org/wordprocessingml/2006/main", type = JAXBElement.class),
        @XmlElementRef(name = "tbl", namespace = "http://schemas.openxmlformats.org/wordprocessingml/2006/main", type = JAXBElement.class),
        @XmlElementRef(name = "sdt", namespace = "http://schemas.openxmlformats.org/wordprocessingml/2006/main", type = Sdt.class)
    })
    protected List<Object> blockLevelElements;
    @XmlTransient
    private Object parent;

    /**
     * Gets the value of the tcPr property.
     * 
     * @return
     *     possible object is
     *     {@link TcPr }
     *     
     */
    public TcPr getTcPr() {
        return tcPr;
    }

    /**
     * Sets the value of the tcPr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcPr }
     *     
     */
    public void setTcPr(TcPr value) {
        this.tcPr = value;
    }

    /**
     * Gets the value of the blockLevelElements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the blockLevelElements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlockLevelElements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link RunTrackChange }{@code >}
     * {@link JAXBElement }{@code <}{@link RunTrackChange }{@code >}
     * {@link JAXBElement }{@code <}{@link P }{@code >}
     * {@link JAXBElement }{@code <}{@link Tbl }{@code >}
     * {@link Sdt }
     * 
     * 
     */
    public List<Object> getBlockLevelElements() {
        if (blockLevelElements == null) {
            blockLevelElements = new ArrayList<Object>();
        }
        return this.blockLevelElements;
    }

    /**
     * Gets the parent object in the object tree representing the unmarshalled xml document.
     * 
     * @return
     *     The parent object.
     */
    public Object getParent() {
        return this.parent;
    }

    public void setParent(Object parent) {
        this.parent = parent;
    }

    /**
     * This method is invoked by the JAXB implementation on each instance when unmarshalling completes.
     * 
     * @param parent
     *     The parent object in the object tree.
     * @param unmarshaller
     *     The unmarshaller that generated the instance.
     */
    public void afterUnmarshal(Unmarshaller unmarshaller, Object parent) {
        setParent(parent);
    }

}
