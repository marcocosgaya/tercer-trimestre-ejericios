import Config.ConexionSQLite;
import Modelo.Alumno;
import Modelo.Asignatura;
import Repositorio.AlumnoDAO;
import Repositorio.AsignaturaDAO;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ConexionSQLite objConexionSQLite = new ConexionSQLite();
        boolean resultado = objConexionSQLite.esConexionCorrecta();
        if(resultado ){
            AlumnoDAO objAlumnoDAO = new AlumnoDAO();
            AsignaturaDAO objAsignaturaDAO = new AsignaturaDAO();
            objAlumnoDAO.crearTablaAlumno();

            Alumno ObjAlumno = new Alumno(0, "Pepe", 23);
            Alumno ObjAlumno2 = new Alumno(0, "Miguel", 45);
            Alumno ObjAlumno3 = new Alumno(0, "Maria", 27);
            Asignatura ObjAsignatura = new AsignatER0, "Programación");
            Asignatura ObjAsignatura2 = new Asignatura(0, "Base de Datos");

            //Llamamos a insertar
//            objAlumnoDAO.insertarAlumno(ObjAlumno);
//            objAlumnoDAO.insertarAlumno(ObjAlumno2);
//            objAlumnoDAO.insertarAlumno(ObjAlumno3);
//            objAsignaturaDAO.insertarAsignatura(ObjAsignatura);
//            objAsignaturaDAO.insertarAsignatura(ObjAsignatura);

            ArrayList<Alumno> ObjArrayList = new ArrayList<Alumno>();
            ObjArrayList = objAlumnoDAO.mostrarRegistroAlumno();
            for (Alumno recorrer : ObjArrayList){
                System.out.println(recorrer);
            }
           System.out.println("Conexion correcta");
        }else {
            System.out.println("Error conexion");
        }
    }
}
