/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.ejercicios;

/**
 *
 * @author cice
 */
public class Ejercicio01 {
    
    public static void main (String ... args){
    
    String cadena="Esto es una cadena de caracteres con muchas vocales";
    int count=0;
    
    char[] arraydecaracteres=cadena.toCharArray();
    
    for (char caracter: arraydecaracteres){
        switch (caracter){
             case 'a':
             case 'e':
             case 'i':
             case 'o':
             case 'u':
                count ++;
               
        
        } 
    
    }
     System.out.println("El número de vocales contado con array de caracteres es: " + count);
     count=0;
    // otra forma
    for (int i=0; i<cadena.length(); i ++){
          
        switch (cadena.toLowerCase().charAt(i)){
            case 'a':
                count ++;
                break;
             case 'e':
                count ++;
                break;
             case 'i':
                count ++;
                break;    
             case 'o':
                count ++;
                break;    
             case 'u':
                count ++;
                break;    
        
        } 
    }
    System.out.println("El número de vocales es: " + count);
    
    }
    
}
