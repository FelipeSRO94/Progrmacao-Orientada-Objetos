package eventos;

import java.util.List;

public class Show extends Evento {
    private List<String> artistas;

    public Show(String nome, String local, String data, List<String> artistas) {
        super(nome, local, data);
        this.artistas = artistas;
    }

    public List<String> getArtistas() {
        return artistas;
    }

    public void setArtistas(List<String> artistas) {
        this.artistas = artistas;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Artistas: " + String.join(", ", artistas));
    }

    @Override
    public void comecarEvento() {
        System.out.println("O show está começando!");
    }

    public void comecarEvento(boolean comAplausos) {
        if (comAplausos) {
            System.out.println("O show está começando com aplausos!");
        } else {
            System.out.println("O show está começando sem aplausos.");
        }
    }
}
