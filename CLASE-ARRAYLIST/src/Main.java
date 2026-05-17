import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Alumnos> lista = new ArrayList();
         lista.add(new Alumnos("Pepe", "Perez"));
         lista.add(new Alumnos("Miguel", "Garcia"));
         lista.add(new Alumnos("Marcos", "Sanchez"));

        for (Alumnos alumno : lista) {
            System.out.println(alumno);
        }

        lista.set(0, new Alumnos("Manolo", "Puerta"));
        System.out.println("lista actualizada : ");

        for (Alumnos alumno : lista) {
            System.out.println(alumno);
        }
    }
}
