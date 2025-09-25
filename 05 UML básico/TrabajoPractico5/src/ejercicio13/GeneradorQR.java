/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author natal
 */
public class GeneradorQR {
    
    public void generar(String valor, Usuario usuario) {
        
        CodigoQR codigo1 = new CodigoQR(valor);
        
        codigo1.setUsuario(usuario);
        
        System.out.println("Código generado: " + codigo1);
        
    }
    
}
