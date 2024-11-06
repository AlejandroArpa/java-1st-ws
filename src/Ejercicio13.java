import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] candidatos = {"Candidato A", "Candidato B", "Candidato C"};
        int[] votos = new int[candidatos.length];

        System.out.println("Sistema de Votación Electrónica");
        System.out.println("Candidatos:");
        for (int i = 0; i < candidatos.length; i++) {
            System.out.println((i + 1) + ". " + candidatos[i]);
        }

        for (int i = 1; i <= 10; i++) {
            System.out.print("\nUsuario " + i + ", elige el número del candidato por el que deseas votar: ");
            int voto = scanner.nextInt();


            if (voto >= 1 && voto <= candidatos.length) {
                votos[voto - 1]++;
                System.out.println("Voto registrado para " + candidatos[voto - 1]);
            } else {
                System.out.println("Opción no válida. Inténtalo de nuevo.");
                i--;
            }
        }

        System.out.println("\nResultados de la Votación:");
        for (int i = 0; i < candidatos.length; i++) {
            System.out.println(candidatos[i] + ": " + votos[i] + " votos");
        }

        int maxVotos = 0;
        String ganador = "Empate";
        boolean empate = false;

        for (int i = 0; i < candidatos.length; i++) {
            if (votos[i] > maxVotos) {
                maxVotos = votos[i];
                ganador = candidatos[i];
                empate = false;
            } else if (votos[i] == maxVotos) {
                empate = true;
            }
        }

        if (empate) {
            System.out.println("\nResultado: Hay un empate entre los candidatos.");
        } else {
            System.out.println("\nEl ganador es: " + ganador + " con " + maxVotos + " votos.");
        }

        scanner.close();
    }
}
