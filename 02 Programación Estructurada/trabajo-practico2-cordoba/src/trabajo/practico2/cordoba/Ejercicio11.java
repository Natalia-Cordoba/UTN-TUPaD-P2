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
public class Ejercicio11 {
    
    static double DESCUENTO = 0.10; // variable global
    
    public static void main(String[] args) {
        
        // utilizar scanner y declarar variables
        Scanner input = new Scanner(System.in);
        double precio, precioFinal;
        
        // perdir el precio del producto y guardar su valor en la variable
        System.out.print("Por favor, ingrese el precio del producto: ");
        precio = Double.parseDouble(input.nextLine());
        
        // llamar a metodo para aplicar el descuento
        precioFinal = calcularDescuentoEspecial(precio);
    }
     
    // crear metodo para aplicar el descuento especial
    public static double calcularDescuentoEspecial(double precio) {
        
        // calcular cual es el descuento
        double descuentoAplicado = precio * DESCUENTO; // variabla local
        System.out.println("El precio final con descuesto es: " + descuentoAplicado);
        
        //calcular el precio final
        double precioFinal = precio - descuentoAplicado;
        System.out.println("El precio final con descuesto es: " + precioFinal);
        
        return precioFinal;
        
    }  
        
}
