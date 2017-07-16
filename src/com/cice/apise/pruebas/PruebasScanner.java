/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.apise.pruebas;

import java.util.Scanner;

/**
 *
 * @author cice
 */
public class PruebasScanner {
    
    public static void main(String[] args){
    
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce el nombre completo: ");
    System.out.println(sc.nextLine());
    
        Scanner scan = new Scanner("Anna Mills/Female/18");
    // initialize the string delimiter
    scan.useDelimiter("/");
    // Printing the tokenized Strings
    while(scan.hasNext()){
        System.out.println(scan.next());
    }
    // closing the scanner stream
    scan.close();
    
    }
    
}
