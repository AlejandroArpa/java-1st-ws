import java.util.ArrayList;
import java.util.Scanner;

class Vehiculo {
    private String matricula;
    private String modelo;
    private String estado;

    public Vehiculo(String matricula, String modelo, String estado) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.estado = estado;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void mostrarDetalles() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("Modelo: " + modelo);
        System.out.println("Estado: " + estado);
    }
}

public class Ejercicio18 {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nSistema de Gestión de Vehículos");
            System.out.println("1. Registrar nuevo vehículo");
            System.out.println("2. Actualizar estado de un vehículo");
            System.out.println("3. Mostrar vehículos disponibles");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa la matrícula del vehículo: ");
                    String matricula = scanner.nextLine();
                    System.out.print("Ingresa el modelo del vehículo: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Ingresa el estado del vehículo (disponible/ocupado): ");
                    String estado = scanner.nextLine().toLowerCase();

                    vehiculos.add(new Vehiculo(matricula, modelo, estado));
                    System.out.println("Vehículo registrado exitosamente.");
                    break;

                case 2:
                    System.out.print("Ingresa la matrícula del vehículo a actualizar: ");
                    String matriculaBuscar = scanner.nextLine();
                    boolean encontrado = false;

                    for (Vehiculo vehiculo : vehiculos) {
                        if (vehiculo.getMatricula().equalsIgnoreCase(matriculaBuscar)) {
                            System.out.print("Ingresa el nuevo estado (disponible/ocupado): ");
                            String nuevoEstado = scanner.nextLine().toLowerCase();
                            vehiculo.setEstado(nuevoEstado);
                            System.out.println("Estado actualizado exitosamente.");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Vehículo no encontrado.");
                    }
                    break;

                case 3:
                    System.out.println("\nVehículos disponibles:");
                    boolean hayDisponibles = false;

                    for (Vehiculo vehiculo : vehiculos) {
                        if (vehiculo.getEstado().equalsIgnoreCase("disponible")) {
                            vehiculo.mostrarDetalles();
                            System.out.println();
                            hayDisponibles = true;
                        }
                    }

                    if (!hayDisponibles) {
                        System.out.println("No hay vehículos disponibles.");
                    }
                    break;

                case 4:
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
