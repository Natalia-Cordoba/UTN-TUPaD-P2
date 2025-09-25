/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author natal
 */
public class Reserva {
    
    private LocalDate fecha;
    private LocalTime hora;
    private Mesa mesa;
    private Cliente cliente;

    public Reserva(LocalDate fecha, LocalTime hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Reserva{" + "fecha=" + fecha + ", hora=" + hora + ", mesa=" + mesa + ", cliente=" + cliente + '}';
    }
    
}
