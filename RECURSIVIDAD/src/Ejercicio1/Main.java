package Ejercicio1;

public class Main {


        public static int SumaRecursiva(int num) {
            if (num <= 0){
                return num;
            }else {
                return num + SumaRecursiva(num -1);
            }

        }


    public static void main(String[] args) {
        int numero = 5;
        System.out.println(SumaRecursiva(numero));
    }
}
