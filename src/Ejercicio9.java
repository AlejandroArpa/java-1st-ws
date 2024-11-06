import java.util.Scanner;

public class Ejercicio9 {
    private static final int EMPLOYEE_COUNT = 5;
    private static final String[] employeeNames = new String[EMPLOYEE_COUNT];
    private static final int[] employeeRatings = new int[EMPLOYEE_COUNT];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar los nombres de los empleados
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.print("Ingrese el nombre del empleado " + (i + 1) + ": ");
            employeeNames[i] = scanner.nextLine();
        }

        // Asignar calificaciones a cada empleado
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            int rating;
            do {
                System.out.print("Ingrese la calificación de desempeño (1 a 10) para " + employeeNames[i] + ": ");
                rating = scanner.nextInt();
                if (rating < 1 || rating > 10) {
                    System.out.println("Calificación inválida. Debe estar entre 1 y 10.");
                }
            } while (rating < 1 || rating > 10);
            employeeRatings[i] = rating;
        }

        // Mostrar el empleado con la calificación más alta y más baja
        int highestIndex = 0;
        int lowestIndex = 0;

        for (int i = 1; i < EMPLOYEE_COUNT; i++) {
            if (employeeRatings[i] > employeeRatings[highestIndex]) {
                highestIndex = i;
            }
            if (employeeRatings[i] < employeeRatings[lowestIndex]) {
                lowestIndex = i;
            }
        }

        System.out.println("\n--- Resultados de Evaluación de Desempeño ---");
        System.out.println("Empleado con la calificación más alta: " + employeeNames[highestIndex] + " (Calificación: " + employeeRatings[highestIndex] + ")");
        System.out.println("Empleado con la calificación más baja: " + employeeNames[lowestIndex] + " (Calificación: " + employeeRatings[lowestIndex] + ")");

        scanner.close();
    }
}
