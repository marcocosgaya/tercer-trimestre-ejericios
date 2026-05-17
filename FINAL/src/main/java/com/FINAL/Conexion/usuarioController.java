package com.FINAL.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class usuarioController {
    private static final String URL = "jdbc:sqlite:canciones.db";
    public static Connection Conectar() throws  SQLException {
        return DriverManager.getConnection(URL);
    }
}
