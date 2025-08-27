/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico3.ejercicio3;

import java.time.Year;

/**
 *
 * @author natal
 */
public class Libro {
    
    private String titulo;
    private String autor;
    private int anioPublicacion;
    
    // Getters para leer todos los atributos
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    
    // Setters con validación para modificar los atributos
    public void setTitulo(String titulo) {
        if (titulo != null) {
            this.titulo = titulo;            
        }
    }

    public void setAutor(String autor) {
        if (autor != null) {
            this.autor = autor;        
        }
    }
    
    // Para la validacion busqué como trabajar con fechas en java para corroborar
    // que el año ingresado no sea menor a 0 ni mayor al año actual
    public void setAnioPublicacion(int anioPublicacion) {
        int anio_actual = Year.now().getValue(); // variable local para almacenar año actual
        if (anioPublicacion > 0 && anioPublicacion < anio_actual) {
            this.anioPublicacion = anioPublicacion;
        } else {
            System.out.println("Error. Año de publicación inválido: " + anioPublicacion);
        }
    }
    
}
