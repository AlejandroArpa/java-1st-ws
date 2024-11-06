import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double facturaElectricidad = 0.0;
        double facturaAgua = 0.0;
        double facturaInternet = 0.0;

        System.out.print("Ingresa el monto de la factura de electricidad: ");
        facturaElectricidad = scanner.nextDouble();

        System.out.print("Ingresa el monto de la factura de agua: ");
        facturaAgua = scanner.nextDouble();

        System.out.print("Ingresa el monto de la factura de internet: ");
        facturaInternet = scanner.nextDouble();

        double totalAPagar = facturaElectricidad + facturaAgua + facturaInternet;
        System.out.println("\nTotal a pagar por todas las facturas: $" + totalAPagar);

        boolean continuar = true;

        while (continuar && totalAPagar > 0) {
            System.out.println("\nOpciones de pago:");
            System.out.println("1. Pagar factura de electricidad");
            System.out.println("2. Pagar factura de agua");
            System.out.println("3. Pagar factura de internet");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    if (facturaElectricidad > 0) {
                        totalAPagar -= facturaElectricidad;
                        System.out.println("Factura de electricidad pagada: $" + facturaElectricidad);
                        facturaElectricidad = 0;
                    } else {
                        System.out.println("La factura de electricidad ya está pagada.");
                    }
                    break;

                case 2:
                    if (facturaAgua > 0) {
                        totalAPagar -= facturaAgua;
                        System.out.println("Factura de agua pagada: $" + facturaAgua);
                        facturaAgua = 0;
                    } else {
                        System.out.println("La factura de agua ya está pagada.");
                    }
                    break;

                case 3:
                    if (facturaInternet > 0) {
                        totalAPagar -= facturaInternet;
                        System.out.println("Factura de internet pagada: $" + facturaInternet);
                        facturaInternet = 0;
                    } else {
                        System.out.println("La factura de internet ya está pagada.");
                    }
                    break;

                case 4:
                    continuar = false;
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }

            System.out.println("Total restante a pagar: $" + totalAPagar);
        }

        if (totalAPagar == 0) {
            System.out.println("Todas las facturas han sido pagadas.");
        }

        scanner.close();
    }
}
