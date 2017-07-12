/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.apise.string;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cice
 */
public class PruebasBufferedReaderFile {
    
    public static void main (String[] args){
    
        BufferedReader bf=null;
        FileReader fr =null;
        try {
            fr =new FileReader("/Users/cice/NetBeansProjects/003_T119_ApiSE/ficheros/ficheroesrdditura.txt");
            bf = new BufferedReader(fr);
            String lectura=null;
            while ((lectura=bf.readLine())!=null) {
                System.out.println(lectura);
            }
             
                
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PruebasBufferedReaderFile.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
                Logger.getLogger(PruebasBufferedReaderFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
               try {
                if (bf!=null) {
                    bf.close();
                }
                if (fr!=null){
                    fr.close();
                }
                } catch (IOException ex) {
                    Logger.getLogger(PruebasBufferedReaderFile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }

    
}
