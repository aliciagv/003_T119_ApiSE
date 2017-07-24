/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.apise.pruebas;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author cice
 */
public class PruebasHashSet {

    public static void main(String[] args) {
        
        HashSet<String> conjunto =new HashSet<String>();
        conjunto.add("Alicia");
        conjunto.add("Alberto");
        conjunto.add("alberto");
       
        for (Iterator it = conjunto.iterator();it.hasNext();){
            System.out.println(it.next());
    
        }
        
        
        
        

    }

}
