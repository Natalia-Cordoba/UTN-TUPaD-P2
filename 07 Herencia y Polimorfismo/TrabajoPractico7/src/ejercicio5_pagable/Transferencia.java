/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5_pagable;

/**
 *
 * @author natal
 */
public class Transferencia implements Pagable{

    private String cbu;
    private String titularCuenta;
    private double monto;

    public Transferencia(String cbu, String titularCuenta, double monto) {
        this.cbu = cbu;
        this.titularCuenta = titularCuenta;
        this.monto = monto;
    }

    @Override
    public void pagar() {
        System.out.println("Pagando con Transferencia: $" + monto + " ...");
    }

    @Override
    public String toString() {
        return "Transferencia{" + "cbu=" + cbu + ", titularCuenta=" + titularCuenta + ", monto=" + monto + '}';
    }
    
}
