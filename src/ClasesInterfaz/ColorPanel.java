/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesInterfaz;

import java.awt.Color;

/**
 *
 * @author Toshiba
 */
public class ColorPanel {
    //Fondo
        //Color.decode("#212b41") negro
        //Color.decode("#F2FDFA") blanco
    //Base 
        //Color.decode("#2e3951") negro
        //Color.WHITE blanco
    private Color colorFondo, colorBase;

    public Color getColorFondo() {
        return colorFondo;
    }

    public void setColorFondo(Color colorFondo) {
        this.colorFondo = colorFondo;
    }

    public Color getColorBase() {
        return colorBase;
    }

    public void setColorBase(Color colorBase) {
        this.colorBase = colorBase;
    }
    
}
