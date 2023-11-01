/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaviagem;

import java.util.Scanner;
import servicoaereo.ServicoAereo_Service;

/**
 *
 * @author Felipe Silva
 */
public class AgenciaViagem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scString = new Scanner(System.in);
        double preco;
        String destino;
        
        System.out.println("Digite a cidade de destino:");
        destino = scString.nextLine().trim();
        
        ServicoAereo_Service service = new ServicoAereo_Service();
        
        preco = service.getServicoAereoPort().getPrecoViagem(destino);
        System.out.println("Preço do destino: R$ " + String.format("%,.2f", preco));
    }
    
}
