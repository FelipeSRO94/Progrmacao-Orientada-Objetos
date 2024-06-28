package Locadora;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> atoresFilme1 = new ArrayList<>(Arrays.asList("Michael Jordan", "Wayne Knight"));
        Filme filme1 = new Filme("Space Jam: O Jogo do Século", "Joe Pytka", atoresFilme1);
        Jogo jogo1 = new Jogo("Side Pocket", "Super Nintendo");

        Locadora<AudioVisual> locadora = new Locadora<>();
        locadora.adicionarItem(filme1);
        locadora.adicionarItem(jogo1);

        System.out.println("Itens disponíveis na locadora:");
        locadora.listarItens();

        System.out.println("Buscando item pelo título 'Space Jam: O Jogo do Século':");
        AudioVisual itemBuscado = locadora.buscarItem("Space Jam: O Jogo do Século");
        if (itemBuscado != null) {
            itemBuscado.exibirInfo();
        } else {
            System.out.println("Item não encontrado.");
        }
    }
}
