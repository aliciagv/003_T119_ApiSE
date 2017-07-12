/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.apise.pruebas;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cice
 */
public class PruebasFileWriter {
    
    public static void main(String[] args){
    
        try {
            FileWriter fw=new FileWriter("/Users/cice/NetBeansProjects/003_T119_ApiSE/ficheros/ficherofilewriter.txt");
            PrintWriter pw= new PrintWriter(fw);
            pw.write("Hola");
            fw.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(PruebasFileWriter.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
}
