package Config;


import java.io.File;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class ConexionSQLite {
    private static final String strRutaURL = "DATABASE/instituto.db";
    private static final String URL = "jdbc:sqlite:" + strRutaURL;

    public static Connection connect(){
        try{
            return DriverManager.getConnection(URL);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public boolean esConexionCorrecta(){
        File objFile = new File(strRutaURL);
        if(objFile.isFile()){
            return true;
        }else {
            return false;
        }

    }
}
