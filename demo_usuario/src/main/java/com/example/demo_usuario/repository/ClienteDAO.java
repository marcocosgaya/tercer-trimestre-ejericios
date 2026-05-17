package com.example.demo_usuario.repository;

import com.example.demo_usuario.model.Cliente;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ClienteDAO {

    // Constructor: crea la tabla automáticamente
    public ClienteDAO() {
        crearTablaSiNoExiste();
    }

    private Connection conectar() {
        try {
            return DriverManager.getConnection("jdbc:sqlite:DATABASE/inicioSesion.db");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // CREA LA TABLA SI NO EXISTE (SOLUCIÓN FÁCIL)
    private void crearTablaSiNoExiste() {
        String sql = "CREATE TABLE IF NOT EXISTS clientes (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "nombre TEXT NOT NULL," +
                "email TEXT," +
                "telefono TEXT" +
                ");";

        try (Connection conn = conectar();
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // LISTAR CLIENTES
    public List<Cliente> listarClientes() {
        List<Cliente> lista = new ArrayList<>();

        String sql = "SELECT * FROM clientes";

        try (Connection conn = conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Cliente c = new Cliente();
                c.setId(rs.getInt("id"));
                c.setNombre(rs.getString("nombre"));
                c.setEmail(rs.getString("email"));
                c.setTelefono(rs.getString("telefono"));
                lista.add(c);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        return lista;
    }

    // INSERTAR CLIENTE
    public void insertarCliente(Cliente c) {
        String sql = "INSERT INTO clientes (nombre, email, telefono) VALUES (?, ?, ?)";

        try (Connection conn = conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, c.getNombre());
            stmt.setString(2, c.getEmail());
            stmt.setString(3, c.getTelefono());
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    // ACTUALIZAR CLIENTE
    public void actualizarCliente(int id, Cliente c) {
        String sql = "UPDATE clientes SET nombre=?, email=?, telefono=? WHERE id=?";

        try (Connection conn = conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, c.getNombre());
            stmt.setString(2, c.getEmail());
            stmt.setString(3, c.getTelefono());
            stmt.setInt(4, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    // ELIMINAR CLIENTE
    public void eliminarCliente(int id) {
        String sql = "DELETE FROM clientes WHERE id=?";

        try (Connection conn = conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
