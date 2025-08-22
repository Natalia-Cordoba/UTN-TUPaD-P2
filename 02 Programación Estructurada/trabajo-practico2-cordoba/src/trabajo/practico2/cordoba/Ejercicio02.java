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
public class Ejercicio02 {
    
    public static void main(String[] args) {
        
        // utilizar scanner y declarar variables
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, numMayor;
        
        // pedir al usuario 3 números enteros y guardar su valor en las variables
        System.out.print("Por favor, ingrese el primer número: ");
        num1 = Integer.parseInt(input.nextLine());
        System.out.print("Por favor, ingrese el segundo número: ");
        num2 = Integer.parseInt(input.nextLine());
        System.out.print("Por favor, ingrese el tercer número: ");
        num3 = Integer.parseInt(input.nextLine());
        
        // evaluar cual de los tres números es mayor
        if ((num1 > num2) && (num1 > num3)) {
            numMayor = num1;
        } else if ((num2 > num1) && (num2 > num3)) {
            numMayor = num2;
        } else {
            numMayor = num3;
        }
        
        // mostrar por consola el número mayor
        System.out.println("El mayor de los números ingresados es: " + numMayor);
    }   
    
}
