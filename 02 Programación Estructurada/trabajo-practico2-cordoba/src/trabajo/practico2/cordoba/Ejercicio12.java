/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico2.cordoba;

/**
 *
 * @author natal
 */
public class Ejercicio12 {
    
    public static void main(String[] args) {
        
        // crear el array con los valores ya inicializados ya que los conocemos
        double[]preciosOriginales = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        // imprimir todos los valores del array con for-each
        System.out.println("Precios Originales:");
        for (double precioOriginal : preciosOriginales){
            System.out.println("Precio: $" + precioOriginal);
        }
        
        // modificar un valor
        preciosOriginales[2] = 129.99;
        
        // volver a imprimir los valores para ver el cambio
        System.out.println("Precios Modificados:"); 
        for (double precioOriginal : preciosOriginales){
            System.out.println("Precio: $" + precioOriginal);
        }
        
    }
    
}
