
package com.statisticsservice.certificateservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CertificateService", targetNamespace = "http://certificateservice.com/", wsdlLocation = "http://cscitemp161.cs.uno.edu:8080/CertificateService/CertificateService?wsdl")
public class CertificateService_Service
    extends Service
{

    private final static URL CERTIFICATESERVICE_WSDL_LOCATION;
    private final static WebServiceException CERTIFICATESERVICE_EXCEPTION;
    private final static QName CERTIFICATESERVICE_QNAME = new QName("http://certificateservice.com/", "CertificateService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://cscitemp161.cs.uno.edu:8080/CertificateService/CertificateService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CERTIFICATESERVICE_WSDL_LOCATION = url;
        CERTIFICATESERVICE_EXCEPTION = e;
    }

    public CertificateService_Service() {
        super(__getWsdlLocation(), CERTIFICATESERVICE_QNAME);
    }

    public CertificateService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CERTIFICATESERVICE_QNAME, features);
    }

    public CertificateService_Service(URL wsdlLocation) {
        super(wsdlLocation, CERTIFICATESERVICE_QNAME);
    }

    public CertificateService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CERTIFICATESERVICE_QNAME, features);
    }

    public CertificateService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CertificateService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CertificateService
     */
    @WebEndpoint(name = "CertificateServicePort")
    public CertificateService getCertificateServicePort() {
        return super.getPort(new QName("http://certificateservice.com/", "CertificateServicePort"), CertificateService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CertificateService
     */
    @WebEndpoint(name = "CertificateServicePort")
    public CertificateService getCertificateServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://certificateservice.com/", "CertificateServicePort"), CertificateService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CERTIFICATESERVICE_EXCEPTION!= null) {
            throw CERTIFICATESERVICE_EXCEPTION;
        }
        return CERTIFICATESERVICE_WSDL_LOCATION;
    }

}
