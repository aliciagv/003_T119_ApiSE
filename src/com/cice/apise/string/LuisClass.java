/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.apise.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author cice
 */
public class LuisClass {
    
    public static void main(String[] args) throws IOException{

    System.out.println("Introduce caracteres: ");    
    InputStream in =System.in;
    InputStreamReader isr =new InputStreamReader(in);
    BufferedReader bf =new BufferedReader(isr);
    
    String a= bf.readLine();
   
    
    }
    
}
