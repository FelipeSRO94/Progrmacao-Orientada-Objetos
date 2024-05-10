import java.util.Scanner;

public class MediaNotas {

    static double[] A = new double[3];

    static Scanner scanner = new Scanner(System.in);

    static void receberNotas() {
        System.out.println("Digite as notas dos 3 críticos:");

        for (int i = 0; i < 3; i++) {
            A[i] = scanner.nextDouble();
        }
    }

    static void calcularMedia() {
        double soma = 0;
        for (double nota : A) {
            soma += nota;
        }
        double media = soma / 3.0;
        System.out.println("A média das notas é: " + media);
    }

    public static void main(String[] args) {
        receberNotas();
        calcularMedia();
        scanner.close();
    }
}
