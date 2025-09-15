/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico4;

/**
 *
 * @author natal
 */
public class TrabajoPractico4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // instanciamos empleados con los dos tipos de constructores
        // todos los atributos como parámetros
        Empleado e1 = new Empleado(1, "Martina Serrano", "Editora", 700000);
        Empleado e2 = new Empleado(2, "Soledad Moreno", "Correctora", 650000);
        Empleado e3 = new Empleado(3, "Irene Soler", "Directora Creativa", 800000);
        // solo nombre y puesto como parámetros
        Empleado e4 = new Empleado("Berta Castillo", "Editora");
        Empleado e5 = new Empleado("Lorena Brune", "Diseñadora");
        Empleado e6 = new Empleado("Aloma Suarez", "Escritora");

        // imprimimos por consola el estado de los empleados
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
        System.out.println(e5);
        System.out.println(e6);
        System.out.println("");
        
        // actualizamos salarios con los dos métodos
        // con porcentaje como parámetro
        e2.actualizarSalario(10);
        e3.actualizarSalario(15);
        // con cantidad como parámetro
        e4.actualizarSalario(50000.0);
        e6.actualizarSalario(750000.0);
        
        // mostramos los salarios actualizados
        System.out.println(e2.getNombre() + ": " + e2.getSalario());
        System.out.println(e3.getNombre() + ": " + e3.getSalario());
        System.out.println(e4.getNombre() + ": " + e4.getSalario());
        System.out.println(e6.getNombre() + ": " + e6.getSalario());
        System.out.println("");
        
        // imprimimos la cantidad de empleados creados llamando al método
        Empleado.mostrarTotalEmpleados();
    }
    
}
