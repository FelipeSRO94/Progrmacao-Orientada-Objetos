package eventos;

public final class StandUp extends Evento {
    private String comediante;

    public StandUp(String nome, String local, String data, String comediante) {
        super(nome, local, data);
        this.comediante = comediante;
    }

    public String getComediante() {
        return comediante;
    }

    public void setComediante(String comediante) {
        this.comediante = comediante;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Comediante: " + comediante);
    }

    @Override
    public void comecarEvento() {
        System.out.println("A apresentação de stand-up está começando!");
    }

    public void comecarEvento(String piada) {
        System.out.println("A apresentação de stand-up está começando com a piada: " + piada);
    }
}
