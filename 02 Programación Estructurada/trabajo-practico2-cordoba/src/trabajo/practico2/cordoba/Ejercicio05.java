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
public class Ejercicio05 {
    
    public static void main(String[] args) {
        
        // utilizar scanner y declarar las variables
        Scanner input = new Scanner(System.in);
        int num;
        int sumaPares = 0;
        
        // pedir el primer número para asegurar que se entre al ciclo
        System.out.print("Por favor, ingrese un número (0 para terminar): ");
        num = Integer.parseInt(input.nextLine());
        
        // seguir pidiendo números hasta que ingrese el cero
        while (num != 0) {            
            if (num % 2 == 0) { //evaluar si es par
                sumaPares += num; // sumar el nuevo número par a los anteriores
            }
            System.out.print("Por favor, ingrese un número (0 para terminar): ");
            num = Integer.parseInt(input.nextLine());
        }
        
        // mostrar por consola el resultado de la suma de todos los números pares
        System.out.println("La suma de los números pares ingresados es: " + sumaPares);
        
    }  
    
}
