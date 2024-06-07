package escola;

public class App {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Antonino Stradivarius Victorius II", "nino_victorius@hogwarts.com", "05036900");
        Professor professor = new Professor("Paulo Coelho", "paulocoelho@hogwarts.com", "Alquimia");

        System.out.println("Informações do Aluno:");
        aluno.exibirInfo();

        System.out.println("\nInformações do Professor:");
        professor.exibirInfo();

        System.out.println("\nInformações do Aluno (Nome e Matrícula):");
        aluno.exibirInfo(true, false, true);

        System.out.println("\nInformações do Professor (Email e Disciplina):");
        professor.exibirInfo(false, true, true);
    }
}
