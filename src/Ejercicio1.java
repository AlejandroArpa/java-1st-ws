import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Introduce tu edad: ");
            byte age = scanner.nextByte();
            if (age < 0) {
                throw new Exception("Edad incorrecta");
            }
            if (age >= 18) {
                System.out.println("Acceso permitido");
                scanner.close();
                return;
            }
            System.out.println("Acceso no permitido");

        } catch (Exception error) {
            System.out.println("Uppps... Ocurrio un error " + error);
        }

    }

}