/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico3.ejercicio4;

/**
 *
 * @author natal
 */
public class Gallina {
   
    private String idGallina;
    private int edad;
    private int huevosPuestos;
    
    // Setter para modificar el identificador de la gallina
    public void setIdGallina(String idGallina) {
        if (idGallina != null) {
            this.idGallina = idGallina;
        }
    }
    
    // método para poner huevos
    public void ponerHuevo() {
        huevosPuestos ++;            
    }
    
    // método opcional para poner más de 1 huevo a la vez
    public void ponerHuevos(int cantidad) {
        if (cantidad > 0) {
            huevosPuestos += cantidad;            
        }
    }
    
    // método para envejecer
    public void envejecer(int anios) {
        if (anios > 0) {
            edad += anios;            
        }
    }
    
    // método para mostrar estado
    public void mostrarEstado() {
        System.out.println("Id: " + idGallina);
        System.out.println("Edad: " + edad);
        System.out.println("Cantidad de Huevos Puestos: " + huevosPuestos);
        System.out.println();
    }
}
