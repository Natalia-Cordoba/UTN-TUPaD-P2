/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico3.ejercicio2;

/**
 *
 * @author natal
 */
public class Mascota {
    
    private String nombre;
    private String especie;
    private int edad;
    
    // método para mostrar la información de la mascota
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
        System.out.println();
    }
    
    // método para que la mascota aumente en 1 su edad 
    // como si cumpliese años
    public void cumplirAnios() {
        edad ++;
    }
    
    // setters para poder modificar los atributos 
    public void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        }
    }

    public void setEspecie(String especie) {
        if (especie != null) {
            this.especie = especie;
        }
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        }
    }
    
}
