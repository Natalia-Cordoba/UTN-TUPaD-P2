/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5_pagable;

/**
 *
 * @author natal
 */
public class Efectivo implements Pagable{
    
    private double monto;

    public Efectivo(double monto) {
        this.monto = monto;
    }

    @Override
    public void pagar() {
        System.out.println("Pagando en Efectivo: $" + monto + " ...");
    }

    @Override
    public String toString() {
        return "Efectivo{" + "monto=" + monto + '}';
    }
    
}
