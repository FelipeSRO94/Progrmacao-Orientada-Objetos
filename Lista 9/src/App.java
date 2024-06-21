import eventos.Show;
import eventos.StandUp;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Show show = new Show("EmoFest 2024", "Parque Chacara do Jockey", "23/09/2024", Arrays.asList("Fresno", "NX Zero", "Simple Plan"));
        show.exibirInformacoes();
        show.comecarEvento();
        show.comecarEvento(true);

        System.out.println();

        StandUp standUp = new StandUp("Capão Comedy", "R. Luís da Fonseca Galvão, 248", "15/08/2024", "Renato Albani");
        standUp.exibirInformacoes();
        standUp.comecarEvento();
        standUp.comecarEvento("Por que a galinha atravessou a rua? Para chegar ao outro lado!");
    }
}
