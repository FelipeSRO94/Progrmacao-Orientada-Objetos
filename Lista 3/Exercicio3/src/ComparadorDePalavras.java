import java.util.Scanner;

public class ComparadorDePalavras {

    static void compararPalavras(String palavra1, String palavra2) {
        if (palavra1.equals(palavra2)) {
            System.out.println("As palavras são idênticas.");
            return;
        }

        if (palavra1.equalsIgnoreCase(palavra2)) {
            System.out.println("As palavras são iguais, ignorando maiúsculas e minúsculas.");
            return;
        }

        System.out.println("As palavras são diferentes.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira palavra:");
        String palavra1 = scanner.nextLine();

        System.out.println("Digite a segunda palavra:");
        String palavra2 = scanner.nextLine();

        compararPalavras(palavra1, palavra2);

        scanner.close();
    }
}
