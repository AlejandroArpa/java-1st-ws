import java.util.Scanner;

public class Ejercicio6 {
    private static final int ROWS = 5;
    private static final int COLUMNS = 5;
    private static final char AVAILABLE = 'O';
    private static final char OCCUPIED = 'X';
    private static final char[][] seats = new char[ROWS][COLUMNS];

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    initializeSeats();
    String option;

        System.out.println("--- Sistema de Reservas de Cine ---");

        do {
        displaySeats();
        System.out.print("Ingrese el número de fila (1 a 5): ");
        int row = scanner.nextInt() - 1;

        System.out.print("Ingrese el número de columna (1 a 5): ");
        int column = scanner.nextInt() - 1;

        if (isSeatAvailable(row, column)) {
            reserveSeat(row, column);
            System.out.println("Asiento reservado con éxito.");
        } else {
            System.out.println("El asiento ya está ocupado. Por favor, seleccione otro asiento.");
        }

        System.out.print("¿Desea hacer otra reserva? (si/no): ");
        option = scanner.next();
    } while (option.equalsIgnoreCase("si"));

        System.out.println("Estado final de los asientos:");
    displaySeats();
        scanner.close();
}

// Método para inicializar los asientos como disponibles
private static void initializeSeats() {
    for (int i = 0; i < ROWS; i++) {
        for (int j = 0; j < COLUMNS; j++) {
            seats[i][j] = AVAILABLE;
        }
    }
}

// Método para mostrar el estado actual de los asientos
private static void displaySeats() {
    System.out.println("\n--- Disposición de Asientos ---");
    for (int i = 0; i < ROWS; i++) {
        for (int j = 0; j < COLUMNS; j++) {
            System.out.print(seats[i][j] + " ");
        }
        System.out.println();
    }
}

// Método para verificar si un asiento está disponible
private static boolean isSeatAvailable(int row, int column) {
    return seats[row][column] == AVAILABLE;
}

// Método para reservar un asiento
private static void reserveSeat(int row, int column) {
    seats[row][column] = OCCUPIED;
}
}
