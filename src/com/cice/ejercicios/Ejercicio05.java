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
      /*  int aleatorio1= (int) floor(random()*100); 
        System.out.println("Aleatorio1: "+ aleatorio1);
        int aleatorio2=(int) Math.floor(Math.random()*100);
        System.out.println("Aleatorio2: "+ aleatorio2);
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
        
//        int valorEntero= Math.floor(Math.random()*(N-M+1)+M); Entre N y M
        int ale0100_1= (int) Math.floor(Math.random()*(100-0+1)+0);
        int ale0100_2= (int) Math.floor(Math.random()*(100-0+1)+0);
        System.out.println("Aleatorio1: "+ ale0100_1);
        System.out.println("Aleatorio2: "+ ale0100_2);
        min=Math.min(ale0100_1, ale0100_2);
        max=Math.max(ale0100_1,ale0100_2);
        suma=0;
        for (int i=min; i<=max; i++){
            suma+=i;
            
        }
        System.out.println("La suma desde el "+ min + " hasta el "+ max + " es: "+ suma);
        
        suma =0;
        while (min<=max){
         suma+=min;
         min++;
        }
        System.out.println("La suma desde el "+ min + " hasta el "+ max + " es: "+ suma);*/
      
        int al1= aleatorio(100,0);
        int al2= aleatorio(100,0);
        int min=minimo(al1,al2);
        int max=max(al1,al2);
        int suma=0;
        for (int i=min; i<=max; i++){
            suma+=i;
            
        }
        System.out.println("La suma desde el "+ min + " hasta el "+ max + " es: "+ suma);
        
    }
    

    /**
     * Este método devuelve un número entero aleatorio entre los números facilitados por parámetro
     * @param mayor es el número mayor entero del rango buscado
     * @param menor es el número menor entero del rango
     * @return aleatorio entre el rango
     */
    public static int aleatorio(int mayor,int menor){
        int resultado=0;
        resultado= (int) Math.floor(Math.random()*(mayor-menor+1)+menor);
        return resultado;
    }
    /**
     * Método encargado de devolver el mínimo de los dos números de entrada
     * @param num1 entero de entrada
     * @param num2 entero de entrada 
     * @return entero mínimo 
     */
    public static int minimo(int num1, int num2){
        int minimo=0;
        minimo = Math.min(num1, num2);
        return minimo;
    }
    /**
     * Método encargado de devolver el máximo entre los dos números de salida
     * @param num1 entero de entrada
     * @param num2 entero de entrada
     * @return entero máximo de los parámetros de entrada
     */
    public static int maximo(int num1, int num2){
        int maximo=0;
        maximo = Math.min(num1, num2);
        return maximo;
    }
    
    
}
