/*
En este ejercicio crearemos un sencillo programa que solicite al usuario la introducción de dos
números y muestre en la consola un mensaje indicando cual es el mayor y cual el menor de los
números suministrados
 */
package com.cice.ejercicios;

import java.util.Scanner;


/**
 *
 * @author Alicia
 */
public class Ejercicio06_1 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Introduce un número: ");
        String c= sc.next();
        System.out.print("Introduce otro número: ");
        String d =sc.next();
        System.out.print(Math.min(Integer.parseInt(c),Integer.parseInt(d))+ " es menor que "+ Math.max(Integer.parseInt(c),Integer.parseInt(d)));
       
       
    }

}
