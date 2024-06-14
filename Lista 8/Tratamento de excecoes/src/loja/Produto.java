package loja;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) throws NomeInvalidoException, PrecoInvalidoException {
        if (nome.length() < 3) {
            throw new NomeInvalidoException("O nome deve ter pelo menos 3 caracteres.");
        }
        if (preco <= 0) {
            throw new PrecoInvalidoException("O preço deve ser maior que zero.");
        }
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws NomeInvalidoException {
        if (nome.length() < 3) {
            throw new NomeInvalidoException("O nome deve ter pelo menos 3 caracteres.");
        }
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) throws PrecoInvalidoException {
        if (preco <= 0) {
            throw new PrecoInvalidoException("O preço deve ser maior que zero.");
        }
        this.preco = preco;
    }
}
