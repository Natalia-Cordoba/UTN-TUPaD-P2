/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

import java.time.LocalDateTime;

/**
 *
 * @author natal
 */
public class Main {
    
    public static void main(String[] args) {
        
        Titular titular1 = new Titular("Melisa Acosta", "37948832");
        CuentaBancaria cuenta1 = new CuentaBancaria("017012346000000123456789", 0.0, "codigo", LocalDateTime.of(2020, 6, 23, 10, 00));
        
        cuenta1.setTitular(titular1);
        
        System.out.println(cuenta1.toString());
        
    }
    
}
