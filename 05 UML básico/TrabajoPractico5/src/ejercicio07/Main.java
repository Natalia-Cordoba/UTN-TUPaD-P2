/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio07;

/**
 *
 * @author natal
 */
public class Main {
 
    public static void main(String[] args) {
        
        Conductor conductor1 = new Conductor("Aloma Martinez", true);
        Motor motor1 = new Motor("HDi de 1.4L", "ABC1234567890");
        Vehiculo vehiculo1 = new Vehiculo("AB123CD", "Peugeot 207", motor1);
        
        vehiculo1.setConductor(conductor1);
        
        System.out.println(vehiculo1.toString());
        
    }
    
}
