import java.util.Scanner;

public class Ejercicio2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el numero de asistentes: ");
        int attendants = scanner.nextInt();
        scanner.nextLine();
        for(int i=0; i<attendants; i++){
            System.out.println("Boletas disponibles "+(attendants-i));
            System.out.println("Desea reservar?");
            String res = scanner.nextLine();
            if(res.equals("si")){
                System.out.println("Reserva creada");
                continue;
            }
            i--;
        }
        System.out.println("No hay boletas disponibles");
        scanner.close();
    }

}