/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author natal
 */
public class Inventario {
    
    private ArrayList<Producto> productos;
    
    public Inventario() {
        productos = new ArrayList<>();
    }
    
    public void agregarProducto(Producto p){
       this.productos.add(p);
    }
    
    public void listarProductos() {
        for (Producto producto : productos) {
            producto.mostrarInfo();
        }
    }
    
    public Producto buscarProductoPorId(String id){
        Producto prodEncontrado = null;
        Iterator<Producto> it = this.productos.iterator();
        while (it.hasNext() && prodEncontrado == null) {
            Producto prod = it.next();
            if (prod.getId().equalsIgnoreCase(id)) {
                prodEncontrado = prod;
            }
        }
        return prodEncontrado;
    }
    
    public Producto eliminarProducto(String id){
        Producto prodParaEliminar = buscarProductoPorId(id);
        if (prodParaEliminar != null) {
            this.productos.remove(prodParaEliminar);  
        } else {
            System.out.println("No se encontró el producto");
        }
        return prodParaEliminar;
    }
    
    public Producto actualizarStock(String id, int nuevaCantidad){
        Producto prodParaActualizarStock = buscarProductoPorId(id);
        if (prodParaActualizarStock != null) {
            prodParaActualizarStock.setCantidad(nuevaCantidad);  
        } else {
            System.out.println("No se encontró el producto");
        }
        return prodParaActualizarStock;
    }
    
    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria){
        ArrayList<Producto> prodEncontrados = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getCategoria() == categoria) {
                prodEncontrados.add(producto);
            }
        }
        return prodEncontrados;
    }
    
    public int obtenerTotalStock() {
        int totalStock = 0;
        for (Producto producto : productos) {
            totalStock += producto.getCantidad() ;
        }
        return totalStock;
    }
    
    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) {
            return null; 
        }
        
        Producto prodMayorStock = productos.get(0);
        for (Producto producto : productos) {
            if (producto.getCantidad() > prodMayorStock.getCantidad()) {
                prodMayorStock = producto;
            }
        }
        return prodMayorStock;
    }

    
    public ArrayList<Producto> filtrarProductoPorPrecio(double min, double max){
        ArrayList<Producto> prodEncontrados = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getPrecio() >= min & producto.getPrecio() <= max) {
                prodEncontrados.add(producto);
            }
        }
        return prodEncontrados;
    }
    
    public void mostrarCategoriasDisponibles() {
        System.out.println("Categorías disponibles:");
        for (CategoriaProducto categoria : CategoriaProducto.values()) {
            System.out.println(categoria);
        }
    }
    
}
