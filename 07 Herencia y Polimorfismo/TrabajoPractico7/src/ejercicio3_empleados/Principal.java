/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3_empleados;

import java.util.ArrayList;

/**
 *
 * @author natal
 */
public class Principal {
    
    public static void main(String[] args) {
        
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        
        EmpleadoPlanta ep1 = new EmpleadoPlanta("Lorena", "12345678", 350000.0, 7);
        EmpleadoTemporal et1 = new EmpleadoTemporal("Isabella", "23456789", 53);
        
        listaEmpleados.add(ep1);
        listaEmpleados.add(et1);
        
        Empleado ep2 = new EmpleadoPlanta("Aurora", "34567890", 470000.0, 10);
        Empleado et2 = new EmpleadoTemporal("Violeta", "45678901", 28);
        
        listaEmpleados.add(ep2);
        listaEmpleados.add(et2);
        
        for (Empleado empleado : listaEmpleados) {
            if (empleado instanceof EmpleadoPlanta) {
                System.out.println("Empleado de planta:");
            } else {
                System.out.println("Empleado temporal:");
            }
            System.out.println(empleado);
            System.out.println("Sueldo: " + empleado.calcularSueldo());
        }

    }
    
}
