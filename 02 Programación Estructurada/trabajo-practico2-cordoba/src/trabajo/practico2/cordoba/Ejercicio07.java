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
public class Ejercicio07 {
    
    public static void main(String[] args) {
        
        // utilizar scanner y declarar variable
        Scanner input = new Scanner(System.in);
        int nota;
        
        // utilizar un ciclo do-while para pedir la nota hasta que ingrese 
        // un valor dentro del rango
        do {            
            // pedir al usuario que ingrese la nota
            System.out.print("Por favor, ingrese una nota (0-10): ");
            nota = Integer.parseInt(input.nextLine());
            
            if (nota < 0 || nota > 10) {
                // mostrar mensaje de error si la nota no está dentro del rango
                System.out.println(" ERROR. Nota inválida. Por favor, ingrese una nota entre 0 y 10.");                
            } else {
                // mostrar mensaje de éxito si la nota si está dentro del rango
                System.out.println("Nota guardada correctamente.");
            }
        } while (nota < 0 || nota > 10); // condición de salida del bucle
    
    }
}
