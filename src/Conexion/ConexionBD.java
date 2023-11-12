package Conexion;

import Interfaz.CrearCuenta;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionBD {

    private static Connection connection;

    private ConexionBD() {

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
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Analisis2", "root", "1234");
            System.out.println("Conexion exitosa");
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
