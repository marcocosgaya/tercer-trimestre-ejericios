package Ejemplo_bufferwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("C:\\descargas\\Ejemplo12.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Línea 1");
            bw.newLine();
            bw.write("Línea 2");
            bw.close();
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}