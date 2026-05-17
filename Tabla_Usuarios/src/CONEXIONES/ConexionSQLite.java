package CONEXIONES;



import java.io.File;
import java.sql.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSQLite {
    private static final String strRutaURL = "DATABASE/Colegio.db";
    private static final String URL = "jdbc:sqlite:" + strRutaURL ;

    public static Connection connect() {
        try {
            return DriverManager.getConnection(URL);
        } catch (SQLException e) {
            throw new RuntimeException("Error al conectar con la base de datos", e);
        }


    }

    public boolean esConexionCorrecta(){
        File objFile = new File(strRutaURL);
        if (objFile.isFile()){
            return true;
        }
        else{
            return false;
        }
    }
}
