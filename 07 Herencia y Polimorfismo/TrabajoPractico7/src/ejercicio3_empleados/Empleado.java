/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3_empleados;

/**
 *
 * @author natal
 */
public abstract class Empleado {
    
    private String nombre;
    private String dni;

    public Empleado(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public abstract double calcularSueldo();

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }
    
}
