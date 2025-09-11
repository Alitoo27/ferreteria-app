
package com.mycompany.ferreteria.persistencia;

import com.mycompany.ferreteria.logica.Distribuidor;
import com.mycompany.ferreteria.logica.Producto;
import com.mycompany.ferreteria.persistencia.exceptions.NonexistentEntityException;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
    DistribuidorJpaController distribuidorJpa = new DistribuidorJpaController();
    ProductoJpaController productoJpa = new ProductoJpaController();

    public void guardarProdu(Producto produ) throws Exception {
        productoJpa.create(produ);
    }

    public void guardarDistri(Distribuidor distri) {
        distribuidorJpa.create(distri);
    }

    public List<Producto> traerProductos() {
        return productoJpa.findProductoEntities();
    }

    public List<Distribuidor> traerDistribuidores() {
        return distribuidorJpa.findDistribuidorEntities();
    }

    public void borrarProducto(int idProducto) {
        try {
            productoJpa.destroy(idProducto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }

    public void borrarDistri(int idDistribuidor)  {
        try {
            distribuidorJpa.destroy(idDistribuidor);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Distribuidor traerDistribuidor(int idDistribuidor) {
        return distribuidorJpa.findDistribuidor(idDistribuidor);
    }

    public void modificarDistri(Distribuidor distri) {
        try {
            distribuidorJpa.editSinProductos(distri);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Producto traerProducto(int idProducto) {
        return productoJpa.findProducto(idProducto);
    }

    public void modificarProdu(Producto produ) {
        try {
            productoJpa.edit(produ);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
