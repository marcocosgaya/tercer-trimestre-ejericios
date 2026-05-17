package Ejercicio2;

import java.io.*;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        String filePath = "C:\\descargas\\";
        File file= new File(filePath);
        File[] files = file.listFiles();
        double tamano = 0.0;
        for (File f : files) {
            if (f.isFile()) {
                tamano = f.length()/1024.0;
                System.out.println(f.getName()+tamano+f.getAbsolutePath());

            }
        }
        if(file.exists()){
        System.out.println("El archivo / directorio existe");
            if(file.isFile()){
                System.out.println("Es un archivo");
                System.out.println("tamaño"+file.length()+"bytes");
                if (file.isDirectory())
                    System.out.println("Es un Directorio");
                }   else {
                    System.out.println("No existe el archivo");
            }
            }
        }

    }
