/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.util.ArrayList;

/**
 *
 * @author natal
 */
public class Profesor {
    
    private String id;
    private String nombre;
    private String especialidad;
    private ArrayList<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        cursos = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }
    
    public void agregarCurso(Curso c) {
        if (c == null) return;

        if (!cursos.contains(c)) {
            cursos.add(c);
        }

        if (c.getProfesor() != this) {
            c.setProfesor(this);
        }
    }
    
    public void eliminarCurso(Curso c) {
        if (c == null) return;
        cursos.remove(c);

        if (c.getProfesor() == this) {
            c.setProfesor(null);
        }
    }
    
    public void listarCursos() {
        System.out.println("Listado de cursos disctados por " + nombre + ":");
        for (Curso curso : cursos) {
            curso.mostrarInfo();
        }
    }
    
    public void mostrarInfo(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Profesor{" + "id=" + id + ", nombre=" + nombre + ", especialidad=" + especialidad + ", cursos=" + cursos + '}';
    }

}
