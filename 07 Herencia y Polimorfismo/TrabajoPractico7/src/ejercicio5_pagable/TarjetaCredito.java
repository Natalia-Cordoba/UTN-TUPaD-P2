/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5_pagable;

/**
 *
 * @author natal
 */
public class TarjetaCredito implements Pagable{

    private String numeroTarjeta;
    private String titularTarjeta;
    private double monto;

    public TarjetaCredito(String numeroTarjeta, String titularTarjeta, double monto) {
        this.numeroTarjeta = numeroTarjeta;
        this.titularTarjeta = titularTarjeta;
        this.monto = monto;
    }
    
    @Override
    public void pagar() {
        System.out.println("Pagando con Tarjeta de Crédito: $" + monto + " ...");
    }

    @Override
    public String toString() {
        return "TarjetaCredito{" + "numeroTarjeta=" + numeroTarjeta + ", titularTarjeta=" + titularTarjeta + ", monto=" + monto + '}';
    } 
    
}
