//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.06.08 a las 05:45:20 PM PET 
//


package com.example.soapservice.personajes;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para personaje complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="personaje"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idPersonaje" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nomPersonaje" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="apePersonaje" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fechNacPersonaje" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personaje", propOrder = {
    "idPersonaje",
    "nomPersonaje",
    "apePersonaje",
    "fechNacPersonaje"
})
public class Personaje {

    protected int idPersonaje;
    @XmlElement(required = true)
    protected String nomPersonaje;
    @XmlElement(required = true)
    protected String apePersonaje;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechNacPersonaje;

    /**
     * Obtiene el valor de la propiedad idPersonaje.
     * 
     */
    public int getIdPersonaje() {
        return idPersonaje;
    }

    /**
     * Define el valor de la propiedad idPersonaje.
     * 
     */
    public void setIdPersonaje(int value) {
        this.idPersonaje = value;
    }

    /**
     * Obtiene el valor de la propiedad nomPersonaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomPersonaje() {
        return nomPersonaje;
    }

    /**
     * Define el valor de la propiedad nomPersonaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomPersonaje(String value) {
        this.nomPersonaje = value;
    }

    /**
     * Obtiene el valor de la propiedad apePersonaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApePersonaje() {
        return apePersonaje;
    }

    /**
     * Define el valor de la propiedad apePersonaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApePersonaje(String value) {
        this.apePersonaje = value;
    }

    /**
     * Obtiene el valor de la propiedad fechNacPersonaje.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechNacPersonaje() {
        return fechNacPersonaje;
    }

    /**
     * Define el valor de la propiedad fechNacPersonaje.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechNacPersonaje(XMLGregorianCalendar value) {
        this.fechNacPersonaje = value;
    }

}
