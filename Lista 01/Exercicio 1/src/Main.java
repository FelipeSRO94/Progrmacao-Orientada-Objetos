import java.util.Scanner;

public class Main {
    // Vetor global para armazenar números
    static int[] vetor = new int[10];

    static void preencherVetor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 10 números para preencher o vetor:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }
    }
    
    static boolean buscarNumero(int numero) {
        for (int i = 0; i < 10; i++) {
            if (vetor[i] == numero) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        preencherVetor();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para buscar no vetor:");
        int numeroBusca = scanner.nextInt();
        boolean encontrado = buscarNumero(numeroBusca);
        if (encontrado) {
            System.out.println("ACHEI");
        } else {
            System.out.println("NAO ACHEI");
        }
        scanner.close();
    }
}
