/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author natal
 */
public class Main {
    
    public static void main(String[] args) {
        
        Mesa mesa1 = new Mesa (17, 3);
        Cliente cliente1 = new Cliente ("Sofía Fernández", "15345678");
        Reserva reserva1 = new Reserva (LocalDate.of(2025, 9, 28), LocalTime.of(21, 30), mesa1);
        
        reserva1.setCliente(cliente1);
        
        System.out.println(reserva1.toString());
        
    }
    
}
