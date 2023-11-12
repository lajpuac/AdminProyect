/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesInterfaz;

import Clases.*;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Toshiba
 */
public class Componente {

    private JComboBox combo;
    private JPanel panelFondo, panelBase;
    private JRadioButton radiobtn;

    public JComboBox getCombo() {
        return combo;
    }

    public void setCombo(JComboBox combo) {
        this.combo = combo;
    }

    public JRadioButton getRadiobtn() {
        return radiobtn;
    }

    public void setRadiobtn(JRadioButton radiobtn) {
        this.radiobtn = radiobtn;
    }

    public JPanel getPanelFondo() {
        return panelFondo;
    }

    public void setPanelFondo(JPanel panelFondo) {
        this.panelFondo = panelFondo;
    }

    public JPanel getPanelBase() {
        return panelBase;
    }

    public void setPanelBase(JPanel panelBase) {
        this.panelBase = panelBase;
    }

}
