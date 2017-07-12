/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.apise.pruebas;

import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author cice
 */
public class PruebasColecciones {

    public static void main(String[] args) {

        // basadas en índices
        Vector vector = new Vector();
        ArrayList array = new ArrayList();
        ArrayList numeros = new ArrayList();
        numeros.add(new Integer(9));
        numeros.add(new Integer(5));

        //para evitar introducir elementos distintos dentros del array lo suyo es que se cree con un tipo genérico
        ArrayList<Integer> numerosenteros = new ArrayList<Integer>();

        numerosenteros.add(new Integer(9));
        numerosenteros.add(new Integer(5));

        ArrayList<String> lista = new ArrayList<>();
        lista.add("Hola ");
        lista.add("Me llamo Alicia ");
        lista.add("Soy alumno ");

        lista.set(0, "Holaa "); // cambia lo que hay en posición
        lista.add("Adios"); //añade al final
        String saludo = lista.get(0);
        System.out.print(lista.size());
        System.out.println(lista.toString()); //Sale entre corchetes y separados por coma los elementos

        for (String slista : lista) {
            System.out.println(slista);
        }
        
        lista.removeIf((a)-> a.contains("Hola"));
        for (String slista : lista) {
            System.out.println(slista);
        }
        lista.clear();
        System.out.println(lista.size());
    }

}


