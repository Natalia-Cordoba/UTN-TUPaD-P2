/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico3.ejercicio5;

/**
 *
 * @author natal
 */
public class SimulacionNaveEspacial {
    
    public static void main(String[] args) {
        
        // Instanciamos la nave espacial
        NaveEspacial nave1 = new NaveEspacial();
        
        // Mostramos los atributos por defecto de la nave
        nave1.mostrarEstado();
        
        // Asignamos nuevos valores a los atributos
        nave1.setNombre("Halcón Milenario");
        nave1.setCombustible(50);
        
        // Volvemos a mostrar los atributos de la nave
        nave1.mostrarEstado();
        
        // Despegamos la nave
        nave1.despegar();
        
        // Intentamos avanzar una distancia que no es posible 
        nave1.avanzar(170);
        
        // Recargamos combustible para poder avanzar 
        nave1.recargarCombustible(200);
        
        // Avanzamos correctamente
        nave1.avanzar(170);
    }   
}
