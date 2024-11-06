import java.util.ArrayList;
import java.util.Scanner;

class Empleado {
    private final String nombre;
    private final String puesto;
    private final double salario;

    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Puesto: " + puesto);
        System.out.println("Salario: $" + salario);
    }
}

public class Ejercicio14 {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        empleados.add(new Empleado("Carlos Pérez", "Gerente", 5000));
        empleados.add(new Empleado("Ana López", "Asistente", 3000));
        empleados.add(new Empleado("Luis Gómez", "Desarrollador", 4500));

        boolean continuar = true;

        while (continuar) {
            System.out.println("\nGestión de Empleados");
            System.out.println("1. Buscar empleado por nombre");
            System.out.println("2. Buscar empleados por puesto");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el nombre del empleado: ");
                    String nombreBuscado = scanner.nextLine();
                    boolean encontradoPorNombre = false;

                    for (Empleado empleado : empleados) {
                        if (empleado.getNombre().equalsIgnoreCase(nombreBuscado)) {
                            System.out.println("\nEmpleado encontrado:");
                            empleado.mostrarDetalles();
                            encontradoPorNombre = true;
                            break;
                        }
                    }
                    if (!encontradoPorNombre) {
                        System.out.println("No se encontró un empleado con el nombre especificado.");
                    }
                    break;

                case 2:
                    System.out.print("Ingresa el puesto de los empleados a buscar: ");
                    String puestoBuscado = scanner.nextLine();
                    boolean encontradoPorPuesto = false;

                    System.out.println("\nEmpleados encontrados en el puesto de " + puestoBuscado + ":");
                    for (Empleado empleado : empleados) {
                        if (empleado.getPuesto().equalsIgnoreCase(puestoBuscado)) {
                            empleado.mostrarDetalles();
                            System.out.println();
                            encontradoPorPuesto = true;
                        }
                    }
                    if (!encontradoPorPuesto) {
                        System.out.println("No se encontraron empleados en el puesto especificado.");
                    }
                    break;

                case 3:
                    continuar = false;
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }

        scanner.close();
    }
}
