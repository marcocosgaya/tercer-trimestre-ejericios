package REPOSITORY;

import CONFIG.ConexionSQLite;
import MODEL.Factura;

import java.sql.*;
import java.util.ArrayList;

public class FacturaDAO {

    public ArrayList<Factura> listarFacturas() {

        String sql = "SELECT * FROM tabla_facturas";
        ArrayList<Factura> lista = new ArrayList<>();

        try (Connection conn = ConexionSQLite.connect();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Factura f = new Factura();
                f.setId(rs.getInt("id"));
                f.setCantidad(rs.getInt("cantidad"));
                lista.add(f);
            }

        } catch (SQLException e) {
            System.out.println("Error al listar facturas: " + e.getMessage());
        }

        return lista;
    }
}
