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
public class LibretaCliente {

    private String nombre, apellido, celular, telefono, direccion;

    public LibretaCliente() {
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public LibretaCliente(String nombre, String apellido, String celular, String telefono, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
