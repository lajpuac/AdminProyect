/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import ClasesInterfaz.ComponenteBoton;
import ClasesInterfaz.ComponenteBotonIcon;
import ClasesInterfaz.ComponenteLabelText;
import ClasesInterfaz.ComponentePanel;
import ClasesSQL.MateriaPrimaSQL;
import ClasesSQL.MostrarEnInterfaces;
import ClasesSQL.PersonalSQL;
import ClasesSQL.PruebaSQL;
import Conexion.ConexionBD;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sun.security.util.Password;

/**
 *
 * @author jenif
 */
public class VerCuentas extends javax.swing.JFrame {

    ComponentePanel panel = new ComponentePanel();
    ComponenteLabelText text = new ComponenteLabelText();
    ComponenteLabelText label = new ComponenteLabelText();
    ComponenteBoton boton = new ComponenteBoton();
    ComponenteBotonIcon botonIcon = new ComponenteBotonIcon();
    PersonalSQL personalsql = new PersonalSQL();
    int id;

    public static String loteAverio = "";

    public String getLoteAverio() {
        return loteAverio;
    }

    public void setLoteAverio(String loteAverio) {
        this.loteAverio = loteAverio;
    }

    /**
     * Creates new form Menu
     */
    public VerCuentas() {

     //   this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        transparenciButton();      
        personalsql.MostraCuentas(jTable);
     //  pruebasql.BuscarLotePollo(jTable);
        this.loteAverio = loteAverio;
    }

    public void transparenciButton() {
        Regresarbtn.setOpaque(false);
        Regresarbtn.setContentAreaFilled(false);
        Regresarbtn.setBorderPainted(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        EliminarClientebtn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        EliminarClientebtn1 = new javax.swing.JButton();
        lotetxt = new javax.swing.JTextField();
        Aceptarbtn = new javax.swing.JButton();
        Regresarbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(123, 125, 125));
        jPanel1.setForeground(new java.awt.Color(52, 73, 94));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        EliminarClientebtn.setBackground(new java.awt.Color(102, 102, 102));
        EliminarClientebtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EliminarClientebtn.setForeground(new java.awt.Color(102, 102, 102));
        EliminarClientebtn.setText("Eliminar");
        EliminarClientebtn.setBorder(null);
        EliminarClientebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarClientebtnActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 102, 102));
        jButton3.setText("Agregar Nuevo Cliente");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 224));
        jLabel3.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Cuentas");

        jTable.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "No. Colaborador", "Supervisor", "Nombre", "Apellido", "Usuario", "Puesto", "Correo Electronico"
            }
        ));
        jTable.setColumnSelectionAllowed(true);
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        EliminarClientebtn1.setBackground(new java.awt.Color(102, 102, 102));
        EliminarClientebtn1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EliminarClientebtn1.setForeground(new java.awt.Color(102, 102, 102));
        EliminarClientebtn1.setText("Eliminar");
        EliminarClientebtn1.setBorder(null);
        EliminarClientebtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarClientebtn1ActionPerformed(evt);
            }
        });

        lotetxt.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lotetxt.setForeground(new java.awt.Color(102, 102, 102));
        lotetxt.setText("Seleccion");
        lotetxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lotetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lotetxtActionPerformed(evt);
            }
        });
        lotetxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lotetxtKeyPressed(evt);
            }
        });

        Aceptarbtn.setBackground(new java.awt.Color(255, 51, 51));
        Aceptarbtn.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        Aceptarbtn.setForeground(new java.awt.Color(255, 255, 255));
        Aceptarbtn.setText("ELIMINAR");
        Aceptarbtn.setBorder(null);
        Aceptarbtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aprovechar.png"))); // NOI18N
        Aceptarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarbtnActionPerformed(evt);
            }
        });

        Regresarbtn.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        Regresarbtn.setForeground(new java.awt.Color(102, 102, 102));
        Regresarbtn.setText("Regresar");
        Regresarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarbtnActionPerformed(evt);
            }
        });
        Regresarbtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RegresarbtnKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lotetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Aceptarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(199, 199, 199)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EliminarClientebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EliminarClientebtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Regresarbtn)
                .addGap(276, 276, 276))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(914, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Regresarbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EliminarClientebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EliminarClientebtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lotetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Aceptarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(449, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(21, 21, 21)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EliminarClientebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarClientebtnActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_EliminarClientebtnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMousePressed
        // TODO add your handling code here:
        int numfila = jTable.getRowCount();

        jTable.getEditingColumn();
        System.out.println("La fila " + numfila + " fue seleccionada");
        System.out.println("Veamos que salio " + jTable.getEditingColumn());
    }//GEN-LAST:event_jTableMousePressed
    private void Pintar(Color colorbotones, String imagen, Color colortexto, Color colorlabel, Color colorbase, Color colorfondo) {
        panel.setPanelBase(jPanel2);
        panel.setColorBase(colorbase);
        panel.getPanelBase();
        panel.setPanelFondo(jPanel1);
        panel.setColorFondo(colorfondo);
        panel.getPanelFondo();
        boton.setBoton(Aceptarbtn);
        boton.setColorBoton(colorbotones);
        boton.getBoton();
        text.setText(lotetxt);
        text.setColorTexto(colortexto);
        text.getText();
        label.setLabel(jLabel3);
        label.setColorLabel(colorlabel);
        label.getLabel();
    }

    private void BuscartxtKeyPressed(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:

    }
    private void EliminarClientebtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarClientebtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EliminarClientebtn1ActionPerformed

    private void RegresarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarbtnActionPerformed
        // TODO add your handling code here:
        RegistroCuentas mp = new RegistroCuentas();
        mp.setVisible(true);
        dispose();
    }//GEN-LAST:event_RegresarbtnActionPerformed

    private void lotetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lotetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lotetxtActionPerformed


    private void AceptarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarbtnActionPerformed

        int filaseleccionada;

        try {

            filaseleccionada = jTable.getSelectedRow();

            if (filaseleccionada == -1) {

                JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");

            } else {

                DefaultTableModel modelotabla = (DefaultTableModel) jTable.getModel();

                String codigo =  (String) modelotabla.getValueAt(filaseleccionada, 0);
                int numEntero = Integer.parseInt(codigo);
                //    String numCadena= String.valueOf(codigo);
               lotetxt.setText(codigo);
                loteAverio = lotetxt.getText();
                System.out.println(numEntero);
               personalsql.DeleteCuenta(numEntero);
               // SQLMateriaPrima.DeleteMateriaPrima(loteAverio);

               
            
            }

        } catch (HeadlessException ex) {

            JOptionPane.showMessageDialog(null, "Error: " + ex + "\nInténtelo nuevamente", " .::Error En la Operacion::.", JOptionPane.ERROR_MESSAGE);

        }

      

    }//GEN-LAST:event_AceptarbtnActionPerformed

    private void lotetxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lotetxtKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            loteAverio = lotetxt.getText();

        }
    }//GEN-LAST:event_lotetxtKeyPressed

    private void RegresarbtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RegresarbtnKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegresarbtnKeyPressed
    boolean modoOscuro = false;

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VerCuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerCuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerCuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerCuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerCuentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptarbtn;
    private javax.swing.JButton EliminarClientebtn;
    private javax.swing.JButton EliminarClientebtn1;
    private javax.swing.JButton Regresarbtn;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField lotetxt;
    // End of variables declaration//GEN-END:variables
}
