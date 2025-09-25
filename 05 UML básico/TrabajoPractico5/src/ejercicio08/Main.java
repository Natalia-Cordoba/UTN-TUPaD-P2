/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio08;

import java.time.LocalDate;

/**
 *
 * @author natal
 */
public class Main {
    
    public static void main(String[] args) {
        
        Usuario usuario1 = new Usuario("Flavia Ortiz", "flavia@example.com");
        Documento documento1 = new Documento("Este es el Título", "Este es el contenido", 
                "0cc175b269c77d2661", LocalDate.of(2025, 9, 23), usuario1);
    
        System.out.println(documento1.toString());
        
    }
    
}
