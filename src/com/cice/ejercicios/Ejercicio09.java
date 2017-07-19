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

    static HashContactos contactos = new HashContactos();

    public static void main(String[] args) {

        int opcion = 0;

        do {
            mostarMenu();
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        addContactos();
                        break;
                    case 2:
                        borrarContactos(sc);
                        break;
                    case 3:
                        mostrarContactos(contactos);
                        break;
                    default:

                }
            } else {
                System.out.println("===============================================================");
                System.out.println("Debe introducir un número del menú");
            }
        } while (opcion != 4);
    }

    private static void mostarMenu() {
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

    }

    private static void addContactos() {
        boolean datosaddError = true;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce el dni");
            if (sc.hasNextInt()) {
                int dni = sc.nextInt();
                System.out.println("Introduce el nombre");
                String nombre = sc.next();
                contactos.addcontacto(dni, nombre);
                datosaddError = false;
            } else {
                System.out.println("Debe introducir un número");
            }

        } while (datosaddError);

    }

    private static void borrarContactos(Scanner sc) {
        System.out.println("Introduce el dni a borrar");
        if (sc.hasNextInt()) {
            int dni = sc.nextInt();
            String borrado = contactos.eliminarcontacto(dni);
            if (borrado == null) {
                System.out.println("El elemento que quiere borrar no existe");
            } else {
                System.out.println("El elemento " + borrado + "ha sido eliminado");
            }
        } else {
            System.out.println("Debe introducir un número");
        }

    }

    private static void mostrarContactos(HashContactos contactos) {

        contactos.mostarcontactos();
    }

}
