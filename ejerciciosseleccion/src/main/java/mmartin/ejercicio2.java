/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mmartin;

import java.util.Scanner;

/**
 *
 * @author 34616
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero=entradaTeclado.nextInt();
        System.out.println(numero>135 ?"Mayor" :"menor");
        System.out.println(numero<0 ?"Menor que 0" :"Mayor que 0");
        if(numero<0){
            numero=numero*(-1);
            System.out.println(numero);
        }
    }
    
}
