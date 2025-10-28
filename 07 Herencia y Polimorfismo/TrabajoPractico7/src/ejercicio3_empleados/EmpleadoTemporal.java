/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3_empleados;

/**
 *
 * @author natal
 */
public class EmpleadoTemporal extends Empleado {
    
    private static final double VALOR_HORA = 1700;
    
    private int horasTrabajadas;

    public EmpleadoTemporal(String nombre, String dni, int horasTrabajadas) {
        super(nombre, dni);
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSueldo() {
        return horasTrabajadas * VALOR_HORA;
    }

    @Override
    public String toString() {
        return super.toString() + "EmpleadoTemporal{" + "VALOR_HORA=" + VALOR_HORA + ", horasTrabajadas=" + horasTrabajadas + '}';
    }
    
}
