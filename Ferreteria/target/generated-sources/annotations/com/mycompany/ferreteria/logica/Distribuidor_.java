package com.mycompany.ferreteria.logica;

import com.mycompany.ferreteria.logica.Producto;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-10-30T20:02:14", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Distribuidor.class)
public class Distribuidor_ { 

    public static volatile SingularAttribute<Distribuidor, String> representante;
    public static volatile SingularAttribute<Distribuidor, String> direccion;
    public static volatile ListAttribute<Distribuidor, Producto> listaProducto;
    public static volatile SingularAttribute<Distribuidor, String> numCel;
    public static volatile SingularAttribute<Distribuidor, String> metPago;
    public static volatile SingularAttribute<Distribuidor, Integer> idDistribuidor;
    public static volatile SingularAttribute<Distribuidor, String> nombreDistri;
    public static volatile SingularAttribute<Distribuidor, String> email;
    public static volatile SingularAttribute<Distribuidor, Integer> ganancia;

}