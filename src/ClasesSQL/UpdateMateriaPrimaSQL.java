
package ClasesSQL;

import Conexion.ConexionBD;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class UpdateMateriaPrimaSQL {

    Connection connection = ConexionBD.getConnection();

    public void ActualizarExistenciasDeMateriaPrima(int ExistenciasActualizadas, String codigo) {
        try {
            Statement consulta = connection.createStatement(); //Objeto para las consultas
            consulta.executeUpdate("UPDATE lotepollo set UnidadExistente = '"+ExistenciasActualizadas+"'WHERE LoteAverio ='"+codigo+"'");//Consulta
            JOptionPane.showMessageDialog(null, "Materia prima ACTUALIZADA en existencias");

           // connection.close();
        } catch (Exception e) {
            System.out.println("actualizar "+e);
           // JOptionPane.showMessageDialog(null, "NO SE PUDO ACTUALIZAR LA MATERIA PRIMA");
        }
    }
    
     public void BuscarCodigoAverio(JComboBox CodigoAveriocmb,String codigoPerdida) {
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                //select LotePollo_LoteAverio from movimientolote where PerdidaMateriaPrima_idPerdidaMateriaPrima = '61752';
                statement.execute("select LotePollo_LoteAverio from movimientolote where PerdidaMateriaPrima_idPerdidaMateriaPrima = ('" + codigoPerdida + "')");
               JOptionPane.showMessageDialog(null, "Código encontrado con éxito");
            }
            //  connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Vuelva a intentar");
        }
    }
}
