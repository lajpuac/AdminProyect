/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesInterfaz;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Toshiba
 */
public class IconBoton {
    //"/Imagenes/darkmode_2.png" negro
    //"/Imagenes/darkmode_1.png" blanco
    private String nombreimagen;
    
    public Icon getImagen(){
    return (new ImageIcon(getClass().getResource(nombreimagen)));    
    }

    public String getNombreimagen() {
        return nombreimagen;
    }

    public void setNombreimagen(String nombreimagen) {
        this.nombreimagen = nombreimagen;
    } 

}
