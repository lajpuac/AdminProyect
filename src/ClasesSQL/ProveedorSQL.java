package ClasesSQL;

import Conexion.ConexionBD;
import Clases.Proveedor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jenif
 */
public class ProveedorSQL {

    Connection connection = ConexionBD.getConnection();

    public void InsertarProveedor(String nombre, String direccion, String telefono, String empresa) {
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                statement.execute("INSERT INTO proveedor(Nombre, Direccion, Telefono,Empresa) VALUES ('" + nombre + "','" + direccion + "','" + telefono + "','" + empresa + "')");
                JOptionPane.showMessageDialog(null, "Proveedor añadido a la lista");
            }
           // connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO AGREGAR AL PROVEEDOR");
        }
    }

    public void DeleteProveedor(int IdProveedor) {
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                statement.execute("DELETE FROM proveedor WHERE idProveedor=('" + IdProveedor + "')");
                JOptionPane.showMessageDialog(null, "Proveedor elimando de la lista");
            }
          //  connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO AGREGAR AL PROVEEDOR");
        }
    }
    
    public void DeleteProveedorPorEmpresa(String Empresa) {
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                statement.execute("DELETE FROM proveedor WHERE Empresa =('" + Empresa + "')");
                //('" + codigo + "')");
                JOptionPane.showMessageDialog(null, "¡Proveedor elimando con éxito!");
            }
          //  connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "OCURRIO UN ERROR, VUELVA A INTENTARLO");
        }
    }

    public int BuscarProveedorPorNombre(JTextField NombreProveedortxt1, JTextField direcciontxt, JTextField TelefonoProveedortxt1, JTextField EmpresaProveedortxt, String nombreProveedor) {
        int IdProveedor = 0;
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                ResultSet clr = statement.executeQuery("select idProveedor, Nombre, Direccion, Telefono, Empresa from proveedor");
                while (clr.next()) {
                    IdProveedor = clr.getInt("idProveedor");
                    String nombre = clr.getString("Nombre");
                    String direccion = clr.getString("Direccion");
                    String telefono = clr.getString("Telefono");
                    String empresa = clr.getString("Empresa");

                    if (nombreProveedor.equals(nombre)) {
                        NombreProveedortxt1.setText(nombre);
                        direcciontxt.setText(direccion);
                        TelefonoProveedortxt1.setText(telefono);
                        EmpresaProveedortxt.setText(empresa);
                        System.out.println(nombre);
                        System.out.println(direccion);
                        System.out.println(telefono);
                        System.out.println(empresa);
                    }
                }
            }
         //   connection.close();
        } catch (Exception e) {
        }

        return IdProveedor;
    }

    public ArrayList<Proveedor> ConsultaProveedorNombre() {
        ArrayList<Proveedor> proveedores = new ArrayList<Proveedor>();
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                ResultSet clr = statement.executeQuery("select idProveedor, Nombre, Direccion, Telefono, Empresa from proveedor");

                while (clr.next()) {
                    Proveedor proveedor = new Proveedor();
                    proveedor.setIdProveedor(clr.getInt("idProveedor"));
                    proveedor.setNombre(clr.getString("Nombre"));
                    proveedor.setDireccion(clr.getString("Direccion"));
                    proveedor.setTelefono(clr.getString("Telefono"));
                    proveedores.add(proveedor);
                }
            }
        //    connection.close();
        } catch (Exception e) {
        }

        return proveedores;
    }

    
    
    
    
     public void BuscarProveedor(JTable ProveedoresTable) {
        String sql = "SELECT Nombre, Direccion,Telefono,Empresa from proveedor";
        Statement st;
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nombre");
        model.addColumn("Dirección");
        model.addColumn("Telefono");
        model.addColumn("Empresa");
        ProveedoresTable.setModel(model);

        String[] dato = new String[4];
        try {

            st = connection.createStatement();
            ResultSet result = st.executeQuery(sql);
            while (result.next()) {
                dato[0] = result.getString(1);
                dato[1] = result.getString(2);
                dato[2] = result.getString(3);
                dato[3] = result.getString(4);
                model.addRow(dato);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LibretaClienteSQL.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }

    }
    
      public void ActualizarProveedor(String Nombre, String Direccion, String Telefono, String Empresa) {
        try {
            Statement consulta = connection.createStatement(); //Objeto para las consultas
            consulta.executeUpdate("UPDATE proveedor set Nombre = '"+Nombre+"', Direccion = '"+Direccion+"', Telefono = '"+Telefono+"' WHERE Empresa = '"+Empresa+"'");//Consulta
            //UPDATE proveedor set Nombre = '"+nombre+"', Direccion = '"+apellido+"', Telefono = '"+celular+"' WHERE Empresa = '"+celular+"';
            JOptionPane.showMessageDialog(null, "Proveedor Actualizado");
            //"UPDATE libretacliente SET  Nombre='"+nombre+"', Apellido='"+apellido+"', Celular='"+celular+"', Telefono='"+telefono+"', Direccion='"+direccion+"'WHERE NoClienteL="+noCliente+""
        } catch (Exception e) {
            System.out.println("actualizar "+e);
          
           JOptionPane.showMessageDialog(null, "NO SE PUDO ACTUALIZAR LA MATERIA PRIMA");
        }
    }
    
 }
