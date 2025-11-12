/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte1_sistema_de_ecommerce;

/**
 *
 * @author natal
 */
public class Main {
    
    public static void main(String[] args) {
        
        // instanciamos 3 clientes para probar los 3 metodos de pago
        Cliente cliente1 = new Cliente("Juana");
        Cliente cliente2 = new Cliente("Paula");
        Cliente cliente3 = new Cliente("Luana");  
        
        // instanciamos 3 pedidos uno por cada cliente
        Pedido pedido1 = new Pedido(cliente1);
        Pedido pedido2 = new Pedido(cliente2);
        Pedido pedido3 = new Pedido(cliente3);

        //realizamos la compra del cliente 1 - Tarjeta de crédito
        pedido1.agregarProducto(new Producto("Mate", 3500));
        pedido1.agregarProducto(new Producto("Termo", 14000));
        
        System.out.println("Cliente: " + cliente1.toString());
        System.out.println("Productos del pedido:" + pedido1.getListaProductos());
        System.out.println("Total del pedido: $" + pedido1.calcularTotal());

        pedido1.cambiarEstado(EstadoPedido.PAGADO);
        
        PagoConDescuento tarjeta1 = new TarjetaCredito();
        
        System.out.println("--------------------------");
        
        //realizamos la compra del cliente 2 - PayPal
        pedido2.agregarProducto(new Producto("Difusor", 12000));
        pedido2.agregarProducto(new Producto("Vela", 7500));
        
        System.out.println("Cliente: " + cliente2.toString());
        System.out.println("Productos del pedido:" + pedido2.getListaProductos());
        System.out.println("Total del pedido: $" + pedido2.calcularTotal());
        
        pedido2.cambiarEstado(EstadoPedido.PAGADO);

        Pago paypal2 = new PayPal();
        
        System.out.println("--------------------------");
        
        //realizamos la compra del cliente 3 - Efectivo
        pedido3.agregarProducto(new Producto("Plato", 5500));
        pedido3.agregarProducto(new Producto("Vaso", 5300));
        pedido3.agregarProducto(new Producto("Set Cubiertos", 4000));
        
        System.out.println("Cliente: " + cliente3.toString());
        System.out.println("Productos del pedido:" + pedido3.getListaProductos());
        System.out.println("Total del pedido: $" + pedido3.calcularTotal());
        
        pedido3.cambiarEstado(EstadoPedido.PAGADO);

        PagoConDescuento efectivo3 = new Efectivo();
    }
    
}
