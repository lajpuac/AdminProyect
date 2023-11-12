/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesSQL;

import javax.swing.table.DefaultTableModel;
import Conexion.ConexionBD;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author jenif
 */
public class LibretaClienteSQL {

    Connection connection = ConexionBD.getConnection();

    public void InsertarLibretaCliente(String nombre, String apellido, String celular, String telefono, String direccion) {
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                statement.execute("INSERT INTO libretacliente(Nombre, Apellido, Celular, Telefono, Direccion) VALUES ('" + nombre + "','" + apellido + "','" + celular + "','" + telefono + "','" + direccion + "')");
                JOptionPane.showMessageDialog(null, "Cliente añadido con éxito");
            }
            //  connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO AGREGAR CLIENTE, VUELVA A INTENTAR");
            System.out.println(e);
        }
    }

    public void EliminarLibretaCliente(int nocliente) {
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                statement.execute("DELETE FROM libretacliente WHERE NoCliente=('" + nocliente + "')");
                JOptionPane.showMessageDialog(null, "Cliente eliminado con éxito");
            }
            //  connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO ELIMINAR CLIENTE");
        }
    }

    public void ActualizarLibreta(Connection connection, int noCliente, String nombre, String apellido, String celular, String telefono, String direccion) throws SQLException {

        try (CallableStatement cstmt = connection.prepareCall("{call mydb.ActualizarLibreta(?,?,?,?,?,?)}");) {
            cstmt.setInt(1, noCliente);
            cstmt.setString(2, nombre);
            cstmt.setString(3, apellido);
            cstmt.setString(4, celular);
            cstmt.setString(5, telefono);
            cstmt.setString(6, direccion);
            cstmt.execute();
            JOptionPane.showMessageDialog(null, "Actualizo de forma correcta");

        } catch (SQLException ex) {
            Logger.getLogger(LibretaClienteSQL.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
    }

    public int BuscarClientePorTelefono(JTextField NombreClientetxt, JTextField ApellidoClientetxt, JTextField CelularClientetxt, JTextField TelefonoClientetxt, JTextField DireccionClientetxt, String telefonoReferencia) {
        int NoCliente = 0;
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                ResultSet clr = statement.executeQuery("select NoCliente, Nombre, Apellido, Celular, Telefono, Direccion from libretacliente");
                while (clr.next()) {
                    NoCliente = clr.getInt("NoCliente");
                    String nombre = clr.getString("Nombre");
                    String apellido = clr.getString("Apellido");
                    String celular = clr.getString("Celular");
                    String telefono = clr.getString("Telefono");
                    String direccion = clr.getString("Direccion");

                    if (telefonoReferencia.equals(telefono)) {
                        NombreClientetxt.setText(nombre);
                        ApellidoClientetxt.setText(apellido);
                        CelularClientetxt.setText(celular);
                        TelefonoClientetxt.setText(telefono);
                        DireccionClientetxt.setText(direccion);

                    }
                }
            }
            //Conexion.getConnection().close();
        } catch (Exception e) {
        }

        return NoCliente;
    }

    public int BuscarClientePorCelular(JTextField NombreClientetxt, JTextField ApellidoClientetxt, JTextField CelularClientetxt, JTextField TelefonoClientetxt, JTextField DireccionClientetxt, String celularReferencia) {
        int NoCliente = 0;
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                ResultSet clr = statement.executeQuery("select NoCliente, Nombre, Apellido, Celular, Telefono, Direccion from libretacliente;");
                while (clr.next()) {
                    NoCliente = clr.getInt("NoCliente");
                    String nombre = clr.getString("Nombre");
                    String apellido = clr.getString("Apellido");
                    String celular = clr.getString("Celular");
                    String telefono = clr.getString("Telefono");
                    String direccion = clr.getString("Direccion");

                    if (celularReferencia.equals(celular)) {
                        NombreClientetxt.setText(nombre);
                        ApellidoClientetxt.setText(apellido);
                        CelularClientetxt.setText(celular);
                        TelefonoClientetxt.setText(telefono);
                        DireccionClientetxt.setText(direccion);

                    }
                }
            }
            // Conexion.getConnection().close();
        } catch (Exception e) {
        }

        return NoCliente;
    }

    public void MostrarClientes(JTable ProveedoresTable) {
        String sql = "select NoCliente, Nombre, Apellido, Celular, Telefono, Direccion from libretacliente";
        Statement st;
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("NOMBRE");
        model.addColumn("APELLIDO");
        model.addColumn("CELULAR");
        model.addColumn("TELEFONO");
        model.addColumn("DIRECCION");
        ProveedoresTable.setModel(model);

        String[] dato = new String[6];
        try {

            st = connection.createStatement();
            ResultSet result = st.executeQuery(sql);
            while (result.next()) {
                dato[0] = result.getString(1);
                dato[1] = result.getString(2);
                dato[2] = result.getString(3);
                dato[3] = result.getString(4);
                dato[4] = result.getString(5);
                dato[5] = result.getString(6);
                model.addRow(dato);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LibretaClienteSQL.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }

    }

    public int BuscarClientePorId(JTextField NombreClientetxt, JTextField ApellidoClientetxt, JTextField CelularClientetxt, JTextField TelefonoClientetxt, JTextField DireccionClientetxt, int id) {
        int IdProveedor = 0;
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                ResultSet clr = statement.executeQuery("select NoCliente, Nombre, Apellido, Celular, Telefono, Direccion from libretacliente where NoCliente = '" + id + "' ");
                //ResultSet clr = statement.executeQuery("select idProveedor, Nombre, Direccion, Telefono, Empresa from proveedor");

                while (clr.next()) {
                    IdProveedor = clr.getInt("NoCliente");
                    String nombre = clr.getString("Nombre");
                    String apellido = clr.getString("Apellido");
                    String cel = clr.getString("Celular");
                    String telefono = clr.getString("Telefono");
                    String direccion = clr.getString("Direccion");

                    if (id == IdProveedor) {
                        NombreClientetxt.setText(nombre);
                        ApellidoClientetxt.setText(apellido);
                        CelularClientetxt.setText(cel);
                        TelefonoClientetxt.setText(telefono);
                        DireccionClientetxt.setText(direccion);
                        System.out.println("hace algo");
                        System.out.println(nombre);
                        System.out.println(apellido);
                        System.out.println(cel);
                        System.out.println(telefono);
                        System.out.println(direccion);
                    }
                }
            }
            //   connection.close();
        } catch (Exception e) {
        }

        return IdProveedor;
    }

       public void ActualizarLibretaCliente(String Nombre, String Apellido, String Celular, String Telefono, String Direccion, int id) {
        try {
            Statement consulta = connection.createStatement(); //Objeto para las consultas
            consulta.executeUpdate("UPDATE libretacliente set Nombre = '"+Nombre+"', Apellido = '"+Apellido+"', Celular = '"+Celular+"', Telefono = '"+Telefono+"', Direccion = '"+Direccion+"' WHERE NoCliente = '"+id+"'");//Consulta
            JOptionPane.showMessageDialog(null, "Cliente Actualizado con éxito");
        } catch (Exception e) {
          
           JOptionPane.showMessageDialog(null, "NO SE PUDO ACTUALIZAR, VUELVA A INTENTAR");
        }
    }
}
