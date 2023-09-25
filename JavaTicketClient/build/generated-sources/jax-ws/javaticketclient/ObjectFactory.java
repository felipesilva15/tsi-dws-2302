
package javaticketclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the javaticketclient package. 
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

    private final static QName _GetPrecoIngressoResponse_QNAME = new QName("http://JavaTicket/", "getPrecoIngressoResponse");
    private final static QName _GetPrecoIngresso_QNAME = new QName("http://JavaTicket/", "getPrecoIngresso");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: javaticketclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPrecoIngressoResponse }
     * 
     */
    public GetPrecoIngressoResponse createGetPrecoIngressoResponse() {
        return new GetPrecoIngressoResponse();
    }

    /**
     * Create an instance of {@link GetPrecoIngresso }
     * 
     */
    public GetPrecoIngresso createGetPrecoIngresso() {
        return new GetPrecoIngresso();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPrecoIngressoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://JavaTicket/", name = "getPrecoIngressoResponse")
    public JAXBElement<GetPrecoIngressoResponse> createGetPrecoIngressoResponse(GetPrecoIngressoResponse value) {
        return new JAXBElement<GetPrecoIngressoResponse>(_GetPrecoIngressoResponse_QNAME, GetPrecoIngressoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPrecoIngresso }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://JavaTicket/", name = "getPrecoIngresso")
    public JAXBElement<GetPrecoIngresso> createGetPrecoIngresso(GetPrecoIngresso value) {
        return new JAXBElement<GetPrecoIngresso>(_GetPrecoIngresso_QNAME, GetPrecoIngresso.class, null, value);
    }

}
