/*
 *Mostrar por pantalla todas las posiciones en las que aparece la letra a en una cadena dada
 */
package com.cice.ejercicios;

/**
 *
 * @author cice
 */
public class Ejercicio03 {
    
    public static void main (String[] args){
        //manera1    
        String cadena="Esto es una ca";
        int pos=0;
        while (pos<cadena.length()){       
           if (cadena.indexOf("a",pos)!=-1){
               System.out.println("La letra a está en la posición" + cadena.indexOf("a",pos));
               pos=cadena.indexOf("a",pos)+1;
           } else {
               pos=cadena.length();
           } 
         }
     //manera2
     pos=0;
     while (pos>=0) {
         if (pos==0) {
         pos=cadena.indexOf("a");
         if (pos!=-1){
            System.out.println("La letra a está en la posición" + pos);
         }
         pos++;
        
         } else {
             pos=cadena.indexOf("a",++pos);
             if (pos!=-1){
                 System.out.println("La letra a está en la posición" + pos);
             }
         
         } 
     
     }
    //manera 3
     do {
      pos=cadena.indexOf("a",pos);
      if (pos!=-1) {
        System.out.println("Se ha encontrado la letra en la posición " +  pos);
      }
      pos +=1;
     
     } while (pos>0);
           
    }
    
}
