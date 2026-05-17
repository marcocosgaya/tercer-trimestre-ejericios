package Repositorio;

import Modelo.Alumno;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Modelo.Alumno;
import Config.ConexionSQLite;
import Modelo.Asignatura;


public class AsignaturaDAO {

    public void mostrarRegistrosAsignaturas(){
        String sql = "SELECT * FROM Tabla_Asignatuta";
        try (Connection conn = ConexionSQLite.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
//                alumno.add(new Alumno(rs.getString("nombre"), rs.getInt("edad"), rs.getInt("id_alumno")));
                System.out.println(rs.getString("nombre")  + rs.getInt("id_asignatura"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void insertarAsignatura(Asignatura asignatura) {
        String sql = "INSERT INTO Tabla_Asignatuta (nombre) VALUES (? )";
        try (Connection conn = ConexionSQLite.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, asignatura.getNombre());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}