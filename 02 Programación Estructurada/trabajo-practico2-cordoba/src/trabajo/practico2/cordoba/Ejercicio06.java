/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico2.cordoba;

import java.util.Scanner;

/**
 *
 * @author natal
 */
public class Ejercicio06 {
    
    public static void main(String[] args) {
        
        // utilizar scanner, declarar variables e inicializarlas
        Scanner input = new Scanner(System.in);
        int num;
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        
        // utilizar un ciclo for para obtener los número
        for (int i = 1; i < 11; i++) {
            
            // pedir de a uno los números 
            System.out.print("Por favor, ingrese el número" + i + ": ");
            num = Integer.parseInt(input.nextLine());
            
            // controlar a que grupo pertenecen y aumentar el contador que corresponda
            if (num > 0) {
                positivos += 1;
            } else if (num < 0) {
                negativos += 1;
            } else {
                ceros += 1;
            }
        }
        
        // mostrar por consola los resultados
        System.out.println("Cantidad de número positivos ingresados: " + positivos);
        System.out.println("Cantidad de número negativos ingresados: " + negativos);
        System.out.println("Cantidad de número ceros ingresados: " + ceros);
       
    }
}
