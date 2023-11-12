/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesSQL;

import Clases.MovimientoLotePerdida;
import Conexion.ConexionBD;
import Clases.PerdidaMateriaPrima;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Toshiba
 */
public class PerdidaMateriaPrimaSQL {

    Connection connection = ConexionBD.getConnection();

    public void InsertarPerdidaMateriaPrima(PerdidaMateriaPrima Datos) {
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                statement.execute("INSERT INTO perdidamateriaprima(idPerdidaMateriaPrima,Muerto,Enfermo,EnObservacion,UnidadAfectada,Fecha,DetallePerdida) VALUES ('" +Datos.getIdPerdidaMateriaPrima()+"',"+ Datos.isMuerto() + "," + Datos.isEnfermo() + "," + Datos.isEnObservacion() + "," + Datos.getUnidadesAfectadas() + ",'" + Datos.getFecha() + "','" + Datos.getDetallePerdida() + "')");

                JOptionPane.showMessageDialog(null, "Tipo de perdida añadida a la lista");
            }
          //  connection.close();
        } catch (Exception e) {
            System.out.println("perdida "+e);
            JOptionPane.showMessageDialog(null, "NO SE PUDO AGREGAR LA PERDIDA");
        }
    }

    public void InsertarPerdidaMovimientoLote(MovimientoLotePerdida Datos) {
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                statement.execute("INSERT INTO movimientolote(PerdidaMateriaPrima,PerdidaMateriaPrima_idPerdidaMateriaPrima,LotePollo_LoteAverio) VALUES ('" + Datos.isPerdidaMateriaPrima() + "','" + Datos.getCodigoperdidaMateriaPrima().getIdPerdidaMateriaPrima() + "','" + Datos.getCodigolotePollo().getLoteAverio() + "')");
                // statement.execute("INSERT INTO movimientolote(PerdidaMateriaPrima,PerdidaRecuperada,CantidadRecuperada,FechaRecuperacion,LotePollo_LoteAverio,PerdidaMateriaPrima_idPerdidaMateriaPrima) VALUES ('" + Datos.getLoteAverio() + "'," + Datos.getUnidadExistente() + ",'" + Datos.getFechaIngreso() + "'," + Datos.getTotal() + "," + Datos.getProveedor().getIdProveedor() + "," + Datos.getUsuario().getIdUsuario() + ")");

               // JOptionPane.showMessageDialog(null, "Recuperación añadido a la lista");
            }
          //  connection.close();
        } catch (Exception e) {
            System.out.println("movimiento "+ e);
            //JOptionPane.showMessageDialog(null, "NO SE PUDO GUARDAR LA PERDIDA RECUPERADA");
        }
    }
    
 public ArrayList<PerdidaMateriaPrima> ConsultaPerdidaMateraPrima() {
        ArrayList<PerdidaMateriaPrima> listaperdidamateriaprima = new ArrayList<PerdidaMateriaPrima>();
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                ResultSet clr = statement.executeQuery("select * from perdidamateriaprima");

                while (clr.next()) {
                    PerdidaMateriaPrima perdidamateriaprima=new PerdidaMateriaPrima();
                    perdidamateriaprima.setIdPerdidaMateriaPrima(clr.getString("idPerdidaMateriaPrima"));
                    perdidamateriaprima.setEnObservacion(clr.getBoolean("EnObservacion"));
                    perdidamateriaprima.setMuerto(clr.getBoolean("Muerto"));
                    perdidamateriaprima.setEnfermo(clr.getBoolean("Enfermo"));
                    perdidamateriaprima.setUnidadesAfectadas(clr.getInt("UnidadAfectada"));
                    perdidamateriaprima.setFecha(clr.getString("Fecha"));//debería devolver un date no un string
                    listaperdidamateriaprima.add(perdidamateriaprima);
                }
            }
          //  connection.close();
        } catch (Exception e) {
        }

        return listaperdidamateriaprima;
    }
 //JComboBox CodigoAveriocmb, 
   public int BuscarLotePollo(JTextField Cantidadtxt, int codigoA) {
        int IdProveedor = 0;
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                //statement.execute("DELETE FROM lotepollo WHERE LoteAverio=('" + codigo + "')");
                ResultSet clr = statement.executeQuery("select LotePollo_LoteAverio from movimientolote where perdidamateriaprima_idPerdidaMateriaPrima =('" + codigoA + "')");
                while (clr.next()) {
                    IdProveedor = clr.getInt("LotePollo_LoteAverio");
                    
                /*     if (codigoA.equals(nombre)) {
                  //  if (nombreProveedor.equals(nombre)) {
                        NombreProveedortxt1.setText(nombre);
                        direcciontxt.setText(direccion);
                        TelefonoProveedortxt1.setText(telefono);
                        EmpresaProveedortxt.setText(empresa);
                        System.out.println(nombre);
                        System.out.println(direccion);
                        System.out.println(telefono);
                        System.out.println(empresa);
                    }*/
                Cantidadtxt.setText( Integer.toString(IdProveedor));
                    //CodigoAveriocmb.addItem(IdProveedor);
                  
                }
            }
         //   connection.close();
        } catch (Exception e) {
        }

        return IdProveedor;
    }
    
   public int BuscarLotePollo2(JComboBox CodigoAveriocmb, int codigoA) {
        int IdProveedor = 0;
        try {
            try (Statement statement = (Statement) connection.createStatement()) {
                //statement.execute("DELETE FROM lotepollo WHERE LoteAverio=('" + codigo + "')");
                ResultSet clr = statement.executeQuery("select LotePollo_LoteAverio from movimientolote where perdidamateriaprima_idPerdidaMateriaPrima =('" + codigoA + "')");
                while (clr.next()) {
                    IdProveedor = clr.getInt("LotePollo_LoteAverio");
                    
                /*     if (codigoA.equals(nombre)) {
                  //  if (nombreProveedor.equals(nombre)) {
                        NombreProveedortxt1.setText(nombre);
                        direcciontxt.setText(direccion);
                        TelefonoProveedortxt1.setText(telefono);
                        EmpresaProveedortxt.setText(empresa);
                        System.out.println(nombre);
                        System.out.println(direccion);
                        System.out.println(telefono);
                        System.out.println(empresa);
                    }*/
                CodigoAveriocmb.addItem(IdProveedor);
             
                    System.out.println(IdProveedor);
            //    Cantidadtxt.setText( Integer.toString(IdProveedor));
                    //CodigoAveriocmb.addItem(IdProveedor);
                  
                }
            }
         //   connection.close();
        } catch (Exception e) {
        }

        return IdProveedor;
    }
}
