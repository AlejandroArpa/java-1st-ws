import java.util.ArrayList;
import java.util.Scanner;

class Product {
    String name;
    boolean inStock;

    public Product(String name, boolean inStock) {
        this.name = name;
        this.inStock = inStock;
    }

    @Override
    public String toString() {
        return name + (inStock ? " (Disponible)" : " (Agotado)");
    }
}

public class Ejercicio4 {
    private static final ArrayList<Product> inventory = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n--- Gestión de Inventario ---");
            System.out.println("1. Agregar un nuevo producto");
            System.out.println("2. Eliminar un producto");
            System.out.println("3. Mostrar inventario completo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    addProduct(scanner);
                    break;
                case 2:
                    removeProduct(scanner);
                    break;
                case 3:
                    displayInventory();
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

    private static void addProduct(Scanner scanner) {
        System.out.print("Ingrese el nombre del producto: ");
        String name = scanner.nextLine();
        System.out.print("¿Está en stock? (si/no): ");
        boolean inStock = scanner.nextLine().equalsIgnoreCase("si");
        inventory.add(new Product(name, inStock));
        System.out.println("Producto agregado correctamente.");
    }

    private static void removeProduct(Scanner scanner) {
        displayInventory();
        System.out.print("Ingrese el número del producto a eliminar: ");
        int index = scanner.nextInt();
        if (index > 0 && index <= inventory.size()) {
            inventory.remove(index - 1);
            System.out.println("Producto eliminado del inventario.");
        } else {
            System.out.println("Número de producto inválido.");
        }
    }

    private static void displayInventory() {
        System.out.println("\n--- Inventario de la Tienda ---");
        if (inventory.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            for (int i = 0; i < inventory.size(); i++) {
                System.out.printf("%d. %s\n", i + 1, inventory.get(i));
            }
        }
    }
}
