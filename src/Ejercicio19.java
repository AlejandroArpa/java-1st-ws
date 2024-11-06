import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> nombresProductos = new ArrayList<>();
        ArrayList<Double> preciosProductos = new ArrayList<>();

        boolean continuar = true;

        while (continuar) {
            System.out.println("\nSistema de Control de Inventario");
            System.out.println("1. Agregar producto y precio");
            System.out.println("2. Mostrar inventario");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingresa el precio del producto: ");
                    double precio = scanner.nextDouble();
                    scanner.nextLine();

                    nombresProductos.add(nombre);
                    preciosProductos.add(precio);
                    System.out.println("Producto agregado exitosamente.");
                    break;

                case 2:
                    System.out.println("\nInventario de Productos:");
                    for (int i = 0; i < nombresProductos.size(); i++) {
                        System.out.printf("Producto: %s - Precio: $%.2f%n", nombresProductos.get(i), preciosProductos.get(i));
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
