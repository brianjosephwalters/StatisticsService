
package com.statisticsservice.certificateservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.statisticsservice.certificateservice package. 
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

    private final static QName _GetExamType_QNAME = new QName("http://certificateservice.com/", "getExamType");
    private final static QName _GetExamTypeForCertificateResponse_QNAME = new QName("http://certificateservice.com/", "getExamTypeForCertificateResponse");
    private final static QName _GetExamTypeResponse_QNAME = new QName("http://certificateservice.com/", "getExamTypeResponse");
    private final static QName _GetExamsForCertificateResponse_QNAME = new QName("http://certificateservice.com/", "getExamsForCertificateResponse");
    private final static QName _GetExamsForCertificate_QNAME = new QName("http://certificateservice.com/", "getExamsForCertificate");
    private final static QName _GetCertificate_QNAME = new QName("http://certificateservice.com/", "getCertificate");
    private final static QName _NonexistentCertificateException_QNAME = new QName("http://certificateservice.com/", "NonexistentCertificateException");
    private final static QName _GetAllExamTypesResponse_QNAME = new QName("http://certificateservice.com/", "getAllExamTypesResponse");
    private final static QName _GetExamTypeForCertificate_QNAME = new QName("http://certificateservice.com/", "getExamTypeForCertificate");
    private final static QName _GetAllUpcomingExamsForCertificate_QNAME = new QName("http://certificateservice.com/", "getAllUpcomingExamsForCertificate");
    private final static QName _GetAllUpcomingExamsForCertificateResponse_QNAME = new QName("http://certificateservice.com/", "getAllUpcomingExamsForCertificateResponse");
    private final static QName _NonexistentExamTypeException_QNAME = new QName("http://certificateservice.com/", "NonexistentExamTypeException");
    private final static QName _GetAllExamTypes_QNAME = new QName("http://certificateservice.com/", "getAllExamTypes");
    private final static QName _GetCertificateResponse_QNAME = new QName("http://certificateservice.com/", "getCertificateResponse");
    private final static QName _GetAllCertificatesResponse_QNAME = new QName("http://certificateservice.com/", "getAllCertificatesResponse");
    private final static QName _GetAllCertificates_QNAME = new QName("http://certificateservice.com/", "getAllCertificates");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.statisticsservice.certificateservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetExamTypeForCertificate }
     * 
     */
    public GetExamTypeForCertificate createGetExamTypeForCertificate() {
        return new GetExamTypeForCertificate();
    }

    /**
     * Create an instance of {@link NonexistentCertificateException }
     * 
     */
    public NonexistentCertificateException createNonexistentCertificateException() {
        return new NonexistentCertificateException();
    }

    /**
     * Create an instance of {@link GetAllExamTypesResponse }
     * 
     */
    public GetAllExamTypesResponse createGetAllExamTypesResponse() {
        return new GetAllExamTypesResponse();
    }

    /**
     * Create an instance of {@link NonexistentExamTypeException }
     * 
     */
    public NonexistentExamTypeException createNonexistentExamTypeException() {
        return new NonexistentExamTypeException();
    }

    /**
     * Create an instance of {@link GetAllUpcomingExamsForCertificate }
     * 
     */
    public GetAllUpcomingExamsForCertificate createGetAllUpcomingExamsForCertificate() {
        return new GetAllUpcomingExamsForCertificate();
    }

    /**
     * Create an instance of {@link GetAllUpcomingExamsForCertificateResponse }
     * 
     */
    public GetAllUpcomingExamsForCertificateResponse createGetAllUpcomingExamsForCertificateResponse() {
        return new GetAllUpcomingExamsForCertificateResponse();
    }

    /**
     * Create an instance of {@link GetAllCertificatesResponse }
     * 
     */
    public GetAllCertificatesResponse createGetAllCertificatesResponse() {
        return new GetAllCertificatesResponse();
    }

    /**
     * Create an instance of {@link GetAllExamTypes }
     * 
     */
    public GetAllExamTypes createGetAllExamTypes() {
        return new GetAllExamTypes();
    }

    /**
     * Create an instance of {@link GetCertificateResponse }
     * 
     */
    public GetCertificateResponse createGetCertificateResponse() {
        return new GetCertificateResponse();
    }

    /**
     * Create an instance of {@link GetAllCertificates }
     * 
     */
    public GetAllCertificates createGetAllCertificates() {
        return new GetAllCertificates();
    }

    /**
     * Create an instance of {@link GetExamsForCertificateResponse }
     * 
     */
    public GetExamsForCertificateResponse createGetExamsForCertificateResponse() {
        return new GetExamsForCertificateResponse();
    }

    /**
     * Create an instance of {@link GetExamTypeResponse }
     * 
     */
    public GetExamTypeResponse createGetExamTypeResponse() {
        return new GetExamTypeResponse();
    }

    /**
     * Create an instance of {@link GetExamTypeForCertificateResponse }
     * 
     */
    public GetExamTypeForCertificateResponse createGetExamTypeForCertificateResponse() {
        return new GetExamTypeForCertificateResponse();
    }

    /**
     * Create an instance of {@link GetExamType }
     * 
     */
    public GetExamType createGetExamType() {
        return new GetExamType();
    }

    /**
     * Create an instance of {@link GetExamsForCertificate }
     * 
     */
    public GetExamsForCertificate createGetExamsForCertificate() {
        return new GetExamsForCertificate();
    }

    /**
     * Create an instance of {@link GetCertificate }
     * 
     */
    public GetCertificate createGetCertificate() {
        return new GetCertificate();
    }

    /**
     * Create an instance of {@link Certificate }
     * 
     */
    public Certificate createCertificate() {
        return new Certificate();
    }

    /**
     * Create an instance of {@link ExamType }
     * 
     */
    public ExamType createExamType() {
        return new ExamType();
    }

    /**
     * Create an instance of {@link Exam }
     * 
     */
    public Exam createExam() {
        return new Exam();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExamType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://certificateservice.com/", name = "getExamType")
    public JAXBElement<GetExamType> createGetExamType(GetExamType value) {
        return new JAXBElement<GetExamType>(_GetExamType_QNAME, GetExamType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExamTypeForCertificateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://certificateservice.com/", name = "getExamTypeForCertificateResponse")
    public JAXBElement<GetExamTypeForCertificateResponse> createGetExamTypeForCertificateResponse(GetExamTypeForCertificateResponse value) {
        return new JAXBElement<GetExamTypeForCertificateResponse>(_GetExamTypeForCertificateResponse_QNAME, GetExamTypeForCertificateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExamTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://certificateservice.com/", name = "getExamTypeResponse")
    public JAXBElement<GetExamTypeResponse> createGetExamTypeResponse(GetExamTypeResponse value) {
        return new JAXBElement<GetExamTypeResponse>(_GetExamTypeResponse_QNAME, GetExamTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExamsForCertificateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://certificateservice.com/", name = "getExamsForCertificateResponse")
    public JAXBElement<GetExamsForCertificateResponse> createGetExamsForCertificateResponse(GetExamsForCertificateResponse value) {
        return new JAXBElement<GetExamsForCertificateResponse>(_GetExamsForCertificateResponse_QNAME, GetExamsForCertificateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExamsForCertificate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://certificateservice.com/", name = "getExamsForCertificate")
    public JAXBElement<GetExamsForCertificate> createGetExamsForCertificate(GetExamsForCertificate value) {
        return new JAXBElement<GetExamsForCertificate>(_GetExamsForCertificate_QNAME, GetExamsForCertificate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCertificate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://certificateservice.com/", name = "getCertificate")
    public JAXBElement<GetCertificate> createGetCertificate(GetCertificate value) {
        return new JAXBElement<GetCertificate>(_GetCertificate_QNAME, GetCertificate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NonexistentCertificateException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://certificateservice.com/", name = "NonexistentCertificateException")
    public JAXBElement<NonexistentCertificateException> createNonexistentCertificateException(NonexistentCertificateException value) {
        return new JAXBElement<NonexistentCertificateException>(_NonexistentCertificateException_QNAME, NonexistentCertificateException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllExamTypesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://certificateservice.com/", name = "getAllExamTypesResponse")
    public JAXBElement<GetAllExamTypesResponse> createGetAllExamTypesResponse(GetAllExamTypesResponse value) {
        return new JAXBElement<GetAllExamTypesResponse>(_GetAllExamTypesResponse_QNAME, GetAllExamTypesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExamTypeForCertificate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://certificateservice.com/", name = "getExamTypeForCertificate")
    public JAXBElement<GetExamTypeForCertificate> createGetExamTypeForCertificate(GetExamTypeForCertificate value) {
        return new JAXBElement<GetExamTypeForCertificate>(_GetExamTypeForCertificate_QNAME, GetExamTypeForCertificate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUpcomingExamsForCertificate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://certificateservice.com/", name = "getAllUpcomingExamsForCertificate")
    public JAXBElement<GetAllUpcomingExamsForCertificate> createGetAllUpcomingExamsForCertificate(GetAllUpcomingExamsForCertificate value) {
        return new JAXBElement<GetAllUpcomingExamsForCertificate>(_GetAllUpcomingExamsForCertificate_QNAME, GetAllUpcomingExamsForCertificate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUpcomingExamsForCertificateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://certificateservice.com/", name = "getAllUpcomingExamsForCertificateResponse")
    public JAXBElement<GetAllUpcomingExamsForCertificateResponse> createGetAllUpcomingExamsForCertificateResponse(GetAllUpcomingExamsForCertificateResponse value) {
        return new JAXBElement<GetAllUpcomingExamsForCertificateResponse>(_GetAllUpcomingExamsForCertificateResponse_QNAME, GetAllUpcomingExamsForCertificateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NonexistentExamTypeException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://certificateservice.com/", name = "NonexistentExamTypeException")
    public JAXBElement<NonexistentExamTypeException> createNonexistentExamTypeException(NonexistentExamTypeException value) {
        return new JAXBElement<NonexistentExamTypeException>(_NonexistentExamTypeException_QNAME, NonexistentExamTypeException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllExamTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://certificateservice.com/", name = "getAllExamTypes")
    public JAXBElement<GetAllExamTypes> createGetAllExamTypes(GetAllExamTypes value) {
        return new JAXBElement<GetAllExamTypes>(_GetAllExamTypes_QNAME, GetAllExamTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCertificateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://certificateservice.com/", name = "getCertificateResponse")
    public JAXBElement<GetCertificateResponse> createGetCertificateResponse(GetCertificateResponse value) {
        return new JAXBElement<GetCertificateResponse>(_GetCertificateResponse_QNAME, GetCertificateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCertificatesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://certificateservice.com/", name = "getAllCertificatesResponse")
    public JAXBElement<GetAllCertificatesResponse> createGetAllCertificatesResponse(GetAllCertificatesResponse value) {
        return new JAXBElement<GetAllCertificatesResponse>(_GetAllCertificatesResponse_QNAME, GetAllCertificatesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCertificates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://certificateservice.com/", name = "getAllCertificates")
    public JAXBElement<GetAllCertificates> createGetAllCertificates(GetAllCertificates value) {
        return new JAXBElement<GetAllCertificates>(_GetAllCertificates_QNAME, GetAllCertificates.class, null, value);
    }

}
