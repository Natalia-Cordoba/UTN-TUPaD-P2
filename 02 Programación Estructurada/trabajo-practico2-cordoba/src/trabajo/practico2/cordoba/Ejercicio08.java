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
public class Ejercicio08 {
    
    public static void main(String[] args) {
        
        // utilizar scanner y declarar variable
        Scanner input = new Scanner(System.in);
        double precioBase, impuesto, descuento, precioFinal;
        
        // pedir al usuario el precio base, el inpuesto y el decuento 
        // y guardar los valores en sus variables
        System.out.print("Por favor ingrese el precio base del producto: ");
        precioBase = Double.parseDouble(input.nextLine());
        System.out.print("Por favor ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        impuesto = Double.parseDouble(input.nextLine());
        System.out.print("Por favor ingrese el descuento: en porcentaje (Ejemplo: 5 para 5%): ");
        descuento = Double.parseDouble(input.nextLine());
        
        // calcular el precio final llamando al método calcularPrecioFinal()
        precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
        
        // mostrar el precio final del producto por consola
        System.out.println("El precio final del producto es: " + precioFinal);
    }
    
    // crear el método para calcular el precio final de un producto 
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento){
        
        double precioFinal = precioBase + (precioBase * (impuesto/100)) - (precioBase * (descuento/100));
        return precioFinal;    
    } 
}
