//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.06.08 a las 05:45:20 PM PET 
//


package com.example.soapservice.programas;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.soapservice.programas package. 
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

    private final static QName _GetProgramaRequest_QNAME = new QName("http://example.com/soapservice/programas", "getProgramaRequest");
    private final static QName _GetProgramaResponse_QNAME = new QName("http://example.com/soapservice/programas", "getProgramaResponse");
    private final static QName _CreateProgramaRequest_QNAME = new QName("http://example.com/soapservice/programas", "createProgramaRequest");
    private final static QName _CreateProgramaResponse_QNAME = new QName("http://example.com/soapservice/programas", "createProgramaResponse");
    private final static QName _UpdateProgramaRequest_QNAME = new QName("http://example.com/soapservice/programas", "updateProgramaRequest");
    private final static QName _UpdateProgramaResponse_QNAME = new QName("http://example.com/soapservice/programas", "updateProgramaResponse");
    private final static QName _DeleteProgramaRequest_QNAME = new QName("http://example.com/soapservice/programas", "deleteProgramaRequest");
    private final static QName _DeleteProgramaResponse_QNAME = new QName("http://example.com/soapservice/programas", "deleteProgramaResponse");
    private final static QName _GetAllProgramasRequest_QNAME = new QName("http://example.com/soapservice/programas", "getAllProgramasRequest");
    private final static QName _GetAllProgramasResponse_QNAME = new QName("http://example.com/soapservice/programas", "getAllProgramasResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.soapservice.programas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetProgramaRequest }
     * 
     */
    public GetProgramaRequest createGetProgramaRequest() {
        return new GetProgramaRequest();
    }

    /**
     * Create an instance of {@link GetProgramaResponse }
     * 
     */
    public GetProgramaResponse createGetProgramaResponse() {
        return new GetProgramaResponse();
    }

    /**
     * Create an instance of {@link CreateProgramaRequest }
     * 
     */
    public CreateProgramaRequest createCreateProgramaRequest() {
        return new CreateProgramaRequest();
    }

    /**
     * Create an instance of {@link CreateProgramaResponse }
     * 
     */
    public CreateProgramaResponse createCreateProgramaResponse() {
        return new CreateProgramaResponse();
    }

    /**
     * Create an instance of {@link UpdateProgramaRequest }
     * 
     */
    public UpdateProgramaRequest createUpdateProgramaRequest() {
        return new UpdateProgramaRequest();
    }

    /**
     * Create an instance of {@link UpdateProgramaResponse }
     * 
     */
    public UpdateProgramaResponse createUpdateProgramaResponse() {
        return new UpdateProgramaResponse();
    }

    /**
     * Create an instance of {@link DeleteProgramaRequest }
     * 
     */
    public DeleteProgramaRequest createDeleteProgramaRequest() {
        return new DeleteProgramaRequest();
    }

    /**
     * Create an instance of {@link DeleteProgramaResponse }
     * 
     */
    public DeleteProgramaResponse createDeleteProgramaResponse() {
        return new DeleteProgramaResponse();
    }

    /**
     * Create an instance of {@link GetAllProgramasRequest }
     * 
     */
    public GetAllProgramasRequest createGetAllProgramasRequest() {
        return new GetAllProgramasRequest();
    }

    /**
     * Create an instance of {@link GetAllProgramasResponse }
     * 
     */
    public GetAllProgramasResponse createGetAllProgramasResponse() {
        return new GetAllProgramasResponse();
    }

    /**
     * Create an instance of {@link Programa }
     * 
     */
    public Programa createPrograma() {
        return new Programa();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProgramaRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetProgramaRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.com/soapservice/programas", name = "getProgramaRequest")
    public JAXBElement<GetProgramaRequest> createGetProgramaRequest(GetProgramaRequest value) {
        return new JAXBElement<GetProgramaRequest>(_GetProgramaRequest_QNAME, GetProgramaRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProgramaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetProgramaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.com/soapservice/programas", name = "getProgramaResponse")
    public JAXBElement<GetProgramaResponse> createGetProgramaResponse(GetProgramaResponse value) {
        return new JAXBElement<GetProgramaResponse>(_GetProgramaResponse_QNAME, GetProgramaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateProgramaRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateProgramaRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.com/soapservice/programas", name = "createProgramaRequest")
    public JAXBElement<CreateProgramaRequest> createCreateProgramaRequest(CreateProgramaRequest value) {
        return new JAXBElement<CreateProgramaRequest>(_CreateProgramaRequest_QNAME, CreateProgramaRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateProgramaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateProgramaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.com/soapservice/programas", name = "createProgramaResponse")
    public JAXBElement<CreateProgramaResponse> createCreateProgramaResponse(CreateProgramaResponse value) {
        return new JAXBElement<CreateProgramaResponse>(_CreateProgramaResponse_QNAME, CreateProgramaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProgramaRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateProgramaRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.com/soapservice/programas", name = "updateProgramaRequest")
    public JAXBElement<UpdateProgramaRequest> createUpdateProgramaRequest(UpdateProgramaRequest value) {
        return new JAXBElement<UpdateProgramaRequest>(_UpdateProgramaRequest_QNAME, UpdateProgramaRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProgramaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateProgramaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.com/soapservice/programas", name = "updateProgramaResponse")
    public JAXBElement<UpdateProgramaResponse> createUpdateProgramaResponse(UpdateProgramaResponse value) {
        return new JAXBElement<UpdateProgramaResponse>(_UpdateProgramaResponse_QNAME, UpdateProgramaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProgramaRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteProgramaRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.com/soapservice/programas", name = "deleteProgramaRequest")
    public JAXBElement<DeleteProgramaRequest> createDeleteProgramaRequest(DeleteProgramaRequest value) {
        return new JAXBElement<DeleteProgramaRequest>(_DeleteProgramaRequest_QNAME, DeleteProgramaRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProgramaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteProgramaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.com/soapservice/programas", name = "deleteProgramaResponse")
    public JAXBElement<DeleteProgramaResponse> createDeleteProgramaResponse(DeleteProgramaResponse value) {
        return new JAXBElement<DeleteProgramaResponse>(_DeleteProgramaResponse_QNAME, DeleteProgramaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllProgramasRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllProgramasRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.com/soapservice/programas", name = "getAllProgramasRequest")
    public JAXBElement<GetAllProgramasRequest> createGetAllProgramasRequest(GetAllProgramasRequest value) {
        return new JAXBElement<GetAllProgramasRequest>(_GetAllProgramasRequest_QNAME, GetAllProgramasRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllProgramasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllProgramasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.com/soapservice/programas", name = "getAllProgramasResponse")
    public JAXBElement<GetAllProgramasResponse> createGetAllProgramasResponse(GetAllProgramasResponse value) {
        return new JAXBElement<GetAllProgramasResponse>(_GetAllProgramasResponse_QNAME, GetAllProgramasResponse.class, null, value);
    }

}
