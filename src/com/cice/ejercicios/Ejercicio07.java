/*
 *Vamos a realizar un programa que, dado una lista de números existentes en una cadena de
caracteres separados por una coma (“,”), realice la suma de todos los números contenidos en la
misma y muestre el resultado en pantalla.
 */
package com.cice.ejercicios;

import java.util.Scanner;

/**
 *
 * @author cice
 */
public class Ejercicio07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean novalida = false;
        do {
            System.out.println("Introduce un listado de números separados por comas");
            String cadena = sc.nextLine();
            if (cadena.contains(",")) {
               try {
                int suma = 0;
                for (String separador : cadena.split(",")) {
                    suma += Integer.parseInt(separador);
                }
                System.out.print("La suma de los números es: " + suma);
               } catch(NumberFormatException nfe){
                   novalida=true;
           
               }

            } else {
                novalida = true;
            }

        } while (novalida);

    }
}
