/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesSQL;

import Conexion.ConexionBD;
import Clases.MateriaPrima;
import Clases.Proveedor;
import Clases.Usuario;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

/**
 *
 * @author Toshiba
 */
public class MateriaPrimaSQL {

    double fiveDigits = 10000 + Math.random() * 90000;
    Connection connection = ConexionBD.getConnection();

    public void InsertarMateriaPrima(MateriaPrima Datos) {
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                statement.execute("INSERT INTO lotepollo(LoteAverio,UnidadExistente,FechaIngreso,Total,Usuario_idUsuario,Proveedor_idProveedor) VALUES ('" + Datos.getLoteAverio() + "'," + Datos.getUnidadExistente() + ",'" + Datos.getFechaIngreso() + "'," + Datos.getTotal() + "," + Datos.getUsuario().getIdUsuario() + "," + Datos.getProveedor().getIdProveedor() + ")");
                JOptionPane.showMessageDialog(null, "¡Lote guardado con éxito!");
            }
            //      connection.close();
        } catch (Exception e) {
            System.out.println("ESTO IMPORTA" + e);
            JOptionPane.showMessageDialog(null, "HUBO UN ERROR, POR FAVOR VUELA A INTENTAR");
        }
    }

    public void DeleteMateriaPrima(String codigo) {
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                // statement.execute("DELETE FROM lotepollo WHERE LotePollo=('" + codigo + "')");
                statement.execute("DELETE FROM lotepollo WHERE LoteAverio=('" + codigo + "')");
                JOptionPane.showMessageDialog(null, "Lote eliminado con exito");
            }
            //      connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "HUBO UN ERROR, POR FAVOR VUELA A INTENTAR");
        }
    }

    public ArrayList<MateriaPrima> ConsultaMateraPrimaCodigo() {
        ArrayList<MateriaPrima> listamateriaprima = new ArrayList<MateriaPrima>();
        Proveedor proveedor = new Proveedor();
        Usuario usuario = new Usuario();
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                ResultSet clr = statement.executeQuery("select * from lotepollo");

                while (clr.next()) {
                    MateriaPrima materiaprima = new MateriaPrima();
                    materiaprima.setLoteAverio(clr.getString("LoteAverio"));
                    materiaprima.setUnidadExistente(clr.getInt("UnidadExistente"));
                    materiaprima.setFechaIngreso(clr.getString("FechaIngreso"));//debería devolver un date no un string
                    materiaprima.setTotal(clr.getFloat("Total"));
                    usuario.setIdUsuario(clr.getInt("Usuario_idUsuario"));
                    materiaprima.setUsuario(usuario);
                    proveedor.setIdProveedor(clr.getInt("Proveedor_idProveedor"));
                    materiaprima.setProveedor(proveedor);
                    //materiaprima.getUsuario().setIdUsuario(clr.getInt("Usuario_idUsuario"));
                    listamateriaprima.add(materiaprima);
                }
            }
            //      connection.close();
        } catch (Exception e) {
            System.out.println("Problema en consulta" + e);
        }

        return listamateriaprima;
    }

    public int getFiveDigitsNumber() {
        double fiveDigits = 10000 + Math.random() * 90000;
        return (int) fiveDigits;
    }

    public void LotePollo(JTable jTable) {
        String sql = "select LoteAverio, UnidadExistente, FechaIngreso, Total from lotepollo";
        Statement st;
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("LOTE AVERIO");
        model.addColumn("EXISTENCIA");
        model.addColumn("FECHA INGRESO");
        model.addColumn("TOTAL");
        jTable.setModel(model);

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
            Logger.getLogger(MateriaPrima.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
    }
    
      public void DeleteIngresoMP(String codigo) {
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                // statement.execute("DELETE FROM lotepollo WHERE LotePollo=('" + codigo + "')");
                statement.execute("delete from lotepollo where LoteAverio =('" + codigo + "')");
                JOptionPane.showMessageDialog(null, "Eliminado con exito");
            }
            //      connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "HUBO UN ERROR, POR FAVOR VUELA A INTENTAR");
        }
    }
}
