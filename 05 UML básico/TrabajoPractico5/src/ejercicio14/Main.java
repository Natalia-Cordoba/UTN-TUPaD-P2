/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

/**
 *
 * @author natal
 */
public class Main {
    
    public static void main(String[] args) {
        
        Proyecto proyecto1 = new Proyecto("Video explicativo UML", 7);
        EditorVideo editor1 = new EditorVideo();
        
        editor1.exportar("mp4", proyecto1);
    }
    
}
