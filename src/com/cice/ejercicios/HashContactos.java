package com.cice.ejercicios;


import java.util.Enumeration;
import java.util.Hashtable;

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
    
    public void eliminarcontacto(Integer dni){
        contactos.remove(dni);
    
    }
    public void mostarcontactos(){
        Enumeration econtacto=contactos.elements();
        
        while (econtacto.hasMoreElements()){
            System.out.println(econtacto.nextElement());
        }
    }
}
