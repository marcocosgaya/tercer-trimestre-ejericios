package Ejemplo_FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            String ruta = "C:\\descargas\\holamundo.txt";
            FileWriter fw = new FileWriter(ruta, false);
            fw.write("HolaMundo");
            fw.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
