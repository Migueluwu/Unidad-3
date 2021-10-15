/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.presentacion;

import java.util.Scanner;

/**
 *
 * @author 34616
 */
public class ejerciciob {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("introduce un caracter");
        String caracter= String.valueOf(entradaTeclado.nextInt());
        
        int valorCaracter = Integer.getInteger(caracter);
        if((valorCaracter >= 48) && (valorCaracter <=57)) {
            System.out.println("es un digito");
        }
        else{
            if(valorCaracter >=65 && valorCaracter<=90){
                System.out.println("es una letra mayuscula");
            }
            else{
                if(valorCaracter>=97 && valorCaracter<=122){
                    System.out.println("es una letra mayuscula");
                    
                }
                else{
                    System.out.println("no es ni un digito ni letra mayuscula ni una letra minuscula");
                }
            }
        }
    }

}
