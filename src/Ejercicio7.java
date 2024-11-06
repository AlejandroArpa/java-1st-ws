import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {
    private static final ArrayList<String> reservations = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        System.out.println("--- Sistema de Gestión de Reservas de Restaurante ---");

        do {
            System.out.println("\n1. Agregar una reserva");
            System.out.println("2. Cancelar una reserva");
            System.out.println("3. Mostrar lista de reservas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (option) {
                case 1:
                    addReservation(scanner);
                    break;
                case 2:
                    cancelReservation(scanner);
                    break;
                case 3:
                    displayReservations();
                    break;
                case 4:
                    System.out.println("Saliendo del sistema de reservas.");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtelo nuevamente.");
            }
        } while (option != 4);

        scanner.close();
    }

    // Método para agregar una reserva
    private static void addReservation(Scanner scanner) {
        System.out.print("Ingrese el nombre del cliente: ");
        String name = scanner.nextLine();
        reservations.add(name);
        System.out.println("Reserva agregada para " + name);
    }

    // Método para cancelar una reserva
    private static void cancelReservation(Scanner scanner) {
        if (reservations.isEmpty()) {
            System.out.println("No hay reservas para cancelar.");
            return;
        }

        System.out.print("Ingrese el nombre del cliente a cancelar: ");
        String name = scanner.nextLine();
        if (reservations.remove(name)) {
            System.out.println("Reserva cancelada para " + name);
        } else {
            System.out.println("No se encontró una reserva para " + name);
        }
    }

    // Método para mostrar todas las reservas confirmadas
    private static void displayReservations() {
        System.out.println("\n--- Lista de Reservas Confirmadas ---");
        if (reservations.isEmpty()) {
            System.out.println("No hay reservas confirmadas.");
        } else {
            for (String name : reservations) {
                System.out.println("Reserva para: " + name);
            }
        }
    }
}
