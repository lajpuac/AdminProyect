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
import ClasesInterfaz.ComponenteRadioButon;
import ClasesSQL.UsuarioSQL;
import Usuario.Compresor;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import sun.security.util.Password;

/**
 *
 * @author jenif
 */
public class CrearCuenta extends javax.swing.JFrame {

    int IdUsuario = 0;
    String usuario = "", correo_electronico = "", nombres = "", apellidos = "", puesto = "";
    Password contraseña3;
    String pass_concatenada = "", pass_concatenada2 = "";
    boolean verificacion;
    Compresor compresor = new Compresor();
    UsuarioSQL usuarioSQL = new UsuarioSQL();
    ComponentePanel panel = new ComponentePanel();
    ComponenteLabelText text = new ComponenteLabelText();
    ComponenteLabelText label = new ComponenteLabelText();
    ComponenteBoton boton = new ComponenteBoton();
    ComponenteBotonIcon botonIcon = new ComponenteBotonIcon();
    ComponenteContraseña password = new ComponenteContraseña();
    ComponenteRadioButon radio = new ComponenteRadioButon();
    ArrayList<String> listapuesto = usuarioSQL.SeleccionarPuestos();

    /**
     * Creates new form Menu
     */
    public CrearCuenta() {

        //this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        transparenciButton();
        for (String nombrepuesto : listapuesto) {
            PuestoLaboralcmbx.addItem(nombrepuesto);
        }
    }

    public void transparenciButton() {
        jButton3.setOpaque(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setBorderPainted(false);
        jButton1.setOpaque(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setBorderPainted(false);
        jButton2.setOpaque(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setBorderPainted(false);
        String texto = "Regresar a Ingreso del sistema";
        jButton3.setToolTipText(texto);
        String texto2 = "Crear Cuenta";
        CrearCuentabtn.setToolTipText(texto2);
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
        CrearCuentabtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Usuariotxt = new javax.swing.JTextField();
        Contraseñatxt = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        Correotxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ApellidoColaboradortxt = new javax.swing.JTextField();
        NombreColaboradortxt = new javax.swing.JTextField();
        Supervisorrb = new javax.swing.JRadioButton();
        Contraseñatxt1 = new javax.swing.JPasswordField();
        PuestoLaboralcmbx = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(249, 181, 114));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(249, 181, 114));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 500));

        CrearCuentabtn.setBackground(new java.awt.Color(255, 255, 204));
        CrearCuentabtn.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        CrearCuentabtn.setForeground(new java.awt.Color(102, 102, 102));
        CrearCuentabtn.setText("Crear Cuenta");
        CrearCuentabtn.setBorder(null);
        CrearCuentabtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CrearCuentabtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aprovechar.png"))); // NOI18N
        CrearCuentabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearCuentabtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Candara Light", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Contraseña");

        Usuariotxt.setBackground(new java.awt.Color(236, 255, 224));
        Usuariotxt.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        Usuariotxt.setForeground(new java.awt.Color(102, 102, 102));
        Usuariotxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        Contraseñatxt.setBackground(new java.awt.Color(236, 255, 224));
        Contraseñatxt.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        Contraseñatxt.setForeground(new java.awt.Color(102, 102, 102));
        Contraseñatxt.setText("Contraseña");
        Contraseñatxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Contraseñatxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContraseñatxtActionPerformed(evt);
            }
        });
        Contraseñatxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ContraseñatxtKeyPressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Candara Light", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Confirmar Contraseña");

        Correotxt.setBackground(new java.awt.Color(236, 255, 224));
        Correotxt.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        Correotxt.setForeground(new java.awt.Color(102, 102, 102));
        Correotxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Correotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorreotxtActionPerformed(evt);
            }
        });
        Correotxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CorreotxtKeyPressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Gadugi", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("REGISTRO");

        ApellidoColaboradortxt.setBackground(new java.awt.Color(236, 255, 224));
        ApellidoColaboradortxt.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        ApellidoColaboradortxt.setForeground(new java.awt.Color(102, 102, 102));
        ApellidoColaboradortxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ApellidoColaboradortxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoColaboradortxtActionPerformed(evt);
            }
        });
        ApellidoColaboradortxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ApellidoColaboradortxtKeyPressed(evt);
            }
        });

        NombreColaboradortxt.setBackground(new java.awt.Color(236, 255, 224));
        NombreColaboradortxt.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        NombreColaboradortxt.setForeground(new java.awt.Color(102, 102, 102));
        NombreColaboradortxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        NombreColaboradortxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        NombreColaboradortxt.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        NombreColaboradortxt.setSelectionColor(new java.awt.Color(255, 102, 51));
        NombreColaboradortxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NombreColaboradortxtMouseClicked(evt);
            }
        });
        NombreColaboradortxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreColaboradortxtActionPerformed(evt);
            }
        });
        NombreColaboradortxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NombreColaboradortxtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombreColaboradortxtKeyTyped(evt);
            }
        });

        Supervisorrb.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        Supervisorrb.setForeground(new java.awt.Color(102, 102, 102));
        Supervisorrb.setText("Supervisor");
        Supervisorrb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupervisorrbActionPerformed(evt);
            }
        });

        Contraseñatxt1.setBackground(new java.awt.Color(236, 255, 224));
        Contraseñatxt1.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        Contraseñatxt1.setForeground(new java.awt.Color(102, 102, 102));
        Contraseñatxt1.setText("Contraseña");
        Contraseñatxt1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Contraseñatxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Contraseñatxt1ActionPerformed(evt);
            }
        });
        Contraseñatxt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Contraseñatxt1KeyPressed(evt);
            }
        });

        PuestoLaboralcmbx.setBackground(new java.awt.Color(236, 255, 224));
        PuestoLaboralcmbx.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        PuestoLaboralcmbx.setForeground(new java.awt.Color(102, 102, 102));
        PuestoLaboralcmbx.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PuestoLaboralcmbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PuestoLaboralcmbxActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(236, 255, 224));
        jButton1.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setText("+");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 102, 102));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha.png"))); // NOI18N
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ojo (2).png"))); // NOI18N
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Apellidos");

        jLabel3.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Puesto Laboral");

        jLabel5.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Usuario");

        jLabel6.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Correo Electrónico");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel11))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Contraseñatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Contraseñatxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Supervisorrb, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CrearCuentabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(PuestoLaboralcmbx, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                    .addComponent(jButton1))
                                .addComponent(NombreColaboradortxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ApellidoColaboradortxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Correotxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Usuariotxt, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addGap(26, 116, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(103, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(NombreColaboradortxt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ApellidoColaboradortxt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Usuariotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PuestoLaboralcmbx, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Correotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Contraseñatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Supervisorrb)
                    .addComponent(jLabel4))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Contraseñatxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addComponent(CrearCuentabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 892, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsuariotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuariotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuariotxtActionPerformed

    private void UsuariotxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UsuariotxtKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            usuario = Usuariotxt.getText();
            usuarioSQL.ComparacioConOtroUsuarios(usuario);
            //   PuestoLaboraltxt.setText("");
            //  PuestoLaboraltxt.requestFocus();
        }
    }//GEN-LAST:event_UsuariotxtKeyPressed

    private void ContraseñatxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ContraseñatxtKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            Contraseñatxt1.requestFocus();
        }
    }//GEN-LAST:event_ContraseñatxtKeyPressed

    private void CrearCuentabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearCuentabtnActionPerformed
        // TODO add your handling code here:
        nombres = NombreColaboradortxt.getText();
        apellidos = ApellidoColaboradortxt.getText();
        usuario = Usuariotxt.getText();
        correo_electronico = Correotxt.getText();
        puesto = (String) PuestoLaboralcmbx.getSelectedItem();
        char[] contraseña1 = Contraseñatxt.getPassword();

        for (int i = 0; i < contraseña1.length; i++) {
            pass_concatenada2 = pass_concatenada2 + contraseña1[i];
            //    System.out.println(contraseña1[i]);
        }
        char[] contraseña2 = Contraseñatxt1.getPassword();
        for (int i = 0; i < contraseña2.length; i++) {
            pass_concatenada = pass_concatenada + contraseña2[i];
            System.out.println(pass_concatenada);
            System.out.println(contraseña2[i]);
        }

        System.out.println("Nombre:" + nombres);
        System.out.println("Apellidos" + apellidos);
        System.out.println("Usuario" + usuario);
        System.out.println("Puesto" + puesto);
        System.out.println("Correo Electronico" + correo_electronico);
        System.out.println("Contraseña" + pass_concatenada);
        System.out.println("Verificación" + verificacion);
        if (pass_concatenada.equals(pass_concatenada2)) {

            String xx;
            xx = compresor.comprimir(pass_concatenada);
            System.out.println("Esta si:" + xx);

            usuarioSQL.InsertarUsuario(nombres, apellidos, verificacion, usuario, xx, puesto, correo_electronico);
            Ingreso ingreso = new Ingreso();
            ingreso.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "La contraseña no coincide, verifique nuevamente");
        }
        pass_concatenada = "";
        pass_concatenada2 = "";

    }//GEN-LAST:event_CrearCuentabtnActionPerformed

    private void ContraseñatxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContraseñatxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContraseñatxtActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Ingreso ingreso = new Ingreso();
        ingreso.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void CorreotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorreotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorreotxtActionPerformed

    private void CorreotxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CorreotxtKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            correo_electronico = Correotxt.getText();
            Contraseñatxt.setText("");
            Contraseñatxt.requestFocus();
        }
    }//GEN-LAST:event_CorreotxtKeyPressed

    private void ApellidoColaboradortxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoColaboradortxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidoColaboradortxtActionPerformed

    private void ApellidoColaboradortxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApellidoColaboradortxtKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            apellidos = ApellidoColaboradortxt.getText();
            Usuariotxt.setText("");
            Usuariotxt.requestFocus();
        }
    }//GEN-LAST:event_ApellidoColaboradortxtKeyPressed

    private void NombreColaboradortxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreColaboradortxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreColaboradortxtActionPerformed

    private void NombreColaboradortxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreColaboradortxtKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            nombres = NombreColaboradortxt.getText();
            NombreColaboradortxt.setText("");
            ApellidoColaboradortxt.setText("");
            ApellidoColaboradortxt.requestFocus();
        }
    }//GEN-LAST:event_NombreColaboradortxtKeyPressed
    boolean modoOscuro = false;

    private void Pintar(Color colorbotones, String imagen, Color colortexto, Color colorlabel, Color colorbase, Color colorfondo, Color colorcontraseña) {

    }
    private void Contraseñatxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Contraseñatxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Contraseñatxt1ActionPerformed

    private void Contraseñatxt1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Contraseñatxt1KeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_Contraseñatxt1KeyPressed

    private void SupervisorrbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupervisorrbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SupervisorrbActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String puesto = JOptionPane.showInputDialog("Ingrese el nuevo puesto");
        PuestoLaboralcmbx.addItem(puesto);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Contraseñatxt.setEchoChar((char) 0);
        Contraseñatxt1.setEchoChar((char) 0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void PuestoLaboralcmbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PuestoLaboralcmbxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PuestoLaboralcmbxActionPerformed

    private void NombreColaboradortxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreColaboradortxtKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreColaboradortxtKeyTyped

    private void NombreColaboradortxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NombreColaboradortxtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreColaboradortxtMouseClicked

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
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new CrearCuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidoColaboradortxt;
    private javax.swing.JPasswordField Contraseñatxt;
    private javax.swing.JPasswordField Contraseñatxt1;
    private javax.swing.JTextField Correotxt;
    private javax.swing.JButton CrearCuentabtn;
    private javax.swing.JTextField NombreColaboradortxt;
    private javax.swing.JComboBox<String> PuestoLaboralcmbx;
    private javax.swing.JRadioButton Supervisorrb;
    private javax.swing.JTextField Usuariotxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
