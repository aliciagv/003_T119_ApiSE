package com.cice.ejercicios;


import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cice
 */
public class HashContactos {
    
    private Hashtable<Integer,String> contactos= new Hashtable<>();
    
    public void addcontacto(Integer dni,String nombre){
        contactos.put(dni,nombre);
    }
    
    public String eliminarcontacto(Integer dni){
        return (String)contactos.remove(dni);
        
        
    
    }
    public void mostarcontactos(){
        
        Enumeration<Integer> keycontacto=contactos.keys();
        
        /*while (keycontacto.hasMoreElements()){
            Integer key=(Integer)keycontacto.nextElement();
            System.out.println( key +" "+ contactos.get(key));
        }*/
        
    
        /*Iterator<Integer> lconta=contactos.keySet().iterator();
          while(lconta.hasNext()){
            Integer clave = lconta.next();
            System.out.println(clave + " - " + contactos.get(clave));
            }
          */  
            
         /*  contactos.forEach((a,b)->{
               System.out.println(a + " "+ b);
           
           });*/
           
           contactos.forEach((a,b)-> System.out.println(a + " "+ b));
     
    }
}
