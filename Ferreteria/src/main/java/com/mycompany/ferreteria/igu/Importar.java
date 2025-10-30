package com.mycompany.ferreteria.igu;

import com.mycompany.ferreteria.logica.Controladora;
import com.mycompany.ferreteria.logica.Distribuidor;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Importar extends javax.swing.JFrame {

    Controladora control = null;
    int XMouse, YMouse;

    public Importar() {
        initComponents();
        control = new Controladora();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtRuta = new javax.swing.JTextField();
        btnSeleccionar = new javax.swing.JButton();
        btnImportardb = new javax.swing.JButton();
        panelSuperior = new javax.swing.JPanel();
        btnAtras1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnSeleccionar.setBackground(new java.awt.Color(158, 158, 158));
        btnSeleccionar.setForeground(new java.awt.Color(0, 0, 0));
        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        btnImportardb.setBackground(new java.awt.Color(158, 158, 158));
        btnImportardb.setForeground(new java.awt.Color(0, 0, 0));
        btnImportardb.setText("Importar Base de Datos");
        btnImportardb.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnImportardb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportardbActionPerformed(evt);
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

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Importar");

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnAtras1))
        );
        panelSuperiorLayout.setVerticalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addComponent(btnAtras1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnImportardb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeleccionar))
                .addGap(29, 29, 29)
                .addComponent(btnImportardb)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Seleccioná el archivo de backup (.txt)");
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        javax.swing.filechooser.FileNameExtensionFilter filtro = new javax.swing.filechooser.FileNameExtensionFilter("Archivos de texto", "txt");
        chooser.setFileFilter(filtro);

        int res = chooser.showOpenDialog(this);
        if (res == JFileChooser.APPROVE_OPTION) {
            File archivo = chooser.getSelectedFile();
            txtRuta.setText(archivo.getAbsolutePath());
        }
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void btnImportardbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportardbActionPerformed
        String rutaArchivo = txtRuta.getText().trim();
        if (rutaArchivo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Seleccioná un archivo de backup primero.");
            return;
        }

        File archivo = new File(rutaArchivo);
        if (!archivo.exists()) {
            JOptionPane.showMessageDialog(this, "El archivo seleccionado no existe.");
            return;
        }

        try {
            importarDatosDesdeTxt(rutaArchivo);
            JOptionPane.showMessageDialog(this, "✅ Datos importados correctamente desde:\n" + rutaArchivo);
        } catch (Exception ex) {

            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnImportardbActionPerformed

    private void btnAtras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtras1ActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras1;
    private javax.swing.JButton btnImportardb;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JTextField txtRuta;
    // End of variables declaration//GEN-END:variables

    private void importarDatosDesdeTxt(String rutaArchivo) throws IOException {
        try ( BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            boolean leyendoDistribuidores = false;
            boolean leyendoProductos = false;

            while ((linea = br.readLine()) != null) {
                if (linea.startsWith("=== DISTRIBUIDORES ===")) {
                    leyendoDistribuidores = true;
                    leyendoProductos = false;
                    continue;
                }
                if (linea.startsWith("=== PRODUCTOS ===")) {
                    leyendoDistribuidores = false;
                    leyendoProductos = true;
                    continue;
                }

                // === IMPORTAR DISTRIBUIDORES ===
                if (leyendoDistribuidores && linea.startsWith("ID:")) {
                    try {
                        String[] partes = linea.split("\\|");
                        String nombre = partes[1].split(":")[1].trim();
                        String representante = partes[2].split(":")[1].trim();
                        String email = partes[3].split(":")[1].trim();
                        String numCel = partes[4].split(":")[1].trim();
                        String direccion = partes[5].split(":")[1].trim();
                        int ganancia = Integer.parseInt(partes[6].split(":")[1].trim());
                        String metPago = partes[7].split(":")[1].trim();

                        control.guardarDistibuidor(nombre, representante, email, numCel, direccion, ganancia, metPago);
                    } catch (Exception e) {
                        System.err.println("⚠️ Error al importar distribuidor: " + e.getMessage());
                    }
                }

                // === IMPORTAR PRODUCTOS ===
                if (leyendoProductos && linea.startsWith("ID:")) {
                    try {
                        String[] partes = linea.split("\\|");
                        if (partes.length < 8) {
                            System.err.println("⚠️ Línea inválida (faltan campos): " + linea);
                            continue;
                        }

                        String codigo = partes[1].split(":", 2)[1].trim();
                        String nombre = partes[2].split(":", 2)[1].trim();
                        String categoria = partes[3].split(":", 2)[1].trim();
                        int cantidad = Integer.parseInt(partes[4].split(":", 2)[1].trim());
                        String precioTexto = partes[5].split(":", 2)[1].trim().replace(",", ".");
                        double precioLista = Double.parseDouble(precioTexto);

                        int stockMin = Integer.parseInt(partes[6].split(":", 2)[1].trim());
                        String distribuidorNombre = partes[7].split(":", 2)[1].trim();

                        // Buscar el distribuidor correspondiente
                        Distribuidor distribuidor = null;
                        for (Distribuidor d : control.traerDistribuidores()) {
                            if (d.getNombre().equalsIgnoreCase(distribuidorNombre)) {
                                distribuidor = d;
                                break;
                            }
                        }

                        // Guardar el producto
                        control.guardarProducto(codigo, nombre, categoria, cantidad, precioLista, stockMin, distribuidor);

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this,
                                "⚠️ Error al importar el producto:\n" + linea + "\n" + e.getMessage(),
                                "Error de importación",
                                JOptionPane.WARNING_MESSAGE);
                    }
                }

            }

        }
    }

}
