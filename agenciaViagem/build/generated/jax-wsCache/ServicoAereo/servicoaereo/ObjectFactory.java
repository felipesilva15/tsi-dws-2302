
package servicoaereo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the servicoaereo package. 
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

    private final static QName _GetPrecoViagem_QNAME = new QName("http://ServicoAereo/", "getPrecoViagem");
    private final static QName _GetPrecoViagemResponse_QNAME = new QName("http://ServicoAereo/", "getPrecoViagemResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicoaereo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPrecoViagemResponse }
     * 
     */
    public GetPrecoViagemResponse createGetPrecoViagemResponse() {
        return new GetPrecoViagemResponse();
    }

    /**
     * Create an instance of {@link GetPrecoViagem }
     * 
     */
    public GetPrecoViagem createGetPrecoViagem() {
        return new GetPrecoViagem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPrecoViagem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServicoAereo/", name = "getPrecoViagem")
    public JAXBElement<GetPrecoViagem> createGetPrecoViagem(GetPrecoViagem value) {
        return new JAXBElement<GetPrecoViagem>(_GetPrecoViagem_QNAME, GetPrecoViagem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPrecoViagemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServicoAereo/", name = "getPrecoViagemResponse")
    public JAXBElement<GetPrecoViagemResponse> createGetPrecoViagemResponse(GetPrecoViagemResponse value) {
        return new JAXBElement<GetPrecoViagemResponse>(_GetPrecoViagemResponse_QNAME, GetPrecoViagemResponse.class, null, value);
    }

}
