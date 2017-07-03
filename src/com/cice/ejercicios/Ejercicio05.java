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
        int aleatorio1= (int) floor(random()*100); 
        System.out.println("Aleatorio1: "+ aleatorio1);
        int aleatorio2=(int) Math.floor(Math.random()*100);
        System.out.println("Aleatorio3: "+ aleatorio2);
        int min=Math.min(aleatorio1, aleatorio2);
        int max=Math.max(aleatorio1,aleatorio2);
        int suma=0;
        for (int i=min; i<=max; i++){
            suma+=i;
            
        }
        System.out.println("La suma desde el "+ min + " hasta el "+ max + " es: "+ suma);
        
        
        
         // Math.random()*6 + 1    Esto da valores entre 1.0 y 7.0 excluido el 7.0
         //Math.random()*6     Esto da valores de 0.0 a 6.0, excluido el 6.0
        //Para 0 a 100
        
//        int valorEntero= Math.floor(Math.random()*(N-M+1)+M);
        int ale0100_1= (int) Math.floor(Math.random()*(100-0+1)+0);
        int ale0100_2= (int) Math.floor(Math.random()*(100-0+1)+0);
        
        
    }

    
}
