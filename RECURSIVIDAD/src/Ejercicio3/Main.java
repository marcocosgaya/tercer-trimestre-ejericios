package Ejercicio3;



public class Main {
    public static void ImprimeNumerosHasta1(int n){
        if (n == 0){
            return; // Caso base
        }
        System.out.println(n);
        ImprimeNumerosHasta1(n - 1);

    }
    public static void main(String[] args) {
        ImprimeNumerosHasta1(10);
    }
}
