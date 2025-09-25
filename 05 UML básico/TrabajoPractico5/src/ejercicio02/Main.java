/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02;

/**
 *
 * @author natal
 */
public class Main {
    
    public static void main(String[] args) {
    
        Usuario usuario1 = new Usuario("Marina López", "23567843");
        Bateria bateria1 = new Bateria("Li-Poly", 5000);
        Celular celular1 = new Celular("123456", "Motorola", "G54", bateria1);
    
        celular1.setUsuario(usuario1);
        
        System.out.println(celular1.toString());
    
    }
    
}
