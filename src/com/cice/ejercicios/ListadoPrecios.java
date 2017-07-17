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
    
   private ArrayList<Double> listadoprecios = new ArrayList<>();
    
    public boolean isEmpty(){
        return listadoprecios.isEmpty();
    }
    
    public void nuevoPrecio(double precio) {
        listadoprecios.add(precio);
    }

    public double preciomax() {
        double max = Integer.MIN_VALUE;
        for (Double i : listadoprecios) {
           max=Math.max(max, i);

        }
        return max;
    }

    public double preciomin() {
        double min = Integer.MAX_VALUE;
        for (Double i : listadoprecios) {
           min=Math.min(min, i);

        }
        return min;

    }

    public double preciomedio() {

        double suma= 0;
        for (Double i : listadoprecios) {
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
