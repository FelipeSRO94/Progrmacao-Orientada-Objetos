import java.util.Scanner;

public class Exercicio1 {
    private static int NUMERO_PERGUNTAS = 3;
    private static String[] B = new String[NUMERO_PERGUNTAS];
    private static String[] C = new String[NUMERO_PERGUNTAS];
    private static Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args) {
        String nomeParticipante = receberNomeParticipante();
        comecarQuiz(nomeParticipante);
        fazerPerguntas(nomeParticipante);
        apresentarResultado(nomeParticipante);
    }

    public static String receberNomeParticipante() {
        System.out.println("Será você um verdadeiro conhecedor de perguntas aleatorias?!?!\n Digite seu nome para começar:");
        return formatarNome(SCAN.nextLine());
    }

    public static String formatarNome(String nome) {
        if (nome.isBlank()) {
            return "NPC";
        }
        nome = nome.trim();
        String[] nomeCompleto = nome.split(" ");
        String primeiroNome = nomeCompleto[0];
        String primeiraLetraDoNome = String.valueOf(primeiroNome.charAt(0));
        String primeiroNomeSemInicial = primeiroNome.substring(1);
        String nomeFormatado = primeiraLetraDoNome.toUpperCase() + primeiroNomeSemInicial.toLowerCase();
        return nomeFormatado;
    }

    public static void comecarQuiz(String nomeParticipante) {
        System.out.println(String.format(
                "Vamos começar %s!!!\n" +
                        "Mas antes, preciso te explicar uma coisa.\n" +
                        "Se a letra da alternativa enviada for diferente das disponíveis, também será considerado errado.\n" +
                        "Aperte ENTER para começar.\n",
                nomeParticipante
        ));
        SCAN.nextLine();
    }

    public static void fazerPerguntas(String nome) {
        for (int i = 0; i < NUMERO_PERGUNTAS; i++) {
            String resposta = "";
            do {
                System.out.println(String.format("%d - %s\n", (i + 1), obterPergunta(i + 1)));
                resposta = SCAN.nextLine();
            } while (!ehUmaRespostaValida(resposta));
            C[i] = obterRespostaCorreta(i + 1);
            B[i] = resposta;
        }
    }

    public static String obterPergunta(int numeroPergunta) {
        switch (numeroPergunta) {
            case 1:
                return "Qual é o maior animal que come com o rabo?\n" +
                        "A) Todos\n" +
                        "B) Macaco sagui\n" +
                        "C) Serpentes";
            case 2:
                return "Quantas vez é possivel pular de um avião sem para-quedas?\n" +
                        "A) 1\n" +
                        "B) 2\n" +
                        "C) 0";
            case 3:
                return "Quel o programa favorito dos Avós?\n" +
                        "A) Jornal nacional\n" +
                        "B) A voz do Brasil\n" +
                        "C) Novela das 21:00";
            default:
                return "";
        }
    }

    public static String obterRespostaCorreta(int numeroPergunta) {
        switch (numeroPergunta) {
            case 1:
                return "A";
            case 2:
                return "A";
            case 3:
                return "B";
            default:
                return "";
        }
    }

    public static boolean ehUmaRespostaValida(String resposta) {
        if (resposta.isBlank()) {
            System.out.println("Sua resposta não pode ser vazia. Vamos enviar a pergunta novamente.");
            return false;
        }
        return true;
    }

    public static void apresentarResultado(String nomeParticipante) {
        System.out.println(String.format(
                "%s, vamos ver se você é Inteligente mesmo.\n" +
                        "Veja quais perguntas você acertou:\n",
                nomeParticipante
        ));
        for (int i = 0; i < NUMERO_PERGUNTAS; i++) {
            System.out.println(String.format(
                    "%d - %s",
                    (i + 1),
                    B[i].equalsIgnoreCase(C[i]) ? "ACERTOU" : "ERROU"
            ));
        }
    }
}
