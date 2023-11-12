/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Date;

/**
 *
 * @author Toshiba
 */
public class InsumoConsumo {

    private String tipoInsumo, nombre;
    private int existencia, idInsumoConsumo;
    private float total;
    private String fechaIngreso, fechaVencimiento;
    private Dimensional dimensional;
    private Usuario usuario;
    private Proveedor proveedor;

    public InsumoConsumo() {
        this.tipoInsumo = tipoInsumo;
        this.nombre = nombre;
        this.existencia = existencia;
        this.idInsumoConsumo = idInsumoConsumo;
        this.total = total;
        this.fechaIngreso = fechaIngreso;
        this.fechaVencimiento = fechaVencimiento;
        this.dimensional = dimensional;
        this.usuario = usuario;
        this.proveedor = proveedor;
    }

    public InsumoConsumo(String tipoInsumo, String nombre, int existencia, int idInsumoConsumo, float total, String fechaIngreso, String fechaVencimiento, Dimensional dimensional, Usuario usuario, Proveedor proveedor) {
        this.tipoInsumo = tipoInsumo;
        this.nombre = nombre;
        this.existencia = existencia;
        this.idInsumoConsumo = idInsumoConsumo;
        this.total = total;
        this.fechaIngreso = fechaIngreso;
        this.fechaVencimiento = fechaVencimiento;
        this.dimensional = dimensional;
        this.usuario = usuario;
        this.proveedor = proveedor;
    }

    public int getIdInsumoConsumo() {
        return idInsumoConsumo;
    }

    public void setIdInsumoConsumo(int idInsumoConsumo) {
        this.idInsumoConsumo = idInsumoConsumo;
    }

    public String getTipoInsumo() {
        return tipoInsumo;
    }

    public void setTipoInsumo(String tipoInsumo) {
        this.tipoInsumo = tipoInsumo;
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

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
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

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

}
