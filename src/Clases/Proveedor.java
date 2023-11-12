/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Toshiba
 */
public class Proveedor {

    private String nombre, direccion, empresa, telefono;
    private int idProveedor;

    public Proveedor() {
        this.nombre = nombre;
        this.direccion = direccion;
        this.empresa = empresa;
        this.telefono = telefono;
        this.idProveedor = idProveedor;
    }

    public Proveedor(String nombre, String direccion, String empresa, String telefono, int idProveedor) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.empresa = empresa;
        this.telefono = telefono;
        this.idProveedor = idProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

}
