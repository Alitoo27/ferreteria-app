package com.mycompany.ferreteria.igu;

import com.mycompany.ferreteria.logica.Controladora;
import com.mycompany.ferreteria.logica.Distribuidor;
import com.mycompany.ferreteria.logica.Producto;
import java.awt.Color;
import java.awt.Component;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableRowSorter;

public class PanelVerProductos extends javax.swing.JFrame {

    int XMouse, YMouse;
    private PanelCarrito carrito;
    Controladora control = null;
    int idProducto;
    Producto produ;
    int idDistribuidor;
    Distribuidor distri;
    private TableRowSorter<DefaultTableModel> sorter;
    private boolean modoEdicion = false;

    public PanelVerProductos() {
        control = new Controladora();
        initComponents();
        cargarDistribuidoresCombo();
        cargarDistribuidoresCombo2();
        inhabilitarCancelar();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrin = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBuscarCodigo = new javax.swing.JTextField();
        txtBuscarNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbBuscarDistri = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnRecarcarTabla = new javax.swing.JButton();
        btnAñadirCarrito = new javax.swing.JButton();
        panelSuperior = new javax.swing.JPanel();
        btnAtras = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnAtras1 = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        txtPrecioLista = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        cmbDistribuidor = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtStockMin = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        lblAgreModif = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelPrin.setBackground(new java.awt.Color(250, 250, 250));
        panelPrin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelPrin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaProductos.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaProductos);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 770, 310));

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Codigo");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre");

        txtBuscarCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarCodigoKeyReleased(evt);
            }
        });

        txtBuscarNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarNombreKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Filtrar por: ");

        cmbBuscarDistri.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbBuscarDistri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBuscarDistriActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Distribuidor");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbBuscarDistri, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbBuscarDistri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBuscarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 60));

        btnEliminar.setBackground(new java.awt.Color(198, 40, 40));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/borrar.png"))); // NOI18N
        btnEliminar.setToolTipText("Eliminar Producto");
        btnEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 220, 70, 70));

        btnEditar.setBackground(new java.awt.Color(255, 255, 51));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editar.png"))); // NOI18N
        btnEditar.setToolTipText("Editar Producto");
        btnEditar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 140, 70, 70));

        btnRecarcarTabla.setBackground(new java.awt.Color(102, 255, 102));
        btnRecarcarTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/recargar.png"))); // NOI18N
        btnRecarcarTabla.setToolTipText("Recargar Tabla");
        btnRecarcarTabla.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRecarcarTabla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRecarcarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecarcarTablaActionPerformed(evt);
            }
        });
        jPanel2.add(btnRecarcarTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 60, 70, 70));

        btnAñadirCarrito.setBackground(new java.awt.Color(0, 151, 167));
        btnAñadirCarrito.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnAñadirCarrito.setForeground(new java.awt.Color(0, 0, 0));
        btnAñadirCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/carrito.png"))); // NOI18N
        btnAñadirCarrito.setText("Añadir al Carrito");
        btnAñadirCarrito.setToolTipText("Añadir al Carrito");
        btnAñadirCarrito.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAñadirCarrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAñadirCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirCarritoActionPerformed(evt);
            }
        });
        jPanel2.add(btnAñadirCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, 150, 70));

        panelPrin.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 880, 460));

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

        btnAtras.setBackground(new java.awt.Color(158, 158, 158));
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/atras.png"))); // NOI18N
        btnAtras.setToolTipText("Atras");
        btnAtras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Ver Productos");

        btnAtras1.setBackground(new java.awt.Color(153, 153, 153));
        btnAtras1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salir.png"))); // NOI18N
        btnAtras1.setToolTipText("Salir del Programa");
        btnAtras1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAtras1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtras1ActionPerformed(evt);
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
                .addContainerGap(452, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(338, 338, 338)
                .addComponent(btnAtras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtras1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelSuperiorLayout.setVerticalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnMinimizar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btnAtras1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAtras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPrin.add(panelSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 40));

        jPanel4.setBackground(new java.awt.Color(250, 250, 250));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Codigo: ");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 21, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nombre: ");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 52, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Categoria: ");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 83, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Cantidad: ");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 114, -1, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Precio de lista: ");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 147, -1, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Distribuidor: ");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 211, -1, -1));

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        jPanel4.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 19, 200, -1));
        jPanel4.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 200, -1));
        jPanel4.add(txtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 81, 200, -1));
        jPanel4.add(txtPrecioLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 145, 179, -1));
        jPanel4.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 112, 198, -1));

        cmbDistribuidor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbDistribuidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDistribuidorActionPerformed(evt);
            }
        });
        jPanel4.add(cmbDistribuidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 206, 193, -1));

        btnGuardar.setBackground(new java.awt.Color(21, 101, 192));
        btnGuardar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setToolTipText("Guardar Cambios");
        btnGuardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel4.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 140, 60));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Stock minimo: ");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 178, -1, -1));
        jPanel4.add(txtStockMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 176, 184, -1));

        btnCancelar.setBackground(new java.awt.Color(198, 40, 40));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar.png"))); // NOI18N
        btnCancelar.setToolTipText("Cancelar Cambios");
        btnCancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel4.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 60, 60));

        panelPrin.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 300, 320));

        lblAgreModif.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblAgreModif.setForeground(new java.awt.Color(0, 0, 0));
        lblAgreModif.setText("Agregar Producto");
        lblAgreModif.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelPrin.add(lblAgreModif, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 200, 30));

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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // cargamos la tabla al abrir el panel
        cargarTablaProdu();
    }//GEN-LAST:event_formWindowOpened

    private void btnRecarcarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecarcarTablaActionPerformed
        // limpiamos los filtros de texto
        limpiarFiltros();
        // reseteamos el combo de distribuidores
        cmbBuscarDistri.setSelectedItem("-");

        // recargamos la tabla desde la BD
        cargarTablaProdu();

        // limpiar filtros en el sorter global
        if (sorter != null) {
            sorter.setRowFilter(null);
        }

    }//GEN-LAST:event_btnRecarcarTablaActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (tablaProductos.getRowCount() > 0) {
            if (tablaProductos.getSelectedRow() != -1) {
                int fila = tablaProductos.getSelectedRow();
                if (fila != -1) {
                    // seleccionamos el producto y lo eliminamos
                    idProducto = Integer.parseInt(tablaProductos.getValueAt(fila, 0).toString());
                    control.borrarProducto(idProducto);
                    // recargamos la tabla
                    cargarTablaProdu();
                }

            }
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // aseguramos de que se seleccione una fila
        if (tablaProductos.getRowCount() > 0) {
            if (tablaProductos.getSelectedRow() != -1) {
                int fila = tablaProductos.getSelectedRow();
                if (fila != -1) {
                    idProducto = Integer.parseInt(tablaProductos.getValueAt(fila, 0).toString());
                    editarProducto(idProducto);

                    btnGuardar.setText("Actualizar");
                    lblAgreModif.setText("Actualizar Producto");
                    habilitarCancelar();
                    modoEdicion = true;

                }

            }
        }

    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtBuscarNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarNombreKeyReleased
        // filtro de busqueda por codigo, actualiza la busqueda por cada tecla apretada
        if (sorter != null) {
            String critBusqueda = txtBuscarNombre.getText().trim();
            if (critBusqueda.isEmpty()) {
                sorter.setRowFilter(null);
            } else {
                sorter.setRowFilter(RowFilter.regexFilter("(?i)" + critBusqueda, 4));
            }
        }
    }//GEN-LAST:event_txtBuscarNombreKeyReleased

    private void txtBuscarCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarCodigoKeyReleased
        // filtro de busqueda por codigo, actualiza la busqueda por cada tecla apretada
        if (sorter != null) {
            String critBusqueda = txtBuscarCodigo.getText().trim();
            if (critBusqueda.isEmpty()) {
                sorter.setRowFilter(null);
            } else {
                sorter.setRowFilter(RowFilter.regexFilter("(?i)" + critBusqueda, 2));
            }
        }
    }//GEN-LAST:event_txtBuscarCodigoKeyReleased

    private void btnAñadirCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirCarritoActionPerformed

        if (tablaProductos.getRowCount() > 0) {
            if (tablaProductos.getSelectedRow() != -1) {
                int fila = tablaProductos.getSelectedRow();
                if (fila != -1) {
                    // tomamos los datos de la tabla
                    idProducto = Integer.parseInt(tablaProductos.getValueAt(fila, 0).toString());
                    String nombre = tablaProductos.getValueAt(fila, 4).toString();
                    double precioVenta = Double.parseDouble(tablaProductos.getValueAt(fila, 6).toString());
                    int cantidad = 1;

                    // si el carrito no esta abierto lo abrimos
                    if (carrito == null || !carrito.isVisible()) {
                        carrito = new PanelCarrito(this, false); // false = no modal
                        carrito.setLocationRelativeTo(this);
                        carrito.setVisible(true);
                    }
                    // envia los datos seleccionados de la tabla de productos a la tabla del carrito
                    carrito.agregarProducto(idProducto, nombre, cantidad, precioVenta);
                }
            }
        }
    }//GEN-LAST:event_btnAñadirCarritoActionPerformed

    private void cmbBuscarDistriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBuscarDistriActionPerformed
        // filtro de busqueda por distribuidor, muestra los elementos que coincidan
        // con el distribuidor seleccionado
        if (sorter != null) {
            String critBusqueda = (String) cmbBuscarDistri.getSelectedItem();
            if (critBusqueda == null || critBusqueda.equals("-")) {
                sorter.setRowFilter(null);
            } else {
                sorter.setRowFilter(RowFilter.regexFilter("(?i)" + critBusqueda, 1));
            }
        }
    }//GEN-LAST:event_cmbBuscarDistriActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        MenuPrincipal pantalla = new MenuPrincipal();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void panelSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSuperiorMousePressed
        XMouse = evt.getX();
        YMouse = evt.getY();
    }//GEN-LAST:event_panelSuperiorMousePressed

    private void panelSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSuperiorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - XMouse, y - YMouse);
    }//GEN-LAST:event_panelSuperiorMouseDragged

    private void btnAtras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtras1ActionPerformed
        int opcion = JOptionPane.showConfirmDialog(
                this,
                "¿Seguro que deseas salir del programa?",
                "Confirmar salida",
                JOptionPane.YES_NO_OPTION
        );

        if (opcion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnAtras1ActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void cmbDistribuidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDistribuidorActionPerformed

    }//GEN-LAST:event_cmbDistribuidorActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // Obtenemos los datos del formulario
        String codigo = txtCodigo.getText().trim();
        String nombre = txtNombre.getText().trim();
        String categoria = txtCategoria.getText().trim();
        String cantidadStr = txtCantidad.getText().trim();
        String precioListaStr = txtPrecioLista.getText().trim();
        String stockMinStr = txtStockMin.getText().trim();
        
        String nombreSeleccionado = (String) cmbDistribuidor.getSelectedItem();
        Distribuidor distribuidor = null;

// Evitamos usar "-" como distribuidor real
        if (nombreSeleccionado != null && !nombreSeleccionado.equals("-")) {
            List<Distribuidor> listaDistribuidores = control.traerDistribuidores();
            for (Distribuidor d : listaDistribuidores) {
                if (d.getNombre().equalsIgnoreCase(nombreSeleccionado)) {
                    distribuidor = d;
                    break;
                }
            }
        }
        // Validar campos vacíos
        if (codigo.isEmpty() || nombre.isEmpty() || categoria.isEmpty()
                || cantidadStr.isEmpty() || precioListaStr.isEmpty() || stockMinStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor complete todos los campos.", "Campos vacíos", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            int cantidad = Integer.parseInt(cantidadStr);
            double precioLista = Double.parseDouble(precioListaStr);
            int stockMin = Integer.parseInt(stockMinStr);

            if (modoEdicion && produ != null) {
                // 🟡 EDITAR PRODUCTO EXISTENTE
                control.modificarProducto(produ, produ.getIdProducto(), codigo, nombre, categoria, cantidad, precioLista, stockMin, distribuidor);
                JOptionPane.showMessageDialog(this, "✅ Producto modificado correctamente.");
            } else {
                // 🟢 CREAR NUEVO PRODUCTO
                control.guardarProducto(codigo, nombre, categoria, cantidad, precioLista, stockMin, distribuidor);
                JOptionPane.showMessageDialog(this, "✅ Producto agregado correctamente.");
            }

            // Reiniciar formulario
            cargarTablaProdu();
            limpiarFormulario();
            inhabilitarCancelar();
            lblAgreModif.setText("Agregar Producto");
            btnGuardar.setText("Guardar");
            modoEdicion = false;
            produ = null;
            txtCodigo.requestFocus();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error: verifique que los campos numéricos sean válidos.", "Error de formato", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al guardar el producto: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        inhabilitarCancelar();
        limpiarFormulario();
        modoEdicion = false;
        lblAgreModif.setText("Agregar Producto");
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnAtras1;
    private javax.swing.JButton btnAñadirCarrito;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnRecarcarTabla;
    private javax.swing.JComboBox<String> cmbBuscarDistri;
    private javax.swing.JComboBox<String> cmbDistribuidor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAgreModif;
    private javax.swing.JPanel panelPrin;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txtBuscarCodigo;
    private javax.swing.JTextField txtBuscarNombre;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecioLista;
    private javax.swing.JTextField txtStockMin;
    // End of variables declaration//GEN-END:variables

    // crear y cargar datos de la DB
    public void cargarTablaProdu() {
        // modelo de la tabla
        DefaultTableModel tablaModelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        // columnas de la tabla
        String titulos[] = {
            "idProducto", "Distribuidor", "Codigo", "Categoria", "Nombre",
            "Precio Lista", "Precio Venta", "Cantidad", "Stock minimo"
        };
        tablaModelo.setColumnIdentifiers(titulos);
        List<Producto> listaProducto = control.traerProductos();

        if (listaProducto != null) {
            for (Producto produ : listaProducto) {
                // si no tiene un distribuidor asignado, se mostrara "Sin distribuidor"
                String nombreDistribuidor = "Sin distribuidor";
                double precioVenta = produ.getPrecioLista();

                // el precio de venta se mostrara en base al precio de lista y al
                // procentage de ganacia del distribuidor
                if (produ.getDistribuidor() != null) {
                    nombreDistribuidor = produ.getDistribuidor().getNombre();
                    precioVenta = produ.getPrecioVenta();
                    precioVenta = Math.round(precioVenta * 100.0) / 100.0;
                }
                // cargamos los datos en la tabla
                Object[] objeto = {
                    produ.getIdProducto(),
                    nombreDistribuidor,
                    produ.getCodigo(),
                    produ.getCategoria(),
                    produ.getNombre(),
                    produ.getPrecioLista(),
                    precioVenta,
                    produ.getCantidad(),
                    produ.getStockMin()
                };
                tablaModelo.addRow(objeto);
            }
        }

        tablaProductos.setModel(tablaModelo);

        sorter = new TableRowSorter<>(tablaModelo);
        tablaProductos.setRowSorter(sorter);
        ajustarAnchoColumnas(tablaProductos);

        // Ocultar columna ID
        tablaProductos.getColumnModel().getColumn(0).setMinWidth(0);
        tablaProductos.getColumnModel().getColumn(0).setMaxWidth(0);
        tablaProductos.getColumnModel().getColumn(0).setWidth(0);

        // 🔴 Renderer para marcar bajo stock y sin distribuidor
        tablaProductos.setDefaultRenderer(Object.class,
                new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                    boolean isSelected, boolean hasFocus, int row, int column) {

                Component compo = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                try {
                    if (table.getColumnCount() > 8 && row < table.getRowCount()) {
                        int cantidad = Integer.parseInt(table.getValueAt(row, 7).toString()); // Columna cantidad
                        int stockMin = Integer.parseInt(table.getValueAt(row, 8).toString()); // Columna stock mínimo
                        String distribuidor = table.getValueAt(row, 1).toString(); // Columna distribuidor

                        // Condición de bajo stock
                        if (cantidad <= stockMin) {
                            compo.setBackground(new Color(255, 102, 102)); // Rojo suave
                            compo.setForeground(Color.BLACK);
                        } // Condición de producto sin distribuidor
                        else if ("Sin distribuidor".equals(distribuidor)) {
                            compo.setBackground(new Color(255, 255, 153)); // Amarillo suave
                            compo.setForeground(Color.BLACK);
                        } else {
                            if (isSelected) {
                                compo.setBackground(table.getSelectionBackground());
                                compo.setForeground(table.getSelectionForeground());
                            } else {
                                compo.setBackground(Color.WHITE);
                                compo.setForeground(Color.BLACK);
                            }
                        }
                    }
                } catch (Exception e) {
                    // Si algo falla, no rompe la UI
                    compo.setBackground(Color.WHITE);
                    compo.setForeground(Color.BLACK);
                }

                return compo;
            }
        });

    }

    private void limpiarFiltros() {
        // limpia los filtros
        txtBuscarCodigo.setText("");
        txtBuscarNombre.setText("");
    }

    private void cargarDistribuidoresCombo() {
        // carga los distribuidores de la DB al JComboBox
        cmbBuscarDistri.removeAllItems();
        // opcion vacia
        cmbBuscarDistri.addItem("-");
        // opcion sin distribuidor
        cmbBuscarDistri.addItem("Sin distribuidor");
        List<Distribuidor> listaDistribuidor = control.traerDistribuidores();
        if (listaDistribuidor != null) {
            listaDistribuidor.forEach(distri -> {
                cmbBuscarDistri.addItem(distri.getNombre());
            });
        }
    }

    private void cargarDistribuidoresCombo2() {
        // cargamos los distribuidores de la DB en el JComboBox
        cmbDistribuidor.removeAllItems();

        //cmbDistribuidor.insertItemAt(new Distribuidor("-", "-", "-", "-", "-", 0, "-"), 0);
        cmbDistribuidor.addItem("-");
        cmbDistribuidor.setSelectedIndex(0);

        List<Distribuidor> listaDistribuidor = control.traerDistribuidores();
        if (listaDistribuidor != null) {
            listaDistribuidor.forEach(distri -> {
                cmbDistribuidor.addItem(distri.getNombre());
            });
        }

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

    private void limpiarFormulario() {
        // limpiamos el formulario
        txtCodigo.setText("");
        txtNombre.setText("");
        txtCategoria.setText("");
        txtCantidad.setText("");
        txtPrecioLista.setText("");
        txtStockMin.setText("");
        cmbDistribuidor.setSelectedIndex(0);
        modoEdicion = false;
        btnGuardar.setText("Guardar");
    }

    private void inhabilitarCancelar() {
        btnCancelar.setEnabled(false);
        limpiarFormulario();
    }

    private void habilitarCancelar() {
        btnCancelar.setEnabled(true);
    }

    private void editarProducto(int idProducto) {
        this.produ = control.traerProducto(idProducto);
        produ.getIdProducto();
        txtCodigo.setText(produ.getCodigo());
        txtNombre.setText(produ.getNombre());
        txtCategoria.setText(produ.getCategoria());
        txtCantidad.setText(String.valueOf(produ.getCantidad()));
        txtPrecioLista.setText(String.valueOf(produ.getPrecioLista()));
        txtStockMin.setText(String.valueOf(produ.getStockMin()));

        String nombreDistribuidor = produ.getDistribuidor() != null
                ? produ.getDistribuidor().getNombre()
                : "-";

        boolean encontrado = false;

        for (int i = 0; i < cmbDistribuidor.getItemCount(); i++) {
            String item = cmbDistribuidor.getItemAt(i);
            if (item.equalsIgnoreCase(nombreDistribuidor)) {
                cmbDistribuidor.setSelectedIndex(i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            cmbDistribuidor.setSelectedIndex(0); // selecciona "-" si no encuentra coincidencia
        }

    }

}
