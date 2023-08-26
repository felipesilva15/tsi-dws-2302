/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicoAereo;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author Felipe Silva
 */
@WebService(serviceName = "ServicoAereo")
@Stateless()
public class ServicoAereo {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "getPrecoViagem")
    public double getPrecoViagem(@WebParam(name = "destino") String destino) {
        double preco = 0;
        
        if(destino.toUpperCase().equals("FORTALEZA"))
            preco = 259.50;
        else if(destino.toUpperCase().equals("SÃO PAULO"))
            preco = 389.90;
        else if(destino.toUpperCase().equals("MINAS GERAIS"))
            preco = 129.99;
        else if(destino.toUpperCase().equals("RIO DE JANEIRO"))
            preco =  109.00;
        else if(destino.toUpperCase().equals("RIO GRANDE DO SUL"))
            preco = 300.00;
        
        return preco;
    }
}
