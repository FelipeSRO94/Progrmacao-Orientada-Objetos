package Locadora;

import java.util.List;

public class Filme implements AudioVisual {
    private String titulo;
    private String diretor;
    private List<String> atores;

    public Filme(String titulo, String diretor, List<String> atores) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.atores = atores;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Filme: " + titulo);
        System.out.println("Diretor: " + diretor);
        System.out.println("Atores: " + String.join(", ", atores));
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public List<String> getAtores() {
        return atores;
    }

    public void setAtores(List<String> atores) {
        this.atores = atores;
    }
}
