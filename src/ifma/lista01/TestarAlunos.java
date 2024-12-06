package ifma.lista01;

public class TestarAlunos {
    public static void main(String[] args) {
        CadastrarAlunos cadastro = new CadastrarAlunos(5);

        cadastro.adicionarNoFinal(new Aluno(3, "João"));
        cadastro.adicionarNoInicio(new Aluno(1, "Maria"));
        cadastro.adicionarNoFinal(new Aluno(4, "Carlos"));
        cadastro.adicionarNoFinal(new Aluno(2, "Ana"));

        System.out.println("Alunos após adições:");
        cadastro.exibirAlunos();

        cadastro.removerNoFinal();
        System.out.println("\nApós remover do final:");
        cadastro.exibirAlunos();

        cadastro.removerNoInicio();
        System.out.println("\nApós remover do início:");
        cadastro.exibirAlunos();

        System.out.println("\nRemovendo aluno no índice 1:");
        System.out.println("Aluno removido: " + cadastro.removerComIndice(1));
        cadastro.exibirAlunos();

        cadastro.ordenarVetor();
        System.out.println("\nApós ordenar pelo código:");
        cadastro.exibirAlunos();
    }
}
