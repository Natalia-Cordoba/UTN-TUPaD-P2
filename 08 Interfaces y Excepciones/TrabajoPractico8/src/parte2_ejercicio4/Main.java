/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte2_ejercicio4;

import java.util.Scanner;

/**
 *
 * @author natal
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Por favor, ingrese su edad: ");
            int edad = scanner.nextInt();

            if (edad < 0 || edad > 120) {
                throw new EdadInvalidaException("Edad inválida: " + edad);
            }
            System.out.println("Edad ingresada correctamente: " + edad);
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error de entrada: " + e.getMessage());
        } finally {
            System.out.println("Operación finalizada.");
        }
        
    }
    
}
