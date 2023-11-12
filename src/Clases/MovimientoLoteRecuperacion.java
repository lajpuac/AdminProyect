/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Date;

/**
 *
 * @author Toshiba
 */
public class MovimientoLoteRecuperacion {

    private MateriaPrima codigolotePollo;
    private PerdidaMateriaPrima codigoperdidaMateriaPrima;
    private boolean PerdidaRecuperada;
    private int CantidadRecuperada;
    private String FechaRecuperacion;//aún no se si debe ser string o date

    public MovimientoLoteRecuperacion() {
        this.codigolotePollo = codigolotePollo;
        this.codigoperdidaMateriaPrima = codigoperdidaMateriaPrima;
        this.PerdidaRecuperada = PerdidaRecuperada;
        this.CantidadRecuperada = CantidadRecuperada;
        this.FechaRecuperacion = FechaRecuperacion;
    }

    public MovimientoLoteRecuperacion(MateriaPrima codigolotePollo, PerdidaMateriaPrima codigoperdidaMateriaPrima, boolean PerdidaMateriaPrima, boolean PerdidaRecuperada, int CantidadRecuperada, String FechaRecuperacion) {
        this.codigolotePollo = codigolotePollo;
        this.codigoperdidaMateriaPrima = codigoperdidaMateriaPrima;
        this.PerdidaRecuperada = PerdidaRecuperada;
        this.CantidadRecuperada = CantidadRecuperada;
        this.FechaRecuperacion = FechaRecuperacion;
    }

    public MateriaPrima getCodigolotePollo() {
        return codigolotePollo;
    }

    public void setCodigolotePollo(MateriaPrima codigolotePollo) {
        this.codigolotePollo = codigolotePollo;
    }

    public PerdidaMateriaPrima getCodigoperdidaMateriaPrima() {
        return codigoperdidaMateriaPrima;
    }

    public void setCodigoperdidaMateriaPrima(PerdidaMateriaPrima codigoperdidaMateriaPrima) {
        this.codigoperdidaMateriaPrima = codigoperdidaMateriaPrima;
    }

    public boolean isPerdidaRecuperada() {
        return PerdidaRecuperada;
    }

    public void setPerdidaRecuperada(boolean PerdidaRecuperada) {
        this.PerdidaRecuperada = PerdidaRecuperada;
    }

    public int getCantidadRecuperada() {
        return CantidadRecuperada;
    }

    public void setCantidadRecuperada(int CantidadRecuperada) {
        this.CantidadRecuperada = CantidadRecuperada;
    }

    public String getFechaRecuperacion() {
        return FechaRecuperacion;
    }

    public void setFechaRecuperacion(String FechaRecuperacion) {
        this.FechaRecuperacion = FechaRecuperacion;
    }

}
