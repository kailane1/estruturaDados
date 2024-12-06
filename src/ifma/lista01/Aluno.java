package ifma.lista01;

public class Aluno {
    private int codigo;
    private String matricula;
    private String nome;

    public Aluno(int codigo, String matricula, String nome){
        this.codigo = codigo;
        this.matricula = matricula;
        this.nome = nome;
    }

    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getMatriculado(){
        return matricula;

    }


    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String toString(){
        return "Aluno{"+
                "codigo=" + codigo +
                ", matricula='"+ matricula + '\'' +
                ", nome='" + nome +'\'' +
                '}';
    }
    }
