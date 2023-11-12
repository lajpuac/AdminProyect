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
public class Mercaderia {
    private String tipoPieza;
    private int cantidadLibra;
    private Date fechaVenta;
    private float total;
    
    public Mercaderia(){
        this.tipoPieza=tipoPieza;
        this.cantidadLibra=cantidadLibra;
        this.fechaVenta=fechaVenta;
        this.total=total;
    }
    public Mercaderia(String tipoPieza, int cantidadLibra, Date fechaVenta, Float total){
        this.tipoPieza= tipoPieza;
        this.cantidadLibra= cantidadLibra;
        this.fechaVenta=fechaVenta;
        this.total=total;
    }

    public String getTipoPieza() {
        return tipoPieza;
    }

    public void setTipoPieza(String tipoPieza) {
        this.tipoPieza = tipoPieza;
    }

    public int getCantidadLibra() {
        return cantidadLibra;
    }

    public void setCantidadLibra(int cantidadLibra) {
        this.cantidadLibra = cantidadLibra;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
}
