/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Clases.Usuario;
import ClasesInterfaz.ComponenteBoton;
import ClasesInterfaz.ComponenteBotonIcon;
import ClasesInterfaz.ComponenteLabelText;
import ClasesInterfaz.ComponentePanel;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import sun.security.util.Password;

/**
 *
 * @author jenif
 */
public class MenuCuentas extends javax.swing.JFrame {

    private boolean modoOscuro;
    ComponentePanel panel = new ComponentePanel();
    ComponenteLabelText text = new ComponenteLabelText();
    ComponenteLabelText label = new ComponenteLabelText();
    ComponenteBoton boton = new ComponenteBoton();
    ComponenteBotonIcon botonIcon = new ComponenteBotonIcon();
    Clases.Usuario usuario = new Clases.Usuario();

    /**
     * Creates new form Menu
     */
    public MenuCuentas() {

        //this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        transparenciButton();
    }

    public MenuCuentas(int numeroboton) {

        //  this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        transparenciButton();
    }

    public MenuCuentas(Usuario usuario) {

        // this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        transparenciButton();
        this.usuario = usuario;

    }

    public void transparenciButton() {
        Accion1btn.setOpaque(false);
        Accion1btn.setContentAreaFilled(false);
        Accion1btn.setBorderPainted(false);
        Accion2btn.setOpaque(false);
        Accion2btn.setContentAreaFilled(false);
        Accion2btn.setBorderPainted(false);
        Accion3btn.setOpaque(false);
        Accion3btn.setContentAreaFilled(false);
        Accion3btn.setBorderPainted(false);
        Regresarbtn.setOpaque(false);
        Regresarbtn.setContentAreaFilled(false);
        Regresarbtn.setBorderPainted(false);
        String texto7 = "Registro de Activos";
        Accion2btn.setToolTipText(texto7);
        String texto8 = "Registro de Pasivos";
        Accion3btn.setToolTipText(texto8);
        String texto9 = "Regresar a Menú Principal";
        Regresarbtn.setToolTipText(texto9);
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
        Accion3btn = new javax.swing.JButton();
        Accion2btn = new javax.swing.JButton();
        Accion1btn = new javax.swing.JButton();
        Regresarbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(429, 325));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(123, 125, 125));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Accion3btn.setBackground(new java.awt.Color(0, 0, 102));
        Accion3btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Accion3btn.setForeground(new java.awt.Color(102, 102, 102));
        Accion3btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/metodo-de-pago.png"))); // NOI18N
        Accion3btn.setText("REGISTRO DE PASIVOS");
        Accion3btn.setBorder(null);
        Accion3btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Accion3btn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aprovechar.png"))); // NOI18N
        Accion3btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Accion3btnActionPerformed(evt);
            }
        });

        Accion2btn.setBackground(new java.awt.Color(0, 0, 102));
        Accion2btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Accion2btn.setForeground(new java.awt.Color(102, 102, 102));
        Accion2btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registro-en-linea.png"))); // NOI18N
        Accion2btn.setText("REGISTRO DE ACTIVOS");
        Accion2btn.setBorder(null);
        Accion2btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Accion2btn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aprovechar.png"))); // NOI18N
        Accion2btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Accion2btnActionPerformed(evt);
            }
        });

        Accion1btn.setBackground(new java.awt.Color(0, 0, 102));
        Accion1btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Accion1btn.setForeground(new java.awt.Color(102, 102, 102));
        Accion1btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inventario (1).png"))); // NOI18N
        Accion1btn.setText("RESUMEN INVENTARIO");
        Accion1btn.setBorder(null);
        Accion1btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Accion1btn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aprovechar.png"))); // NOI18N
        Accion1btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Accion1btnActionPerformed(evt);
            }
        });

        Regresarbtn.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        Regresarbtn.setForeground(new java.awt.Color(102, 102, 102));
        Regresarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha.png"))); // NOI18N
        Regresarbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Regresarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 68, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Accion2btn, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Accion3btn, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Accion1btn, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75))
                    .addComponent(Regresarbtn, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Regresarbtn)
                .addGap(54, 54, 54)
                .addComponent(Accion2btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Accion3btn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Accion1btn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarbtnActionPerformed
        // TODO add your handling code here:
        Menu3 menu = new Menu3();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_RegresarbtnActionPerformed

    private void Accion2btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Accion2btnActionPerformed
        // TODO add your handling code here:
        RegistroCuentas menu = new RegistroCuentas();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_Accion2btnActionPerformed

    private void Accion1btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Accion1btnActionPerformed
        VisuaLotePollo materiaPrima = new VisuaLotePollo();
        // MateriaPrima materiaPrima = new MateriaPrima(usuario);
        materiaPrima.setVisible(true);
        dispose();

    }//GEN-LAST:event_Accion1btnActionPerformed

    private void Accion3btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Accion3btnActionPerformed
        // TODO add your handling code here:
        PagoDeServicios recuperacion = new PagoDeServicios();
        recuperacion.setVisible(true);
        dispose();

    }//GEN-LAST:event_Accion3btnActionPerformed
    private void Pintar(Color colorbotones, String imagen, Color colorfondo) {

        panel.setPanelFondo(jPanel1);
        panel.setColorFondo(colorfondo);
        panel.getPanelFondo();
        boton.setBoton(Accion1btn);
        boton.setColorBoton(colorbotones);
        boton.getBoton();
        boton.setBoton(Accion2btn);
        boton.setColorBoton(colorbotones);
        boton.getBoton();
        boton.setBoton(Accion3btn);
        boton.setColorBoton(colorbotones);
        boton.getBoton();

    }

    private void nombrarmenu(int numeromenu) {
        if (numeromenu == 1) {
            Accion1btn.setText("Agregar Cliente");
            Accion2btn.setText("Ver Libreta");

        } else if (numeromenu == 2) {

        }
        Inventario inventario = new Inventario();
        inventario.setVisible(true);
        dispose();
    }

    private void direccionarmenu(int numeromenu, int accion) {
        if (numeromenu == 1) {
            if (accion == 1) {
                Cliente cliente = new Cliente();
                cliente.setVisible(true);
                dispose();
            } else if (accion == 2) {
                Libreta libreta = new Libreta();
                libreta.setVisible(true);
                dispose();
            }
        } else if (numeromenu == 2) {

        }
    }

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
            java.util.logging.Logger.getLogger(MenuCuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCuentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Accion1btn;
    private javax.swing.JButton Accion2btn;
    private javax.swing.JButton Accion3btn;
    private javax.swing.JButton Regresarbtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}