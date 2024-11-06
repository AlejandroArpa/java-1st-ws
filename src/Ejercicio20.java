import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] asientos = new char[6][6];

        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                asientos[i][j] = 'O';
            }
        }

        boolean continuar = true;

        while (continuar) {
            System.out.println("\nMapa de Asientos (O = Libre, X = Ocupado):");
            mostrarAsientos(asientos);

            System.out.print("\nIngresa el número de fila (1-6): ");
            int fila = scanner.nextInt() - 1;
            System.out.print("Ingresa el número de asiento (1-6): ");
            int columna = scanner.nextInt() - 1;

            if (fila >= 0 && fila < 6 && columna >= 0 && columna < 6) {
                if (asientos[fila][columna] == 'O') {
                    asientos[fila][columna] = 'X';
                    System.out.println("Asiento reservado exitosamente.");
                } else {
                    System.out.println("Ese asiento ya está ocupado. Elige otro asiento.");
                }
            } else {
                System.out.println("Ubicación no válida. Por favor, elige un asiento entre 1 y 6 para fila y columna.");
            }

            System.out.print("¿Deseas hacer otra reserva? (s/n): ");
            char respuesta = scanner.next().toLowerCase().charAt(0);
            if (respuesta != 's') {
                continuar = false;
            }
        }

        System.out.println("\nMapa final de asientos:");
        mostrarAsientos(asientos);

        scanner.close();
    }

    private static void mostrarAsientos(char[][] asientos) {
        System.out.println("   1 2 3 4 5 6");
        for (int i = 0; i < asientos.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < asientos[i].length; j++) {
                System.out.print(" " + asientos[i][j]);
            }
            System.out.println();
        }
    }
}
