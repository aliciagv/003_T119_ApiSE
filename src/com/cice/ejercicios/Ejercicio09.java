/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.ejercicios;

import java.util.Scanner;

/**
 *
 * @author cice
 */
public class Ejercicio09 {
    
    static HashContactos contactos= new HashContactos();
    public static void main(String[] args){
    
    Scanner sc= new Scanner(System.in);
    
    int opcion=0;
    
       
    do {
    
        System.out.println("========== Menú de la aplicación ========");
        System.out.println("=========================================");
        System.out.println("");
        System.out.println("1.- Añadir contacto");
        System.out.println("2.- Eliminar contacto");
        System.out.println("3.- Mostrar contactos");
        System.out.println("4:- Salir");
        System.out.println("");
        System.out.println("=========================================");
        System.out.println("Tu opción es: ");
        opcion =sc.nextInt();
        switch (opcion) {
            case 1:
                addContactos(sc);
                break;
            case 2:
                borrarContactos(sc);
             break;
            case 3: 
                mostrarContactos(contactos);
                break;
            default:
                
        }
    } while (opcion!=4);
    }
    
    
    
    
    private static void addContactos(Scanner sc){
        System.out.println("Introduce el dni");
        int dni=sc.nextInt();
        System.out.println("Introduce el nombre");
        String nombre=sc.next();
        
        contactos.addcontacto(dni, nombre);
        
        
    }
    private static void borrarContactos(Scanner sc){
        System.out.println("Introduce el dni a borrar");
        int dni=sc.nextInt();
        String borrado= contactos.eliminarcontacto(dni);
        if (borrado==null){
            System.out.println("El elemento que quiere borrar no existe");
        } else {
            System.out.println("El elemento "+borrado +"ha sido eliminado");
        }
        
        
    }private static void mostrarContactos(HashContactos contactos){
     
         contactos.mostarcontactos();
    }
 
    
}
