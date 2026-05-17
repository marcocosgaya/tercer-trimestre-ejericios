package Ejercicio1;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        String  [] nombre = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "k", "L", "M", "N", "O"};
        Integer [] edad = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        try{
            String id = "";
            FileWriter fw = new FileWriter("C://descargas/edades.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i=0; i<nombre.length; i++){
                if (i<16){
                    id = "0" + (i+1);
                }else{
                    id = "" + (i+1);
                }
                bw.write(id + "|"+ nombre[i]+ "\n");
            }
            bw.close();

        }catch(IOException e){
            e.getMessage();
        }
    }

}
