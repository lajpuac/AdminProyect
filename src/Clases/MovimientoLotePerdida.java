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
public class MovimientoLotePerdida {

    private MateriaPrima codigolotePollo;
    private PerdidaMateriaPrima codigoperdidaMateriaPrima;
    private boolean PerdidaMateriaPrima;

    public MovimientoLotePerdida() {
        this.codigolotePollo = codigolotePollo;
        this.codigoperdidaMateriaPrima = codigoperdidaMateriaPrima;
        this.PerdidaMateriaPrima = PerdidaMateriaPrima;
    }

    public MovimientoLotePerdida(MateriaPrima codigolotePollo, PerdidaMateriaPrima codigoperdidaMateriaPrima, boolean PerdidaMateriaPrima, boolean PerdidaRecuperada, int CantidadRecuperada, Date FechaRecuperacion) {
        this.codigolotePollo = codigolotePollo;
        this.codigoperdidaMateriaPrima = codigoperdidaMateriaPrima;
        this.PerdidaMateriaPrima = PerdidaMateriaPrima;

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

    public boolean isPerdidaMateriaPrima() {
        return PerdidaMateriaPrima;
    }

    public void setPerdidaMateriaPrima(boolean PerdidaMateriaPrima) {
        this.PerdidaMateriaPrima = PerdidaMateriaPrima;
    }
}
