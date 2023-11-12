/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesSQL;

import Clases.InsumoConsumo;
import Clases.MateriaPrima;
import Conexion.ConexionBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Toshiba
 */
public class MedicamentosYAlimentosSQL {
       Connection connection = ConexionBD.getConnection();
    
     public void InsertarMedicamentosYAlimentos(InsumoConsumo Datos) {
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                statement.execute("INSERT INTO insumoconsumo(TipoInsumo,Nombre,Existencia,Total,FechaIngreso,FechaVencimiento,Dimensional_idDimensional,Proveedor_idProveedor,Usuario_idUsuario) VALUES ('" + Datos.getTipoInsumo()+ "','" + Datos.getNombre()+ "'," + Datos.getExistencia()+ "," + Datos.getTotal() + ",'" + Datos.getFechaIngreso() + "','" +Datos.getFechaVencimiento()+"',"+Datos.getDimensional().getIdDimensional()+","+Datos.getProveedor().getIdProveedor()+","+ Datos.getUsuario().getIdUsuario() + ")");
                JOptionPane.showMessageDialog(null, "INSUMO GUARDADO");
            }
         //   connection.close();
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "NO SE PUDO AGREGAR AL EL INSUMO");
        }
    }

    public ArrayList<InsumoConsumo> ConsultaMedicamentosYAlimentos() {
        ArrayList<InsumoConsumo> listainsumoconsumo = new ArrayList<InsumoConsumo>();
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                ResultSet clr = statement.executeQuery("select * from InsumoConsumo");

                while (clr.next()) {
                    InsumoConsumo insumoconsumo = new InsumoConsumo();
                    insumoconsumo.setIdInsumoConsumo(clr.getInt("idInsumoConsumo"));
                    insumoconsumo.setTipoInsumo(clr.getString("TipoInsumo"));
                    insumoconsumo.setNombre(clr.getString("Nombre"));
                    insumoconsumo.setExistencia(clr.getInt("Existencia"));
                    insumoconsumo.setTotal(clr.getInt("Total"));
                    insumoconsumo.setFechaIngreso(clr.getString("FechaIngreso"));
                    insumoconsumo.setFechaVencimiento(clr.getString("FechaVencimiento"));
                    insumoconsumo.getDimensional().setIdDimensional(clr.getInt("Dimensional_idDimensional"));
                    insumoconsumo.getProveedor().setIdProveedor(clr.getInt("Proveedor_idProveedor"));
                    insumoconsumo.getUsuario().setIdUsuario(clr.getInt("Usuario_idUsuario"));
                    listainsumoconsumo.add(insumoconsumo);
                }
            }
        //    connection.close();
        } catch (Exception e) {
        }

        return listainsumoconsumo;
    }
     public void DeleteMedicamentosYAlimentos(String codigo) {
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
               // statement.execute("DELETE FROM lotepollo WHERE LotePollo=('" + codigo + "')");
               statement.execute("DELETE FROM insumoconsumo WHERE TipoInsumo =('" + codigo + "')"); 
               JOptionPane.showMessageDialog(null, "Eliminado con exito");
            }
      //      connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "HUBO UN ERROR, POR FAVOR VUELA A INTENTAR");
        }
    }
  
}
