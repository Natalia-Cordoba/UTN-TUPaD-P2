/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4_animales;

/**
 *
 * @author natal
 */
public class Vaca extends Animal {

    public Vaca(String nombre, String especie, String raza) {
        super(nombre, especie, raza);
    }

    @Override
    public String hacerSonido() {
        return "Muu Muu Muu";
    }
    
}
