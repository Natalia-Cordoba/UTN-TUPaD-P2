/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author natal
 */
public class Main {
    
    public static void main(String[] args) {
        
        Artista artista1 = new Artista("El plan de la mariposa", "Rock");
        Cancion cancion1 = new Cancion("Tesoro Escondido");
        
        cancion1.setArtista(artista1);
        
        Reproductor reproductor1 = new Reproductor();
        
        System.out.println(cancion1);
        
        reproductor1.reproducir(cancion1);
    }
    
}
