/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.util.ArrayList;

/**
 *
 * @author natal
 */
public class Principal {
    
    public static void main(String[] args) {
        
        // Instancio productos para el inventario
        Producto p1 = new Producto("AA11", "Salsa de Soja", 3000.0, 25, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("AA22", "Alga Nori", 6999.0, 48, CategoriaProducto.ALIMENTOS);
        Producto p3 = new Producto("AA33", "Ramen", 2500.0, 30, CategoriaProducto.ALIMENTOS);
        Producto p4 = new Producto("AA44", "Celular", 700000.0, 14, CategoriaProducto.ELECTRONICA);
        Producto p5 = new Producto("AA55", "Tablet", 550000.0, 22, CategoriaProducto.ELECTRONICA);
        Producto p6 = new Producto("AA66", "Remera", 20000.0, 55, CategoriaProducto.ROPA);
        Producto p7 = new Producto("AA77", "Short", 45000.0, 17, CategoriaProducto.ROPA);
        Producto p8 = new Producto("AA88", "Vestido", 52000.0, 93, CategoriaProducto.ROPA);
        Producto p9 = new Producto("AA99", "Lampara", 17000.0, 35, CategoriaProducto.HOGAR);
   
        // Instancio un inventario 
        Inventario inventario = new Inventario();
        
        // Agrego los productos instaciados al inventario
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);
        inventario.agregarProducto(p6);
        inventario.agregarProducto(p7);
        inventario.agregarProducto(p8);
        inventario.agregarProducto(p9);
        
        // Listo los productos
        System.out.println("Listado de productos: ");
        inventario.listarProductos();
        System.out.println("");
        
        // Busco un producto por id
        Producto prodEncontrado = inventario.buscarProductoPorId("AA55");
        System.out.println("Producto encontrado por ID: " + prodEncontrado);
        System.out.println("");
        
        // Elimino un producto por id
        Producto prodEliminado = inventario.eliminarProducto("AA22");
        System.out.println("Producto eliminado: " + prodEliminado);
        // Muestro los productos restantes
        System.out.println("Listado de productos restantes: ");
        inventario.listarProductos();
        System.out.println("");
        
        // Actualizo el stock de un producto
        Producto stockActualizado = inventario.actualizarStock("AA77", 71);
        System.out.println("Stock actualizado: " + stockActualizado);
        System.out.println("");
        
        // Filtro los productos por categoría
        ArrayList<Producto> prodPorCategoria = inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);
        System.out.println("Productos filtrados por categoría: ");
        for (Producto producto : prodPorCategoria) {
            System.out.println(producto);
        }
        System.out.println("");
        
        
        // Obtengo el stock total de productos
        int totalStock = inventario.obtenerTotalStock();
        System.out.println("Stock total de productos disponible: " + totalStock);
        System.out.println("");
    
        // Obtengo el Producto con mayor stock
        Producto prodMayorStock = inventario.obtenerProductoConMayorStock();
        System.out.println("Producto con mayorStock: " + prodMayorStock);
        System.out.println("");
        
        // Filtro por precio los productos
        ArrayList<Producto> prodPorPrecio = inventario.filtrarProductoPorPrecio(1000, 3000);
        System.out.println("Productos filtrados por precio: ");
        for (Producto producto : prodPorPrecio) {
            System.out.println(producto);
        }
        System.out.println("");
        
        // Muestro las categorías disponibles con sus descripciones
        inventario.mostrarCategoriasDisponibles();
        
    }  
}
