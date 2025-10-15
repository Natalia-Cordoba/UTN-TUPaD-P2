/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author natal
 */
public class Universidad {
    
    private String nombre;
    private ArrayList<Profesor> profesores;
    private ArrayList<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        profesores = new ArrayList<>();
        cursos = new ArrayList<>();
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }
    
    public void agregarProfesor(Profesor p) {
        if (p != null && !profesores.contains(p)) {
            profesores.add(p);
        }
    }

    public void agregarCurso(Curso c) {
        if (c != null && !cursos.contains(c)) {
            cursos.add(c);
        }
    }
    
    public void listarProfesores() {
        System.out.println("Listado de profesores:");
        for (Profesor profesor : profesores) {
            profesor.mostrarInfo();
        }
    }
    
    public void listarCursos() {
        System.out.println("Listado de cursos: ");
        for (Curso curso : cursos) {
            curso.mostrarInfo();
        }
    }
    
    public void asignarProfesorACurso(String codigo, String id) {
        Curso curso = buscarCursoPorCodigo(codigo);
        Profesor profesor = buscarProfesorPorId(id);

        if (curso != null && profesor != null) {
            curso.setProfesor(profesor);
        } else {
            System.out.println("Error: curso o profesor no encontrado.");
        }
    }
    
    private Profesor buscarProfesorPorId (String id){
        Profesor profesorEncontrado = null;
        Iterator<Profesor> it = this.profesores.iterator();
        while (it.hasNext() && profesorEncontrado == null) {
            Profesor p = it.next();
            if (p.getId().equalsIgnoreCase(id)) {
                profesorEncontrado = p;
            }
        }
        return profesorEncontrado;
    }
    
    private Curso buscarCursoPorCodigo(String codigo){
        Curso cursoEncontrado = null;
        Iterator<Curso> it = this.cursos.iterator();
        while (it.hasNext() && cursoEncontrado == null) {
            Curso c = it.next();
            if (c.getCodigo().equalsIgnoreCase(codigo)) {
                cursoEncontrado = c;
            }
        }
        return cursoEncontrado;
    }
    
    public Curso eliminarCurso(String codigo){
        Curso cursoParaEliminar = buscarCursoPorCodigo(codigo);
        if (cursoParaEliminar != null) {
            cursoParaEliminar.setProfesor(null);
            this.cursos.remove(cursoParaEliminar); 
            System.out.println("Curso eliminado correctamente");
        } else {
            System.out.println("No se encontró el curso");
        }
        return cursoParaEliminar;
    }
    
    public Profesor eliminarProfesor(String id){
        Profesor profesorParaEliminar = buscarProfesorPorId(id);
        if (profesorParaEliminar != null) {
            for (Curso c : new ArrayList<>(profesorParaEliminar.getCursos())) {
                c.setProfesor(null);
            }
            this.profesores.remove(profesorParaEliminar);  
            System.out.println("Profesor eliminado correctamente");
        } else {
            System.out.println("No se encontró el profesor");
        }
        return profesorParaEliminar;
    }
    
}
