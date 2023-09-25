/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaTicket;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author Felipe Silva
 */
@WebService(serviceName = "JavaTicket")
@Stateless()
public class JavaTicket {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "getPrecoIngresso")
    public double getPrecoIngresso(@WebParam(name = "show") String show) {
        double preco = 0;
        
        if(show.toUpperCase().equals("THE TOWN"))
            preco = 680.90;
        else if(show.toUpperCase().equals("LOLLAPALOOZA"))
            preco = 1119.99;
        else if(show.toUpperCase().equals("ROCK IN RIO"))
            preco = 2500.00;
        else if(show.toUpperCase().equals("OKTOBERFEST"))
            preco =  389.99;
        else if(show.toUpperCase().equals("MANEVA"))
            preco = 129.49;
        
        return preco;
    }
}
