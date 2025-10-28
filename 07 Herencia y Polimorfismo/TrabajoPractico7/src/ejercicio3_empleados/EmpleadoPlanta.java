/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3_empleados;

/**
 *
 * @author natal
 */
public class EmpleadoPlanta extends Empleado {
    
    private static final int BONO_ANTIGUEDAD = 150;
    
    private double sueldoBase;
    private int aniosAntiguedad;
    
    public EmpleadoPlanta(String nombre, String dni, double sueldoBase, int aniosAntiguedad) {
        super(nombre, dni);
        this.sueldoBase = sueldoBase;
        this.aniosAntiguedad = aniosAntiguedad;
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase + (aniosAntiguedad * BONO_ANTIGUEDAD);
    }

    @Override
    public String toString() {
        return super.toString() + "EmpleadoPlanta{" + "BONO_ANTIGUEDAD=" + BONO_ANTIGUEDAD + ", sueldoBase=" + sueldoBase + ", aniosAntiguedad=" + aniosAntiguedad + '}';
    }
 
}
