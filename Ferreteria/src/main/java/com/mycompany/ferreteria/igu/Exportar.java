package com.mycompany.ferreteria.igu;

import com.mycompany.ferreteria.logica.Controladora;
import com.mycompany.ferreteria.logica.Distribuidor;
import com.mycompany.ferreteria.logica.Producto;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Exportar extends javax.swing.JFrame {

    Controladora control = null;
    int XMouse, YMouse;

    public Exportar() {
        initComponents();
        control = new Controladora();


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtRuta = new javax.swing.JTextField();
        btnSeleccionar = new javax.swing.JButton();
        btnExportarDB = new javax.swing.JButton();
        panelSuperior = new javax.swing.JPanel();
        btnAtras3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnSeleccionar.setBackground(new java.awt.Color(158, 158, 158));
        btnSeleccionar.setForeground(new java.awt.Color(0, 0, 0));
        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.setToolTipText("");
        btnSeleccionar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        btnExportarDB.setBackground(new java.awt.Color(158, 158, 158));
        btnExportarDB.setForeground(new java.awt.Color(0, 0, 0));
        btnExportarDB.setText("Exportar Base de Datos");
        btnExportarDB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnExportarDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarDBActionPerformed(evt);
            }
        });

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

        btnAtras3.setBackground(new java.awt.Color(158, 158, 158));
        btnAtras3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/atras.png"))); // NOI18N
        btnAtras3.setToolTipText("Atras");
        btnAtras3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAtras3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtras3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtras3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Exportar");

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnAtras3))
        );
        panelSuperiorLayout.setVerticalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addComponent(btnAtras3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExportarDB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(panelSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeleccionar))
                .addGap(29, 29, 29)
                .addComponent(btnExportarDB)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Seleccioná la carpeta para guardar el backup");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int res = chooser.showSaveDialog(this);
        if (res == JFileChooser.APPROVE_OPTION) {
            File carpeta = chooser.getSelectedFile();
            // Mostramos solo la carpeta seleccionada en el textfield
            txtRuta.setText(carpeta.getAbsolutePath());
        }

    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void btnExportarDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarDBActionPerformed
        String rutaCarpeta = txtRuta.getText().trim();
        if (rutaCarpeta.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccioná una carpeta para guardar el backup.");
            return;
        }

        try {
            // ✅ Generar nombre de archivo con fecha para evitar sobrescritura
            String fecha = new java.text.SimpleDateFormat("yyyyMMdd_HHmmss").format(new java.util.Date());
            File archivoBackup = new File(rutaCarpeta, "backup_ferreteria_" + fecha + ".txt");

            exportarDatosATxt(archivoBackup.getAbsolutePath());
            JOptionPane.showMessageDialog(this, "✅ Backup exportado correctamente:\n" + archivoBackup.getAbsolutePath());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "⚠️ Error al exportar el backup: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnExportarDBActionPerformed

    private void btnAtras3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtras3ActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnAtras3ActionPerformed

    private void panelSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSuperiorMousePressed
        XMouse = evt.getX();
        YMouse = evt.getY();
    }//GEN-LAST:event_panelSuperiorMousePressed

    private void panelSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSuperiorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - XMouse, y - YMouse);
    }//GEN-LAST:event_panelSuperiorMouseDragged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras3;
    private javax.swing.JButton btnExportarDB;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JTextField txtRuta;
    // End of variables declaration//GEN-END:variables

    private void exportarDatosATxt(String rutaArchivo) throws IOException {
        try ( BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo))) {

            // === EXPORTAR DISTRIBUIDORES ===
            bw.write("=== DISTRIBUIDORES ===");
            bw.newLine();

            List<Distribuidor> distribuidores = control.traerDistribuidores();
            for (Distribuidor d : distribuidores) {
                bw.write(String.format(
                        "ID: %d | Nombre: %s | Representante: %s | Email: %s | Cel: %s | Dirección: %s | Ganancia: %d | MétodoPago: %s",
                        d.getIdDistribuidor(),
                        d.getNombre(),
                        d.getRepresentante(),
                        d.getEmail(),
                        d.getNumCel(),
                        d.getDireccion(),
                        d.getGanancia(),
                        d.getMetPago()
                ));
                bw.newLine();
            }

            bw.newLine();

            // === EXPORTAR PRODUCTOS ===
            bw.write("=== PRODUCTOS ===");
            bw.newLine();

            List<Producto> productos = control.traerProductos();
            for (Producto p : productos) {
                String distribuidorNombre = (p.getDistribuidor() != null)
                        ? p.getDistribuidor().getNombre()
                        : "Sin Distribuidor";

                bw.write(String.format(
                        "ID: %d | Código: %s | Nombre: %s | Categoría: %s | Cantidad: %d | PrecioLista: %.2f | StockMin: %d | Distribuidor: %s",
                        p.getIdProducto(),
                        p.getCodigo(),
                        p.getNombre(),
                        p.getCategoria(),
                        p.getCantidad(),
                        p.getPrecioLista(),
                        p.getStockMin(),
                        distribuidorNombre
                ));
                bw.newLine();
            }

            bw.newLine();
            bw.write("=== FIN DEL BACKUP ===");
            bw.newLine();

        }
    }

}
