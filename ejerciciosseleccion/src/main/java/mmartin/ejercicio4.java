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
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.print("escanear edad:");

        int edad = scanner.nextInt();

        System.out.println(edad >= 18?"Es mayor de edad" :"No es mayor de edad"); 
     

        System.out.print("mostrar la edad: ");
        System.out.println(edad);

    }

}
