package com.mycompany.ferreteria.logica;

import com.mycompany.ferreteria.logica.Distribuidor;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-10-03T20:28:29", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, String> codigo;
    public static volatile SingularAttribute<Producto, Double> precioLista;
    public static volatile SingularAttribute<Producto, Integer> stockMin;
    public static volatile SingularAttribute<Producto, String> categoria;
    public static volatile SingularAttribute<Producto, Integer> idProducto;
    public static volatile SingularAttribute<Producto, Integer> cantidad;
    public static volatile SingularAttribute<Producto, String> nombre;
    public static volatile SingularAttribute<Producto, Distribuidor> distribuidor;

}