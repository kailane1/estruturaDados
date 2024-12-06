package ifma.lista01;

public class CadastrarAlunos {
    private Aluno[] vetor;
    private int tamanhoAtual;

    public CadastrarAlunos(int capacidade) {
        vetor = new Aluno[capacidade];
        tamanhoAtual = 0;
    }

    public boolean adicionarNoFinal(Aluno aluno) {
        if (tamanhoAtual < vetor.length) {
            vetor[tamanhoAtual] = aluno;
            tamanhoAtual++;
            return true;
        }
        return false;
    }

    public boolean adicionarNoInicio(Aluno aluno) {
        if (tamanhoAtual < vetor.length) {
            for (int i = tamanhoAtual; i > 0; i--) {
                vetor[i] = vetor[i - 1];
            }
            vetor[0] = aluno;
            tamanhoAtual++;
            return true;
        }
        return false;
    }
    public boolean removerNoFinal() {
        if (tamanhoAtual > 0) {
            vetor[tamanhoAtual - 1] = null;
            tamanhoAtual--;
            return true;
        }
        return false;
    }

    public boolean removerNoInicio() {
        if (tamanhoAtual > 0) {
            for (int i = 0; i < tamanhoAtual - 1; i++) {
                vetor[i] = vetor[i + 1];
            }
            vetor[tamanhoAtual - 1] = null;
            tamanhoAtual--;
            return true;
        }
        return false;
    }

    public boolean verificarIndice(int indice) {
        return indice >= 0 && indice < tamanhoAtual && vetor[indice] != null;
    }

    public String removerComIndice(int indice) {
        if (!verificarIndice(indice)) {
            throw new IllegalArgumentException("Índice inválido ou vazio.");
        }

        String nomeRemovido = vetor[indice].getNome();
        if (indice == 0) {
            removerNoInicio();
        } else if (indice == tamanhoAtual - 1) {
            removerNoFinal();
        } else {
            for (int i = indice; i < tamanhoAtual - 1; i++) {
                vetor[i] = vetor[i + 1];
            }
            vetor[tamanhoAtual - 1] = null;
            tamanhoAtual--;
        }
        return nomeRemovido;
    }

    public void ordenarVetor() {
        Arrays.sort(vetor, 0, tamanhoAtual, (a1, a2) -> Integer.compare(a1.getCodigo(), a2.getCodigo()));
    }

    public void exibirAlunos() {
        for (int i = 0; i < tamanhoAtual; i++) {
            System.out.println(vetor[i]);
        }
    }
}


