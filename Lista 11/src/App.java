public class App {
    public static void main(String[] args) {
        Musica musica1 = new Musica("Rebirth", "Gorgoroth", "Quantos Possunt ad Satanitatem Trahunt");
        Musica musica2 = new Musica("Seven Tears Are Flowing to the River", "Nargaroth", "Black Metal ist Krieg");
        Musica musica3 = new Musica("Meu Cãozinho Xuxo", "Xuxa", "Xou da Xuxa");

        BibliotecaMusical biblioteca = new BibliotecaMusical();

        biblioteca.adicionarMusica(musica1.getTitulo(), musica1);
        biblioteca.adicionarMusica(musica2.getTitulo(), musica2);
        biblioteca.adicionarMusica(musica3.getTitulo(), musica3);

        System.out.println("Músicas na biblioteca:");
        biblioteca.listarMusicas();

        try {
            Musica musicaBuscada = biblioteca.buscarMusica("Rebirth");
            System.out.println("Música encontrada: " + musicaBuscada);
        } catch (MusicaNaoEncontradaException e) {
            System.out.println(e.getMessage());
        }

        try {
            Musica musicaNaoEncontrada = biblioteca.buscarMusica("Ragatanga");
            System.out.println("Música encontrada: " + musicaNaoEncontrada);
        } catch (MusicaNaoEncontradaException e) {
            System.out.println(e.getMessage());
        }
    }
}
