/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesSQL;

import Clases.MovimientoLoteRecuperacion;
import Conexion.ConexionBD;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Toshiba
 */
public class PerdidaRecuperadaSQL {

    Connection connection = ConexionBD.getConnection();

    public void InsertarPerdidaRecuperada(MovimientoLoteRecuperacion Datos) {
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                statement.execute("INSERT INTO movimientolote(PerdidaRecuperada,CantidadRecuperada,FechaRecuperacion,PerdidaMateriaPrima_idPerdidaMateriaPrima,LotePollo_LoteAverio) VALUES ('" + Datos.isPerdidaRecuperada()+ "'," + Datos.getCantidadRecuperada() + ",'" + Datos.getFechaRecuperacion()+ "','" + Datos.getCodigoperdidaMateriaPrima().getIdPerdidaMateriaPrima()+ "','" + Datos.getCodigolotePollo().getLoteAverio()+ "')");
                // statement.execute("INSERT INTO movimientolote(PerdidaMateriaPrima,PerdidaRecuperada,CantidadRecuperada,FechaRecuperacion,LotePollo_LoteAverio,PerdidaMateriaPrima_idPerdidaMateriaPrima) VALUES ('" + Datos.getLoteAverio() + "'," + Datos.getUnidadExistente() + ",'" + Datos.getFechaIngreso() + "'," + Datos.getTotal() + "," + Datos.getProveedor().getIdProveedor() + "," + Datos.getUsuario().getIdUsuario() + ")");

                JOptionPane.showMessageDialog(null, "Recuperación añadido a la lista");
            }
           // connection.close();
        } catch (Exception e) {
            System.out.println("ESTO IMPORTA" + e);
            JOptionPane.showMessageDialog(null, "NO SE PUDO GUARDAR LA PERDIDA RECUPERADA");
        }
    }
}
