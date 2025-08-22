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
public class Ejercicio01 {
    
    public static void main(String[] args) {
        
        // utilizar scanner y declarar variables
        Scanner input = new Scanner(System.in);
        int anio;
        
        // pedir al usuario un año y guardar el valor en la variable
        System.out.print("Por favor, ingrese un año para saber si es bisiesto: ");
        anio = Integer.parseInt(input.nextLine());
        
        // evaluar si el año ingresado es o no bisiesto 
        // y mostrar el mensaje que corresponda a cada caso
        if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
            System.out.println("El año " + anio + " SI es bisiesto");
        } else {
            System.out.println("El año " + anio + " NO es bisiesto");
        }
    }   

}
