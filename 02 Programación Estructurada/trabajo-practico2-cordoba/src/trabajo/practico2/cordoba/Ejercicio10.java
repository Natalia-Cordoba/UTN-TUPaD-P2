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
public class Ejercicio10 {

    public static void main(String[] args) {
        
        // utilizar scanner y declarar variables
        Scanner input = new Scanner(System.in);
        int stockActual, cantidadVendida, cantidadRecibida, nuevoStock;
    
        // pedir al usuario el stock actual, la cantidad vendida 
        // y la cantidad recibida. Guardar los valores en las variables
        System.out.print("Por favos, ingrese el stock actual del producto: ");
        stockActual = Integer.parseInt(input.nextLine());
        System.out.print("Por favos, ingrese la cantidad vendida del producto: ");
        cantidadVendida = Integer.parseInt(input.nextLine());
        System.out.print("Por favos, ingrese la cantidad recibida del producto: ");
        cantidadRecibida = Integer.parseInt(input.nextLine());
        
        //llamar al metodo para actualizar stock
        nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
    
        //mostrar por consola el nuevo stock
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
    }
    
    //crear método para actualizar el stock 
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        
        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        return nuevoStock;
        
    }
}
    
    
