/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4_animales;

/**
 *
 * @author natal
 */
public class Perro extends Animal {

    public Perro(String nombre, String especie, String raza) {
        super(nombre, especie, raza);
    }

    @Override
    public String hacerSonido() {
        return "Guau Guau Guau";
    }
    
}
