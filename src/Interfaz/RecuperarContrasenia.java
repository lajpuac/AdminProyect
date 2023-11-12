/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import ClasesInterfaz.ComponenteBoton;
import ClasesInterfaz.ComponenteBotonIcon;
import ClasesInterfaz.ComponenteContraseña;
import ClasesInterfaz.ComponenteLabelText;
import ClasesInterfaz.ComponentePanel;
import Usuario.Compresor;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import sun.security.util.Password;

/**
 *
 * @author jenif
 */
public class RecuperarContrasenia extends javax.swing.JFrame {

    String usuario = "";
    Password contraseña3;
    Compresor compresor = new Compresor();
    String pass_concatenada, pass_concatenada2;
    ComponentePanel panel = new ComponentePanel();
    ComponenteLabelText text = new ComponenteLabelText();
    ComponenteLabelText label = new ComponenteLabelText();
    ComponenteBoton boton = new ComponenteBoton();
    ComponenteBotonIcon botonIcon = new ComponenteBotonIcon();
    ComponenteContraseña password = new ComponenteContraseña();

    /**
     * Creates new form Menu
     */
    public RecuperarContrasenia() {

        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        transparenciButton();
    }

    public void transparenciButton() {
        jButton2.setOpaque(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setBorderPainted(false);

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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Usuariotxt = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        Contraseña1txt = new javax.swing.JPasswordField();
        Confirmarbtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Contraseña2txt = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(123, 125, 125));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Nueva Contraseña");

        jLabel3.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Usuario");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        Usuariotxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Usuariotxt.setForeground(new java.awt.Color(102, 102, 102));
        Usuariotxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Usuariotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuariotxtActionPerformed(evt);
            }
        });
        Usuariotxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UsuariotxtKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Usuariotxt, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(Usuariotxt, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        Contraseña1txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Contraseña1txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Contraseña1txtKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contraseña1txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(Contraseña1txt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        Confirmarbtn.setBackground(new java.awt.Color(211, 84, 0));
        Confirmarbtn.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        Confirmarbtn.setForeground(new java.awt.Color(255, 255, 255));
        Confirmarbtn.setText("Aceptar");
        Confirmarbtn.setBorder(null);
        Confirmarbtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aprovechar.png"))); // NOI18N
        Confirmarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarbtnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Confirmar Contraseña");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        Contraseña2txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Contraseña2txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Contraseña2txtKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contraseña2txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(Contraseña2txt, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton2.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel6)))
                .addGap(0, 99, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Confirmarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton2)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(24, 24, 24)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Confirmarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 134, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Contraseña1txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Contraseña1txtKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            Contraseña2txt.requestFocus();
        }
    }//GEN-LAST:event_Contraseña1txtKeyPressed

    private void ConfirmarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarbtnActionPerformed
        // TODO add your handling code here:
        if (Contraseña1txt.getPassword() != Contraseña2txt.getPassword()) {
            JOptionPane.showMessageDialog(null, "La contraseña no es la misma, por favor verificar nuevamente ");
        }
        usuario = Usuariotxt.getText();
        System.out.println("1 Usuario" + usuario);
        char[] contraseña1 = Contraseña1txt.getPassword();
        for (int i = 0; i < contraseña1.length; i++) {
            pass_concatenada2 = pass_concatenada2 + contraseña1[i];
            //    System.out.println(contraseña1[i]);
        }
        char[] contraseña2 = Contraseña2txt.getPassword();
        for (int i = 0; i < contraseña2.length; i++) {
            pass_concatenada = pass_concatenada + contraseña2[i];
            System.out.println(pass_concatenada);
            System.out.println(contraseña2[i]);
        }
        if (pass_concatenada.equals(pass_concatenada2)) {
            String xx;
            xx = compresor.comprimir(pass_concatenada);
            System.out.println("Esta si:" + xx);
            //acá se actualiza la contraseña
        }
        Menu3 menux = new Menu3();
        menux.setVisible(true);
        dispose();
    }//GEN-LAST:event_ConfirmarbtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Ingreso ingreso = new Ingreso();
        ingreso.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void UsuariotxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UsuariotxtKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            usuario = Usuariotxt.getText();
            Contraseña1txt.setText("");
            Contraseña1txt.requestFocus();
        }
    }//GEN-LAST:event_UsuariotxtKeyPressed

    private void UsuariotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuariotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuariotxtActionPerformed

    private void Contraseña2txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Contraseña2txtKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_Contraseña2txtKeyPressed

    boolean modoOscuro = false;

    private void Pintar(Color colorbotones, String imagen, Color colortexto, Color colorlabel, Color colorbase, Color colorfondo, Color colorcontraseña) {
        panel.setPanelBase(jPanel2);
        panel.setColorBase(colorbase);
        panel.getPanelBase();
        panel.setPanelFondo(jPanel1);
        panel.setColorFondo(colorfondo);
        panel.getPanelFondo();
        boton.setBoton(Confirmarbtn);
        boton.setColorBoton(colorbotones);
        boton.getBoton();
        text.setText(Usuariotxt);
        text.setColorTexto(colortexto);
        text.getText();
        password.setContraseña(Contraseña1txt);
        password.setColorContaseña(colorcontraseña);
        password.getContraseña();
        password.setContraseña(Contraseña2txt);
        password.setColorContaseña(colorcontraseña);
        password.getContraseña();
        label.setLabel(jLabel3);
        label.setColorLabel(colorlabel);
        label.getLabel();
        label.setLabel(jLabel2);
        label.setColorLabel(colorlabel);
        label.getLabel();
        label.setLabel(jLabel6);
        label.setColorLabel(colorlabel);
        label.getLabel();
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
            java.util.logging.Logger.getLogger(RecuperarContrasenia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecuperarContrasenia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecuperarContrasenia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecuperarContrasenia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecuperarContrasenia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Confirmarbtn;
    private javax.swing.JPasswordField Contraseña1txt;
    private javax.swing.JPasswordField Contraseña2txt;
    private javax.swing.JTextField Usuariotxt;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
