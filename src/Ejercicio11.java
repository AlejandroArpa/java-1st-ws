import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        ArrayList<String> productos = new ArrayList<>(); // Arreglo dinámico para los nombres de productos
        ArrayList<Integer> cantidades = new ArrayList<>(); // Arreglo dinámico para las cantidades

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nSistema de Inventario");
            System.out.println("1. Agregar nuevo producto");
            System.out.println("2. Actualizar cantidad de producto");
            System.out.println("3. Mostrar inventario");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el nombre del producto: ");
                    String nombreProducto = scanner.nextLine();
                    System.out.print("Ingresa la cantidad en stock: ");
                    int cantidad = scanner.nextInt();
                    productos.add(nombreProducto);
                    cantidades.add(cantidad);
                    System.out.println("Producto agregado con éxito.");
                    break;

                case 2:
                    System.out.print("Ingresa el nombre del producto a actualizar: ");
                    String productoActualizar = scanner.nextLine();
                    int indice = productos.indexOf(productoActualizar);
                    if (indice != -1) {
                        System.out.print("Ingresa la nueva cantidad: ");
                        int nuevaCantidad = scanner.nextInt();
                        cantidades.set(indice, nuevaCantidad);
                        System.out.println("Cantidad actualizada con éxito.");
                    } else {
                        System.out.println("El producto no existe en el inventario.");
                    }
                    break;

                case 3:
                    System.out.println("\nInventario de Productos:");
                    for (int i = 0; i < productos.size(); i++) {
                        System.out.println("Producto: " + productos.get(i) + " | Cantidad: " + cantidades.get(i));
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
