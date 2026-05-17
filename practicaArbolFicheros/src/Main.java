import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
        String ruta = "C:\\descargas\\carpeta_";


        for (int i = 1; i < 6; i++) {
            File archivo = new File(ruta + "Carpeta" + i);
            archivo.mkdir();

            for (int j = 1; j < 6; j++) {
                File subcarpeta = new File(archivo, "Subcarpeta" + j);
                subcarpeta.mkdir();

                for (int k = 1; j < 6; k++) {
                    File csv = new File(subcarpeta, "Subcarpeta" + k + ".txt");
                    csv.mkdir();


                }
            }
        }

    }catch (Exception e){
        System.out.println(e.getMessage());}
    }
}