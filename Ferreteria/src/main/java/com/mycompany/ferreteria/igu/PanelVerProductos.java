package com.mycompany.ferreteria.igu;

import com.mycompany.ferreteria.logica.Controladora;
import com.mycompany.ferreteria.logica.Distribuidor;
import com.mycompany.ferreteria.logica.Producto;
import java.awt.Color;
import java.awt.Component;
import java.util.List;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class PanelVerProductos extends javax.swing.JFrame {

    private PanelCarrito carrito;
    Controladora control = null;

    public PanelVerProductos() {
        control = new Controladora();
        initComponents();
        cargarDistribuidoresCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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
        btnAtras = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

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

        jLabel2.setText("Codigo");

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

        jLabel4.setText("Filtrar por: ");

        cmbBuscarDistri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBuscarDistriActionPerformed(evt);
            }
        });

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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBuscarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cmbBuscarDistri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/borrar.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editar.png"))); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnRecarcarTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/recargar.png"))); // NOI18N
        btnRecarcarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecarcarTablaActionPerformed(evt);
            }
        });

        btnAñadirCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/carrito.png"))); // NOI18N
        btnAñadirCarrito.setText("Añadir al Carrito");
        btnAñadirCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirCarritoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAñadirCarrito))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnRecarcarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnRecarcarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAñadirCarrito, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/atras.png"))); // NOI18N
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Ver Productos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(190, 190, 190)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // cargamos la tabla al abrir el panel
        cargarTablaProdu();
    }//GEN-LAST:event_formWindowOpened

    private void btnRecarcarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecarcarTablaActionPerformed
        // limpiamos los filtros y recargamos la tabla
        limpiarFiltros();
        cmbBuscarDistri.setSelectedItem("-");
        cargarTablaProdu();

        TableRowSorter<?> sorter = (TableRowSorter<?>) tablaProductos.getRowSorter();
        if (sorter != null) {
            sorter.setRowFilter(null);
        } else {
            // Si no hay sorter, lo creamos y mostramos toda la tabla
            DefaultTableModel modeloTabla = (DefaultTableModel) tablaProductos.getModel();
            TableRowSorter<DefaultTableModel> ordenador = new TableRowSorter<>(modeloTabla);
            tablaProductos.setRowSorter(ordenador);

        }

    }//GEN-LAST:event_btnRecarcarTablaActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        MenuPrincipal pantalla = new MenuPrincipal();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (tablaProductos.getRowCount() > 0) {
            if (tablaProductos.getSelectedRow() != -1) {
                int fila = tablaProductos.getSelectedRow();
                if (fila != -1) {
                    // seleccionamos el producto y lo eliminamos
                    int idProducto = Integer.parseInt(tablaProductos.getValueAt(fila, 0).toString());
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
                    // seleccionamos elelemento por ID
                    int idProducto = Integer.parseInt(tablaProductos.getValueAt(fila, 0).toString());
                    // llamamos al panel de modificar productos
                    PanelModificarProductos pantallaModif = new PanelModificarProductos(idProducto);
                    pantallaModif.setVisible(true);
                    pantallaModif.setLocationRelativeTo(null);
                    this.dispose();
                }

            }
        }

    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtBuscarNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarNombreKeyReleased
        // filtro de busqueda por codigo, actualiza la busqueda por cada tecla apretada
        String critBusqueda = txtBuscarNombre.getText().trim();
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaProductos.getModel();
        TableRowSorter<DefaultTableModel> ordenador = new TableRowSorter<>(modeloTabla);
        tablaProductos.setRowSorter(ordenador);
        // filtra por la columna 4 (nombre del producto)
        ordenador.setRowFilter(RowFilter.regexFilter("(?i)" + critBusqueda, 4));
    }//GEN-LAST:event_txtBuscarNombreKeyReleased

    private void txtBuscarCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarCodigoKeyReleased
        // filtro de busqueda por codigo, actualiza la busqueda por cada tecla apretada
        String critBusqueda = txtBuscarCodigo.getText().trim();
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaProductos.getModel();
        TableRowSorter<DefaultTableModel> ordenador = new TableRowSorter<>(modeloTabla);
        tablaProductos.setRowSorter(ordenador);
        // flitra por la columna 2 (codigo del producto)
        ordenador.setRowFilter(RowFilter.regexFilter("(?i)" + critBusqueda, 2));
    }//GEN-LAST:event_txtBuscarCodigoKeyReleased

    private void btnAñadirCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirCarritoActionPerformed

        if (tablaProductos.getRowCount() > 0) {
            if (tablaProductos.getSelectedRow() != -1) {
                int fila = tablaProductos.getSelectedRow();
                if (fila != -1) {
                    // tomamos los datos de la tabla
                    int idProducto = Integer.parseInt(tablaProductos.getValueAt(fila, 0).toString());
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
        String critBusqueda = (String) cmbBuscarDistri.getSelectedItem();
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaProductos.getModel();
        TableRowSorter<DefaultTableModel> ordenador = new TableRowSorter<>(modeloTabla);
        tablaProductos.setRowSorter(ordenador);

        // Si selecciona "-", mostramos todo
        if (critBusqueda.equals("-")) {
            ordenador.setRowFilter(null);
        } else {
            // Filtra por columna 1 (nombre del distribuidor)
            ordenador.setRowFilter(RowFilter.regexFilter("(?i)" + critBusqueda, 1));
        }
    }//GEN-LAST:event_cmbBuscarDistriActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnAñadirCarrito;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRecarcarTabla;
    private javax.swing.JComboBox<String> cmbBuscarDistri;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txtBuscarCodigo;
    private javax.swing.JTextField txtBuscarNombre;
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

                int cantidad = Integer.parseInt(table.getValueAt(row, 7).toString()); // Columna cantidad
                int stockMin = Integer.parseInt(table.getValueAt(row, 8).toString()); // Columna stock mínimo
                String distribuidor = table.getValueAt(row, 1).toString(); // Columna distribuidor

                // 🔴 Condición de bajo stock
                if (cantidad <= stockMin) {
                    compo.setBackground(new Color(255, 102, 102)); // Rojo suave
                    compo.setForeground(Color.BLACK);
                } // 🟡 Condición de producto sin distribuidor
                else if (distribuidor.equals("Sin distribuidor")) {
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

}
