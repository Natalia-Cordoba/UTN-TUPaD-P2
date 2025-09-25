/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author natal
 */
public class Main {
    
    public static void main(String[] args) {
        
        Usuario usuario1 = new Usuario("Ana Escudero", "ana@example.com");
        GeneradorQR generador1 = new GeneradorQR();
        
        generador1.generar("QR1234", usuario1);
        
    }
}
