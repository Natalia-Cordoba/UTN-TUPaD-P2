/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte1_sistema_de_ecommerce;

/**
 *
 * @author natal
 */
public class Cliente implements Notificable {
    
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println("Notificación para " + nombre + ": " + mensaje);
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + '}';
    }
    
}