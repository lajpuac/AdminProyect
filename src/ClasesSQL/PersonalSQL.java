/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesSQL;

import Clases.MateriaPrima;
import Conexion.ConexionBD;
import Conexion.ConexionBD2;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
public class PersonalSQL {

    Connection connection = ConexionBD2.getConnection();

    public void InsertarPersonal(String Usuario, String Nit, String CUI, String Direccion, String Telefono, String Profesion, String FechaDeNacimiento, String Edad, String FechaDeIngreso, String TipoDeSangre, String Alergias, String Enfermedad, String Contacto, String Sueldo, String Medicamento) {
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                statement.execute("INSERT INTO personal(Usuario,Nit,CUI,Direccion,Telefono,Profesion,FechaDeNacimiento, Edad, FechaDeIngreso, TipoDeSangre, Alergias, Enfermedad, Contacto, Sueldo, Medicamento) VALUES ('" + Usuario + "','" + Nit + "','" + CUI + "','" + Direccion + "','" + Telefono + "','" + Profesion + "','" + FechaDeNacimiento + "','" + Edad + "','" + FechaDeIngreso + "','" + TipoDeSangre + "','" + Alergias + "','" + Enfermedad + "','" + Contacto + "','" + Sueldo + "','" + Medicamento + "')");
                //Insert into personal(Usuario,Nit,CUI,Direccion,Telefono,Profesion,FechaDeNacimiento, Edad, FechaDeIngreso, TipoDeSangre, Alergias, Enfermedad, Contacto, Sueldo, Medicamento) VALUES('prueba1_','5243534','534534534','Quetlzatenango','53453','Doctor','2023-06-06','89','2023-06-06','A positivo', 'Ninguan','Ninguna','4534534','3000','Ninguno');
                JOptionPane.showMessageDialog(null, "Detalle añadido ");
            }
            // connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Vuelva a intentarlo, por favor");
        }
    }

    public void InsertarFalta(String Usuario, String Nombre, String NoFaltas, String Tipo, String Descripcion, String Fecha) {
        // ('prueba1_', 'Jimena', '3', 'Horas', 'Consulta', '2023-07-12');
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                statement.execute("INSERT INTO faltascolaborador(Usuario, Nombre, NoFaltas, Tipo, Descripcion, Fecha) VALUES ('" + Usuario + "','" + Nombre + "','" + NoFaltas + "','" + Tipo + "','" + Descripcion + "','" + Fecha + "')");
                JOptionPane.showMessageDialog(null, "Falta añadida ");
            }
            // connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Vuelva a intentarlo, por favor");
        }
    }

    public void VerDetallePersonal2(JTable jTable) {
        String sql = "select Usuario, FechaDeIngreso, TipoDeSangre, Alergias, Enfermedad, Contacto, Sueldo, Medicamento from Personal";
//select Usuario, FechaDeIngreso, TipoDeSangre, Alergias, Enfermedad, Contacto, Sueldo, Medicamento from Personal;

        Statement st;
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Usuario");
        model.addColumn("Fecha de Ingreso");
        model.addColumn("Tipo de Sangre");
        model.addColumn("Alergias");
        model.addColumn("Enfermedad");
        model.addColumn("Contacto");
        model.addColumn("Sueldo");
        jTable.setModel(model);

        String[] dato = new String[7];
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
                dato[6] = result.getString(7);
                /* dato[8] = result.getString(9);
                dato[9] = result.getString(10);
                dato[10] = result.getString(11);
                dato[11] = result.getString(12);
                dato[12] = result.getString(13);
                dato[13] = result.getString(14);*/
                model.addRow(dato);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MateriaPrima.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
    }

    public void VerDetallePersonal3(JTable jTable) {
        String sql = "select Usuario, Nit, CUI, Direccion, Telefono, Profesion, FechaDeNacimiento, Edad from Personal";
//select Usuario, FechaDeIngreso, TipoDeSangre, Alergias, Enfermedad, Contacto, Sueldo, Medicamento from Personal;

        Statement st;
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Usuario");
        model.addColumn("Nit");
        model.addColumn("CUI");
        model.addColumn("Dirección");
        model.addColumn("Telefono");
        model.addColumn("Profesión");
        model.addColumn("Fecha de Nacimiento");
        model.addColumn("Edad");
        jTable.setModel(model);

        String[] dato = new String[8];
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
                dato[6] = result.getString(7);
                dato[7] = result.getString(8);
                model.addRow(dato);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MateriaPrima.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
    }

    public void DeleteDetallePersonal(String codigo) {
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                statement.execute("DELETE FROM personal WHERE Usuario =('" + codigo + "')");
                JOptionPane.showMessageDialog(null, "Detalle eliminado con exito");
            }
            //      connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "HUBO UN ERROR, POR FAVOR VUELA A INTENTAR");
        }
    }

    public void BuscarPersonal(JTextField CodigoAveriotxt, String codigoA) {
        int IdProveedor = 0;
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                //statement.execute("DELETE FROM lotepollo WHERE LoteAverio=('" + codigo + "')");
                ResultSet clr = statement.executeQuery("select Nombre from usuario where Usuario =('" + codigoA + "')");
                while (clr.next()) {
                    String nombre = clr.getString("Nombre");

                    if (codigoA.equals(nombre)) {
                        CodigoAveriotxt.setText(nombre);

                    }
                    System.out.println("Hola");
                }
            }
            //   connection.close();
        } catch (Exception e) {
        }

    }

    public void BuscarFaltas(JTable jTable) {
        String sql = "select Usuario, Nombre, NoFaltas, Tipo, Descripcion, Fecha from faltascolaborador";
        Statement st;
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Usuario");
        model.addColumn("Nombre");
        model.addColumn("Numero de faltas");
        model.addColumn("Tipo");
        model.addColumn("Descripción");
        model.addColumn("Fecha");
        jTable.setModel(model);

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
            Logger.getLogger(MateriaPrima.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
    }

    public void DeleteFaltaColaborador(String codigo) {
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                // statement.execute("DELETE FROM lotepollo WHERE LotePollo=('" + codigo + "')");
                statement.execute("Delete from faltascolaborador where Usuario =('" + codigo + "')");
                JOptionPane.showMessageDialog(null, "Falta eliminada con exito");
            }
            //      connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "HUBO UN ERROR, POR FAVOR VUELA A INTENTAR");
        }
    }

    public void InsertarServicio(String TipoServicio, String Mes, String Encargado, String Fecha, Float Total) {
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                statement.execute("INSERT INTO servicios(TipoDeServicio, MesDepago, Encargado, Fecha, Total)  VALUES ('" + TipoServicio + "','" + Mes + "','" + Encargado + "','" + Fecha + "'," + Total + ")");
                //"INSERT INTO insumouso(Nombre,Existencia,FechaIngreso,Total,Dimensional_idDimensional,Usuario_idUsuario) VALUES ('" + nombre + "'," + existencia + ",'" + fechaIngreso + "'," + total + "," + Dimensional_idDimensional + "," + intUsuario_idUsuario + ")");
                JOptionPane.showMessageDialog(null, "¡Añadido con éxito!");
            }
            //connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO AGREGAR, VUELA A INTENTAR POR FAVOR");
        }
    }

    public void BuscarServiciosEfectuados(JTable jTable) {
        String sql = "select TipoDeServicio, MesDePago, Encargado, Fecha, Total from servicios";
        Statement st;
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Servicio");
        model.addColumn("Mes Cancelado");
        model.addColumn("Encargado");
        model.addColumn("Fecha");
        model.addColumn("Total");
        jTable.setModel(model);

        String[] dato = new String[5];
        try {

            st = connection.createStatement();
            ResultSet result = st.executeQuery(sql);
            while (result.next()) {
                dato[0] = result.getString(1);
                dato[1] = result.getString(2);
                dato[2] = result.getString(3);
                dato[3] = result.getString(4);
                dato[4] = result.getString(5);
                model.addRow(dato);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MateriaPrima.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
    }

    public void DeleteServicio(String fecha) {
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                // statement.execute("DELETE FROM lotepollo WHERE LotePollo=('" + codigo + "')");
                statement.execute("delete from servicios where Fecha =('" + fecha + "')");
                JOptionPane.showMessageDialog(null, "Pago de servicio eliminado con exito");
            }
            //      connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "HUBO UN ERROR, POR FAVOR VUELA A INTENTAR");
        }
    }

    public void InsertarCuenta(String Mes, boolean Debe, boolean Haber, int anio, float monto, String Cuenta, String Aux, String Concepto) {
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                //insert into cuentas(Mes, Debe, Haber, anio, monto, cuenta, aux, concepto) values ('Enero','true','false', 2023, 34.43, 'Caja', 'Sueldos', 'Pago');
                statement.execute("insert into cuentas(Mes, Debe, Haber, anio, monto, cuenta, aux, concepto) values  ('" + Mes + "','" + Debe + "','" + Haber + "'," + anio + "," + monto + ",'" + Cuenta + "','" + Aux + "','" + Concepto + "')");
                JOptionPane.showMessageDialog(null, "Se Agrego con éxito");
            }
            //  connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO AGREGAR VUELVA A INTENTARLO POR FAVOR");
            System.out.println(e);
        }
    }

    public void MostraCuentas(JTable jTable) {
        String sql = "select id, Mes, Debe, Haber, anio, monto, cuenta, aux, concepto from cuentas";
        //select Nombre, Apellido, Supervisor, Usuario, puesto, correoElectronico from usuario;
        Statement st;
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Mes");
        model.addColumn("Debe");
        model.addColumn("Haber");
        model.addColumn("Año");
        model.addColumn("Monto");
        model.addColumn("Cuentas");
        model.addColumn("Cuentas");
        model.addColumn("Concepto");
        jTable.setModel(model);

        String[] dato = new String[9];
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
                dato[6] = result.getString(7);
                dato[7] = result.getString(8);
                dato[8] = result.getString(9);
                model.addRow(dato);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MateriaPrima.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
    }
    
      public void DeleteCuenta(int id) {
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                // statement.execute("DELETE FROM lotepollo WHERE LotePollo=('" + codigo + "')");
                statement.execute("delete from cuentas where id = (" + id + ")");
                JOptionPane.showMessageDialog(null, "Lote eliminado con exito");
            }
            //      connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "HUBO UN ERROR, POR FAVOR VUELA A INTENTAR");
        }
    }
      ////DATOS CLIENTE PARA GENERAR RECIBO
      public void InsertarDatos(String Nit, String Nombre, String Direccion) {
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                statement.execute("INSERT INTO datosclientes(nit, nombre, direccion) values ('" +Nit + "','" + Nombre + "','" + Direccion + "')");
                JOptionPane.showMessageDialog(null, "Ingreso con éxito ");
            }
            // connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Vuelva a intentarlo, por favor");
        }
    }
      
      public int BuscarClienteNit(JTextField Nittxt1, JTextField Nombretxt, JTextField direcciontxt1, String nit) {
        int IdProveedor = 0;
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                ResultSet clr = statement.executeQuery("select nit, nombre, direccion from datosclientes where nit =('" + nit + "')");
                while (clr.next()) {
                    String nit2 = clr.getString("nit");
                    String nombre = clr.getString("nombre");
                    String direccion = clr.getString("direccion");
                    

                    if (nit2.equals(nit)) {
                        Nittxt1.setText(nit2);
                        Nombretxt.setText(nombre);
                        direcciontxt1.setText(direccion);
                    }
                }
            }
         //   connection.close();
        } catch (Exception e) {
        }

        return IdProveedor;
    }

}
