import java.util.Scanner;

public class Main {
    static boolean[][] mapa = new boolean[4][4];
 
    static void preencherMapa() {
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                mapa[i][j] = false;
            }
        }
    }

    static void ativarTorre(int linha, int coluna) {
        
        if (linha >= 0 && linha < mapa.length && coluna >= 0 && coluna < mapa[0].length) {
            mapa[linha][coluna] = true; 
        } else {
            System.out.println("Coordenadas inválidas. A torre não pode ser ativada.");
        }
    }

    static void imprimirMapa() {
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                if (mapa[i][j]) {
                    System.out.print("|O");
                } else {
                    System.out.print("|X");
                }
            }
            System.out.println("|");
        }
    }

    public static void main(String[] args) {
        preencherMapa();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a linha da torre:");
        int linha = scanner.nextInt();
        System.out.println("Digite a coluna da torre:");
        int coluna = scanner.nextInt();
        
        ativarTorre(linha, coluna);
        
        imprimirMapa();
        
        scanner.close();
    }
}
