/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico4;

/**
 *
 * @author natal
 */
public class Empleado {
    
    // definimos los atibutos de la clase Empleado
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados;

    // creamos los dos tipos de constructores 
    // el constructor que recibe todos los atributos por parámetro
    public Empleado(int id, String nombre, String puesto, double salario) {
        Empleado.totalEmpleados ++;
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }
    // el contructor que solo recibe nombre y puesto por parametro
    public Empleado(String nombre, String puesto) {
        Empleado.totalEmpleados ++;
        this.id = Empleado.totalEmpleados;  // id automático 
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 500000;  // salario por defecto
    }
    
    // creamos los getters y setters necesarios
    // para el atributo id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        }
    }
    
    // para el atributo nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;        
        }
    }
    
    // para el atributo puesto
    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        if (puesto != null) {
            this.puesto = puesto;        
        }
    }

    // para el atributo salario
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;        
        }
    }
    
    // para el atributo de clase totalEmpleados
    public static int getTotalEmplados() {
        return totalEmpleados;
    }
    
    // creamos los métodos para actualizar salario 
    // recibiendo un porcentaje
    public void actualizarSalario(int porcentaje){
        this.salario += this.salario * ((double) porcentaje / 100);
    }
    // recibiendo una cantidad
    public void actualizarSalario(double cantidad){
        this.salario += cantidad;
    }
    
    // creamos el método toString para mostrar el estado de las instancias de forma legible
    @Override
    public String toString() {
        return "Empleado {Id: " + id + ", Nombre: " + nombre + ", Puesto: " + puesto + ", Salario: " + salario + "}";
    }
    
    // creamos el método estático para mostrar el total de empleados creados
    public static void mostrarTotalEmpleados() {
        System.out.println("Total de Empleados: " + Empleado.totalEmpleados);
    } 
}
