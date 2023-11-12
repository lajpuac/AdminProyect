/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesSQL;

import Clases.MateriaPrima;
import javax.swing.table.DefaultTableModel;
import Conexion.ConexionBD;
/*import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;*/
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
public class VentaSQL {

    Connection connection = ConexionBD.getConnection();

    public void InsertarVenta(boolean adomicilio, boolean puntoVenta, String producto, int cantidad, float total, String fecha, int usuario_idUsuario) {
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                statement.execute("INSERT INTO venta (Adomicilio,PuntoVenta,Producto,Cantidad,Total,Fecha,Usuario_idUsuario) VALUES ('" + adomicilio + "','" + puntoVenta + "','" + producto + "'," + cantidad + "," + total + ",'" + fecha + "'," + usuario_idUsuario + ")");
                JOptionPane.showMessageDialog(null, "Venta añedida a la lista");
            }
            //  connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO AGREGAR ESTA VENTA");
            System.out.println(e);
        }
    }

    public void MostraVentas(JTable jTable) {
        String sql = "select idVenta, Producto, Cantidad, Total, Fecha from venta";
        //select Nombre, Apellido, Supervisor, Usuario, puesto, correoElectronico from usuario;
        Statement st;
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("PRODUCTO");
        model.addColumn("CANTIDAD");
        model.addColumn("TOTAL");
        model.addColumn("FECHA");
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

    public void MostraTotalVentas(JTable jTable) {
        String sql = "SELECT SUM(Total) FROM venta";
        //select Nombre, Apellido, Supervisor, Usuario, puesto, correoElectronico from usuario;
        Statement st;
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Total");
        jTable.setModel(model);

        String[] dato = new String[1];
        try {

            st = connection.createStatement();
            ResultSet result = st.executeQuery(sql);
            while (result.next()) {
                dato[0] = result.getString(1);
                model.addRow(dato);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MateriaPrima.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
    }

    public void MostraLotePollo(JTable jTable) {
        String sql = "select LoteAverio, UnidadExistente, Total from lotepollo";
        //select Nombre, Apellido, Supervisor, Usuario, puesto, correoElectronico from usuario;
        Statement st;
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No. Lote");
        model.addColumn("Unidades existentes");
        model.addColumn("Total");
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

    public void MostraTotalUnidadesE(JTable jTable) {
        String sql = "select sum(UnidadExistente) from lotepollo";
        //select Nombre, Apellido, Supervisor, Usuario, puesto, correoElectronico from usuario;
        Statement st;
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Total Existenacias");
        jTable.setModel(model);

        String[] dato = new String[1];
        try {

            st = connection.createStatement();
            ResultSet result = st.executeQuery(sql);
            while (result.next()) {
                dato[0] = result.getString(1);
                model.addRow(dato);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MateriaPrima.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
    }

    public void MostraTotalUnidadesMonetario(JTable jTable) {
        String sql = "select sum(Total) from lotepollo";
        //select Nombre, Apellido, Supervisor, Usuario, puesto, correoElectronico from usuario;
        Statement st;
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Total ");
        jTable.setModel(model);

        String[] dato = new String[1];
        try {

            st = connection.createStatement();
            ResultSet result = st.executeQuery(sql);
            while (result.next()) {
                dato[0] = result.getString(1);
                model.addRow(dato);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MateriaPrima.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
    }

    public void GenerarFactura() {

      /*  try {
            Document documento = new Document();
            String ruta = System.getProperty("user.home");
            // PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/OneDrive/Escritorio/Reporte_Alumnos6.pdf"));
            String destino = "Recibo.pdf";
            PdfWriter.getInstance(documento, new FileOutputStream(destino));
            documento.open();
            Phrase p = new Phrase("RECIBO DE COMPRA");
            documento.add(p);

            PdfPTable tabla = new PdfPTable(4);
            tabla.addCell("Producto");
            tabla.addCell("Cantidad");
            tabla.addCell("Total");
            tabla.addCell("Fecha");
            // documento.add(tabla);
            //  documento.close();

            try {
                try (Statement statement = (Statement) connection.createStatement()) {
                    String sql = "select Producto, Cantidad, Total, Fecha from venta";
                    // st = connection.createStatement();
                    ResultSet rs = statement.executeQuery(sql);
                    if (rs.next()) {

                        do {
                            tabla.addCell(rs.getString(1));
                            tabla.addCell(rs.getString(2));
                            tabla.addCell(rs.getString(3));
                            tabla.addCell(rs.getString(4));
                        } while (rs.next());
                        documento.add(tabla);
                    }

                }

            } catch (Exception e) {
                documento.close();
                System.out.println("Recibo creado con éxito");
                //  JOptionPane.showMessageDialog(null, "Reporte creado.");
                System.out.println(e);
            }

        } catch (DocumentException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Vuelva a intentar.");
        }*/
    }
}
