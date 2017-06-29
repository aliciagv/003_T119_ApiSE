/*
 dada una determinada cadena de caracteres, se inserte una barra / adicional entre palabras.
Mediante el método indexOf() se irán buscando las posiciones donde se encuentran los espacios
para insertar el espacio adicional, operación esta que será́realizada a través del método insert().
 */
package com.cice.ejercicios;

/**
 *
 * @author cice
 */
public class Ejercicio04 {
    
    public static void main(String[] args){
        
        StringBuilder stb= new StringBuilder("Texto donde se insertarán espacios");
        int pos=0;
        do {
            pos= stb.indexOf(" ",pos);
            if (pos!=-1){
                System.out.println("Posición: "+pos);
                stb.insert(pos , "/");
                pos=pos+2;
            } 
        } while (pos!=-1);
                
        System.out.println(stb.toString());

       
        
        
    
    
    }
    
}
