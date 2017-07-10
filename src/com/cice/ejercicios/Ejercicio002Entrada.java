/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author cice
 */
public class Ejercicio002Entrada {
    
    public static void main (String[] args) throws IOException {
        
        System.out.print("Introduce una cadena: ");
        InputStream in= System.in;
        InputStreamReader isr = new InputStreamReader(in);
        BufferedReader bf =new BufferedReader(isr);
        String cadena1=null;
        String cadena2=null;
        try {
            cadena1= bf.readLine();
            System.out.print("Introduce otra cadena: ");
            BufferedReader bf2 =new BufferedReader(new InputStreamReader(System.in));
            cadena2= bf.readLine();
            
            
        }catch  (IOException e){
            System.out.println("Ha habido un error: " + e.getMessage());
    }
        
      if (cadena1.length()>cadena2.length()){
          System.out.println("La cadena más larga es: " + cadena1);
        } else  if (cadena1.length()<cadena2.length()){
            System.out.println("La cadena más larga es: " + cadena2);
        } else {
            System.out.println("Son iguales");
        }
        
        
       
        
        
                
    }
    
}
