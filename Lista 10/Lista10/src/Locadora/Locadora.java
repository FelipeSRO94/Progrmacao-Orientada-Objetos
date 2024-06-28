package Locadora;

import java.util.ArrayList;
import java.util.List;

public class Locadora<T extends AudioVisual> {
    private List<T> acervo;

    public Locadora() {
        this.acervo = new ArrayList<>();
    }

    public void adicionarItem(T item) {
        acervo.add(item);
    }

    public void listarItens() {
        for (T item : acervo) {
            item.exibirInfo();
            System.out.println();
        }
    }

    public T buscarItem(String titulo) {
        for (T item : acervo) {
            if (item instanceof Filme && ((Filme) item).getTitulo().equals(titulo)) {
                return item;
            } else if (item instanceof Jogo && ((Jogo) item).getTitulo().equals(titulo)) {
                return item;
            }
        }
        return null;
    }
}
