package com.mycompany.ferreteria.igu;

import com.mycompany.ferreteria.logica.Controladora;
import com.mycompany.ferreteria.logica.Distribuidor;
import java.awt.Component;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

public class PanelDistribuidores extends javax.swing.JFrame {

    int XMouse, YMouse;
    Controladora control = null;
    Distribuidor distri;
    int idDistribuidor;

    public PanelDistribuidores() {
        initComponents();
        control = new Controladora();
        agregarEventoTabla();
        inhabilitarEditar();
        inhabilitarCancelar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        panelPrin = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDistribuidor = new javax.swing.JTextField();
        txtNumCel = new javax.swing.JTextField();
        txtRepresentante = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        cmbMetPago = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtGanancia = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDistribuidores = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        panelSuperior = new javax.swing.JPanel();
        btnAtras1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnAtras2 = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelPrin.setBackground(new java.awt.Color(250, 250, 250));
        panelPrin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Distribuidor: ");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Representante: ");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Num. Telefono: ");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Email: ");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Direccion/Localidad: ");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Metodo de pago: ");

        cmbMetPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "EFECTIVO", "TRANSFERENCIA", "CHEQUE" }));
        cmbMetPago.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));

        btnGuardar.setBackground(new java.awt.Color(21, 101, 192));
        btnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/add distri.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setToolTipText("Guardar Distribuidor");
        btnGuardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(255, 255, 0));
        btnEditar.setForeground(new java.awt.Color(0, 0, 0));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setToolTipText("Editar Distribuidor");
        btnEditar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(198, 40, 40));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar.png"))); // NOI18N
        btnCancelar.setToolTipText("Cancelar Cambios");
        btnCancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("% Ganancia: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbMetPago, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRepresentante)
                                    .addComponent(txtDistribuidor)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmail)
                                    .addComponent(txtNumCel)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(4, 4, 4)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtGanancia, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(13, 13, 13))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDistribuidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNumCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtGanancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbMetPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        panelPrin.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 42, 300, 340));

        jPanel4.setBackground(new java.awt.Color(250, 250, 250));

        tablaDistribuidores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaDistribuidores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(tablaDistribuidores);

        btnEliminar.setBackground(new java.awt.Color(198, 40, 40));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/borrar.png"))); // NOI18N
        btnEliminar.setToolTipText("Borrar Dsitribuidor");
        btnEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        panelPrin.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 42, 600, 340));

        panelSuperior.setBackground(new java.awt.Color(250, 250, 250));
        panelSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelSuperiorMouseDragged(evt);
            }
        });
        panelSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelSuperiorMousePressed(evt);
            }
        });

        btnAtras1.setBackground(new java.awt.Color(158, 158, 158));
        btnAtras1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/atras.png"))); // NOI18N
        btnAtras1.setToolTipText("Atras");
        btnAtras1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAtras1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtras1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Distribuidores");

        btnAtras2.setBackground(new java.awt.Color(153, 153, 153));
        btnAtras2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salir.png"))); // NOI18N
        btnAtras2.setToolTipText("Salir del Programa");
        btnAtras2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAtras2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtras2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtras2ActionPerformed(evt);
            }
        });

        btnMinimizar.setBackground(new java.awt.Color(158, 158, 158));
        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/minimizar.png"))); // NOI18N
        btnMinimizar.setToolTipText("Minimizar");
        btnMinimizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addContainerGap(332, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(212, 212, 212)
                .addComponent(btnAtras1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtras2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelSuperiorLayout.setVerticalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperiorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAtras1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnAtras2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelPrin.add(panelSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (tablaDistribuidores.getRowCount() > 0) {
            if (tablaDistribuidores.getSelectedRow() != -1) {
                int fila = tablaDistribuidores.getSelectedRow();
                if (fila != -1) {
                    idDistribuidor = Integer.parseInt(tablaDistribuidores.getValueAt(fila, 0).toString());
                    control.borrarDistribuidor(idDistribuidor);
                    cargarTablaDistri();
                }

            }
        }


    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // tomamos los datos del formulario
        String distribuidor = txtDistribuidor.getText();
        String representante = txtRepresentante.getText();
        String email = txtEmail.getText();
        String numCel = txtNumCel.getText();
        String direccion = txtDireccion.getText();
        String gananciaTexto = txtGanancia.getText();
        String metPago = (String) cmbMetPago.getSelectedItem();

        // transformamos ganancia de String a Integer
        int ganancia = 0;
        try {
            ganancia = Integer.parseInt(gananciaTexto);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "La ganancia debe ser un número entero válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // guardamos los datos en la DB, limpiamos el formulario y recargamos la tabla
        control.guardarDistibuidor(distribuidor, representante, email, numCel, direccion, ganancia, metPago);
        limpiarFormulario();
        cargarTablaDistri();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        idDistribuidor = this.distri.getIdDistribuidor();
        String distribuidor = txtDistribuidor.getText();
        String representante = txtRepresentante.getText();
        String email = txtEmail.getText();
        String numCel = txtNumCel.getText();
        String direccion = txtDireccion.getText();
        String gananciaTexto = txtGanancia.getText();
        String metPago = (String) cmbMetPago.getSelectedItem();

        //  transformamos la ganancia de String a Integer
        int ganancia = 0;
        try {
            ganancia = Integer.parseInt(gananciaTexto);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "La ganancia debe ser un número entero válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // tomamos los valores actualizados del formulario, los guardamos y cerramos el formulario
        control.modificarDistibuidor(distri, idDistribuidor, distribuidor, representante, email, numCel, direccion, ganancia, metPago);
        JOptionPane.showMessageDialog(this, "Distribuidor actualizado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        limpiarFormulario();
        cargarTablaDistri();
        inhabilitarEditar();
        habilitarGuardar();
        inhabilitarCancelar();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // cargamos la tabla al abrir el panel
        cargarTablaDistri();
    }//GEN-LAST:event_formWindowOpened

    private void btnAtras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtras1ActionPerformed
        // volvemos al menu principal y cerramos el panel
        MenuPrincipal pantalla = new MenuPrincipal();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnAtras1ActionPerformed

    private void panelSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSuperiorMousePressed
        XMouse = evt.getX();
        YMouse = evt.getY();
    }//GEN-LAST:event_panelSuperiorMousePressed

    private void panelSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSuperiorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - XMouse, y - YMouse);
    }//GEN-LAST:event_panelSuperiorMouseDragged

    private void btnAtras2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtras2ActionPerformed
        int opcion = JOptionPane.showConfirmDialog(
                this,
                "¿Seguro que deseas salir del programa?",
                "Confirmar salida",
                JOptionPane.YES_NO_OPTION
        );

        if (opcion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnAtras2ActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        habilitarGuardar();
        inhabilitarCancelar();
        inhabilitarEditar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void limpiarFormulario() {
        // limpiamos el formulario
        txtDistribuidor.setText("");
        txtRepresentante.setText("");
        txtEmail.setText("");
        txtNumCel.setText("");
        txtDireccion.setText("");
        txtGanancia.setText("");
        cmbMetPago.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras1;
    private javax.swing.JButton btnAtras2;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JComboBox<String> cmbMetPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JPanel panelPrin;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JTable tablaDistribuidores;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDistribuidor;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGanancia;
    private javax.swing.JTextField txtNumCel;
    private javax.swing.JTextField txtRepresentante;
    // End of variables declaration//GEN-END:variables

    private void cargarTablaDistri() {
        // creamos el modelo de la tabla
        DefaultTableModel tablaModelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        // columnas de la tabla
        String titulos[] = {"idDistribuidor", "Distribuidor", "Representante", "Telefono", "Email", "Direccion", "Ganancia", "Met. Pago"};
        tablaModelo.setColumnIdentifiers(titulos);
        // traemos los distribuidores de la DB y los cargamos en la tabla
        List<Distribuidor> listaDistribuidor = control.traerDistribuidores();

        if (listaDistribuidor != null) {
            for (Distribuidor distri : listaDistribuidor) {
                Object[] objeto = {
                    distri.getIdDistribuidor(),
                    distri.getNombre(),
                    distri.getRepresentante(),
                    distri.getNumCel(),
                    distri.getEmail(),
                    distri.getDireccion(),
                    distri.getGanancia(),
                    distri.getMetPago()
                };
                tablaModelo.addRow(objeto);
            }
        }

        tablaDistribuidores.setModel(tablaModelo);
        ajustarAnchoColumnas(tablaDistribuidores);
        // ocultamos la columna del ID
        tablaDistribuidores.getColumnModel().getColumn(0).setMinWidth(0);
        tablaDistribuidores.getColumnModel().getColumn(0).setMaxWidth(0);
        tablaDistribuidores.getColumnModel().getColumn(0).setWidth(0);
    }

    private void agregarEventoTabla() {
        tablaDistribuidores.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaDistribuidoresMouseClicked(evt);
            }
        });
    }

    private void tablaDistribuidoresMouseClicked(java.awt.event.MouseEvent evt) {
        int fila = tablaDistribuidores.getSelectedRow();
        if (fila != -1) {
            idDistribuidor = Integer.parseInt(tablaDistribuidores.getValueAt(fila, 0).toString());
            distri = control.traerDistribuidor(idDistribuidor);

            if (distri != null) {
                txtDistribuidor.setText(distri.getNombre());
                txtRepresentante.setText(distri.getRepresentante());
                txtEmail.setText(distri.getEmail());
                txtNumCel.setText(distri.getNumCel());
                txtDireccion.setText(distri.getDireccion());
                txtGanancia.setText(String.valueOf(distri.getGanancia()));

                // Manejo seguro del método de pago
                String metodoPago = distri.getMetPago();
                if (metodoPago == null || metodoPago.trim().isEmpty()) {
                    cmbMetPago.setSelectedIndex(0);
                } else if (metodoPago.equalsIgnoreCase("EFECTIVO")) {
                    cmbMetPago.setSelectedIndex(1);
                } else if (metodoPago.equalsIgnoreCase("TRANSFERENCIA")) {
                    cmbMetPago.setSelectedIndex(2);
                } else if (metodoPago.equalsIgnoreCase("CHEQUE")) {
                    cmbMetPago.setSelectedIndex(3);
                } else {
                    cmbMetPago.setSelectedIndex(0);
                }
            }
        }
        habilitarEditar();
        habilitarCancelar();
        inhabilitarGuardar();
    }
    
    private void ajustarAnchoColumnas(JTable table) {
        final int margen = 10; // Espacio extra a la derecha
        for (int col = 0; col < table.getColumnCount(); col++) {
            int anchoMax = 50; // Valor mínimo
            for (int row = 0; row < table.getRowCount(); row++) {
                TableCellRenderer renderer = table.getCellRenderer(row, col);
                Component comp = table.prepareRenderer(renderer, row, col);
                anchoMax = Math.max(comp.getPreferredSize().width + margen, anchoMax);
            }

            // También consideramos el tamaño del encabezado
            TableCellRenderer headerRenderer = table.getTableHeader().getDefaultRenderer();
            Component headerComp = headerRenderer.getTableCellRendererComponent(
                    table, table.getColumnName(col), false, false, 0, col);
            anchoMax = Math.max(headerComp.getPreferredSize().width + margen, anchoMax);

            // Aplicamos el ancho calculado
            table.getColumnModel().getColumn(col).setPreferredWidth(anchoMax);
        }
    }
    
    private void inhabilitarEditar(){
        btnEditar.setEnabled(false); 
    }
    
    private void habilitarEditar(){
        btnEditar.setEnabled(true); 
    }

    private void inhabilitarGuardar(){
        btnGuardar.setEnabled(false); 
    }
    
    private void habilitarGuardar(){
        btnGuardar.setEnabled(true); 
    }
    
    private void inhabilitarCancelar(){
        btnCancelar.setEnabled(false); 
        limpiarFormulario();
    }
    
    private void habilitarCancelar(){
        btnCancelar.setEnabled(true); 
    }
}
