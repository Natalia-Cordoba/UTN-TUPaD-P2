/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5_pagable;

import java.util.ArrayList;

/**
 *
 * @author natal
 */
public class Principal {
    
    public static void main(String[] args) {

        ArrayList<Pagable> listaPagos = new ArrayList<>();

        TarjetaCredito tc1 = new TarjetaCredito("1234-5678-9876-5432", "Gabriela", 3500.0);
        Transferencia t1 = new Transferencia("1234567890123456789012", "Daniela", 1700.0);
        Efectivo e1 = new Efectivo(5000.0);

        listaPagos.add(tc1);
        listaPagos.add(t1);
        listaPagos.add(e1);
        
        Pagable tc2 = new TarjetaCredito("9876-54321-2345-6789", "Sara", 43000.0);
        Pagable t2 = new Transferencia("0987654321098765432109", "Emma", 8250.0);
        Pagable e2 = new Efectivo(22000.0);

        listaPagos.add(tc2);
        listaPagos.add(t2);
        listaPagos.add(e2);

        for (Pagable pago : listaPagos) {
            procesarPago(pago);
        }
        
    }
    
    public static void procesarPago(Pagable medio) {
        medio.pagar();
        System.out.println("Pago Realizado con Éxito: " + medio.toString());
    }
}
