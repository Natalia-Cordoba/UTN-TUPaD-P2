/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico3.ejercicio1;

/**
 *
 * @author natal
 */
public class Estudiante {
    
    private String nombre;
    private String apellido;
    private int curso;
    private double calificacion;
    
    // método para mostrar la información del estudiante
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
        System.out.println();
    }
    
    // setters para modificar los valores por defecto 
    public void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        }
    }

    public void setApellido(String apellido) {
        if (apellido != null) {
            this.apellido = apellido;
        }
    }

    public void setCurso(int curso) {
        if (curso > 0) {
            this.curso = curso;
        }
    }

    public void setCalificacion(double calificacion) {
        if (calificacion >= 0 && calificacion <= 10) {
            this.calificacion = calificacion;
        }
    }
    
    // método para subir la calificación
    // controlando que no pase de 10
    public void subirCalificacion(double puntos) {
        if (puntos > 0 && (calificacion + puntos) <= 10) {
            calificacion += puntos;
        } else {
            System.out.println("No se puede subir la calificación a un número mayor a 10.");
        }
    }
    
    // método para bajar la calificación
    // controlando que no baje de 0
    public void bajarCalificacion(double puntos) {
        if (puntos > 0 && (calificacion - puntos) >= 0) {
            calificacion -= puntos;
        } else {
            System.out.println("No se puede bajar la calificación a un número menor a 0.");
        }
    }
}
