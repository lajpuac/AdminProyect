/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesInterfaz;

import javax.swing.JButton;

/**
 *
 * @author Toshiba
 */
public class ComponenteBotonIcon extends IconBoton {

    private JButton botonActivador;

    public JButton getBotonActivador() {
        botonActivador.setIcon(getImagen());
        return botonActivador;
    }

    public void setBotonActivador(JButton botonActivador) {
        this.botonActivador = botonActivador;
    }

}
