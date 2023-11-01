
package javaticketclient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "JavaTicket", targetNamespace = "http://JavaTicket/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface JavaTicket {


    /**
     * 
     * @param show
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPrecoIngresso", targetNamespace = "http://JavaTicket/", className = "javaticketclient.GetPrecoIngresso")
    @ResponseWrapper(localName = "getPrecoIngressoResponse", targetNamespace = "http://JavaTicket/", className = "javaticketclient.GetPrecoIngressoResponse")
    @Action(input = "http://JavaTicket/JavaTicket/getPrecoIngressoRequest", output = "http://JavaTicket/JavaTicket/getPrecoIngressoResponse")
    public double getPrecoIngresso(
        @WebParam(name = "show", targetNamespace = "")
        String show);

}