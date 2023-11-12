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
import ClasesSQL.MateriaPrimaSQL;
import ClasesSQL.MercaderiaSQL;
import ClasesSQL.PersonalSQL;
import ClasesSQL.ProveedorSQL;
import ClasesSQL.UpdateMateriaPrimaSQL;
import ClasesSQL.UsuarioSQL;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import javax.swing.ImageIcon;
import sun.security.util.Password;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sun.security.util.Password;
import java.util.Random;

/**
 *
 * @author jenif
 */
public class FaltasColaborador extends javax.swing.JFrame {

    double fiveDigits = 10000 + Math.random() * 90000;
    String loteAverio = "";
    String Usuario = "", Nombre = "", NumeroFaltas = "", Tipo = "", Descripcion = "";
    String nombreproveedor = "";
    int cantidad = 0, total = 0;
    ProveedorSQL proveedores = new ProveedorSQL();
    PersonalSQL personalSQL = new PersonalSQL();

    MateriaPrimaSQL SQLMateriaPrima = new MateriaPrimaSQL();
    Clases.MateriaPrima materiaprima = new Clases.MateriaPrima();
    UpdateMateriaPrimaSQL SQLUpdateMateriaPrima = new UpdateMateriaPrimaSQL();
    MercaderiaSQL mercaderiasql = new MercaderiaSQL();
    ArrayList<Clases.Proveedor> listaProveedores = proveedores.ConsultaProveedorNombre();
    ArrayList<Clases.MateriaPrima> listamateriaprima = new ArrayList<Clases.MateriaPrima>();
    ComponentePanel panel = new ComponentePanel();
    ComponenteLabelText text = new ComponenteLabelText();
    ComponenteLabelText label = new ComponenteLabelText();
    ComponenteBoton boton = new ComponenteBoton();
    ComponenteBotonIcon botonIcon = new ComponenteBotonIcon();
    Usuario usuario = new Usuario();
    UsuarioSQL usuarioSQL = new UsuarioSQL();
    Clases.Proveedor proveedor = new Clases.Proveedor();
    SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
    String fecha;

    public FaltasColaborador() {

        // this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        transparenciButton();

        Proveedorjcmb1.addItem("Horas");
        Proveedorjcmb1.addItem("Días");
        try {
            /*  for (String nombrepuesto : listapuesto) {
            PuestoLaboralcmbx.addItem(nombrepuesto);
            }*/
            mercaderiasql.ConsultaDeUsuario(Proveedorjcmb);
        } catch (SQLException ex) {
            Logger.getLogger(DetallePersonal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public FaltasColaborador(Usuario usuario) {

        //this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        transparenciButton();
        for (Clases.Proveedor prov : listaProveedores) {
            Proveedorjcmb.addItem(prov.getNombre());
        }
        this.usuario = usuario;
    }

    public void transparenciButton() {
        Buscarbtn.setOpaque(false);
        Buscarbtn.setContentAreaFilled(false);
        Buscarbtn.setBorderPainted(false);
        regresarbtn.setOpaque(false);
        regresarbtn.setContentAreaFilled(false);
        regresarbtn.setBorderPainted(false);
        String texto2 = "Regresar a Ventana de Trabajadores";
        regresarbtn.setToolTipText(texto2);
        String texto3 = "Buscar Nombre";
        Buscarbtn.setToolTipText(texto3);
        String texto4 = "Guardar Ausencia";
        Guardarbtn.setToolTipText(texto4);
        String texto5 = "Haga click para acceder a Eliminación de Ausencia";
        Guardarbtn2.setToolTipText(texto5);
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
        Cantidadtxt = new javax.swing.JTextField();
        FechaCalendar = new com.toedter.calendar.JCalendar();
        Proveedorjcmb = new javax.swing.JComboBox<>();
        CodigoAveriotxt = new javax.swing.JTextField();
        Buscarbtn = new javax.swing.JButton();
        regresarbtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Guardarbtn = new javax.swing.JButton();
        Guardarbtn2 = new javax.swing.JButton();
        Proveedorjcmb1 = new javax.swing.JComboBox<>();
        CodigoAveriotxt1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Guardarbtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(249, 181, 114));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(921, 670));
        jPanel1.setVerifyInputWhenFocusTarget(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(249, 181, 114));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cantidadtxt.setBackground(new java.awt.Color(236, 255, 224));
        Cantidadtxt.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        Cantidadtxt.setForeground(new java.awt.Color(102, 102, 102));
        Cantidadtxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Cantidadtxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Cantidadtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantidadtxtActionPerformed(evt);
            }
        });
        Cantidadtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CantidadtxtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CantidadtxtKeyTyped(evt);
            }
        });
        jPanel2.add(Cantidadtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 253, 43));
        jPanel2.add(FechaCalendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 240, 130));

        Proveedorjcmb.setBackground(new java.awt.Color(236, 255, 224));
        Proveedorjcmb.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        Proveedorjcmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario" }));
        Proveedorjcmb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Proveedorjcmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProveedorjcmbActionPerformed(evt);
            }
        });
        jPanel2.add(Proveedorjcmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 253, 42));

        CodigoAveriotxt.setEditable(false);
        CodigoAveriotxt.setBackground(new java.awt.Color(236, 255, 224));
        CodigoAveriotxt.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        CodigoAveriotxt.setForeground(new java.awt.Color(102, 102, 102));
        CodigoAveriotxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CodigoAveriotxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        CodigoAveriotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoAveriotxtActionPerformed(evt);
            }
        });
        CodigoAveriotxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CodigoAveriotxtKeyPressed(evt);
            }
        });
        jPanel2.add(CodigoAveriotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 253, 43));

        Buscarbtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Buscarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa (1).png"))); // NOI18N
        Buscarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarbtnActionPerformed(evt);
            }
        });
        jPanel2.add(Buscarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, -1, -1));

        regresarbtn.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        regresarbtn.setForeground(new java.awt.Color(102, 102, 102));
        regresarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha.png"))); // NOI18N
        regresarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarbtnActionPerformed(evt);
            }
        });
        jPanel2.add(regresarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 50, 40));

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setFont(new java.awt.Font("Gadugi", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("AUSENCIA DEL COLABORADOR");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        Guardarbtn.setBackground(new java.awt.Color(211, 84, 0));
        Guardarbtn.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        Guardarbtn.setForeground(new java.awt.Color(255, 255, 255));
        Guardarbtn.setText("Guardar");
        Guardarbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Guardarbtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aprovechar.png"))); // NOI18N
        Guardarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarbtnActionPerformed(evt);
            }
        });
        jPanel2.add(Guardarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, 144, 34));

        Guardarbtn2.setBackground(new java.awt.Color(211, 84, 0));
        Guardarbtn2.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        Guardarbtn2.setForeground(new java.awt.Color(255, 255, 255));
        Guardarbtn2.setText("Eliminar");
        Guardarbtn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Guardarbtn2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aprovechar.png"))); // NOI18N
        Guardarbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Guardarbtn2ActionPerformed(evt);
            }
        });
        jPanel2.add(Guardarbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 430, 144, 34));

        Proveedorjcmb1.setBackground(new java.awt.Color(244, 253, 251));
        Proveedorjcmb1.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        Proveedorjcmb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo" }));
        Proveedorjcmb1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Proveedorjcmb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Proveedorjcmb1ActionPerformed(evt);
            }
        });
        jPanel2.add(Proveedorjcmb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 240, 42));

        CodigoAveriotxt1.setBackground(new java.awt.Color(236, 255, 224));
        CodigoAveriotxt1.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        CodigoAveriotxt1.setForeground(new java.awt.Color(102, 102, 102));
        CodigoAveriotxt1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CodigoAveriotxt1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        CodigoAveriotxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoAveriotxt1ActionPerformed(evt);
            }
        });
        CodigoAveriotxt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CodigoAveriotxt1KeyPressed(evt);
            }
        });
        jPanel2.add(CodigoAveriotxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 520, 43));

        jLabel12.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Fecha de la ausencia");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 160, -1));

        jLabel13.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Detalle de la ausencia");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 170, -1));

        jLabel14.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Número de Faltas");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 150, -1));

        jLabel15.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Nombre");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 70, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 820, 520));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        Guardarbtn1.setBackground(new java.awt.Color(211, 84, 0));
        Guardarbtn1.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        Guardarbtn1.setForeground(new java.awt.Color(255, 255, 255));
        Guardarbtn1.setText("Guardar");
        Guardarbtn1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aprovechar.png"))); // NOI18N
        Guardarbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Guardarbtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(Guardarbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 410, 109, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CantidadtxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CantidadtxtKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cantidad = Integer.parseInt(Cantidadtxt.getText());

        }
    }//GEN-LAST:event_CantidadtxtKeyPressed

    private void CantidadtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantidadtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CantidadtxtActionPerformed
    List Proveedores = new ArrayList();

    static void obtener_proveedor(ArrayList<Integer> id, ArrayList<String> Proveedor) {
        int ID = 0;
        String proveedor = "";
        id.get(ID);
        Proveedor.get(Integer.parseInt(proveedor));
    }


    private void GuardarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarbtnActionPerformed
     
        Usuario = (String) Proveedorjcmb.getSelectedItem();
        Nombre = CodigoAveriotxt.getText();
        NumeroFaltas = Cantidadtxt.getText();
        Tipo = (String) Proveedorjcmb1.getSelectedItem();
        Descripcion = CodigoAveriotxt1.getText();
        fecha = f.format(FechaCalendar.getDate());

        System.out.println(Usuario);
        System.out.println(Nombre);
        System.out.println(NumeroFaltas);
        System.out.println(Tipo);
        System.out.println(Descripcion);
        System.out.println(fecha);
        personalSQL.InsertarFalta(Usuario, Nombre, NumeroFaltas, Tipo, Descripcion, fecha);
    }//GEN-LAST:event_GuardarbtnActionPerformed
    boolean modoOscuro = false;
    private void ProveedorjcmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProveedorjcmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProveedorjcmbActionPerformed

    private void CodigoAveriotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoAveriotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoAveriotxtActionPerformed

    private void CodigoAveriotxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CodigoAveriotxtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoAveriotxtKeyPressed
    private void Pintar(Color colorbotones, String imagen, Color colortexto, Color colorlabel, Color colorbase, Color colorfondo) {

    }

    private void CantidadtxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CantidadtxtKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_CantidadtxtKeyTyped

    private void BuscarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarbtnActionPerformed
        // TODO add your handling code here:
        Usuario = (String) Proveedorjcmb.getSelectedItem();
        System.out.println(Usuario);
        usuarioSQL.BusquedaNombre(CodigoAveriotxt, Usuario);
       
    }//GEN-LAST:event_BuscarbtnActionPerformed

    private void Guardarbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Guardarbtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Guardarbtn1ActionPerformed

    private void regresarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarbtnActionPerformed
        // TODO add your handling code here:
        Colaborador menu = new Colaborador();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_regresarbtnActionPerformed

    private void Guardarbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Guardarbtn2ActionPerformed
        // TODO add your handling code here:
        /* loteAverio = CodigoAveriotxt.getText();
     proveedor.setNombre((String) Proveedorjcmb.getSelectedItem());
        cantidad = Integer.parseInt(Cantidadtxt.getText());
        total = Integer.parseInt(Cantidadtxt1.getText());
        materiaprima.setLoteAverio(loteAverio);*/
        FaltasColaboradorVista lp = new FaltasColaboradorVista();
        lp.setVisible(true);
        dispose();
    }//GEN-LAST:event_Guardarbtn2ActionPerformed

    private void Proveedorjcmb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Proveedorjcmb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Proveedorjcmb1ActionPerformed

    private void CodigoAveriotxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoAveriotxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoAveriotxt1ActionPerformed

    private void CodigoAveriotxt1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CodigoAveriotxt1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoAveriotxt1KeyPressed

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
            java.util.logging.Logger.getLogger(FaltasColaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FaltasColaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FaltasColaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FaltasColaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FaltasColaborador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscarbtn;
    private javax.swing.JTextField Cantidadtxt;
    private javax.swing.JTextField CodigoAveriotxt;
    private javax.swing.JTextField CodigoAveriotxt1;
    private com.toedter.calendar.JCalendar FechaCalendar;
    private javax.swing.JButton Guardarbtn;
    private javax.swing.JButton Guardarbtn1;
    private javax.swing.JButton Guardarbtn2;
    private javax.swing.JComboBox<String> Proveedorjcmb;
    private javax.swing.JComboBox<String> Proveedorjcmb1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton regresarbtn;
    // End of variables declaration//GEN-END:variables
}
