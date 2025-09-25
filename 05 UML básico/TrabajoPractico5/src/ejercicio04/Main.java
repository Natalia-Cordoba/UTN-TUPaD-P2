/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

import java.time.YearMonth;

/**
 *
 * @author natal
 */
public class Main {
    
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente("María Martinez", "15467543");
        Banco banco1 = new Banco("Banco123", "19-25678543-4");
        TarjetaDeCredito tarjeta1 = new TarjetaDeCredito("1234-3456-5678-7890", YearMonth.of(2029,12), banco1);
    
        tarjeta1.setCliente(cliente1);
        
        System.out.println(tarjeta1.toString());
    }
    
}
