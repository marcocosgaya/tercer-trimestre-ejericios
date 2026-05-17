package Ej02;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> Numeros = new HashSet<>();
        Numeros.add(1);
        Numeros.add(2);
        Numeros.add(3);
        Numeros.add(4);
        Numeros.add(5);
        Numeros.add(6);
        Numeros.add(null);

        for (int i = 0; i < Numeros.size(); i++) {
            if (i%2==0){
                System.out.println(Numeros.get[i]);
            }
        }

    }
}
