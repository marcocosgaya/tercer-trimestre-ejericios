package com.FINAL.repository;

import java.sql.Connection;

public class usuarioDAO {
    public void crearTabla() {
        String sql = "CREATE TABLE IF NOT EXISTS usuario (" +
                "id INTEGER PRIMARY KEY, " +
                "titulo TEXT, " +
                "artista TEXT, " +
                "duracion INTEGER)";


    }
}