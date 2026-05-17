package REPOSITORIO;

import CONEXIONES.ConexionSQLite;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class usuarioDAO {

    public boolean esUsuarioCorrecto(String usuario, String password){
        int cont = 0;
        String sql = "SELECT * FROM Tabla_Alumno";

        try (Connection conn = ConexionSQLite.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                cont++;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la consulta: " + e.getMessage());
        }

        return cont > 0;
    }
}
