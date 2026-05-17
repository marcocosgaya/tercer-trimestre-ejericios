package Ejemplo_FileReader;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            String ruta = "C:\\descargas\\holamundo.txt";
            FileReader fr = new FileReader(ruta);
            int caracter=fr.read();
            while (caracter != -1) {
                System.out.print((char) caracter);
                caracter = fr.read();
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
