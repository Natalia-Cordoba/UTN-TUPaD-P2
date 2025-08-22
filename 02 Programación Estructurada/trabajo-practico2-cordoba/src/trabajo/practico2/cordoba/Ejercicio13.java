/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico2.cordoba;

/**
 *
 * @author natal
 */
public class Ejercicio13 {
    
    public static void main(String[] args) {
    
        // crear el array con los valores ya inicializados ya que los conocemos
        double[]preciosOriginales = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        // imprimir los valores con una función recursiva
        System.out.println("Precios Originales:");
        originalesRecursivos(preciosOriginales, 0);
        
        // modificar un valor
        preciosOriginales[2] = 129.99;
        
        // reimprimir los valores con otra función recursiva
        System.out.println("Precios Modificados:"); 
        modificadosRecursivos(preciosOriginales, 0);
        
    }
    
    // crear función recursiva para imprimir los precios originales
    public static void originalesRecursivos(double[] preciosOriginales, int precio) {
       
        if (precio == preciosOriginales.length) { // caso base
            return;
        }
        System.out.println("Precio: $" + preciosOriginales[precio]);
        originalesRecursivos(preciosOriginales, precio + 1); // llamada recursiva
                
    }

    // crear otra función recursiva para imprimir los precios modificados
    public static void modificadosRecursivos(double[] preciosOriginales, int precio) {
       
        if (precio == preciosOriginales.length) { // caso base
            return;
        }
        System.out.println("Precio: $" + preciosOriginales[precio]);
        modificadosRecursivos(preciosOriginales, precio + 1); // llamada recursiva
                
    }
}
