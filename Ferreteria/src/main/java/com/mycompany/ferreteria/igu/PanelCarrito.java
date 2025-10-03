package com.mycompany.ferreteria.igu;

import com.mycompany.ferreteria.logica.Controladora;
import com.mycompany.ferreteria.logica.Producto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PanelCarrito extends javax.swing.JDialog {

    int XMouse, YMouse;
    private final PanelVerProductos productos;
    Producto produ;
    Controladora control = null;
    int idProducto;

    DefaultTableModel tablaModelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    public PanelCarrito(java.awt.Frame parent, boolean modal) {
        super(parent, modal);

        productos = new PanelVerProductos();
        control = new Controladora();
        initComponents();
        cargarTablaCarrito();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrin = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btnFinalCompra = new javax.swing.JButton();
        txtTotal = new javax.swing.JTextField();
        btnBorrar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaCarrito = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtPUnidad = new javax.swing.JTextField();
        txtImporte = new javax.swing.JTextField();
        spnCantidad = new javax.swing.JSpinner();
        panelSuperior = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPrin.setBackground(new java.awt.Color(0, 0, 255));
        panelPrin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(250, 250, 250));

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Total:  $");

        btnFinalCompra.setBackground(new java.awt.Color(102, 255, 51));
        btnFinalCompra.setForeground(new java.awt.Color(0, 0, 0));
        btnFinalCompra.setText("Finalizar compra");
        btnFinalCompra.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFinalCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinalCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalCompraActionPerformed(evt);
            }
        });

        btnBorrar.setBackground(new java.awt.Color(198, 40, 40));
        btnBorrar.setForeground(new java.awt.Color(0, 0, 0));
        btnBorrar.setText("Eliminar fila");
        btnBorrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(234, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFinalCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFinalCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelPrin.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 450, 100));

        tablaCarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaCarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCarritoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaCarrito);

        panelPrin.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 450, 210));

        jPanel5.setBackground(new java.awt.Color(250, 250, 250));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Descripcion: ");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Cantidad: ");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Precio P/Unidad:");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Importe:");

        spnCantidad.setModel(new javax.swing.SpinnerNumberModel());
        spnCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCantidadStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombre)
                    .addComponent(spnCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 32, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(txtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        panelPrin.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 450, 80));

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
        panelSuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Carrito");
        panelSuperior.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 2, 212, 35));

        jButton1.setBackground(new java.awt.Color(158, 158, 158));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/atras.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelSuperior.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        panelPrin.add(panelSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 40));

        getContentPane().add(panelPrin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalCompraActionPerformed

        for (int i = 0; i < tablaCarrito.getRowCount(); i++) {
            // Tomar los datos de cada fila
            idProducto = Integer.parseInt(tablaCarrito.getValueAt(i, 0).toString());
            int cantVendida = Integer.parseInt(tablaCarrito.getValueAt(i, 2).toString());

            // Traer el producto desde la BD
            produ = control.traerProducto(idProducto);

            // actualizamos la el stock total
            int cantidadActual = produ.getCantidad();
            int nuevoStock = cantidadActual - cantVendida;

            if (nuevoStock < 0) {
                JOptionPane.showMessageDialog(this, "Stock insuficiente para el producto: " + produ.getNombre());
            } else {
                control.venderProdu(produ, idProducto, nuevoStock); 
            }

        }
        this.dispose();
        
    }//GEN-LAST:event_btnFinalCompraActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void tablaCarritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCarritoMouseClicked
        if (tablaCarrito.getRowCount() > 0) {
            if (tablaCarrito.getSelectedRow() != -1) {
                // seleccionamos una fila y cargamos sus valores en los campos
                int fila = tablaCarrito.getSelectedRow();
                this.txtNombre.setText(tablaCarrito.getValueAt(fila, 1).toString());
                this.txtPUnidad.setText(tablaCarrito.getValueAt(fila, 3).toString());
                this.spnCantidad.setValue(tablaCarrito.getValueAt(fila, 2));
                this.txtImporte.setText(tablaCarrito.getValueAt(fila, 4).toString());
            }
        }
    }//GEN-LAST:event_tablaCarritoMouseClicked

    private void spnCantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCantidadStateChanged
        if (tablaCarrito.getRowCount() > 0) {
            if (tablaCarrito.getSelectedRow() != -1) {
                // modificamos la cantidad con el JSpinner
                // y actualizamos los importes de los JtextField y de la tabla
                int fila = tablaCarrito.getSelectedRow();
                int cantidad = (int) spnCantidad.getValue();
                double precioUnitario = Double.parseDouble(txtPUnidad.getText());
                double importe = cantidad * precioUnitario;
                importe = Math.round(importe * 100.0) / 100.0;
                txtImporte.setText(String.valueOf(importe));
                tablaCarrito.setValueAt(cantidad, fila, 2);
                tablaCarrito.setValueAt(importe, fila, 4);

                // actualizamos el importe total de la compra
                double total = 0.0;
                for (int i = 0; i < tablaCarrito.getRowCount(); i++) {
                    importe = Double.parseDouble(tablaCarrito.getValueAt(i, 4).toString());
                    total += importe;
                    total = Math.round(total * 100.0) / 100.0;
                }
                txtTotal.setText(String.valueOf(total));

            }
        }


    }//GEN-LAST:event_spnCantidadStateChanged

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        if (tablaCarrito.getRowCount() > 0) {
            int fila = tablaCarrito.getSelectedRow();
            if (fila != -1) {
                // eliminamos la fila seleccionada 
                tablaModelo.removeRow(fila);
                double total = 0.0;
                double importe;
                // actualizamos el importe total de la compra
                for (int i = 0; i < tablaCarrito.getRowCount(); i++) {
                    importe = Double.parseDouble(tablaCarrito.getValueAt(i, 4).toString());
                    total += importe;
                    total = Math.round(total * 100.0) / 100.0;
                }
                txtTotal.setText(String.valueOf(total));

            } else {
                JOptionPane.showMessageDialog(this, "Debe seleccionar un producto para eliminar.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "No hay productos en el carrito.");
        }

    }//GEN-LAST:event_btnBorrarActionPerformed

    private void panelSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSuperiorMousePressed
        XMouse = evt.getX();
        YMouse = evt.getY();
    }//GEN-LAST:event_panelSuperiorMousePressed

    private void panelSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSuperiorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - XMouse, y - YMouse);
    }//GEN-LAST:event_panelSuperiorMouseDragged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnFinalCompra;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel panelPrin;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JTable tablaCarrito;
    private javax.swing.JTextField txtImporte;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPUnidad;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    private void cargarTablaCarrito() {
        // agregamos las columnas
        String titulos[] = {"idProducto",
            "Nombre", "Cantidad",
            "Precio P/Unidad", "Importe"
        };
        tablaModelo.setColumnIdentifiers(titulos);

        tablaCarrito.setModel(tablaModelo);
        
        // ocultamos la columna de ID
        tablaCarrito.getColumnModel().getColumn(0).setMinWidth(0);
        tablaCarrito.getColumnModel().getColumn(0).setMaxWidth(0);
        tablaCarrito.getColumnModel().getColumn(0).setWidth(0);
    }

    public void agregarProducto(int idProducto, String nombre, int cantidad, double precioUnidad) {
        boolean productoExistente = false;

        for (int i = 0; i < tablaCarrito.getRowCount(); i++) {
            int idTabla = Integer.parseInt(tablaCarrito.getValueAt(i, 0).toString());
            if (idTabla == idProducto) {
                // Producto ya existe, actualizar cantidad e importe
                int cantidadActual = Integer.parseInt(tablaCarrito.getValueAt(i, 2).toString());
                int nuevaCantidad = cantidadActual + cantidad;
                double nuevoImporte = Math.round((nuevaCantidad * precioUnidad) * 100.0) / 100.0;

                tablaCarrito.setValueAt(nuevaCantidad, i, 2); // actualizar cantidad
                tablaCarrito.setValueAt(precioUnidad, i, 3);  // actualizar precio (por si cambia)
                tablaCarrito.setValueAt(nuevoImporte, i, 4);  // actualizar importe

                productoExistente = true;
                break;
            }
        }

        // si el producto es nuevo se añade a la tabla
        if (!productoExistente) {
            double importe = Math.round((cantidad * precioUnidad) * 100.0) / 100.0;
            tablaModelo.addRow(new Object[]{idProducto, nombre, cantidad, precioUnidad, importe});
        }

        // Recalcular el total siempre
        double total = 0.0;
        for (int i = 0; i < tablaCarrito.getRowCount(); i++) {
            double importe = Double.parseDouble(tablaCarrito.getValueAt(i, 4).toString());
            total += importe;
        }
        total = Math.round(total * 100.0) / 100.0; // redondeo a 2 decimales
        txtTotal.setText(String.valueOf(total));
    }
    
    


}
