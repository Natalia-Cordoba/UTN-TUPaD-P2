/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico2.cordoba;

import java.util.Scanner;

/**
 *
 * @author natal
 */
public class Ejercicio09 {
    
    // declarar como constantes los costos de envío por kg
    final static int ENVIO_NACIONAL = 5;
    final static int ENVIO_INTERNACIONAL = 10;
    
    public static void main(String[] args) {
        
        // utilizar scanner y declarar variables
        Scanner input = new Scanner(System.in);
        double peso, precioProducto, costoEnvio, totalCompra;
        String zona;
        
        // pedir al usuario el precio del producto, el peso del paquete 
        // y la zona de envío. Guardar los valores en sus variables
        System.out.print("Por favor, ingrese el precio del producto: ");
        precioProducto = Double.parseDouble(input.nextLine());
        System.out.print("Por favor, ingrese el peso del paquete en kg: ");
        peso = Double.parseDouble(input.nextLine());
        System.out.print("Por favor, ingrese la zona de envío (Nacional/Internacional): ");
        zona = input.nextLine();
        
        // llamadas a las funciones
        costoEnvio = calcularCostoEnvio(peso, zona);
        totalCompra = calcularTotalCompra(precioProducto, costoEnvio);
        
        // mostrar el el costo del envío y el total a pagar por consola
        System.out.println("El costo del envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + totalCompra);
    }
    
    // crear el método para calcular el costo de envío de un producto 
    public static double calcularCostoEnvio(double peso, String zona){
        
        double costoEnvio = 0.0;
        
        if (zona.equalsIgnoreCase("nacional")) {
            costoEnvio = peso * ENVIO_NACIONAL;
        } else if (zona.equalsIgnoreCase("internacional")) {
            costoEnvio = peso * ENVIO_INTERNACIONAL;
        } else {
            System.out.println("ERROR. La zona ingresada no es válida");
        }
        return costoEnvio;  
        
    } 
    
    // crear el método para calcular el total de la compra
    public static double calcularTotalCompra(double precioProducto, double costoEnvio){
        
        double totalCompra = precioProducto + costoEnvio;
        return totalCompra;  
        
    } 
}
