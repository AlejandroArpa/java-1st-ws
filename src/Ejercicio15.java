import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] habitaciones = {
                {'O', 'O', 'O', 'O'},
                {'O', 'O', 'O', 'O'},
                {'O', 'O', 'O', 'O'},
                {'O', 'O', 'O', 'O'}
        };

        boolean continuar = true;

        while (continuar) {
            System.out.println("Estado actual de las habitaciones:");
            mostrarHabitaciones(habitaciones);

            System.out.print("Ingresa el número de fila (0 a 3): ");
            int fila = scanner.nextInt();
            System.out.print("Ingresa el número de columna (0 a 3): ");
            int columna = scanner.nextInt();

            if (fila >= 0 && fila < 4 && columna >= 0 && columna < 4) {
                if (habitaciones[fila][columna] == 'O') {
                    habitaciones[fila][columna] = 'X';
                    System.out.println("La habitación ha sido reservada exitosamente.");
                } else {
                    System.out.println("La habitación ya está ocupada. Por favor, elige otra.");
                }
            } else {
                System.out.println("Posición no válida. Debes elegir entre 0 y 3 para filas y columnas.");
            }

            System.out.print("¿Deseas reservar otra habitación? (s/n): ");
            char respuesta = scanner.next().toLowerCase().charAt(0);
            continuar = (respuesta == 's');
        }

        System.out.println("Sistema de reservas finalizado.");
        scanner.close();
    }

    public static void mostrarHabitaciones(char[][] habitaciones) {
        for (int i = 0; i < habitaciones.length; i++) {
            for (int j = 0; j < habitaciones[i].length; j++) {
                System.out.print(habitaciones[i][j] + " ");
            }
            System.out.println();
        }
    }
}
