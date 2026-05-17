package com.example.demo_usuario.repository;

import com.example.demo_usuario.model.DetallePedido;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class DetallePedidoDAO {

    public DetallePedidoDAO() {
        crearTablasSiNoExisten();
        insertarDatosDePrueba();
    }

    private Connection conectar() {
        try {
            return DriverManager.getConnection("jdbc:sqlite:DATABASE/inicioSesion.db");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void crearTablasSiNoExisten() {

        String clientes = "CREATE TABLE IF NOT EXISTS clientes (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "nombre TEXT," +
                "email TEXT," +
                "telefono TEXT" +
                ");";

        String usuarios = "CREATE TABLE IF NOT EXISTS usuarios (" +
                "id_usuario INTEGER PRIMARY KEY AUTOINCREMENT," +
                "username TEXT," +
                "password TEXT" +
                ");";

        String productos = "CREATE TABLE IF NOT EXISTS productos (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "nombre TEXT," +
                "precio REAL" +
                ");";

        String detalle = "CREATE TABLE IF NOT EXISTS detalle_pedido (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "id_cliente INTEGER," +
                "id_usuario INTEGER," +
                "id_producto INTEGER," +
                "cantidad INTEGER," +
                "fecha TEXT" +
                ");";

        try (Connection conn = conectar(); Statement stmt = conn.createStatement()) {
            stmt.execute(clientes);
            stmt.execute(usuarios);
            stmt.execute(productos);
            stmt.execute(detalle);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void insertarDatosDePrueba() {
        try (Connection conn = conectar()) {

            // BORRAR TODO
            conn.createStatement().execute("DELETE FROM detalle_pedido;");
            conn.createStatement().execute("DELETE FROM clientes;");
            conn.createStatement().execute("DELETE FROM usuarios;");
            conn.createStatement().execute("DELETE FROM productos;");

            // ⭐ REINICIAR AUTOINCREMENT DESDE JAVA (SIN TOCAR SQL MANUAL)
            conn.createStatement().execute("DELETE FROM sqlite_sequence;");

            // INSERTAR CLIENTES
            conn.createStatement().execute(
                    "INSERT INTO clientes (nombre, email, telefono) VALUES " +
                            "('Juan Pérez', 'juan@mail.com', '600123123')," +
                            "('María López', 'maria@mail.com', '611222333');"
            );

            // INSERTAR USUARIOS
            conn.createStatement().execute(
                    "INSERT INTO usuarios (username, password) VALUES " +
                            "('admin', '1234')," +
                            "('empleado', 'abcd');"
            );

            // INSERTAR PRODUCTOS
            conn.createStatement().execute(
                    "INSERT INTO productos (nombre, precio) VALUES " +
                            "('Coca-Cola', 1.50)," +
                            "('Pan Bimbo', 2.20)," +
                            "('Agua Mineral', 1.00);"
            );

            // INSERTAR DETALLE
            conn.createStatement().execute(
                    "INSERT INTO detalle_pedido (id_cliente, id_usuario, id_producto, cantidad, fecha) VALUES " +
                            "(1, 1, 1, 3, '2024-01-01')," +
                            "(2, 2, 2, 1, '2024-01-02')," +
                            "(1, 1, 3, 5, '2024-01-03');"
            );

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public List<DetallePedido> listarDetalle() {
        List<DetallePedido> lista = new ArrayList<>();

        String sql =
                "SELECT dp.id, " +
                        "COALESCE(c.nombre, 'Sin cliente') AS cliente, " +
                        "COALESCE(u.username, 'Sin usuario') AS usuario, " +
                        "COALESCE(p.nombre, 'Sin producto') AS producto, " +
                        "COALESCE(p.precio, 0) AS precio, " +
                        "dp.cantidad, dp.fecha " +
                        "FROM detalle_pedido dp " +
                        "LEFT JOIN clientes c ON dp.id_cliente = c.id " +
                        "LEFT JOIN usuarios u ON dp.id_usuario = u.id_usuario " +
                        "LEFT JOIN productos p ON dp.id_producto = p.id";

        try (Connection conn = conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                DetallePedido d = new DetallePedido();
                d.setId(rs.getInt("id"));
                d.setCliente(rs.getString("cliente"));
                d.setUsuario(rs.getString("usuario"));
                d.setProducto(rs.getString("producto"));
                d.setPrecio(rs.getDouble("precio"));
                d.setCantidad(rs.getInt("cantidad"));
                d.setFecha(rs.getString("fecha"));
                lista.add(d);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }

        return lista;
    }
}
