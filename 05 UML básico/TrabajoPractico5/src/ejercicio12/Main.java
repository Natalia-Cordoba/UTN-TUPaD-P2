/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author natal
 */
public class Main {
    
    public static void main(String[] args) {
        
        Contribuyente contribuyente1 = new Contribuyente("Raquel Brune", "22-34565321-4");
        Impuesto impuesto1 = new Impuesto(2.5);
        
        impuesto1.setContribuyente(contribuyente1);
        
        Calculadora calculadora1 = new Calculadora();
        
        System.out.println(impuesto1);
        
        calculadora1.calcular(impuesto1);
        
    }
    
}
