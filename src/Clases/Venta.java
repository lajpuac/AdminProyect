/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Date;

/**
 *
 * @author jenif
 */
public class Venta {
    private boolean adomicilio, puntoVenta;
    private String producto,fecha;
    private int cantidad;
    private float total;
    
    public Venta(){
        this.adomicilio=adomicilio;
        this.puntoVenta=puntoVenta;
        this.producto=producto;
        this.cantidad=cantidad;
        this.total=total;
        this.fecha=fecha;
    }
    public Venta(boolean adomicilio,boolean puntoVenta, String producto, int cantidad, float total, String fecha){
        this.adomicilio = adomicilio;
        this.puntoVenta=puntoVenta;
        this.producto=producto;
        this.cantidad=cantidad;
        this.total=total;
        this.fecha=fecha;
    }

    public boolean isAdomicilio() {
        return adomicilio;
    }

    public void setAdomicilio(boolean adomicilio) {
        this.adomicilio = adomicilio;
    }

    public boolean isPuntoVenta() {
        return puntoVenta;
    }

    public void setPuntoVenta(boolean puntoVenta) {
        this.puntoVenta = puntoVenta;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


            
}
