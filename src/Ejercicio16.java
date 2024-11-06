import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] gastosMensuales = new double[12];
        double gastoTotal = 0;

        System.out.println("Registro de Gastos Mensuales");

        for (int i = 0; i < 12; i++) {
            System.out.print("Ingresa el gasto del mes " + (i + 1) + ": ");
            gastosMensuales[i] = scanner.nextDouble();
            gastoTotal += gastosMensuales[i];
        }

        double promedioGastos = gastoTotal / 12;

        System.out.println("\nResumen de Gastos Anuales:");
        System.out.printf("Gasto Total del Año: $%.2f%n", gastoTotal);
        System.out.printf("Promedio de Gastos Mensuales: $%.2f%n", promedioGastos);

        scanner.close();
    }
}
