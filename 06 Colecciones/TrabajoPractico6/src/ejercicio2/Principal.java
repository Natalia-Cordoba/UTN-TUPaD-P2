/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.util.ArrayList;

/**
 *
 * @author natal
 */
public class Principal {
    
    public static void main(String[] args) {
        
        // Instancio una biblioteca
        Biblioteca biblioteca1 = new Biblioteca("La Biblioteca");
        
        // Instancio 3 autores
        Autor autor1 = new Autor("BS", "Brandon Sanderson", "Estadounidense");
        Autor autor2 = new Autor("AC", "Agatha Christie", "Británica");
        Autor autor3 = new Autor("CP", "Claudia Piñeiro", "Argentina");
        
        // Instancio desde la biblioteca 5 libros y los asigno a los autores
        biblioteca1.agregarLibro("9788467070514", "Y no quedó ninguno", 1939, autor2);
        biblioteca1.agregarLibro("9788417347291", "El imperio final", 2006, autor1);
        biblioteca1.agregarLibro("9788419260253", "El pozo de la ascensión", 2007, autor1);
        biblioteca1.agregarLibro("9789877389753", "El tiempo de las moscas", 2022, autor3);
        biblioteca1.agregarLibro("9788466658911", "El héroe de las eras", 2008, autor1);
        
        // Listo todos los libros de la biblioteca
        biblioteca1.listarLibros();
        System.out.println("");
        
        // Busco un libro por su isbn
        Libro libroEncontrado = biblioteca1.buscarLibroPorIsbn("9788467070514");
        if (libroEncontrado != null) {
            System.out.println("Libro encontrado por ISBN: " + libroEncontrado);
        } else {
            System.out.println("No se encontró ningún libro con ese ISBN.");
        }
        System.out.println("");
        
        // Elimino un libro por su isbn
        Libro libroEliminado = biblioteca1.eliminarLibro("9789877389753");
        System.out.println("Libro eliminado: " + libroEliminado);
        // Muestro los libros restantes
        System.out.println("Listado de libros restantes: ");
        biblioteca1.listarLibros();
        System.out.println("");
        
        // Filtro los libros por año
        ArrayList<Libro> libroPorAnio = biblioteca1.filtrarLibrosPorAnio(2006);
        System.out.println("Libros filtrados por año: ");
        for (Libro libro : libroPorAnio) {
            System.out.println(libro);
        }
        System.out.println("");
        
        // Obtengo la cantidad total de libros
        System.out.println("Cantidad de libros en la biblioteca: " + biblioteca1.obtenerCantidadLibros());
        System.out.println("");
        
        // Muestro los autores disponibles en la biblioteca
        biblioteca1.mostrarAutoresDisponibles();
        
    }
           
}
