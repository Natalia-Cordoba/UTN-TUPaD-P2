/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

import java.time.LocalDate;

/**
 *
 * @author natal
 */
public class Main {
    
    public static void main(String[] args) {
        
        Titular titular1 = new Titular("Guadalupe Soler", "36356765");
        Pasaporte pasaporte1 = new Pasaporte("W234789", LocalDate.of(2025, 7, 23), "Foto del pasaporte1");
    
        pasaporte1.setTitular(titular1);
        
        System.out.println(pasaporte1.toString());
    
    }
}
