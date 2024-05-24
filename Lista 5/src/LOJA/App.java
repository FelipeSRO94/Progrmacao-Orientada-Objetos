package LOJA;

public class App {
    public static void main(String[] args) {
       
        Loja minhaLoja = new Loja("Loja de Yu-Gi-Oh");

        Produto produto1 = new Produto(1, "Ash do pézinho", 250.00);
        Produto produto2 = new Produto(2, "TTT", 150.00);
        Produto produto3 = new Produto(3, "Pote da Ganancia (Japones assinano pelo Kazuma)", 12000.00);

        minhaLoja.adicionarProduto(produto1);
        minhaLoja.adicionarProduto(produto2);
        minhaLoja.adicionarProduto(produto3);

        System.out.println("Produtos disponíveis na " + minhaLoja.getNome() + ":");
        minhaLoja.listarProdutos();
    }
}
