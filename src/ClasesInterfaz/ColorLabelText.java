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
public class ColorLabelText {
    // Label
        //Color.decode("#666666") negro
        //Color.decode("#666666") blanco
    //Texto
        //Color.decode("#FFFFE0") negro
        //Color.decode("#666666") blanco
    
    private Color colorTexto;
    private Color colorLabel;

    public Color getColorLabel() {
        return colorLabel;
    }

    public void setColorLabel(Color colorLabel) {
        this.colorLabel = colorLabel;
    }

    public Color getColorTexto() {
        return colorTexto;
    }

    public void setColorTexto(Color colorTexto) {
        this.colorTexto = colorTexto;
    }
}
