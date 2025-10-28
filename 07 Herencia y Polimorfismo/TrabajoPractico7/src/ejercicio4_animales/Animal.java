/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4_animales;

/**
 *
 * @author natal
 */
public abstract class Animal {
    
    private String nombre;
    private String especie;
    private String raza;

    public Animal(String nombre, String especie, String raza) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
    }
    
    public abstract String hacerSonido();
    
    public void describirAnimal() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", especie=" + especie + ", raza=" + raza + '}';
    }
    
}
