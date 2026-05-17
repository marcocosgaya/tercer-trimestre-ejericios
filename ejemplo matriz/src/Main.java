public class Main {
    public static void main(String[] args) {
        int[][] matriz = {
                {3, 8, 1, 4},
                {9, 2, 7, 6},
                {5, 11, 0, 13},
                {12, 14, 10, 15}
        };

        int mayor = matriz[0][0];
        int filaMayor = 0;
        int colMayor = 0;

        for (int i = 1; i < matriz.length; i++) {
            for (int j = 1; j < matriz[i].length; j++) {
                if (matriz[i][j] > mayor) {
                    filaMayor = i;
                    colMayor = j;
                }

            }
            System.out.println();
        }

        System.out.println("\nEl número mayor es: " + mayor);
        System.out.println("Se encuentra en la fila " + filaMayor + " y columna " + colMayor);

    }
}
