
package com.mycompany.ferreteria.logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String DB_URL = "jdbc:sqlite:ferreteria.db"; // se creará en el directorio del proyecto
    private static Connection conn = null;

    public static Connection getConnection() {
        try {
            if (conn == null || conn.isClosed()) {
                conn = DriverManager.getConnection(DB_URL);
                System.out.println("✅ Conectado a la base de datos SQLite correctamente.");
            }
        } catch (SQLException e) {
            System.err.println("❌ Error al conectar con SQLite: " + e.getMessage());
        }
        return conn;
    }
}
