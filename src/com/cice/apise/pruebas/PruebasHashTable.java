/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.apise.pruebas;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

/**
 *
 * @author cice
 */
public class PruebasHashTable {
    
    
    public static void main(String[] args){
        
        Hashtable<Integer,String> lista = new Hashtable<Integer,String>();
        System.out.println(lista.put(783,"Alicia Gutiérrez"));
        System.out.println(lista.put(783,"Alicia"));
        lista.clear();//limpia tood
        String a=lista.get(783);
        System.out.println(a);
        System.out.println(lista.put(781,"Alicia"));
        System.out.println(lista.put(782,"Gutierrez"));
        System.out.println("La lista contiene el valor: "+ lista.containsValue("Alicia"));
        System.out.println("La lista contiene la key: " + lista.containsKey(782));
        System.out.println("La lista contiene: "+ lista.contains("Ali"));
        Hashtable<String,List<String>> lista1 = new Hashtable<>();
        lista1.put("Alicia", new ArrayList<String>());
        for (Integer claves:lista.keySet()){ //devuelve la lista de claves
            System.out.println(claves);
        }
        Enumeration e= lista.keys();
        
        while (e.hasMoreElements()){
        Integer key= (Integer)e.nextElement();
        }
       
        //operador ternario
        String mensaje= (1>2)?"Hola":"Adios";
        
        
        
    }
}
