package com.mycompany.ferreteria.logica;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Producto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idProducto;
    
    private String codigo;
    private String nombre;
    private String categoria;
    private int cantidad;
    private double precioLista;
    //private double precioVenta;
    private int stockMin;

    
    @ManyToOne
    @JoinColumn(name = "nombreDistri")
    private Distribuidor distribuidor;

    public Producto() {
    }

    public Producto(String codigo, String nombre, String categoria, int cantidad, double precioLista, double precioVenta, int stockMin, Distribuidor distribuidor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.precioLista = precioLista;
        //this.precioVenta = precioVenta;
        this.stockMin = stockMin;
        this.distribuidor = distribuidor;
    }

    // Getters y Setters

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioLista() {
        return precioLista;
    }

    public void setPrecioLista(double precioLista) {
        this.precioLista = precioLista;
    }

    public double getPrecioVenta() {
        if(distribuidor != null){
            double porcetajeGanancia = distribuidor.getGanancia() / 100.0;
            return precioLista +(precioLista*porcetajeGanancia);
        }else{
            return precioLista;
        }
    }

    public int getStockMin() {
        return stockMin;
    }

    public void setStockMin(int stockMin) {
        this.stockMin = stockMin;
    }

    public Distribuidor getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(Distribuidor distribuidor) {
        this.distribuidor = distribuidor;
    }




}
