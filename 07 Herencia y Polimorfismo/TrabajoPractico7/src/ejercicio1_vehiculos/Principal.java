/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1_vehiculos;

/**
 *
 * @author natal
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Auto a1 = new Auto("Citroen", "C4", 5);
        Auto a2 = new Auto("Volkswagen", "Up!", 5);

        a1.mostrarInfo();
        a2.mostrarInfo();
        
        Vehiculo v1 = new Auto("Ford", "Focus", 4);
        Vehiculo v2 = new Auto("Toyota", "Yaris", 5);
        
        v1.mostrarInfo(); 
        v2.mostrarInfo(); 
      
    }

}
