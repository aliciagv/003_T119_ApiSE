/*
Como ejemplo de utilización de colecciones basadas en índices vamos a desarrollar un
programa que nos permita registrar una serie de precios de productos en una colección,
ofreciéndonos además la posibilidad de obtener unos datos estadísticos sobre los mismos.
Al iniciarse el programa se presentara al usuario en un menú como el que se indica a
continuación:
1. Nuevo precio
2. Precio medio
3. Precio máximo
4. Precio mínimo
5. Mostrar todos los precios
6. Salir
Menú que volverá a ser mostrado al usuario después de realizarse la opción correspondiente; así
hasta que elija ”salir”
Con la opción 1 se le pedirá al usuario que introduzca el precio que quiere almacenar, mientras
que las demás opciones mostraran los datos solicitados. Como veremos a continuación en el
listado de código, en vez de incluir todo el código en el interior del método main() se realizara la
gestión de cada una de las opciones en métodos independientes para facilitar la claridad del
código y hacerlo mas estructurado.
 */
package com.cice.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cice
 */
public class Ejercicio07 {
    
    static ArrayList<Integer> listadoprecios = new ArrayList<Integer>();
    
    public static void main(String[] args){
        int opcion=6;
        
        do {
        System.out.println("=======MENU======");
        System.out.println("1. Nuevo precio");
        System.out.println("2. Precio medio");
        System.out.println("3. Precio máximo");
        System.out.println("4. Precio mínimo");
        System.out.println("5. Mostrar todos los precios");
        System.out.println("6. Salir");
        System.out.println("Elige una opción");
        Scanner sc =new Scanner(System.in);
        
        
        opcion =sc.nextInt();
        switch (opcion){
            case 1: 
                System.out.print("Introduce un precio a añadir: ");
                int precio= sc.nextInt();
                nuevoPrecio(precio);
                break;
            case 2:
                break;
            case 3:
                preciomax();
                break;
            case 4:
                preciomin();
                break;
            case 5:
                
                break;    
            case 6:
                System.out.print("Salimos");
                break;  
            default:
               System.out.println("La opcion seleccionada no es valida");
                
                
                
        
        }
        
        } while (opcion!=6);
        
        
        
        
        
        

    
    }
    
    private static void nuevoPrecio(int precio){
        listadoprecios.add(precio);
    }
    
     private static Integer preciomax(){
         Integer max =Integer.MIN_VALUE;
         for (Integer i: listadoprecios){
             if (i>max) max=i;
             
        }
         return max;
    }
     
     private static Integer preciomin(){
         Integer min =Integer.MAX_VALUE;
         for (Integer i: listadoprecios){
             if (i<min) min=i;
             
        }
         return min;
         
    }
}
