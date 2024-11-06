import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

class User {
    String username;
    String password;
    String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario: " + username + ", Email: " + email;
    }
}

public class Ejercicio5 {
    private static final ArrayList<User> users = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String option;

        do {
            System.out.println("\n--- Sistema de Registro de Usuarios ---");
            System.out.print("Ingrese un nombre de usuario: ");
            String username = scanner.nextLine();

            System.out.print("Ingrese un correo electrónico: ");
            String email = scanner.nextLine();

            String password;
            while (true) {
                System.out.print("Ingrese una contraseña: ");
                password = scanner.nextLine();
                if (isValidPassword(password)) {
                    break;
                } else {
                    System.out.println("La contraseña debe tener al menos 8 caracteres, una letra mayúscula y un número.");
                }
            }

            users.add(new User(username, password, email));
            System.out.println("Usuario registrado correctamente.");

            System.out.print("¿Desea registrar otro usuario? (si/no): ");
            option = scanner.nextLine();
        } while (option.equalsIgnoreCase("si"));

        scanner.close();
        displayRegisteredUsers();
    }

    // Método para validar la contraseña
    private static boolean isValidPassword(String password) {
        return password.length() >= 8 &&
                Pattern.compile("[A-Z]").matcher(password).find() &&  // Al menos una letra mayúscula
                Pattern.compile("[0-9]").matcher(password).find();    // Al menos un número
    }

    // Método para mostrar los usuarios registrados
    private static void displayRegisteredUsers() {
        System.out.println("\n--- Lista de Usuarios Registrados ---");
        for (User user : users) {
            System.out.println(user);
        }
    }
}
