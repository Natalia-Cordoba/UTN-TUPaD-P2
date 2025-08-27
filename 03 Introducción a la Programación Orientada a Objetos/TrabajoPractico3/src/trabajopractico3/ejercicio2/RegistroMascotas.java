/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico3.ejercicio2;

/**
 *
 * @author natal
 */
public class RegistroMascotas {
    
    public static void main(String[] args) {
        
        // instanciamos una nueva mascota
        Mascota mascota1 = new Mascota();
        
        // mostramos los valores de sus atributos por defecto
        mascota1.mostrarInfo();
        
        // asignamos nuevos valores a los atributos
        mascota1.setNombre("Michi");
        mascota1.setEspecie("Gato");
        mascota1.setEdad(6);
        // volvemos a mostrar los atributos en su nuevo estado
        mascota1.mostrarInfo();
        
        //simulamos el paso del tiempo
        mascota1.cumplirAnios(); // 1 año
        mascota1.cumplirAnios(); // 2 años
        // volvemos a mostrar los atributos en su nuevo estado
        mascota1.mostrarInfo();
    }
    
}
