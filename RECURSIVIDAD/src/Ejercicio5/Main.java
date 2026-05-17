package Ejercicio5;

public class Main {
    public static int contarDigitos(int n) {
        if (n < 10) {
            return 1; // Caso base: un solo dígito
        }

        return 1 + contarDigitos(n / 10); // Quitamos un dígito y contamos
    }

    public static void main(String[] args) {
        System.out.println(contarDigitos(1234));
    }
}
