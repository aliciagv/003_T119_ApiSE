/*
 * En este ejercicio vamos a realizar un programa que nos muestre la suma de todos los números
enteros comprendidos entre dos números aleatorios generados por el propio programa. Los
números aleatorios serán mayores de 0 y menores de 100.
 */
package com.cice.ejercicios;

import static java.lang.Math.*;

/**
 *
 * @author Alicia
 */
public class Ejercicio05 {
  
    
    public static void main (String[] args){
        int aletatorio1= (int) Math.floor(Math.random()*100); 
        int aletatorio2=(int) Math.floor(Math.random()*100);
        int min=Math.min(aletatorio1, aletatorio2);
        int max=Math.max(aletatorio1,aletatorio2);
        int suma=0;
        for (int i=min; i<=max; i++){
            suma+=i;
            
        }
        System.out.println("La suma desde el "+ min + " hasta el "+ max + " es: "+ suma);
    }

    
}
