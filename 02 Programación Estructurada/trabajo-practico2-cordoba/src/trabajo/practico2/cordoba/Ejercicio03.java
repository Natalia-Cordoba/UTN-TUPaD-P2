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
public class Ejercicio03 {
    
    public static void main(String[] args) {
        
        // utilizar scanner y declarar variables
        Scanner input = new Scanner(System.in);
        int edad;
        
        // pedir al usuario su edad y guardar su valor en la variable
        System.out.print("Por favor, ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());

        
        // evaluar a que categoría pertenece según su edad
        // y mostrar el mensaje que corresponda
        if (edad > 0 && edad < 12) {
            System.out.println("Eres un Niño");
        } else if (edad >= 12 && edad <= 17) {
            System.out.println("Eres un Adolescente");
        } else if (edad >= 18 && edad <= 59) {
            System.out.println("Eres un Adulto");
        } else if (edad >= 60) {
            System.out.println("Eres un Adulto Mayor");
        } else  {
            System.out.println("La edad ingresada no es válida");
        }
        
    }   
}
