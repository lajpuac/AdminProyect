/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesInterfaz;

import javax.swing.JRadioButton;

/**
 *
 * @author Toshiba
 */
public class ComponenteRadioButon extends ColorRadioButon{

    private JRadioButton radiobtn;

    public JRadioButton getRadiobtn() {
        radiobtn.setForeground(getColorradio());
        return radiobtn;
    }

    public void setRadiobtn(JRadioButton radiobtn) {
        this.radiobtn = radiobtn;
    }

}
