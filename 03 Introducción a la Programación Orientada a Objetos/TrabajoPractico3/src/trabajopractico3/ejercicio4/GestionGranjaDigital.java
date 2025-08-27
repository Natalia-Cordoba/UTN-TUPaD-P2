/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico3.ejercicio4;

/**
 *
 * @author natal
 */
public class GestionGranjaDigital {
    
    public static void main(String[] args) {
        
        // instanciamos las dos gallinas 
        Gallina gallina1 = new Gallina();
        Gallina gallina2 = new Gallina();
    
        // mostramos los valores de sus atributos por defecto
        System.out.println("Gallina 1");
        gallina1.mostrarEstado();
        System.out.println("Gallina 2");
        gallina2.mostrarEstado(); 
        
        // asignamos id y simulamos las acciones de la gallina 1
        gallina1.setIdGallina("#G1");
        gallina1.envejecer(2);
        gallina1.ponerHuevo(); 
        gallina1.ponerHuevo();
        gallina1.ponerHuevo();
        
        // asignamos id y simulamos las acciones de la gallina 2      
        gallina2.setIdGallina("#G2");
        gallina2.envejecer(5);
        gallina2.ponerHuevo(); 
        gallina2.ponerHuevos(117); // método opcional
    
        // volvemos a mostrar los valores de sus atributos por defecto
        System.out.println("Gallina 1");
        gallina1.mostrarEstado();
        System.out.println("Gallina 2");
        gallina2.mostrarEstado(); 
    }
    
}
