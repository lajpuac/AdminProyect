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
import ClasesSQL.VentaSQL;
import Conexion.ConexionBD;
import static Interfaz.LotePollo.loteAverio;
/*import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;*/
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
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
public class GenerarRecibo extends javax.swing.JFrame {

    ComponentePanel panel = new ComponentePanel();
    ComponenteLabelText text = new ComponenteLabelText();
    ComponenteLabelText label = new ComponenteLabelText();
    ComponenteBoton boton = new ComponenteBoton();
    ComponenteBotonIcon botonIcon = new ComponenteBotonIcon();
    MostrarEnInterfaces pruebasql = new MostrarEnInterfaces();
    MateriaPrimaSQL SQLMateriaPrima = new MateriaPrimaSQL();
    PersonalSQL personalSQL = new PersonalSQL();
    VentaSQL ventaSQL = new VentaSQL();
    String nit = "", nombre = "", direccion = "";
    Calendar FechaRecibo = new GregorianCalendar();
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
    public GenerarRecibo() {

        //   this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        transparenciButton();
        ventaSQL.MostraVentas(jTable);
        this.loteAverio = loteAverio;
    }

    public void transparenciButton() {
        Regresarbtn.setOpaque(false);
        Regresarbtn.setContentAreaFilled(false);
        Regresarbtn.setBorderPainted(false);
        Regresarbtn2.setOpaque(false);
        Regresarbtn2.setContentAreaFilled(false);
        Regresarbtn2.setBorderPainted(false);
        Verbtn.setOpaque(false);
        Verbtn.setContentAreaFilled(false);
        Verbtn.setBorderPainted(false);
        String texto2 = "Buscar";
        Verbtn.setToolTipText(texto2);
        String texto3 = "Regresar a la Ventana de Ventas";
        Regresarbtn.setToolTipText(texto3);
        String texto4 = "Generar Recibo";
        Regresarbtn2.setToolTipText(texto4);
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
        Regresarbtn = new javax.swing.JButton();
        Regresarbtn2 = new javax.swing.JButton();
        lotetxt1 = new javax.swing.JTextField();
        lotetxt2 = new javax.swing.JTextField();
        lotetxt3 = new javax.swing.JTextField();
        Verbtn = new javax.swing.JButton();

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
        jLabel3.setText("RECIBO");

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
        lotetxt.setText("Selección");
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

        Regresarbtn.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        Regresarbtn.setForeground(new java.awt.Color(102, 102, 102));
        Regresarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha.png"))); // NOI18N
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

        Regresarbtn2.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        Regresarbtn2.setForeground(new java.awt.Color(102, 102, 102));
        Regresarbtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/validando-billete.png"))); // NOI18N
        Regresarbtn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Regresarbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Regresarbtn2ActionPerformed(evt);
            }
        });

        lotetxt1.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lotetxt1.setForeground(new java.awt.Color(102, 102, 102));
        lotetxt1.setText("Nombre");
        lotetxt1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lotetxt1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        lotetxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lotetxt1ActionPerformed(evt);
            }
        });
        lotetxt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lotetxt1KeyPressed(evt);
            }
        });

        lotetxt2.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lotetxt2.setForeground(new java.awt.Color(102, 102, 102));
        lotetxt2.setText("Nit");
        lotetxt2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lotetxt2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        lotetxt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lotetxt2ActionPerformed(evt);
            }
        });
        lotetxt2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lotetxt2KeyPressed(evt);
            }
        });

        lotetxt3.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lotetxt3.setForeground(new java.awt.Color(102, 102, 102));
        lotetxt3.setText("Dirección");
        lotetxt3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lotetxt3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        lotetxt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lotetxt3ActionPerformed(evt);
            }
        });
        lotetxt3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lotetxt3KeyPressed(evt);
            }
        });

        Verbtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Verbtn.setForeground(new java.awt.Color(102, 102, 102));
        Verbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ojo (4).png"))); // NOI18N
        Verbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Regresarbtn)
                .addGap(262, 262, 262))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lotetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(707, 707, 707)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EliminarClientebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EliminarClientebtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Regresarbtn2)
                                .addGap(279, 279, 279))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lotetxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Verbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(lotetxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lotetxt1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(914, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(EliminarClientebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EliminarClientebtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel3))
                            .addComponent(Regresarbtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lotetxt2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Verbtn, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lotetxt3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(lotetxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Regresarbtn2)
                            .addComponent(lotetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(435, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(21, 21, 21)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
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
        Ventas mp = new Ventas();
        mp.setVisible(true);
        dispose();
    }//GEN-LAST:event_RegresarbtnActionPerformed

    private void lotetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lotetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lotetxtActionPerformed


    private void lotetxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lotetxtKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            loteAverio = lotetxt.getText();

        }
    }//GEN-LAST:event_lotetxtKeyPressed

    private void RegresarbtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RegresarbtnKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegresarbtnKeyPressed

    private void Regresarbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Regresarbtn2ActionPerformed
        // TODO add your handling code here:
        nit = lotetxt2.getText();
        nombre = lotetxt1.getText();
        direccion = lotetxt3.getText();
        System.out.println("Nit" + nit);
        System.out.println("Nombre" + nombre);
        System.out.println("Direccion" + direccion);
        personalSQL.InsertarDatos(nit, nombre, direccion);
        int filaseleccionada;

        try {

            filaseleccionada = jTable.getSelectedRow();

            if (filaseleccionada == -1) {

                JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");

            } else {

                DefaultTableModel modelotabla = (DefaultTableModel) jTable.getModel();

                String codigo = (String) modelotabla.getValueAt(filaseleccionada, 0);
                lotetxt.setText(codigo);
                loteAverio = lotetxt.getText();
                System.out.println(loteAverio);
                //  SQLMateriaPrima.DeleteMateriaPrima(loteAverio);

            }

        } catch (HeadlessException ex) {

            JOptionPane.showMessageDialog(null, "Error: " + ex + "\nInténtelo nuevamente", " .::Error En la Operacion::.", JOptionPane.ERROR_MESSAGE);

        }

        /////////////RECIBO PDF
     /*   Document documento = new Document();

        try {
            String ruta = System.getProperty("user.home");
            // PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/OneDrive/Desktop/Reporte_Alumnos2.pdf"));
            String destino = "Recibo.pdf";
            PdfWriter.getInstance(documento, new FileOutputStream(destino));
            documento.open();
            //ENCABEZADO
            Phrase p = new Phrase("CRIANZA Y VENTA DE POLLO DON CRIOLLO\n");
            documento.add(p);
            Phrase p2 = new Phrase("2DA AVENIDA A, 4-62 ZONA 1. CANTEL, QUETZALTENANGO.\n");
            documento.add(p2);
            Phrase p3 = new Phrase("RECIBO DE COMPRA\n");
            documento.add(p3);
            Phrase p4 = new Phrase("FECHA:" + " " + FechaRecibo.get(Calendar.DAY_OF_MONTH) + " " + FechaRecibo.get(Calendar.MONTH) + " " + FechaRecibo.get(Calendar.YEAR) + "\n");
            documento.add(p4);
            Phrase p5 = new Phrase("HORA:" + " " + FechaRecibo.get(Calendar.HOUR_OF_DAY) + " " + ":" + " " + FechaRecibo.get(Calendar.MINUTE) + " " + ":" + " " + FechaRecibo.get(Calendar.SECOND) + "\n");
            documento.add(p5);
            Phrase p6 = new Phrase("DATOS DE CLIENTE:" + "\n");
            documento.add(p6);
            Phrase p7 = new Phrase("NOMBRE:" + " " + nombre + " " + "\n");
            documento.add(p7);
            Phrase p8 = new Phrase("NIT:" + " " + nit + " " + "\n");
            documento.add(p8);
            Phrase p9 = new Phrase("DIRECCION:" + " " + direccion + " " + "\n");
            documento.add(p9);
            PdfPTable tabla = new PdfPTable(4);
            tabla.addCell("PRODUCTO");
            tabla.addCell("CANTIDAD");
            tabla.addCell("TOTAL");
            tabla.addCell("FECHA");

            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Analisis2", "root", "1234");
                PreparedStatement pst = cn.prepareStatement("select Producto, Cantidad, Total, Fecha from venta where idVenta =('" + loteAverio + "')");

                ResultSet rs = pst.executeQuery();

                if (rs.next()) {

                    do {
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                    } while (rs.next());
                    documento.add(tabla);
                }

            } catch (DocumentException e) {
            }
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte creado.");
        } catch (DocumentException e) {
        }*/

    }//GEN-LAST:event_Regresarbtn2ActionPerformed

    private void lotetxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lotetxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lotetxt1ActionPerformed

    private void lotetxt1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lotetxt1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lotetxt1KeyPressed

    private void lotetxt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lotetxt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lotetxt2ActionPerformed

    private void lotetxt2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lotetxt2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lotetxt2KeyPressed

    private void lotetxt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lotetxt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lotetxt3ActionPerformed

    private void lotetxt3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lotetxt3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lotetxt3KeyPressed

    private void VerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerbtnActionPerformed
        // TODO add your handling code here:
        nit = lotetxt2.getText();
        personalSQL.BuscarClienteNit(lotetxt1, lotetxt1, lotetxt3, nit);
    }//GEN-LAST:event_VerbtnActionPerformed
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
            java.util.logging.Logger.getLogger(GenerarRecibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenerarRecibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenerarRecibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenerarRecibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new GenerarRecibo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EliminarClientebtn;
    private javax.swing.JButton EliminarClientebtn1;
    private javax.swing.JButton Regresarbtn;
    private javax.swing.JButton Regresarbtn2;
    private javax.swing.JButton Verbtn;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField lotetxt;
    private javax.swing.JTextField lotetxt1;
    private javax.swing.JTextField lotetxt2;
    private javax.swing.JTextField lotetxt3;
    // End of variables declaration//GEN-END:variables
}
