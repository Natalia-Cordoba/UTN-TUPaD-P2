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
public class Ejercicio04 {
    
    // declarar como constantes los descuentos
    final static double DESC_CATEGORIA_A = 0.10;
    final static double DESC_CATEGORIA_B = 0.15;
    final static double DESC_CATEGORIA_C = 0.20;
    
    public static void main(String[] args) {
        
        // utilizar scanner y declarar variables
        Scanner input = new Scanner(System.in);
        double precioOriginal, precioFinal;
        char categoria;
        
        // pedir al usuario el precio del producto y la categoría 
        // y guardar sus valores en las variables
        System.out.print("Por favor, ingrese el precio del producto: ");
        precioOriginal = Double.parseDouble(input.nextLine());
        System.out.print("Por favor, ingrese la categoría del producto (A, B o C): ");
        categoria = input.nextLine().charAt(0);
        
        // evaluar que descuento le corresponde de acuerdo a su categoría
        // mostrar por consola el descuento aplicado y el precio final
        switch (categoria) {
            case 'A':
            case 'a':
                System.out.println("Categoría A: 10% de descuento");
                precioFinal = precioOriginal * (1 - DESC_CATEGORIA_A);
                System.out.println("Precio final: " + precioFinal);
                break;
            case 'B':
            case 'b':
                System.out.println("Categoría B: 15% de descuento");
                precioFinal = precioOriginal * (1 - DESC_CATEGORIA_B);
                System.out.println("Precio final: " + precioFinal);
                break;
            case 'C':
            case 'c':
                System.out.println("Categoría C: 20% de descuento");
                precioFinal = precioOriginal * (1 - DESC_CATEGORIA_C);
                System.out.println("Precio final: " + precioFinal);
                break;
            default:
                System.out.println("La categoría ingresada NO es válida");
        }

        
    }   
}
