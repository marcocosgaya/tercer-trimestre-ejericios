package Repositorio;

import Modelo.Alumno;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import Config.ConexionSQLite;


public class AlumnoDAO {
    public void crearTablaAlumno( ){
        String sql = "CREATE TABLE IF NOT EXISTS Tabla_Alumno(id_alumno INTEGER PRIMARY KEY ";
    }
    public List <Alumno> mostrarRegistroAlumno() {
        List <Alumno> alumnos = new ArrayList();
        String sql = "SELECT * FROM Tabla_Alumno";
        try(Connection conn = ConexionSQLite.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
                while(rs.next()) {
                    alumnos.add(new Alumno(rs.getInt("id_alumno"), rs.getString("nombre"), rs.getInt("apellidos")));
                }
            }catch (SQLException e){
            e.printStackTrace();
        }
        return alumnos;
    }
}
