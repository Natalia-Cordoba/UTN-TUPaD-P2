/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico1.cordoba;

import java.util.Scanner;

/**
 *
 * @author natal
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        
        // utilizar scanner y desclarar variables
        Scanner input = new Scanner(System.in);
        String nombre;
        int edad;
        
        // pedir los datos al usuario y almacenarlos en las variables
        System.out.print("Por favor, ingrese su nombre: ");
        nombre = input.nextLine();
        System.out.print("Por favor, ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        // mostrar los datos ingresados por consola
        System.out.println("Tu nombre es " + nombre + " y tienes " + edad + " años.");
    }
}
