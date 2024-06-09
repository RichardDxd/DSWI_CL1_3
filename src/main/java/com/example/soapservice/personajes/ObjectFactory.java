//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.06.08 a las 05:45:20 PM PET 
//


package com.example.soapservice.personajes;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.soapservice.personajes package. 
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

    private final static QName _GetPersonajeRequest_QNAME = new QName("http://example.com/soapservice/personajes", "getPersonajeRequest");
    private final static QName _GetPersonajeResponse_QNAME = new QName("http://example.com/soapservice/personajes", "getPersonajeResponse");
    private final static QName _CreatePersonajeRequest_QNAME = new QName("http://example.com/soapservice/personajes", "createPersonajeRequest");
    private final static QName _CreatePersonajeResponse_QNAME = new QName("http://example.com/soapservice/personajes", "createPersonajeResponse");
    private final static QName _UpdatePersonajeRequest_QNAME = new QName("http://example.com/soapservice/personajes", "updatePersonajeRequest");
    private final static QName _UpdatePersonajeResponse_QNAME = new QName("http://example.com/soapservice/personajes", "updatePersonajeResponse");
    private final static QName _DeletePersonajeRequest_QNAME = new QName("http://example.com/soapservice/personajes", "deletePersonajeRequest");
    private final static QName _DeletePersonajeResponse_QNAME = new QName("http://example.com/soapservice/personajes", "deletePersonajeResponse");
    private final static QName _GetAllPersonajesRequest_QNAME = new QName("http://example.com/soapservice/personajes", "getAllPersonajesRequest");
    private final static QName _GetAllPersonajesResponse_QNAME = new QName("http://example.com/soapservice/personajes", "getAllPersonajesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.soapservice.personajes
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPersonajeRequest }
     * 
     */
    public GetPersonajeRequest createGetPersonajeRequest() {
        return new GetPersonajeRequest();
    }

    /**
     * Create an instance of {@link GetPersonajeResponse }
     * 
     */
    public GetPersonajeResponse createGetPersonajeResponse() {
        return new GetPersonajeResponse();
    }

    /**
     * Create an instance of {@link CreatePersonajeRequest }
     * 
     */
    public CreatePersonajeRequest createCreatePersonajeRequest() {
        return new CreatePersonajeRequest();
    }

    /**
     * Create an instance of {@link CreatePersonajeResponse }
     * 
     */
    public CreatePersonajeResponse createCreatePersonajeResponse() {
        return new CreatePersonajeResponse();
    }

    /**
     * Create an instance of {@link UpdatePersonajeRequest }
     * 
     */
    public UpdatePersonajeRequest createUpdatePersonajeRequest() {
        return new UpdatePersonajeRequest();
    }

    /**
     * Create an instance of {@link UpdatePersonajeResponse }
     * 
     */
    public UpdatePersonajeResponse createUpdatePersonajeResponse() {
        return new UpdatePersonajeResponse();
    }

    /**
     * Create an instance of {@link DeletePersonajeRequest }
     * 
     */
    public DeletePersonajeRequest createDeletePersonajeRequest() {
        return new DeletePersonajeRequest();
    }

    /**
     * Create an instance of {@link DeletePersonajeResponse }
     * 
     */
    public DeletePersonajeResponse createDeletePersonajeResponse() {
        return new DeletePersonajeResponse();
    }

    /**
     * Create an instance of {@link GetAllPersonajesRequest }
     * 
     */
    public GetAllPersonajesRequest createGetAllPersonajesRequest() {
        return new GetAllPersonajesRequest();
    }

    /**
     * Create an instance of {@link GetAllPersonajesResponse }
     * 
     */
    public GetAllPersonajesResponse createGetAllPersonajesResponse() {
        return new GetAllPersonajesResponse();
    }

    /**
     * Create an instance of {@link Personaje }
     * 
     */
    public Personaje createPersonaje() {
        return new Personaje();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonajeRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPersonajeRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.com/soapservice/personajes", name = "getPersonajeRequest")
    public JAXBElement<GetPersonajeRequest> createGetPersonajeRequest(GetPersonajeRequest value) {
        return new JAXBElement<GetPersonajeRequest>(_GetPersonajeRequest_QNAME, GetPersonajeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonajeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPersonajeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.com/soapservice/personajes", name = "getPersonajeResponse")
    public JAXBElement<GetPersonajeResponse> createGetPersonajeResponse(GetPersonajeResponse value) {
        return new JAXBElement<GetPersonajeResponse>(_GetPersonajeResponse_QNAME, GetPersonajeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonajeRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreatePersonajeRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.com/soapservice/personajes", name = "createPersonajeRequest")
    public JAXBElement<CreatePersonajeRequest> createCreatePersonajeRequest(CreatePersonajeRequest value) {
        return new JAXBElement<CreatePersonajeRequest>(_CreatePersonajeRequest_QNAME, CreatePersonajeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonajeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreatePersonajeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.com/soapservice/personajes", name = "createPersonajeResponse")
    public JAXBElement<CreatePersonajeResponse> createCreatePersonajeResponse(CreatePersonajeResponse value) {
        return new JAXBElement<CreatePersonajeResponse>(_CreatePersonajeResponse_QNAME, CreatePersonajeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonajeRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdatePersonajeRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.com/soapservice/personajes", name = "updatePersonajeRequest")
    public JAXBElement<UpdatePersonajeRequest> createUpdatePersonajeRequest(UpdatePersonajeRequest value) {
        return new JAXBElement<UpdatePersonajeRequest>(_UpdatePersonajeRequest_QNAME, UpdatePersonajeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonajeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdatePersonajeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.com/soapservice/personajes", name = "updatePersonajeResponse")
    public JAXBElement<UpdatePersonajeResponse> createUpdatePersonajeResponse(UpdatePersonajeResponse value) {
        return new JAXBElement<UpdatePersonajeResponse>(_UpdatePersonajeResponse_QNAME, UpdatePersonajeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersonajeRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeletePersonajeRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.com/soapservice/personajes", name = "deletePersonajeRequest")
    public JAXBElement<DeletePersonajeRequest> createDeletePersonajeRequest(DeletePersonajeRequest value) {
        return new JAXBElement<DeletePersonajeRequest>(_DeletePersonajeRequest_QNAME, DeletePersonajeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersonajeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeletePersonajeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.com/soapservice/personajes", name = "deletePersonajeResponse")
    public JAXBElement<DeletePersonajeResponse> createDeletePersonajeResponse(DeletePersonajeResponse value) {
        return new JAXBElement<DeletePersonajeResponse>(_DeletePersonajeResponse_QNAME, DeletePersonajeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllPersonajesRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllPersonajesRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.com/soapservice/personajes", name = "getAllPersonajesRequest")
    public JAXBElement<GetAllPersonajesRequest> createGetAllPersonajesRequest(GetAllPersonajesRequest value) {
        return new JAXBElement<GetAllPersonajesRequest>(_GetAllPersonajesRequest_QNAME, GetAllPersonajesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllPersonajesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllPersonajesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.com/soapservice/personajes", name = "getAllPersonajesResponse")
    public JAXBElement<GetAllPersonajesResponse> createGetAllPersonajesResponse(GetAllPersonajesResponse value) {
        return new JAXBElement<GetAllPersonajesResponse>(_GetAllPersonajesResponse_QNAME, GetAllPersonajesResponse.class, null, value);
    }

}
