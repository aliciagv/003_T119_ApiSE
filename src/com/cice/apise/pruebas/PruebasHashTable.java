/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.apise.pruebas;

import java.util.Hashtable;

/**
 *
 * @author cice
 */
public class PruebasHashTable {
    
    
    public static void main(String[] args){
        
        Hashtable<Integer,String> lista = new Hashtable<Integer,String>();
        System.out.println(lista.put(783,"Alicia Gutiérrez"));
        System.out.println(lista.put(783,"Alicia"));
        
                
        String a=lista.get(783);
        for (Integer claves:lista.keySet()){ //devuelve la lista de claves
            System.out.println(claves);
        }
       
        
        
    }
}
