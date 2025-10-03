
package com.mycompany.ferreteria.igu;

import com.mycompany.ferreteria.logica.Controladora;
import com.mycompany.ferreteria.logica.Distribuidor;
import com.mycompany.ferreteria.logica.Producto;
import java.util.List;
import javax.swing.JOptionPane;


public class PanelModificarProductos extends javax.swing.JFrame {

    int XMouse, YMouse;
    Controladora control = null;
    int idProducto;
    Producto produ;
    
    public PanelModificarProductos(int idProducto) {
        control = new Controladora();
        //this.idProducto = idProducto;
        initComponents();
        cargarDistribuidoresCombo();
        cargarProdu(idProducto);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        panelPrin = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        txtPrecioLista = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        cmbDistribuidor = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtStockMin = new javax.swing.JTextField();
        panelSuperior = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        jTextField6.setText("jTextField1");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Mi Negocio");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panelPrin.setBackground(new java.awt.Color(250, 250, 250));
        panelPrin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Codigo: ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 21, -1, -1));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre: ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 52, -1, -1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Categoria: ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 83, -1, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Cantidad: ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 114, -1, -1));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Precio de lista: ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 147, -1, -1));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Distribuidor: ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 211, -1, -1));

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        jPanel2.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 19, 200, -1));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 200, -1));
        jPanel2.add(txtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 81, 200, -1));
        jPanel2.add(txtPrecioLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 145, 179, -1));
        jPanel2.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 112, 198, -1));

        cmbDistribuidor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbDistribuidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDistribuidorActionPerformed(evt);
            }
        });
        jPanel2.add(cmbDistribuidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 206, 193, -1));

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));
        jPanel3.setForeground(new java.awt.Color(204, 204, 204));

        btnGuardar.setBackground(new java.awt.Color(21, 101, 192));
        btnGuardar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 300, -1));

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Stock minimo: ");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 178, -1, -1));
        jPanel2.add(txtStockMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 176, 184, -1));

        panelPrin.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 43, 300, 320));

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

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Modificar Productos");

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperiorLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        panelSuperiorLayout.setVerticalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        panelPrin.add(panelSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 40));

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

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    idProducto = this.produ.getIdProducto();
    String codigo = txtCodigo.getText();
    String nombre = txtNombre.getText();
    String categoria = txtCategoria.getText();
    int cantidad = Integer.parseInt(txtCantidad.getText());
    double precioLista = Double.parseDouble(txtPrecioLista.getText());
    int stockMin = Integer.parseInt(txtStockMin.getText());

    Distribuidor distribuidor = (Distribuidor) cmbDistribuidor.getSelectedItem();

    // tomamos los valores actualizados del formulario, los guardamos y cerramos el formulario
    try {
        control.modificarProducto(produ, idProducto, codigo, nombre, categoria, cantidad, precioLista, stockMin, distribuidor);
        JOptionPane.showMessageDialog(this, "Producto modificado correctamente");
        PanelVerProductos pantalla = new PanelVerProductos();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        this.dispose();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al modificar el producto: " + e.getMessage());
    }
        
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cmbDistribuidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDistribuidorActionPerformed
        
    }//GEN-LAST:event_cmbDistribuidorActionPerformed

    private void panelSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSuperiorMousePressed
        XMouse = evt.getX();
        YMouse = evt.getY();
    }//GEN-LAST:event_panelSuperiorMousePressed

    private void panelSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSuperiorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - XMouse, y - YMouse);
    }//GEN-LAST:event_panelSuperiorMouseDragged
  
    private void cargarDistribuidoresCombo() {
        // carmamos los distribuidores de la DB en el JComboBox
        List<Distribuidor> listaDistribuidor = control.traerDistribuidores();
        if(listaDistribuidor!=null){
            listaDistribuidor.forEach(distri -> {
                cmbDistribuidor.addItem(distri);
            });
        }
        
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<Distribuidor> cmbDistribuidor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JPanel panelPrin;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecioLista;
    private javax.swing.JTextField txtStockMin;
    // End of variables declaration//GEN-END:variables

    private void cargarProdu(int idProducto) {
        this.produ = control.traerProducto(idProducto);
        produ.getIdProducto();
        txtCodigo.setText(produ.getCodigo());
        txtNombre.setText(produ.getNombre());
        txtCategoria.setText(produ.getCategoria());
        txtCantidad.setText(String.valueOf(produ.getCantidad()));
        txtPrecioLista.setText(String.valueOf(produ.getPrecioLista()));
        txtStockMin.setText(String.valueOf(produ.getStockMin()));
        cmbDistribuidor.setSelectedItem(produ.getDistribuidor());
    }
}
