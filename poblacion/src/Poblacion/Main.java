package Poblacion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        String ruta = "C:\\descargas\\codigosPostales.txt";
        String rutaJSON = "C:\\descargas\\codigosPostales.JSON";
        String[] arrayLinea = new String[3];
        ArrayList<Poblacion> arrayList = new ArrayList<Poblacion>();
        try{

            //Poblacion objPoblacion = new Poblacion("Aranjuez", "28300", 1);
            //arrayList.add(new Poblacion("Aranjuez", "28300", 1));

            FileReader fr = new FileReader(ruta);
            BufferedReader br = new BufferedReader(fr);
           String linea = br.readLine();
           while (linea != null){
               arrayLinea = linea.split("\\|");
               arrayList.add(new Poblacion(arrayLinea[0], arrayLinea[1], Integer.parseInt(arrayLinea[2])));
               linea =br.readLine();
           }
           br.close();
           System.out.println(arrayList);

           mapper.writeValue(new File((rutaJSON)), arrayList);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
