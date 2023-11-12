/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Clases.Usuario;
import ClasesSQL.PruebaSQL;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author jenif
 */
public class PanelContraseña {

   
    public int retornandoId() {
        int resultado = 0;
        JPasswordField passwordField = new JPasswordField(15);
        JTextField jtextField = new JTextField(15);
        PruebaSQL pruebasql = new PruebaSQL();
        // TODO code application logic here
        char[] password;
        String Usuario = "", pass_concatenada = "";

        //Para obtener ID del Usuario
        //CONTRASEÑA
        JPanel panel = new JPanel();
        JLabel label2 = new JLabel("Usuario:");
        JLabel label = new JLabel("Contraseña:");
        // Agregamos los componentes al panel
        panel.add(label2);
        panel.add(jtextField);
        panel.add(label);
        panel.add(passwordField);
        // Definimos el texto de las opciones para aceptar o cancelar
        String[] options = new String[]{"Aceptar", "Cancelar"};
        // Agregamos el panel y las opciones al dialogo
        int option = JOptionPane.showOptionDialog(null, panel, "Ingreso de datos usuario",
                JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, options[1]);
        //CONTRASEÑA
        if (option == 0) // pressing OK button
        {
            Usuario = jtextField.getText();
            System.out.println("Usuario: " + Usuario);
            password = passwordField.getPassword();

            for (int i = 0; i < password.length; i++) {
                pass_concatenada = pass_concatenada + password[i];
                System.out.println(password[i]);
            }

            pruebasql.BuscarUsuario(Usuario, pass_concatenada);
            resultado = pruebasql.BuscarUsuario(Usuario, pass_concatenada);
        } else {
            System.out.println("Ingreso de contraseña cancelada");

        }
        System.out.println("Var para meter en el insert:" + pruebasql.getVal());
        return resultado;
    }
}
