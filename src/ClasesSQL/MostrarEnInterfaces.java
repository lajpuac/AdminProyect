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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jenif
 */
public class MostrarEnInterfaces {

    Connection connection = ConexionBD.getConnection();

    public int BuscarDimesional(JComboBox Dimensionaljcmb) {
        int idDimensional = 0;
        String dimensional = "";
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                ResultSet clr = statement.executeQuery("select idDimensional,Dimensional from dimensional");
                while (clr.next()) {
                    idDimensional = clr.getInt("idDimensional");
                    dimensional = clr.getString("Dimensional");

                    Dimensionaljcmb.addItem(dimensional);
                    // System.out.println("Varible para meter en insert:" + idDimensional);
                }
                System.out.println("Varible para meter en insert:" + idDimensional);
            }

        } catch (Exception e) {
            Logger.getLogger(MercaderiaSQL.class.getName()).log(Level.SEVERE, null, e);
            System.out.println(e);
        }

        return idDimensional;
    }

    public void Buscar(JTable jTable) {

        String sql = "select Nombre, Apellido, Celular, Telefono, Direccion from libretacliente";
        Statement st;
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Celular");
        model.addColumn("Telefono");
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
            Logger.getLogger(LibretaClienteSQL.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
    }

    public void BuscarLotePollo(JTable jTable) {
        String sql = "SELECT LoteAverio, UnidadExistente, FechaIngreso FROM lotepollo";
        Statement st;
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Lote Averio");
        model.addColumn("Unidad Existente");
        model.addColumn("Fecha Ingreso");
        jTable.setModel(model);

        String[] dato = new String[3];
        try {

            st = connection.createStatement();
            ResultSet result = st.executeQuery(sql);
            while (result.next()) {
                dato[0] = result.getString(1);
                dato[1] = result.getString(2);
                dato[2] = result.getString(3);

                model.addRow(dato);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MateriaPrima.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
    }

    public void BuscarInsumoConsumo(JTable jTable) {
        String sql = "select TipoInsumo, Nombre, Existencia, Total, FechaIngreso, FechaVencimiento from insumoconsumo";
        Statement st;
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Tipo Insumo");
        model.addColumn("Nombre");
        model.addColumn("Existencia");
        model.addColumn("Total");
        model.addColumn("Fecha Ingreso");
        model.addColumn("Fecha Vencimiento");
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

    public void BuscarProveedor(JTable jTable) {
        String sql = "select Nombre, Direccion, Telefono, Empresa from proveedor";
        Statement st;
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nombre");
        model.addColumn("Direccion");
        model.addColumn("Telefono");
        model.addColumn("Empresa");
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

    public void InsumoUso(JTable jTable) {
        String sql = "select Nombre, Existencia, FechaIngreso, Total from insumouso";
        Statement st;
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nombre");
        model.addColumn("Existencia");
        model.addColumn("Fecha Ingreso");
        jTable.setModel(model);

        String[] dato = new String[3];
        try {

            st = connection.createStatement();
            ResultSet result = st.executeQuery(sql);
            while (result.next()) {
                dato[0] = result.getString(1);
                dato[1] = result.getString(2);
                dato[2] = result.getString(3);

                model.addRow(dato);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MateriaPrima.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
    }

    public void InsumoMercaderia(JTable jTable) {
        String sql = "select TipoPieza, CantidadLibra, FechaVenta, Total, LotePollo_LoteAverio, stock from mercaderia";
        Statement st;
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("TIPO DE PIEZA");
        model.addColumn("TOTAL DE LIBRAS");
        model.addColumn("FECHA");
        model.addColumn("TOTAL");
        model.addColumn("NO. LOTE DE POLLO");
        model.addColumn("STOCK");
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

}
