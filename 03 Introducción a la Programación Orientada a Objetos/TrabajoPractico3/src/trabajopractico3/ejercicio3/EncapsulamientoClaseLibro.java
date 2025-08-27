/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico3.ejercicio3;

/**
 *
 * @author natal
 */
public class EncapsulamientoClaseLibro {
    
    public static void main(String[] args) {
        
        // Instanciamos un nuevo libro
        Libro libro1 = new Libro();

        // Obtenermos con el metodo get los valores por defecto de los atributos
        System.out.println("Título: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("AnioPublicacion: " + libro1.getAnioPublicacion());
        System.out.println();
        
        // Modificar los valores de los atributos
        libro1.setTitulo("El Imperio Final");
        libro1.setAutor("Brandon Sanderson");
        libro1.setAnioPublicacion(2032); // año inválido
        libro1.setAnioPublicacion(2008); // año válido

        // mostrar la información final
        System.out.println("Título: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("AnioPublicacion: " + libro1.getAnioPublicacion());
        
    }
}
