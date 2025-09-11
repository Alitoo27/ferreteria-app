
package com.mycompany.ferreteria.logica;

import com.mycompany.ferreteria.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardarDistibuidor(String distribuidor, String representante, String email, String numCel, String direccion, int ganancia, String metPago) {
        // recibimos los datos del distribuidor y los guardamos
        Distribuidor distri = new Distribuidor();
        distri.setNombre(distribuidor);
        distri.setRepresentante(representante);
        distri.setEmail(email);
        distri.setNumCel(numCel);
        distri.setDireccion(direccion);
        distri.setGanancia(ganancia);
        distri.setMetPago(metPago);
        
        controlPersis.guardarDistri(distri);
    }

    public void guardarProducto(String codigo, String nombre, String categoria, int cantidad, double precioLista, int stockMin, Distribuidor distribuidor) throws Exception {
        // recibimos los datos del producto y los guardamos
        Producto produ = new Producto();
        produ.setCodigo(codigo);
        produ.setNombre(nombre);
        produ.setCategoria(categoria);
        produ.setCantidad(cantidad);
        produ.setPrecioLista(precioLista);
        produ.setStockMin(stockMin);
        produ.setDistribuidor(distribuidor);
        
        controlPersis.guardarProdu(produ);
    }

    public List<Producto> traerProductos() {
       // llamamos a los productos cargados en la DB
        return controlPersis.traerProductos();
    }

    public List<Distribuidor> traerDistribuidores() {
        // llamamos a los distribuidores cargados en la DB
        return controlPersis.traerDistribuidores();
    }

    public void borrarProducto(int idProducto) {
        // eliminamos el producto seleccionado mediante su ID
        controlPersis.borrarProducto(idProducto);
    }

    public void borrarDistribuidor(int idDistribuidor) {
        // eliminamos el distribuidor seleccionado mediante su ID
        controlPersis.borrarDistri(idDistribuidor);
        
    }

    public Distribuidor traerDistribuidor(int idDistribuidor) {
        // traemos el distribuidor de la DB mediante su ID
        return controlPersis.traerDistribuidor(idDistribuidor);
    }


    public void modificarDistibuidor(Distribuidor distri, int idDistribuidor, String distribuidor, String representante, String email, String numCel, String direccion, int ganancia, String metPago) {
        // actualizamos los datos del distribuidor mediante su ID
        distri.setIdDistribuidor(idDistribuidor);
        distri.setNombre(distribuidor);
        distri.setRepresentante(representante);
        distri.setEmail(email);
        distri.setNumCel(numCel);
        distri.setDireccion(direccion);
        distri.setGanancia(ganancia);
        distri.setMetPago(metPago);
        controlPersis.modificarDistri(distri);
    }

    public Producto traerProducto(int idProducto) {
        // traemos el producto de la DB mediante su ID
        return controlPersis.traerProducto(idProducto);
    }

    public void modificarProducto(Producto produ, int idProducto, String codigo, String nombre, String categoria, int cantidad, double precioLista, int stockMin, Distribuidor distribuidor) {
        // actualizamos los datos del producto mediante su ID
        produ.setIdProducto(idProducto);
        produ.setCodigo(codigo);
        produ.setNombre(nombre);
        produ.setCategoria(categoria);
        produ.setCantidad(cantidad);
        produ.setPrecioLista(precioLista);
        produ.setStockMin(stockMin);
        produ.setDistribuidor(distribuidor);
        controlPersis.modificarProdu(produ);
    }

    public void venderProdu(Producto produ, int idProducto, int nuevoStock) {
        // actualizamos el stock de productos mediante su ID
        produ.setIdProducto(idProducto);
        produ.setCantidad(nuevoStock);
        controlPersis.modificarProdu(produ);
    }

    
}
      

