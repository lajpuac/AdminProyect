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
public class InsumoUso {

    private String nombre;
    private int existencia;
    private Date fechaIngreso;
    private Float total;
    private Dimensional dimensional;
    private Usuario usuario;

    public InsumoUso() {
        this.nombre = nombre;
        this.existencia = existencia;
        this.fechaIngreso = fechaIngreso;
        this.total = total;
        this.dimensional = dimensional;
        this.usuario = usuario;
    }

    public InsumoUso(String nombre, int existencia, Date fechaIngreso, Float total, Dimensional dimensional, Usuario usuario) {
        this.nombre = nombre;
        this.existencia = existencia;
        this.fechaIngreso = fechaIngreso;
        this.total = total;
        this.dimensional = dimensional;
        this.usuario = usuario;
    }

    public Dimensional getDimensional() {
        return dimensional;
    }

    public void setDimensional(Dimensional dimensional) {
        this.dimensional = dimensional;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

}
