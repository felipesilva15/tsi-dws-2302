/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaticketclient;

import java.util.Scanner;

/**
 *
 * @author Felipe Silva
 */
public class JavaTicketClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scString = new Scanner(System.in);
        double preco;
        String show;
        
        System.out.println("Digite o nome do show:");
        show = scString.nextLine().trim();
        
        JavaTicket_Service service = new JavaTicket_Service();
        
        preco = service.getJavaTicketPort().getPrecoIngresso(show);
        
        if (preco <= 0) {
            System.out.println("Este show não está disponível!");
            return;
        }
        
        System.out.println(String.format("Preço do show \"%s\" é de R$ %,.2f.", show, preco));
    }
    
}
