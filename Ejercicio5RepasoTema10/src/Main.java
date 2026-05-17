import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) {
        String ruta = "C:\\descargas\\codigosPostales.txt";
        String [] arrayLinea = new String[3];
        String [] arrayCodigoPostal = arrayLinea;
        int contador= 0;
        try{
            FileReader fr = new FileReader(ruta);
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();

            while(linea != null){
                arrayLinea = linea.split("\\|");
                linea = br.readLine();
                arrayCodigoPostal[contador] = arrayLinea[1];
                contador++;
            }
            br.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

    }
}
