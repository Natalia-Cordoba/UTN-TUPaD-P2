/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author natal
 */
public class Biblioteca {
    
    private String nombre;
    private ArrayList<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        libros = new ArrayList<>();
    }
    
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(nuevoLibro);
    }

    public void listarLibros() {
        System.out.println("Listado de libros: ");
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
    }
    
    public Libro buscarLibroPorIsbn(String isbn){
        Libro libroEncontrado = null;
        Iterator<Libro> it = this.libros.iterator();
        while (it.hasNext() && libroEncontrado == null) {
            Libro prod = it.next();
            if (prod.getIsbn().equalsIgnoreCase(isbn)) {
                libroEncontrado = prod;
            }
        }
        return libroEncontrado;
    }
    
    public Libro eliminarLibro(String isbn){
        Libro libroParaEliminar = buscarLibroPorIsbn(isbn);
        if (libroParaEliminar != null) {
            this.libros.remove(libroParaEliminar);  
        } else {
            System.out.println("No se encontró el libro");
        }
        return libroParaEliminar;
    }
    
    public ArrayList<Libro> filtrarLibrosPorAnio(int anio){
        ArrayList<Libro> libroEncontrados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                libroEncontrados.add(libro);
            }
        }
        return libroEncontrados;
    }
    
    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public void mostrarAutoresDisponibles() {
        System.out.println("Autores disponibles:");
        ArrayList<Autor> autoresEncontrados = new ArrayList<>();

        for (Libro libro : libros) {
            Autor autor = libro.getAutor();

            if (!autoresEncontrados.contains(autor)) {
                autoresEncontrados.add(autor);
                autor.mostrarInfo();
            }
        }
    }

}
