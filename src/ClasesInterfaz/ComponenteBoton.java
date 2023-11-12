/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesInterfaz;

import javax.swing.Icon;
import javax.swing.JButton;

/**
 *
 * @author Toshiba
 */
public class ComponenteBoton extends ColorBoton{
    
    private JButton boton;

    public JButton getBoton() {
         boton.setForeground(getColorBoton());
        return boton;
    }

    public void setBoton(JButton boton) {
        this.boton = boton;
    }
}
