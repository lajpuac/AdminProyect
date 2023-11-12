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
public class PerdidaMateriaPrima {

    private int unidadesAfectadas;
    private boolean muerto, enfermo, enObservacion;
    private String fecha,idPerdidaMateriaPrima,detallePerdida;

    public PerdidaMateriaPrima() {
        this.idPerdidaMateriaPrima = idPerdidaMateriaPrima;
        this.unidadesAfectadas = unidadesAfectadas;
        this.muerto = muerto;
        this.enfermo = enfermo;
        this.enObservacion = enObservacion;
        this.fecha = fecha;
        this.detallePerdida = detallePerdida;
    }

    public PerdidaMateriaPrima(String idPerdidaMateriaPrima, int unidadesAfectadas, boolean muerto, boolean enfermo, boolean enObservacion, String fecha, String detallePerdida) {
        this.idPerdidaMateriaPrima = idPerdidaMateriaPrima;
        this.unidadesAfectadas = unidadesAfectadas;
        this.muerto = muerto;
        this.enfermo = enfermo;
        this.enObservacion = enObservacion;
        this.fecha = fecha;
        this.detallePerdida = detallePerdida;
    }

    public String getIdPerdidaMateriaPrima() {
        return idPerdidaMateriaPrima;
    }

    public void setIdPerdidaMateriaPrima(String idPerdidaMateriaPrima) {
        this.idPerdidaMateriaPrima = idPerdidaMateriaPrima;
    }

    public int getUnidadesAfectadas() {
        return unidadesAfectadas;
    }

    public void setUnidadesAfectadas(int unidadesAfectadas) {
        this.unidadesAfectadas = unidadesAfectadas;
    }

    public boolean isMuerto() {
        return muerto;
    }

    public void setMuerto(boolean muerto) {
        this.muerto = muerto;
    }

    public boolean isEnfermo() {
        return enfermo;
    }

    public void setEnfermo(boolean enfermo) {
        this.enfermo = enfermo;
    }

    public boolean isEnObservacion() {
        return enObservacion;
    }

    public void setEnObservacion(boolean enObservacion) {
        this.enObservacion = enObservacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDetallePerdida() {
        return detallePerdida;
    }

    public void setDetallePerdida(String detallePerdida) {
        this.detallePerdida = detallePerdida;
    }

}
