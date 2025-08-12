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
public class Ejercicio5 {
    public static void main(String[] args) {
        
        // utilizar scanner y declarar variables
        Scanner input = new Scanner(System.in);
        int num1, num2, suma, resta, multiplicacion;
        double division;
        
        // pedir al usuario ambos números y guardarlos en las variables
        System.out.print("Por favor ingrese el primer número: ");
        num1 = Integer.parseInt(input.nextLine());
        System.out.print("Por favor ingrese el segundo número (no puede ser cero): ");
        num2 = Integer.parseInt(input.nextLine());
        
        // realizar los cálculos entre ambos números
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = (double) num1 / num2;
        
        // mostrar por consola los resultados
        System.out.println(num1 + " + " + num2 + " = " + suma);
        System.out.println(num1 + " - " + num2 + " = " + resta);
        System.out.println(num1 + " * " + num2 + " = " + multiplicacion);
        System.out.println(num1 + " / " + num2 + " = " + division);

    }
    
}
