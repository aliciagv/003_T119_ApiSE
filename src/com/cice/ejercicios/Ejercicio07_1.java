/*
 *Vamos a realizar un programa que,se pida los números de uno en uno y se pregunte al usuario si quiere introducir más número o no. Todos los números introducidos deben de sumarse
 * Utilizaremos colecciones
 */
package com.cice.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cice
 */
public class Ejercicio07_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> listanumeros = new ArrayList<Integer>();
        String respuesta=null;
        do {
            System.out.println("Introduce un número");
            try {

                listanumeros.add(Integer.parseInt(sc.next()));

                System.out.println("¿Quiere introducir otro número? S/N");
                respuesta=sc.next();
                
            } catch (NumberFormatException e) {
                 System.out.println("No ha introducido un número");
                 respuesta=null;
            }

        } while (respuesta==null || respuesta.equalsIgnoreCase("s"));
        int suma = 0;
        for (Integer numero : listanumeros) {
            suma += numero;
        }
        System.out.print("La suma es: " + suma);
    }
}
