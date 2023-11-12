/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author jenif
 */
public class Cuentas {

    private boolean Debe, Haber;
    private String Concepto, fecha, Cuenta, Auxiliar;
    private float Monto;

    public Cuentas() {
        this.Auxiliar = Auxiliar;
        this.Concepto = Concepto;
        this.Cuenta = Cuenta;
        this.Debe = Debe;
        this.Haber = Haber;
        this.Monto = Monto;
        this.fecha = fecha;
    }
    // public Venta(boolean adomicilio,boolean puntoVenta, String producto, int cantidad, float total, String fecha){

    public Cuentas(boolean Debe, boolean Haber, String Concepto, String Cuenta, String Auxiliar, float Monto, String fecha) {
        this.Auxiliar = Auxiliar;
        this.Concepto = Concepto;
        this.Cuenta = Cuenta;
        this.Debe = Debe;
        this.Haber = Haber;
        this.Monto = Monto;
        this.fecha = fecha;
    }

    public boolean isDebe() {
        return Debe;
    }

    public void setDebe(boolean Debe) {
        this.Debe = Debe;
    }

    public boolean isHaber() {
        return Haber;
    }

    public void setHaber(boolean Haber) {
        this.Haber = Haber;
    }

    public String getConcepto() {
        return Concepto;
    }

    public void setConcepto(String Concepto) {
        this.Concepto = Concepto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCuenta() {
        return Cuenta;
    }

    public void setCuenta(String Cuenta) {
        this.Cuenta = Cuenta;
    }

    public String getAuxiliar() {
        return Auxiliar;
    }

    public void setAuxiliar(String Auxiliar) {
        this.Auxiliar = Auxiliar;
    }

    public float getMonto() {
        return Monto;
    }

    public void setMonto(float Monto) {
        this.Monto = Monto;
    }
    
    
}
