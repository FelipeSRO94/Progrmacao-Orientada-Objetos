package LOJA;

import java.util.ArrayList;

public class Loja {
    private String nome;
    private ArrayList<Produto> produtos;

    public Loja(String nome) {
        this.nome = nome;
        this.produtos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public void listarProdutos() {
        for (Produto produto : produtos) {
            produto.exibirProduto();
            System.out.println("------------------------");
        }
    }
}
