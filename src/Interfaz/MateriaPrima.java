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
import ClasesSQL.ProveedorSQL;
import ClasesSQL.UpdateMateriaPrimaSQL;
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
public class MateriaPrima extends javax.swing.JFrame {

    double fiveDigits = 10000 + Math.random() * 90000;
    String loteAverio = "";
    String nombreproveedor = "";
    int cantidad = 0, total = 0;
    ProveedorSQL proveedores = new ProveedorSQL();
    MateriaPrimaSQL SQLMateriaPrima = new MateriaPrimaSQL();
    Clases.MateriaPrima materiaprima = new Clases.MateriaPrima();
    UpdateMateriaPrimaSQL SQLUpdateMateriaPrima = new UpdateMateriaPrimaSQL();

    ArrayList<Clases.Proveedor> listaProveedores = proveedores.ConsultaProveedorNombre();
    ArrayList<Clases.MateriaPrima> listamateriaprima = new ArrayList<Clases.MateriaPrima>();
    ComponentePanel panel = new ComponentePanel();
    ComponenteLabelText text = new ComponenteLabelText();
    ComponenteLabelText label = new ComponenteLabelText();
    ComponenteBoton boton = new ComponenteBoton();
    ComponenteBotonIcon botonIcon = new ComponenteBotonIcon();
    Usuario usuario = new Usuario();
    Clases.Proveedor proveedor = new Clases.Proveedor();

    public MateriaPrima() {

        //  this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        transparenciButton();
        for (Clases.Proveedor prov : listaProveedores) {
            Proveedorjcmb.addItem(prov.getNombre());
        }
    }

    public MateriaPrima(Usuario usuario) {

        // this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        transparenciButton();
        for (Clases.Proveedor prov : listaProveedores) {
            Proveedorjcmb.addItem(prov.getNombre());
        }
        this.usuario = usuario;
    }

    public void transparenciButton() {
        regresarbtn.setOpaque(false);
        regresarbtn.setContentAreaFilled(false);
        regresarbtn.setBorderPainted(false);
        String texto2 = "Regresar a Menú Principal";
        regresarbtn.setToolTipText(texto2);
        String texto3 = "Generar Código Automáticamente";
        GeneradorDeCodigo.setToolTipText(texto3);
        String texto4 = "Guardar Lote";
        Guardarbtn.setToolTipText(texto4);
        String texto5 = "Haga click para acceder a Eliminación de Lote";
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
        jLabel11 = new javax.swing.JLabel();
        FechaCalendar = new com.toedter.calendar.JCalendar();
        Proveedorjcmb = new javax.swing.JComboBox<>();
        CodigoAveriotxt = new javax.swing.JTextField();
        regresarbtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Guardarbtn = new javax.swing.JButton();
        Cantidadtxt1 = new javax.swing.JTextField();
        Guardarbtn2 = new javax.swing.JButton();
        Guardarbtn3 = new javax.swing.JButton();
        GeneradorDeCodigo = new javax.swing.JButton();
        Guardarbtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(123, 125, 125));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(921, 670));
        jPanel1.setVerifyInputWhenFocusTarget(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cantidadtxt.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        Cantidadtxt.setForeground(new java.awt.Color(102, 102, 102));
        Cantidadtxt.setText("Cantidad");
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
        jPanel2.add(Cantidadtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 253, 43));

        jLabel11.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Fecha de Ingreso");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, -1, -1));
        jPanel2.add(FechaCalendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, 125));

        Proveedorjcmb.setBackground(new java.awt.Color(244, 253, 251));
        Proveedorjcmb.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        Proveedorjcmb.setForeground(new java.awt.Color(102, 102, 102));
        Proveedorjcmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Proveedor", " ", " " }));
        Proveedorjcmb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Proveedorjcmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProveedorjcmbActionPerformed(evt);
            }
        });
        jPanel2.add(Proveedorjcmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 253, 42));

        CodigoAveriotxt.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        CodigoAveriotxt.setForeground(new java.awt.Color(102, 102, 102));
        CodigoAveriotxt.setText("Código de averío");
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
        jPanel2.add(CodigoAveriotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 253, 43));

        regresarbtn.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        regresarbtn.setForeground(new java.awt.Color(102, 102, 102));
        regresarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha.png"))); // NOI18N
        regresarbtn.setToolTipText("");
        regresarbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarbtnActionPerformed(evt);
            }
        });
        jPanel2.add(regresarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 60, 40));

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("MATERIA PRIMA ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        Guardarbtn.setBackground(new java.awt.Color(211, 84, 0));
        Guardarbtn.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        Guardarbtn.setForeground(new java.awt.Color(255, 255, 255));
        Guardarbtn.setText("Guardar");
        Guardarbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Guardarbtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aprovechar.png"))); // NOI18N
        Guardarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarbtnActionPerformed(evt);
            }
        });
        jPanel2.add(Guardarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 390, 144, 34));

        Cantidadtxt1.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        Cantidadtxt1.setForeground(new java.awt.Color(102, 102, 102));
        Cantidadtxt1.setText("Total");
        Cantidadtxt1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Cantidadtxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cantidadtxt1ActionPerformed(evt);
            }
        });
        Cantidadtxt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Cantidadtxt1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Cantidadtxt1KeyTyped(evt);
            }
        });
        jPanel2.add(Cantidadtxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 253, 43));

        Guardarbtn2.setBackground(new java.awt.Color(211, 84, 0));
        Guardarbtn2.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        Guardarbtn2.setForeground(new java.awt.Color(255, 255, 255));
        Guardarbtn2.setText("Eliminar");
        Guardarbtn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Guardarbtn2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aprovechar.png"))); // NOI18N
        Guardarbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Guardarbtn2ActionPerformed(evt);
            }
        });
        jPanel2.add(Guardarbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 430, 144, 34));

        Guardarbtn3.setBackground(new java.awt.Color(211, 84, 0));
        Guardarbtn3.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        Guardarbtn3.setForeground(new java.awt.Color(255, 255, 255));
        Guardarbtn3.setText("Actualizar");
        Guardarbtn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Guardarbtn3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aprovechar.png"))); // NOI18N
        Guardarbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Guardarbtn3ActionPerformed(evt);
            }
        });
        jPanel2.add(Guardarbtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 470, 144, 34));

        GeneradorDeCodigo.setBackground(new java.awt.Color(211, 84, 0));
        GeneradorDeCodigo.setFont(new java.awt.Font("Candara Light", 1, 16)); // NOI18N
        GeneradorDeCodigo.setForeground(new java.awt.Color(255, 255, 255));
        GeneradorDeCodigo.setText("Generar código");
        GeneradorDeCodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GeneradorDeCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneradorDeCodigoActionPerformed(evt);
            }
        });
        jPanel2.add(GeneradorDeCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, -1));

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
        loteAverio = CodigoAveriotxt.getText();
        proveedor.setNombre((String) Proveedorjcmb.getSelectedItem());
        cantidad = Integer.parseInt(Cantidadtxt.getText());
        total = Integer.parseInt(Cantidadtxt1.getText());

        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        String fecha;
        fecha = f.format(FechaCalendar.getDate());

        materiaprima.setLoteAverio(loteAverio);
        for (Clases.Proveedor prov : listaProveedores) {
            if (prov.getNombre().equals(proveedor.getNombre())) {
                proveedor.setIdProveedor(prov.getIdProveedor());
                materiaprima.setProveedor(prov);
            }
        }
        materiaprima.setUnidadExistente(cantidad);
        materiaprima.setFechaIngreso(fecha);
        materiaprima.setTotal(total);
        materiaprima.setUsuario(usuario);

        SQLMateriaPrima.InsertarMateriaPrima(materiaprima);
        //SQLMateriaPrima.InsertarMateriaPrima(loteAverio,cantidad,fecha,total,usuario);
        Cantidadtxt.setText("Cantidad");
        CodigoAveriotxt.setText("Código de averío");
        Cantidadtxt1.setText("Total");
        FechaCalendar.setDate(null);
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

    private void Guardarbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Guardarbtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Guardarbtn1ActionPerformed

    private void regresarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarbtnActionPerformed
        // TODO add your handling code here:
        Menu3 menu = new Menu3();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_regresarbtnActionPerformed

    private void Cantidadtxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cantidadtxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cantidadtxt1ActionPerformed

    private void Cantidadtxt1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cantidadtxt1KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            total = Integer.parseInt(Cantidadtxt1.getText());

        }
    }//GEN-LAST:event_Cantidadtxt1KeyPressed

    private void Cantidadtxt1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cantidadtxt1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Cantidadtxt1KeyTyped

    private void Guardarbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Guardarbtn2ActionPerformed
        // TODO add your handling code here:
        /* loteAverio = CodigoAveriotxt.getText();
     proveedor.setNombre((String) Proveedorjcmb.getSelectedItem());
        cantidad = Integer.parseInt(Cantidadtxt.getText());
        total = Integer.parseInt(Cantidadtxt1.getText());
        materiaprima.setLoteAverio(loteAverio);*/
        LotePollo lp = new LotePollo();
        lp.setVisible(true);
        dispose();
    }//GEN-LAST:event_Guardarbtn2ActionPerformed

    private void Guardarbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Guardarbtn3ActionPerformed
        // TODO add your handling code here:
        //  SQLUpdateMateriaPrima.ActualizarExistenciasDeMateriaPrima(EXIT_ON_CLOSE, loteAverio);
    }//GEN-LAST:event_Guardarbtn3ActionPerformed

    private void GeneradorDeCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneradorDeCodigoActionPerformed
        // TODO add your handling code here:
        SQLMateriaPrima.getFiveDigitsNumber();
        System.out.println(SQLMateriaPrima.getFiveDigitsNumber());
        String aux = String.valueOf(SQLMateriaPrima.getFiveDigitsNumber());
        CodigoAveriotxt.setText(aux);
    }//GEN-LAST:event_GeneradorDeCodigoActionPerformed

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
            java.util.logging.Logger.getLogger(MateriaPrima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MateriaPrima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MateriaPrima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MateriaPrima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MateriaPrima().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cantidadtxt;
    private javax.swing.JTextField Cantidadtxt1;
    private javax.swing.JTextField CodigoAveriotxt;
    private com.toedter.calendar.JCalendar FechaCalendar;
    private javax.swing.JButton GeneradorDeCodigo;
    private javax.swing.JButton Guardarbtn;
    private javax.swing.JButton Guardarbtn1;
    private javax.swing.JButton Guardarbtn2;
    private javax.swing.JButton Guardarbtn3;
    private javax.swing.JComboBox<String> Proveedorjcmb;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton regresarbtn;
    // End of variables declaration//GEN-END:variables
}