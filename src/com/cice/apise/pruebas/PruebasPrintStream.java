/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.apise.pruebas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;




/**
 *
 * @author cice
 */
public class PruebasPrintStream {

    public static void main(String[] args) {
       
        
        if (exit()){
            System.out.print("Existe");
            
             outfileexit();
        
        } else {
             System.out.print("No existe");
             outfilenotexit();
        }
    }

    private static boolean exit(){
        try {
            FileReader fr =new FileReader("/Users/cice/NetBeansProjects/003_T119_ApiSE/ficheros/fichero000escritura.txt");
            return true;
        } catch (FileNotFoundException ex) {
           return false;
        }
    
    }
    private static void outfileexit() {
        
        try {
         
            
            PrintStream ps = new PrintStream("/Users/cice/NetBeansProjects/003_T119_ApiSE/ficheros/fichero000escritura.txt");
            ps.println("Introducimos esta cadena de caracteres en el fichero");
            ps.close();

        } catch (FileNotFoundException fnfe) {
            System.out.print("El fichero no existe");

        }
    }
    
    private static void outfilenotexit(){
            
        try {
            
            PrintStream ps =new PrintStream(new File("/Users/cice/NetBeansProjects/003_T119_ApiSE/ficheros/crearficheroescritura.txt"));
            ps.println("Introducimos esta cadena de caracteres en el fichero");
            ps.close();

        } catch (FileNotFoundException fnfe) {
            System.out.print("El fichero no existe");

        }
    
    
    }

}
