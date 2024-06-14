package loja;

public class App {
    public static void main(String[] args) {
        try {
            Produto produtoValido = new Produto("Maçã", 2.50);
            System.out.println("Produto criado com sucesso: " + produtoValido.getNome() + ", Preço: " + produtoValido.getPreco());
        } catch (NomeInvalidoException | PrecoInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Produto produtoNomeInvalido = new Produto("A", 2.50);
        } catch (NomeInvalidoException e) {
            System.out.println("Erro ao criar produto: " + e.getMessage());
        } catch (PrecoInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Produto produtoPrecoInvalido = new Produto("Banana", -1.00);
        } catch (NomeInvalidoException e) {
            System.out.println(e.getMessage());
        } catch (PrecoInvalidoException e) {
            System.out.println("Erro ao criar produto: " + e.getMessage());
        }
    }
}
