/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesSQL;

import Clases.Dimensional;
import Conexion.ConexionBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Toshiba
 */
public class DimensionalSQL {

    Connection connection = ConexionBD.getConnection();
    int val2;

    public int getVal2() {
        return val2;
    }

    public void setVal2(int val2) {
        this.val2 = val2;
    }

    public void InsertarDimensional(String dimensional) {
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                statement.execute("INSERT INTO dimensional(Dimensional) VALUES('" + dimensional + "')");
                JOptionPane.showMessageDialog(null, "Dimensional añedida a la lista");
            }
            //connection.close();
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "NO SE PUDO AGREGAR DIMENSIONAL");
            System.out.println(e);
        }
    }

    public void EliminarDimensional(String dimensional) {
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                statement.execute("DELETE FROM dimensional WHERE Dimensional=('" + dimensional + "')");
                JOptionPane.showMessageDialog(null, "DIMENSIONAL eliminada de la lista");
            }
           // connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO ELIMINAR DIMENSIONAL");
        }
    }

    public int ObtenerIdDimensional(String dimesional) {
        int idDimensional = 0;
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                ResultSet clr = statement.executeQuery("select idDimensional,Dimensional from dimensional");
                while (clr.next()) {
                    idDimensional = clr.getInt("idDimensional");
                    String Dimensional = clr.getString("Dimensional");

                    if (dimesional.equals(Dimensional)) {

                        val2 = idDimensional;
                        System.out.println(val2);

                    }
                }
            }
            //Conexion.getConnection().close();
        } catch (Exception e) {
        }

        return idDimensional;
    }

    public ArrayList<Dimensional> ConsultaDimencional() {
        ArrayList<Dimensional> listaDimencionales = new ArrayList<Dimensional>();
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                ResultSet clr = statement.executeQuery("select * from dimensional");
                while (clr.next()) {
                    Clases.Dimensional dimensional = new Clases.Dimensional();
                    dimensional.setIdDimensional(clr.getInt("idDimensional"));
                    dimensional.setDimensional(clr.getString("Dimensional"));
                    listaDimencionales.add(dimensional);
                }
            }
            //Conexion.getConnection().close();
        } catch (Exception e) {
        }

        return listaDimencionales;
    }

}
