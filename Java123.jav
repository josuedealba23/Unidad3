/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java123;

import java.util.Scanner;

public class Java123 {

    
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("ingrese un numero entero");
        int numero =scanner.nextInt();
        
        if (numero% 02 == 0){
            System.out.println("(El numero" + numero + "es par");
        } else {
            
           System.out.println("el numero" + numero + "es impar.");
           
        }
        scanner. close();
    }
}
