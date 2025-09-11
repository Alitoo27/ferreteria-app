package com.mycompany.ferreteria.logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
public class Distribuidor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer idDistribuidor;

    private String nombreDistri;
    private String representante;
    private String numCel;
    private String email;
    private String direccion;
    private int ganancia;
    private String metPago;

    @OneToMany(mappedBy = "distribuidor")
    private List<Producto> listaProducto;

    public Distribuidor() {
    }

    public Distribuidor(String nombreDistri, String representante, String numCel, String email, String direccion, int ganancia, String metPago) {
        this.nombreDistri = nombreDistri;
        this.representante = representante;
        this.numCel = numCel;
        this.email = email;
        this.direccion = direccion;
        this.ganancia = ganancia;
        this.metPago = metPago;
    }

    // Getters y Setters

    public int getIdDistribuidor() {
        return idDistribuidor;
    }

    public void setIdDistribuidor(int idDistribuidor) {
        this.idDistribuidor = idDistribuidor;
    }

    public String getNombre() {
        return nombreDistri;
    }

    public void setNombre(String nombreDistri) {
        this.nombreDistri = nombreDistri;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getNumCel() {
        return numCel;
    }

    public void setNumCel(String numCel) {
        this.numCel = numCel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getGanancia() {
        return ganancia;
    }

    public void setGanancia(int ganancia) {
        this.ganancia = ganancia;
    }

    public List<Producto> getListaProducto() {
        return listaProducto;
    }

    public void setListaProducto(List<Producto> listaProducto) {
        this.listaProducto = listaProducto;
    }

    public String getMetPago() {
        return metPago;
    }

    public void setMetPago(String metPago) {
        this.metPago = metPago;
    }

    @Override
    public String toString() {
        return this.nombreDistri;
    }
    
    
    
}
