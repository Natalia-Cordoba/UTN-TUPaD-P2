/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author natal
 */
public class Principal {
    
    public static void main(String[] args) {
        
        // instancio 1 universidad, 3 profesores y 5 cursos
        Universidad utn = new Universidad("UTN");

        Profesor p1 = new Profesor("P01", "Laura González", "Programación");
        Profesor p2 = new Profesor("P02", "Juana Pérez", "Base de Datos");
        Profesor p3 = new Profesor("P03", "Ana Ruiz", "Inglés");

        Curso c1 = new Curso("C101", "Programación I");
        Curso c2 = new Curso("C102", "Bases De Datos I");
        Curso c3 = new Curso("C103", "Programación II");
        Curso c4 = new Curso("C104", "Inglés I");
        Curso c5 = new Curso("C105", "Bases de Datos II");

        // Agrego los profesores y cursos a la universidad
        utn.agregarProfesor(p1);
        utn.agregarProfesor(p2);
        utn.agregarProfesor(p3);

        utn.agregarCurso(c1);
        utn.agregarCurso(c2);
        utn.agregarCurso(c3);
        utn.agregarCurso(c4);
        utn.agregarCurso(c5);

        // Asigno profesor a los cursos
        utn.asignarProfesorACurso("C101", "P01");
        utn.asignarProfesorACurso("C102", "P02");
        utn.asignarProfesorACurso("C103", "P01");
        utn.asignarProfesorACurso("C104", "P03");
        utn.asignarProfesorACurso("C105", "P02");
        
        // Listo los profesores y cursos
        utn.listarProfesores();
        System.out.println("");
        utn.listarCursos();
        System.out.println("");

        // Cambio un profesor
        System.out.println("Cambio el profesor del curso C101");
        System.out.println("Profesor actual: " + c1.getProfesor().getNombre());
        utn.asignarProfesorACurso("C101", "P03");
        // Verifico que ambos lados estén sincronizados
        System.out.println("Nuevo profesor: " + c1.getProfesor().getNombre()); 
        System.out.println("Cursos actualizados del nuevo profesor: " + p3.getCursos());
        System.out.println("");
        
        // Elimino un curso
        System.out.println("Elimino el curso con el id C102");
        utn.eliminarCurso("C102");
        // Verifico que ya no aparece en la lista del profesor
        p2.listarCursos();
        System.out.println("");
        
        // Elimino un profesor
        System.out.println("Elimino el profesor con código P01");
        utn.eliminarProfesor("P01");
        // dejo profesor = null en sus cursos
        c3.mostrarInfo();
        System.out.println("");

        // Listado final
        System.out.println("Estado final de los cursos y profesores");
        utn.listarProfesores();
        utn.listarCursos();
        System.out.println("");
        
        // Reporte cantidad de cursos por profesor
        System.out.println("Reporte: Cantidad de cursos por profesor");
        for (Profesor p : utn.getProfesores()) {
            System.out.println(p.getNombre() + " dicta " + p.getCursos().size() + " curso/s.");
        }

    }
    
}
