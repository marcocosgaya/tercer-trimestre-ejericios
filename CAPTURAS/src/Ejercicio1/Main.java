package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        try {
            int[] num = new int[12];
            num[0] = 39;
            num[1] = -2;
            num[6] = 14;
            num[8] = 5;
            num[9] = 120;

            System.out.print("[");
            for (int i = 0; i < num.length; i++) {
                System.out.println(num[i]);
                ;
            }
            System.out.print("]");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Indice fuera de los limites del array");
        }finally {
            System.out.println("Bloque finalmente ejecutado");
        }
    }
}
