package com.cice.ejercicios;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cice
 */
public class Ejercicio02 {
    
    public static void main (String... args){
        int contador=0;
        String cadenamaslarga=null;
        for(String argumentos:args) {
            if (argumentos.length()>contador){
                cadenamaslarga=argumentos;
                contador=argumentos.length();
            }
        }
        System.out.println("La cadena más larga es: " + cadenamaslarga + " con tamaño " + contador );
        
    }
    
}
