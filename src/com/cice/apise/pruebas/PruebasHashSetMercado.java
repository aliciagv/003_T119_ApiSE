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
public class PruebasHashSetMercado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HashSet<Producto> listacompra = new HashSet<Producto>(); //no pueden existir dos objetos iguales en este conjunto
        Producto pan = new Producto("Pan", 5);
        Producto huevos = new Producto("Huevos", 6);
        Producto manzanas = new Producto("Manzanas", 7);
        Producto manzanas2 = new Producto("Manzanas", 7);
        listacompra.add(pan);
        listacompra.add(huevos);
        listacompra.add(manzanas);
        listacompra.add(manzanas2);

        listacompra.remove(pan);
        for (Iterator it = listacompra.iterator(); it.hasNext();) {
            Object objeto = it.next();
            Producto producto = (Producto) objeto;
            System.out.println(producto);
        }
        // Eliminar todos los valores 
        listacompra.clear();
        System.out.println("Lista del mercado con " + listacompra.size()
                + " productos");

    }
    
}
