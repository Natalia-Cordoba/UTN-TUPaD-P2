/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2_figurasgeometricas;

import java.util.ArrayList;

/**
 *
 * @author natal
 */
public class Principal {
    
    public static void main(String[] args) {
        
        ArrayList<Figura> figuras = new ArrayList<>();
        
        Circulo c1 = new Circulo("circulo_1", 2.5);
        Rectangulo r1 = new Rectangulo("rectangulo_1", 14.0, 3.5);
        
        figuras.add(c1);
        figuras.add(r1);
        
        Figura c2 = new Circulo("circulo_2", 7.3);
        Figura r2 = new Rectangulo("rectangulo_2", 24.15, 6);
        
        figuras.add(c2);
        figuras.add(r2);
        
        for (Figura figura : figuras) {
            System.out.println(figura.toString());
            System.out.println("Area: " + figura.calcularArea());
        }
    }
    
}
