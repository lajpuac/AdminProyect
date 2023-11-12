/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesInterfaz;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Toshiba
 */
public class ComponenteLabelText extends ColorLabelText{

    private JLabel label;
    private JTextField text;

    public JLabel getLabel() {
        label.setForeground(getColorLabel());
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public JTextField getText() {
        text.setForeground(getColorTexto());
        return text;
    }

    public void setText(JTextField text) {
        this.text = text;
    }
}
