import java.util.Arrays;
import java.util.Scanner;

class Proyecto {
    private String nombre;
    private double calificacion;

    public Proyecto(String nombre, double calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCalificacion() {
        return calificacion;
    }
}

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Proyecto[] proyectos = new Proyecto[5];

        for (int i = 0; i < proyectos.length; i++) {
            System.out.print("Ingresa el nombre del proyecto " + (i + 1) + ": ");
            String nombre = scanner.nextLine();
            System.out.print("Ingresa la calificación para " + nombre + ": ");
            double calificacion = scanner.nextDouble();
            scanner.nextLine();

            proyectos[i] = new Proyecto(nombre, calificacion);
        }

        Arrays.sort(proyectos, (p1, p2) -> Double.compare(p2.getCalificacion(), p1.getCalificacion()));

        System.out.println("\nProyectos ordenados por calificación (de mayor a menor):");
        for (Proyecto proyecto : proyectos) {
            System.out.printf("Proyecto: %s - Calificación: %.2f%n", proyecto.getNombre(), proyecto.getCalificacion());
        }

        scanner.close();
    }
}
