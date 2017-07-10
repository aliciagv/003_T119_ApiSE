/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.apise.string;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 *
 * @author cice
 */
public class PruebasInputStream {
   
    public static void main(String[] args){
        
    try {
        
       PrintStream ps= new PrintStream("C:\\Users\\cice\\Documents\\NetBeansProjects\\003_T119_ApiSE\\ficheros\\ficheroesritura.txt");
       ps.println("Introducimos esta cadena de caracteres en el fichero");
       ps.close();
        
    }  catch(FileNotFoundException fnfe){
        System.out.print("El fichero no existe");
    
 }
}
    
}
