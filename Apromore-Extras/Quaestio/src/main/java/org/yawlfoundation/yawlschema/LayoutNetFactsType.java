/*
 * Copyright © 2009-2017 The Apromore Initiative.
 *
 * This file is part of "Apromore".
 *
 * "Apromore" is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 3 of the
 * License, or (at your option) any later version.
 *
 * "Apromore" is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program.
 * If not, see <http://www.gnu.org/licenses/lgpl-3.0.html>.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.11.03 at 05:04:23 PM CET 
//

package org.yawlfoundation.yawlschema;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * Java class for LayoutNetFactsType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="LayoutNetFactsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="frame" type="{http://www.yawlfoundation.org/yawlschema}LayoutFrameType"/>
 *         &lt;element name="scale" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="vertex" type="{http://www.yawlfoundation.org/yawlschema}LayoutVertexFactsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="container" type="{http://www.yawlfoundation.org/yawlschema}LayoutContainerFactsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="flow" type="{http://www.yawlfoundation.org/yawlschema}LayoutFlowFactsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="bgColor" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LayoutNetFactsType", propOrder = { "frameOrScaleOrVertex" })
public class LayoutNetFactsType {

	@XmlElements({
			@XmlElement(name = "flow", type = LayoutFlowFactsType.class),
			@XmlElement(name = "container", type = LayoutContainerFactsType.class),
			@XmlElement(name = "vertex", type = LayoutVertexFactsType.class),
			@XmlElement(name = "frame", type = LayoutFrameType.class),
			@XmlElement(name = "scale", type = Double.class) })
	protected List<Object> frameOrScaleOrVertex;
	@XmlAttribute(required = true)
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlSchemaType(name = "NCName")
	protected String id;
	@XmlAttribute
	protected BigInteger bgColor;

	/**
	 * Gets the value of the frameOrScaleOrVertex property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the frameOrScaleOrVertex property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getFrameOrScaleOrVertex().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link LayoutFlowFactsType } {@link LayoutContainerFactsType }
	 * {@link LayoutVertexFactsType } {@link LayoutFrameType } {@link Double }
	 * 
	 * 
	 */
	public List<Object> getFrameOrScaleOrVertex() {
		if (frameOrScaleOrVertex == null) {
			frameOrScaleOrVertex = new ArrayList<Object>();
		}
		return this.frameOrScaleOrVertex;
	}

	/**
	 * Gets the value of the id property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setId(String value) {
		this.id = value;
	}

	/**
	 * Gets the value of the bgColor property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getBgColor() {
		return bgColor;
	}

	/**
	 * Sets the value of the bgColor property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setBgColor(BigInteger value) {
		this.bgColor = value;
	}

}
