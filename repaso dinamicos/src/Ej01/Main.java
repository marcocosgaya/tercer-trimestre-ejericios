package Ej01;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> Numeros = new HashSet<>();

        System.out.println("Ingresa un numero: ");
        String entrada = sc.nextLine();

        while(!entrada.equalsIgnoreCase("FIN")){
            Numeros.add(entrada);
            entrada = sc.nextLine();

        }
        System.out.println(Numeros);
    }
}