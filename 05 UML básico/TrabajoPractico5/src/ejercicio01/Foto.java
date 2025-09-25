/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author natal
 */
public class Foto {
    
    private String imagen;
    private String formato;

    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }
    
    public Foto(String imagen) {
        this.imagen = imagen;
        this.formato = "jpg"; // opcion por defecto
    }
    
    public String getImagen() {
        return imagen;
    }

    public String getFormato() {
        return formato;
    }

    @Override
    public String toString() {
        return "Foto{" + "imagen=" + imagen + ", formato=" + formato + '}';
    }
     
}
