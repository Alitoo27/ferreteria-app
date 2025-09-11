# ferreteria-app
# 🛠️ Ferretería App

Sistema de gestión para una ferretería, desarrollado como parte de la **Pasantía Supervisada** de la carrera.  
La aplicación permite administrar productos, distribuidores y realizar ventas a través de un carrito de compras.

---

## 🚀 Funcionalidades principales

- **Gestión de Productos**
  - Alta, baja, modificación y listado de productos.
  - Cálculo automático del precio de venta (precio lista + % de ganancia).
  - Control de stock con alertas por bajo inventario.

- **Gestión de Distribuidores**
  - Registro de distribuidores con datos de contacto y método de pago.
  - Relación entre productos y su distribuidor.

- **Carrito de Ventas**
  - Selección de productos desde la tabla principal.
  - Agregar al carrito con cantidad y cálculo de importe.
  - Finalización de compra con actualización automática de stock.

---

## 🛠️ Tecnologías utilizadas

- **Lenguaje:** Java  
- **Framework:** Swing (Java GUI)  
- **Persistencia:** JPA (EclipseLink)  
- **Base de datos:** MySQL  
- **IDE:** NetBeans 

---

## 📂 Estructura del proyecto

src/

├── com.mycompany.ferreteria.igu # Interfaces gráficas

├── com.mycompany.ferreteria.logica # Lógica de negocio

└── com.mycompany.ferreteria.persistencia # Controladores JPA y conexión DB
