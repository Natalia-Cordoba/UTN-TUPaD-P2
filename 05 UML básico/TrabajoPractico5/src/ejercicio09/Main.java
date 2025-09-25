/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio09;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author natal
 */
public class Main {
    
    public static void main(String[] args) {
        
        Paciente paciente1 = new Paciente("Sara López", "Galeno");
        Profesional profesional1 = new Profesional("Emma García", "Psicología");
        CitaMedica cita1 = new CitaMedica(LocalDate.of(2025, 10, 17), LocalTime.of(17, 30));
        
        cita1.setPaciente(paciente1);
        cita1.setProfesional(profesional1);
        
        System.out.println(cita1.toString());
        
    }
    
}
