/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author natal
 */
public class Main {
    
    public static void main(String[] args) {
        
        Editorial editorial1 = new Editorial ("Anagrama", "Pau Claris, 172. 08037 Barcelona");
        Autor autor1 = new Autor ("Delphine de Vigan", "francesa");
        Libro libro1 = new Libro ("Los reyes de la casa", "978-84-339-8126-4", editorial1);
        
        libro1.setAutor(autor1);
        
        System.out.println(libro1.toString());
        
    }
    
}
