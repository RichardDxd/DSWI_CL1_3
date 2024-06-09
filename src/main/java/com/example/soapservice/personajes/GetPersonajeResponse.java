//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.06.08 a las 05:45:20 PM PET 
//


package com.example.soapservice.personajes;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getPersonajeResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getPersonajeResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="personaje" type="{http://example.com/soapservice/personajes}personaje"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPersonajeResponse", propOrder = {
    "personaje"
})
public class GetPersonajeResponse {

    @XmlElement(required = true)
    protected Personaje personaje;

    /**
     * Obtiene el valor de la propiedad personaje.
     * 
     * @return
     *     possible object is
     *     {@link Personaje }
     *     
     */
    public Personaje getPersonaje() {
        return personaje;
    }

    /**
     * Define el valor de la propiedad personaje.
     * 
     * @param value
     *     allowed object is
     *     {@link Personaje }
     *     
     */
    public void setPersonaje(Personaje value) {
        this.personaje = value;
    }

}
