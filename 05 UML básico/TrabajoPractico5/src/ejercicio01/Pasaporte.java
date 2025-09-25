/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

import java.time.LocalDate;

/**
 *
 * @author natal
 */
public class Pasaporte {
    
    private String numero;
    private LocalDate fechaEmision;
    private Foto foto;
    private Titular titular;

    public Pasaporte(String numero, LocalDate fechaEmision, String imagen) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen);
    }
    
    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    }

    public String getNumero() {
        return numero;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public Foto getFoto() {
        return foto;
    }
    
    public Titular getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        return "Pasaporte{" + "numero=" + numero + ", fechaEmision=" + fechaEmision + ", foto=" + foto + ", titular=" + titular + '}';
    }
      
}
