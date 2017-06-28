/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.apise.string;

/**
 *
 * @author cice
 */
public class PruebasString {
    
    public static void main (String[] args){
        
        boolean esMayor=2 > 4;
        boolean esIgual= 2 == 3-1;
        boolean comparavaloresBool= esMayor==esIgual;
        
        boolean comparaCharas = 'a' !='A';
        
        System.out.println(esMayor);
        System.out.println(esIgual);
        System.out.println(comparavaloresBool);
        System.out.println(comparaCharas);
        
        String nombre= "Alicia";
        String otronombre="Alicia";
        String nombre1= new String ("Alicia");
        boolean sonIguales= nombre == otronombre; // esta comparación la trata como primitivo y funciona
        System.out.println(sonIguales);
        sonIguales=nombre1==otronombre; //esta comparacion no funciona ya que compara el puntero a memoria, por eso sale false
        
        
        StringBuilder sb =new StringBuilder();
        sb.append("Alicia");
        
        
        StringBuilder sb2 =new StringBuilder();
        sb2.append("Alicia");
        
        
        System.out.println (sb==sb2); // compara el puntero a memoria por eso sale false
        
        sb2=sb;
        System.out.println (sb==sb2); // aquí debido a la asignación el puntero a memoria lo comparan.
        
        System.out.println(nombre.equalsIgnoreCase(otronombre));
        
        String a="Aliciaxcd";
        int pos=a.lastIndexOf("a"); // la última ocurrencia del string que encuentra
        System.out.println(pos);
        
        pos=0;
        for (int i=0; i<2;i++){
            System.out.println(++pos);
            System.out.println(pos++);
        }
        System.out.println(pos);
        
        
        
        
    
        
    
    }
    
}
