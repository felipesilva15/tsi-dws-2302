
package javaticketclient;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "JavaTicket", targetNamespace = "http://JavaTicket/", wsdlLocation = "http://localhost:8080/JavaTicket/JavaTicket?WSDL")
public class JavaTicket_Service
    extends Service
{

    private final static URL JAVATICKET_WSDL_LOCATION;
    private final static WebServiceException JAVATICKET_EXCEPTION;
    private final static QName JAVATICKET_QNAME = new QName("http://JavaTicket/", "JavaTicket");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/JavaTicket/JavaTicket?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        JAVATICKET_WSDL_LOCATION = url;
        JAVATICKET_EXCEPTION = e;
    }

    public JavaTicket_Service() {
        super(__getWsdlLocation(), JAVATICKET_QNAME);
    }

    public JavaTicket_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), JAVATICKET_QNAME, features);
    }

    public JavaTicket_Service(URL wsdlLocation) {
        super(wsdlLocation, JAVATICKET_QNAME);
    }

    public JavaTicket_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, JAVATICKET_QNAME, features);
    }

    public JavaTicket_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public JavaTicket_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns JavaTicket
     */
    @WebEndpoint(name = "JavaTicketPort")
    public JavaTicket getJavaTicketPort() {
        return super.getPort(new QName("http://JavaTicket/", "JavaTicketPort"), JavaTicket.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns JavaTicket
     */
    @WebEndpoint(name = "JavaTicketPort")
    public JavaTicket getJavaTicketPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://JavaTicket/", "JavaTicketPort"), JavaTicket.class, features);
    }

    private static URL __getWsdlLocation() {
        if (JAVATICKET_EXCEPTION!= null) {
            throw JAVATICKET_EXCEPTION;
        }
        return JAVATICKET_WSDL_LOCATION;
    }

}