/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte2_ejercicio3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author natal
 */
public class Main {
    
    public static void main(String[] args) {
        String ruta = "src/parte2_ejercicio3/archivo.txt";
        File archivo = new File(ruta);

        try {
            Scanner sc = new Scanner(archivo);
            System.out.println("Contenido del archivo:");
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo no existe o la ruta es incorrecta.");
        } finally {
            System.out.println("Operación finalizada.");
        }
    }
    
}
