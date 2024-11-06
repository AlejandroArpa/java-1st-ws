import java.util.Scanner;

public class Ejercicio3 {
    private static final String[] tasks = new String[10];
    private static final boolean[] completed = new boolean[10];
    private static int taskCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n--- Sistema de Gestión de Tareas Pendientes ---");
            System.out.println("1. Agregar una nueva tarea");
            System.out.println("2. Marcar una tarea como completada");
            System.out.println("3. Mostrar lista de tareas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    addTask(scanner);
                    break;
                case 2:
                    markTaskAsCompleted(scanner);
                    break;
                case 3:
                    displayTasks();
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtelo nuevamente.");
            }
        } while (option != 4);

        scanner.close();
    }

    private static void addTask(Scanner scanner) {
        if (taskCount < tasks.length) {
            System.out.print("Ingrese la tarea: ");
            String task = scanner.nextLine();
            tasks[taskCount] = task;
            completed[taskCount] = false;
            taskCount++;
            System.out.println("Tarea agregada correctamente.");
        } else {
            System.out.println("La lista de tareas está llena.");
        }
    }

    private static void markTaskAsCompleted(Scanner scanner) {
        displayTasks();
        System.out.print("Ingrese el número de la tarea que desea marcar como completada: ");
        int taskNumber = scanner.nextInt();
        if (taskNumber > 0 && taskNumber <= taskCount) {
            completed[taskNumber - 1] = true;
            System.out.println("Tarea marcada como completada.");
        } else {
            System.out.println("Número de tarea inválido.");
        }
    }

    private static void displayTasks() {
        System.out.println("\n--- Lista de Tareas ---");
        for (int i = 0; i < taskCount; i++) {
            String status = completed[i] ? "Completada" : "Pendiente";
            System.out.printf("%d. %s [%s]\n", i + 1, tasks[i], status);
        }
    }
}
