package Ejercicio2;

public class Main {
    public static void ImprimeNumerosHastaN(int n){
        if (n == 0){
            return;
        }

        ImprimeNumerosHastaN(n - 1); // Llamada recursiva
        System.out.println(n);       // Se ejecuta al volver
    }

    public static void main(String[] args) {

        ImprimeNumerosHastaN(10);
    }
}
