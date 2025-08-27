/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico3.ejercicio5;

/**
 *
 * @author natal
 */
public class NaveEspacial {
    
    private String nombre;
    private int combustible;
    private final int COMBUSTIBLE_MAX = 300;
    
    // método para despegar la nave espacial
    public void despegar() {
        System.out.println("¡Preparando Despegue!");
        System.out.println("3");
        System.out.println("2");
        System.out.println("1");
        System.out.println("¡Despegue!");
        System.out.println();
    }
    
    // método privado para validar si hay combustible antes de avanzar
    private boolean combustibleDisponible(int distancia) {
        return combustible >= distancia;
    } 
            
    // método para avanzar la nave espacial
    public void avanzar(int distancia) {
        if (combustibleDisponible(distancia)) {
            combustible -= distancia;
            System.out.println("La nave avanzó " + distancia + " unidades.");
        } else {
            System.out.println("Debes recargar combustible para avanzar");
        }
    }
    
    // método para recargarCombustible
    // establecemos 300 unidades como limite de carga
   public void recargarCombustible(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad de combustible a recargar debe ser un valor positivo.");
        } else if ((combustible + cantidad) > COMBUSTIBLE_MAX) {
            System.out.println("Error: La cantidad a recargar excede el límite de " + COMBUSTIBLE_MAX + " unidades.");
        } else {
            combustible += cantidad;
            System.out.println("Se cargó combustible correctamente. Nivel actual: " + combustible + " unidades.");
        }
    }
    
    // método para mostrar el estado de los atributos
    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Combustible: " + combustible + " unidades");
        System.out.println();
    }
    
    // Setters para poder asignar valores a los atributos
    public void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;        
        }
    }

    public void setCombustible(int combustible) {
        if (combustible > 0 && combustible <= COMBUSTIBLE_MAX) {
            this.combustible = combustible;            
        } else {
            System.out.println("Error: el combustible debe estar entre 0 y " + COMBUSTIBLE_MAX + " unidades.");
        }
    }
    
}
