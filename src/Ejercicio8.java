import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    double average;

    public Student(String name, double average) {
        this.name = name;
        this.average = average;
    }

    @Override
    public String toString() {
        return "Nombre: " + name + ", Promedio: " + average;
    }
}

public class Ejercicio8 {
    private static final ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        System.out.println("--- Sistema de Gestión de Estudiantes ---");

        do {
            System.out.println("\n1. Agregar un nuevo estudiante");
            System.out.println("2. Mostrar lista de estudiantes");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (option) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    System.out.println("Saliendo del sistema de gestión de estudiantes.");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtelo nuevamente.");
            }
        } while (option != 3);

        scanner.close();
    }

    // Método para agregar un nuevo estudiante
    private static void addStudent(Scanner scanner) {
        System.out.print("Ingrese el nombre del estudiante: ");
        String name = scanner.nextLine();
        System.out.print("Ingrese el promedio del estudiante: ");
        double average = scanner.nextDouble();

        students.add(new Student(name, average));
        System.out.println("Estudiante agregado correctamente.");
    }

    // Método para mostrar la lista de estudiantes con su promedio
    private static void displayStudents() {
        System.out.println("\n--- Lista de Estudiantes ---");
        if (students.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}
