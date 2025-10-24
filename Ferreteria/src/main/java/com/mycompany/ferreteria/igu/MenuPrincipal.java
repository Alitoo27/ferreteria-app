package com.mycompany.ferreteria.igu;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MenuPrincipal extends javax.swing.JFrame {

    int XMouse, YMouse;

    public MenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbtnVerProductos = new javax.swing.JButton();
        jbtnDistribuidores = new javax.swing.JButton();
        pbsuperior = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        btnDB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Mi Negocio");

        jbtnVerProductos.setBackground(new java.awt.Color(158, 158, 158));
        jbtnVerProductos.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jbtnVerProductos.setForeground(new java.awt.Color(0, 0, 0));
        jbtnVerProductos.setText("Productos");
        jbtnVerProductos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnVerProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnVerProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnVerProductosActionPerformed(evt);
            }
        });

        jbtnDistribuidores.setBackground(new java.awt.Color(158, 158, 158));
        jbtnDistribuidores.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jbtnDistribuidores.setForeground(new java.awt.Color(0, 0, 0));
        jbtnDistribuidores.setText("Distribuidores");
        jbtnDistribuidores.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnDistribuidores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnDistribuidores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDistribuidoresActionPerformed(evt);
            }
        });

        pbsuperior.setBackground(new java.awt.Color(250, 250, 250));
        pbsuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pbsuperiorMouseDragged(evt);
            }
        });
        pbsuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pbsuperiorMousePressed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(158, 158, 158));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salir.png"))); // NOI18N
        jButton1.setToolTipText("Salir del Programa");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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

        javax.swing.GroupLayout pbsuperiorLayout = new javax.swing.GroupLayout(pbsuperior);
        pbsuperior.setLayout(pbsuperiorLayout);
        pbsuperiorLayout.setHorizontalGroup(
            pbsuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pbsuperiorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pbsuperiorLayout.setVerticalGroup(
            pbsuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, Short.MAX_VALUE)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        btnDB.setToolTipText("Importar/Exportar Base de Datos");
        btnDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pbsuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnVerProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnDistribuidores, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 262, Short.MAX_VALUE)
                .addComponent(btnDB, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(258, 258, 258))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pbsuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(jbtnVerProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jbtnDistribuidores, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnDB, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnVerProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnVerProductosActionPerformed
        PanelVerProductos pantalla = new PanelVerProductos();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jbtnVerProductosActionPerformed

    private void jbtnDistribuidoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDistribuidoresActionPerformed
        PanelDistribuidores pantalla = new PanelDistribuidores();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jbtnDistribuidoresActionPerformed

    private void pbsuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pbsuperiorMousePressed
        XMouse = evt.getX();
        YMouse = evt.getY();
    }//GEN-LAST:event_pbsuperiorMousePressed

    private void pbsuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pbsuperiorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - XMouse, y - YMouse);
    }//GEN-LAST:event_pbsuperiorMouseDragged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int opcion = JOptionPane.showConfirmDialog(
                this,
                "¿Seguro que deseas salir del programa?",
                "Confirmar salida",
                JOptionPane.YES_NO_OPTION
        );

        if (opcion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDBActionPerformed
        panelBaseDatos pantalla = new panelBaseDatos();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnDBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDB;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnDistribuidores;
    private javax.swing.JButton jbtnVerProductos;
    private javax.swing.JPanel pbsuperior;
    // End of variables declaration//GEN-END:variables
}
