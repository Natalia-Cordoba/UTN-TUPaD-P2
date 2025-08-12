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
public class ErrorEjemplo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine(); // ERROR SOlUCIONADO
        System.out.println("Hola, " + nombre);
}
}
