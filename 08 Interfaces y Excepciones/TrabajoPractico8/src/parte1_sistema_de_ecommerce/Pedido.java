/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte1_sistema_de_ecommerce;

import java.util.ArrayList;

/**
 *
 * @author natal
 */
public class Pedido implements Pagable {
    
    private ArrayList<Producto> listaProductos = new ArrayList<>();
    private EstadoPedido estado;
    private Notificable cliente;

    public Pedido(Notificable cliente) {
        this.cliente = cliente;
        this.estado = EstadoPedido.PENDIENTE;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }
    
    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
    }
    
    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : listaProductos) {
            total += producto.calcularTotal();
        }
        return total;
    }
    
    public void cambiarEstado(EstadoPedido nuevoEstado) {
        this.estado = nuevoEstado;
        cliente.notificar(nuevoEstado.getDescripcion());
    }
    
}
