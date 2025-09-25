/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio05;

/**
 *
 * @author natal
 */
public class Main {
    
    public static void main(String[] args) {
        
        Propietario propietario1 = new Propietario("Florencia Canedo", "32456789");
        Computadora computadora1 = new Computadora("Lenovo", "RE74IH3J", "Legion Pro 5i", "AMD");
        
        computadora1.setPropietario(propietario1);
        
        System.out.println(computadora1.toString());
    }
    
}
