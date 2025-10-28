/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4_animales;

import java.util.ArrayList;

/**
 *
 * @author natal
 */
public class Principal {
    
    public static void main(String[] args) {
        
        ArrayList<Animal> listaAnimales = new ArrayList<>();
        
        Perro p1 = new Perro("Loki", "Perro", "Mestizo");
        Gato g1 = new Gato("Salem", "Gato", "Bombay");
        Vaca v1 = new Vaca("Clarabella", "Vaca", "Holstein");
        
        listaAnimales.add(p1);
        listaAnimales.add(g1);
        listaAnimales.add(v1);
        
        Animal p2 = new Perro("Max", "Perro", "Border Collie");
        Animal g2 = new Gato("Michi", "Gato", "Meztizo");
        Animal v2 = new Vaca("Aurora", "Vaca", "Angus");
        
        listaAnimales.add(p2);
        listaAnimales.add(g2);
        listaAnimales.add(v2);
        
        for (Animal animal : listaAnimales) {
            animal.describirAnimal();
            if (animal instanceof Perro) {
                System.out.println("Ladrando...");
            } else if (animal instanceof Gato){
                System.out.println("Maullando...");
            } else {
                System.out.println("Mujiendo...");
            }
            System.out.println("Sonido: " + animal.hacerSonido());
        }
    }
    
}

