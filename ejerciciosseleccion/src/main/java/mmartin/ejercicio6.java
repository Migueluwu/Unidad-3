/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mmartin;

import java.util.Scanner;

/**
 *
 * @author miguel
 */
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int opcion;

        System.out.println("Menú de opciones");
        System.out.println("-------------------------");
        System.out.println("1. Calcular el área de un Cuadrado");
        System.out.println("2. Calcular el área de un Triángulo");
        System.out.println("3. Calcular el área de un Círculo");
        System.out.println("4. Finalizar");

        System.out.print("Elija una opción: ");
        opcion = entrada.nextInt();

        if (opcion == 1) {
            System.out.println("Ha seleccionado calcular el área de un cuadrado...");
            System.out.println("introduce cuanto mide un lado del cuadrado");
            int lado = entrada.nextInt();
            int areaCuadrado = (int) Math.pow(lado, 2);
            System.out.println("el area del cuadrado es " + areaCuadrado);
        } else if (opcion == 2) {

            System.out.println("Ha seleccionado calcular el     área de un triángulo...");
            System.out.println("introduce cuanto mide la base del triangulo ");
            int baseTriangulo = entrada.nextInt();
            System.out.println("introduce cuanto mide la altura del traingulo");
            int alturaTriangulo = entrada.nextInt();
            int areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
            System.out.println("el area del triangulo es " + areaTriangulo);
        } else if (opcion == 3) {

            System.out.println("Ha seleccionado calcular el área de un círculo...");
            System.out.println("introduce el radio del circulo");
            int radioCirculo = entrada.nextInt();
            double areaCirculo = Math.PI * Math.pow(radioCirculo, 2);
            System.out.println("el area del circulo es de " + areaCirculo);
        } else {
            System.out.println("Ha seleccionado terminar");
        }

    }

}
