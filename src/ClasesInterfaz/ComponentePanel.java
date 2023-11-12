/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesInterfaz;

import javax.swing.JPanel;

/**
 *
 * @author Toshiba
 */
public class ComponentePanel extends ColorPanel{

    private JPanel panelFondo, panelBase;

    public JPanel getPanelFondo() {
        panelFondo.setBackground(getColorFondo());
        return panelFondo;
    }

    public void setPanelFondo(JPanel panelFondo) {
        this.panelFondo = panelFondo;
    }

    public JPanel getPanelBase() {
        panelBase.setBackground(getColorBase());
        return panelBase;
    }

    public void setPanelBase(JPanel panelBase) {
        this.panelBase = panelBase;
    }

}
