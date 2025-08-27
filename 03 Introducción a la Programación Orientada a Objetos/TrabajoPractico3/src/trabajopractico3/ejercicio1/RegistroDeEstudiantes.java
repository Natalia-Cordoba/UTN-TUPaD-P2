/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico3.ejercicio1;

/**
 *
 * @author natal
 */
public class RegistroDeEstudiantes {
    
    public static void main(String[] args) {
        
        // instanciamos un estudiante
        Estudiante estudiante1 = new Estudiante();
        
        // mostramos sus atributos por defecto (nulls y ceros)
        estudiante1.mostrarInfo();
        
        //modificamos los atributos del estudiante
        estudiante1.setNombre("Malena");
        estudiante1.setApellido("Morales");
        estudiante1.setCurso(2);
        estudiante1.setCalificacion(5.5);
        // volvemos a mostrar el estado de los atributos
        estudiante1.mostrarInfo();
        
        // aumentamos su calificacion
        estudiante1.subirCalificacion(3);
        // volvemos a mostrar el estado de los atributos
        estudiante1.mostrarInfo();
        
        // disminuimos su calificacion
        estudiante1.bajarCalificacion(1.5);
        // volvemos a mostrar el estado de los atributos
        estudiante1.mostrarInfo();
    }
}
