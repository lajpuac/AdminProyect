/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;
import Interfaz.CrearCuenta;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author jenif
 */
public class ConexionBD2 {
    
    private static Connection connection;

    private ConexionBD2() {

    }

    public static Connection getConnection() {
        try {
            if (connection == null) {
                CrearConexion();
                // System.out.println("Entro al if");
            }
            /*if (!VerificarSQL()) {
                connection.close();
                CrearConexion();
            }*/
            return connection;
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println(e);
            throw new RuntimeException("Conexión fallida", e);
        }
    }

    private static void CrearConexion() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");//com.mysql.cj.jdbc.Driver
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "1234");
            System.out.println("Conexion exitosaa la BD2");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

   /* private static boolean VerificarSQL() {
        boolean x = false;
        try {
            //Connection miConexion=(Connection) Conexion.GetConnection();

            Statement s = connection.createStatement();
            ResultSet clr = s.executeQuery("select 1");
            x = true;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
        return x;
    }*/
}
