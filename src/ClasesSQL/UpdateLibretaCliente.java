/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesSQL;
import Conexion.ConexionBD;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author jenif
 */
public class UpdateLibretaCliente {
    Connection connection = ConexionBD.getConnection();
      public void ActualizarCliente(String nombre, String apellido, String celular, String telefono, String direccion, int noCliente) {
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                //UPDATE libretacliente SET  NoCliente=NoClienteL, Nombre=NombreL, Apellido=ApellidoL, Celular=CelularL, Telefono=TelefonoL, Direccion=DireccionL WHERE NoClienteL=NoCliente;
                statement.execute("UPDATE libretacliente SET  Nombre='"+nombre+"', Apellido='"+apellido+"', Celular='"+celular+"', Telefono='"+telefono+"', Direccion='"+direccion+"'WHERE NoClienteL="+noCliente+"");
                JOptionPane.showMessageDialog(null, "ACTUALIZADA en existencias");
            }
          //  connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO ACTUALIZAR ");
            System.out.println(e);
        }
    }
   
      
}
