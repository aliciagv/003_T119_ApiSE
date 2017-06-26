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
    String cadenalarga=null;
    int contador=0;
    for (String entrada: args){
        if (entrada.length() > contador){
        contador=entrada.length();
        cadenalarga=entrada;
        }
    }
    System.out.println("La cadena más larga que ha entrado es: " + cadenalarga);
    }
    
}
