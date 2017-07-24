/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.apise.pruebas;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 *
 * @author cice
 */
public class PruebasColas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        //Orden logico del elemento, integer de menor a mayor, String alfabeticamente...
        pq.add(30);
        pq.add(20);
        pq.add(40);
        pq.add(10);
        int t = pq.size();
        for (int i = 0; i < t; i++) {
            System.out.println(pq.poll());
        }

        PriorityQueue<String> pqs = new PriorityQueue<String>();
        //Orden logico del elemento, integer de menor a mayor, String alfabeticamente...
        pqs.add(new String("para"));
        pqs.add(new String("antes"));
        pqs.add("bajo");
        pqs.add("excepto");
        pqs.add("contra");

        Iterator it = pqs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("Tamaño" + pqs.size());

        int ts = pqs.size();
        for (int i = 0; i < ts; i++) {
            System.out.println(pqs.poll());
            System.out.println("El tamaño ahora es:" + pqs.size());
        }

        PriorityQueue<Producto> pqproducto = new PriorityQueue<Producto>();
        pqproducto.add(new Producto("Pan", 5));
        pqproducto.add(new Producto("Huevos", 6));
        pqproducto.add(new Producto("Manzanas", 7));

        int tsproducto = pqproducto.size();
        for (int i = 0; i < tsproducto; i++) {
            System.out.println(pqproducto.poll().toString());
        }

    }

}
