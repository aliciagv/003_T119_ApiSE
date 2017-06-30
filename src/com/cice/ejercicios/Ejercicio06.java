/*
En este ejercicio crearemos un sencillo programa que solicite al usuario la introducción de dos
números y muestre en la consola un mensaje indicando cual es el mayor y cual el menor de los
números suministrados
 */
package com.cice.ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alicia
 */
public class Ejercicio06 {

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        InputStreamReader isr = null;
        BufferedReader bfr = null;
        boolean notnum = false;
        do {
            System.out.println("Introduce un número:");
            InputStream is = System.in;
            isr = new InputStreamReader(is);
            bfr = new BufferedReader(isr);

            try {
                String snum1 = bfr.readLine();
                num1 = Integer.parseInt(snum1);
                notnum = true;
            } catch (IOException ex) {
                System.out.println("Debe introducir un número");
            } catch (NumberFormatException nfe) {
                System.out.println("Debe introducir un número");
            }
        } while (!notnum);

        notnum = false;

        do {
            System.out.println("Introduce otro número:");
            isr = new InputStreamReader(System.in);
            bfr = new BufferedReader(isr);

            try {
                String snum2 = bfr.readLine();
                num2 = Integer.parseInt(snum2);
                notnum = true;
            } catch (IOException ex) {
                System.out.println("Debe introducir un número");
            } catch (NumberFormatException nfe) {
                System.out.println("Debe introducir un número");
            }
        } while (!notnum);

        int mayor = num1 > num2 ? num1 : num2;
        int menor = num1 <= num2 ? num1 : num2;
        if (mayor == menor) {
            System.out.println("Los números introducidos son iguales");
        } else {
            System.out.println("El número mayor es " + mayor + " y el menor " + menor);
        }

    }

}
