/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.ejercicios;

import java.util.ArrayList;

/**
 *
 * @author cice
 */
public class ListadoPrecios {
    
   private ArrayList<Integer> listadoprecios = new ArrayList<Integer>();
    
    public boolean isEmpty(){
        return listadoprecios.isEmpty();
    }
    
    public void nuevoPrecio(int precio) {
        listadoprecios.add(precio);
    }

    public Integer preciomax() {
        Integer max = Integer.MIN_VALUE;
        for (Integer i : listadoprecios) {
            if (i > max) {
                max = i;
            }

        }
        return max;
    }

    public Integer preciomin() {
        Integer min = Integer.MAX_VALUE;
        for (Integer i : listadoprecios) {
            if (i < min) {
                min = i;
            }

        }
        return min;

    }

    public double preciomedio() {

        int suma = 0;
        for (Integer i : listadoprecios) {
            suma = suma + i;
        }
        return suma / listadoprecios.size();

    }
    
    public void mostrarprecios(){
        
        if (listadoprecios.isEmpty()) {
            System.out.println("No hay precios que mostrar");
        } else {
            for (int i=0; i<listadoprecios.size(); i++){
                System.out.println("Precio"+ i +": "+ listadoprecios.get(i));
            
            }
        }
        
    }
    
}
