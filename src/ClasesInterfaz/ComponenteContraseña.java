/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesInterfaz;

import javax.swing.JPasswordField;

/**
 *
 * @author Toshiba
 */
public class ComponenteContraseña extends ColorContraseña{

    private JPasswordField contraseña;

    public JPasswordField getContraseña() {
        contraseña.setForeground(getColorContaseña());
        return contraseña;
    }

    public void setContraseña(JPasswordField contraseña) {
        this.contraseña = contraseña;
    }
}
