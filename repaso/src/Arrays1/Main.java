package Arrays1;

import java.util.HashSet;

public class Main {
    public static void main(String[] args){
        HashSet  <Integer>pares = new  HashSet();
        pares.add(1);
        pares.add(2);
        pares.add(3);
        pares.add(4);
        pares.add(5);
        pares.add(6);
        pares.add(null);

        for (Integer i : pares){

            if (i != null && i % 2 == 0){
                System.out.println();
            }
        }
    }
}
