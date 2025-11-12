/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte1_sistema_de_ecommerce;

/**
 *
 * @author natal
 */
public class TarjetaCredito implements PagoConDescuento {
    
    private static final double DESCUENTO = 5.0; 
    
    @Override
    public void procesarPago(double monto) {
        double montoFinal = monto - aplicarDescuento(monto);
        System.out.println("Pago con tarjeta procesado correctamente. El total a pagar es: $" + montoFinal);
    }

    @Override
    public double aplicarDescuento(double monto) {
        System.out.println("Aplicando " + DESCUENTO + "% de descuento por pago con tarjeta de crédito.");
        return monto * (DESCUENTO / 100);
    }
}