/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.apise.pruebas;

/**
 *
 * @author cice
 */
public class Producto  implements Comparable <Producto>{

    private String nombre;
    private int cantidad;

    public Producto(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
// La evaluacion de duplicidad de objetos se realiza mediante los métodos equals y hashCode. 

    public boolean equals(Object objeto) {
        if (objeto == null) {
            return false;
        }

        Producto producto = (Producto) objeto;
        if (this.getNombre().equals(producto.getNombre())) {
            return true;
        }

        return false;
    }

    public int hashCode() {
        return this.getNombre().hashCode();
    }

    public String toString() {
        return ("Nombre: " + nombre + " Cantidad: " + cantidad);
    }

    @Override
    public int compareTo(Producto o) {
         return nombre.compareTo(o.nombre);
    }

}
