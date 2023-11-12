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
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author jenif
 */
public class InventarioSQL {

    Connection connection = ConexionBD.getConnection();

    public void InsertarInventario(String nombre, int existencia, String fechaIngreso, int total, int Dimensional_idDimensional, int intUsuario_idUsuario) {
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                statement.execute("INSERT INTO insumouso(Nombre,Existencia,FechaIngreso,Total,Dimensional_idDimensional,Usuario_idUsuario) VALUES ('" + nombre + "'," + existencia + ",'" + fechaIngreso + "'," + total + "," + Dimensional_idDimensional + "," + intUsuario_idUsuario + ")");
                JOptionPane.showMessageDialog(null, "Insumo añadido con éxito");
            }
            //connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO AGREGAR ESTE INSUMO");
        }
    }

    public void DeleteInventario(String codigo) {
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                // statement.execute("DELETE FROM lotepollo WHERE LotePollo=('" + codigo + "')");
                statement.execute("DELETE FROM insumouso WHERE Nombre =('" + codigo + "')");
                JOptionPane.showMessageDialog(null, "Lote eliminado con exito");
            }
            //      connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "HUBO UN ERROR, POR FAVOR VUELA A INTENTAR");
        }
    }

    /* public int BuscarInsumoPorNombre(JComboBox Productojcmb, JTextField Cantidadtxt, JTextField Totaltxt, String nombreInsumo) {
        int IdInsumoUso = 0;
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                ResultSet clr = statement.executeQuery("select idInsumoUso, Nombre, Existencia, Total from insumouso");
                while (clr.next()) {
                    IdInsumoUso = clr.getInt("idInsumoUso");
                    String nombre = clr.getString("Nombre");
                    int existencia = clr.getInt("Existencia");
                    int total = clr.getInt("Total");

                    if (nombreInsumo.equals(nombre)) {
                        Productojcmb.setActionCommand(nombre);
                                //setText(nombre);
                        Cantidadtxt.setText(existencia);
                        Totaltxt.setText(telefono);
                   
                    }
                }
            }
         //   connection.close();
        } catch (Exception e) {
        }

        return IdInsumoUso;
    }*/
}
