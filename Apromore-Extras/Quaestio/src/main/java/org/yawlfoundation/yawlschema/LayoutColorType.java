/*
 * Copyright © 2009-2018 The Apromore Initiative.
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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for LayoutColorType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="LayoutColorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="r" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="g" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="b" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LayoutColorType")
public class LayoutColorType {

	@XmlAttribute(required = true)
	protected BigInteger r;
	@XmlAttribute(required = true)
	protected BigInteger g;
	@XmlAttribute(required = true)
	protected BigInteger b;

	/**
	 * Gets the value of the r property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getR() {
		return r;
	}

	/**
	 * Sets the value of the r property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setR(BigInteger value) {
		this.r = value;
	}

	/**
	 * Gets the value of the g property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getG() {
		return g;
	}

	/**
	 * Sets the value of the g property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setG(BigInteger value) {
		this.g = value;
	}

	/**
	 * Gets the value of the b property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getB() {
		return b;
	}

	/**
	 * Sets the value of the b property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setB(BigInteger value) {
		this.b = value;
	}

}
