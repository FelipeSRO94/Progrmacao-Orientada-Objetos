class grimorio {
    String livro, efeito, cor;

    grimorio(String livro, String efeito, String cor) {
        this.livro = livro;
        this.efeito = efeito;
        this.cor = cor;
    }

    void exibirDados() {
        System.out.println("Tipo de livro: " + livro + ", Efeito: " + efeito + ", Cor: " + cor);
    }

    void TipoDoLivro() {
        System.out.println("O Livro tem sua aura " + efeito + " para um grande proposito.");
    }

    void corLivro() {
        System.out.println("O Livro " + cor + " pode usar quantas vezes quiser ate a Mana acabar.");
    }
}

class Pessoa {
    String nome, profissao;
    int idade;

    Pessoa(String nome, int idade, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }

    void exibirDados() {
        System.out.println("Nome: " + nome + ", Idade: " + idade + ", Profissão: " + profissao);
    }

    void cumprimentar() {
        System.out.println("Olá, meu nome é " + nome + ".");
    }

    void trabalhar() {
        System.out.println(nome + " está trabalhando como " + profissao + ".");
    }
}

class tiposZumbis {
    String nome, tipo, alimento;

    tiposZumbis(String nome, String tipo, String alimento) {
        this.nome = nome;
        this.tipo = tipo;
        this.alimento = alimento;
    }

    void exibirDados() {
        System.out.println("Nome: " + nome + ", Tipo: " + tipo + ", Alimento: " + alimento);
    }

    void alimentoZumbi() {
        System.out.println("A forma que " + alimento + " é de forma fluida.");
    }

    void movimento() {
        System.out.println("A movimentação do " + nome + " é feita de uma maneira unica.");
    }
}

public class App {
    public static void main(String[] args) {
        grimorio book = new grimorio("Magico", "Revive os mortos e os controla", "Preto");
        Pessoa pessoa = new Pessoa("Pedro", 30, "Necromante");
        tiposZumbis zombi = new tiposZumbis("Zumbi Magico", "Magico", "se alimenta da magia do necromante");

        book.exibirDados();
        pessoa.exibirDados();
        zombi.exibirDados();

        book.TipoDoLivro();
        pessoa.cumprimentar();
        zombi.alimentoZumbi();
    }
}
