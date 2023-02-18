public class Turma {
    private int ano;
    private int quantidadeAlunos;
    private String nomeCurso;
    private int numeroTurma;
    private AlunoHerenca[] vetorAlunos;

    public Turma() {
        this.vetorAlunos = new AlunoHerenca[40];
        this.quantidadeAlunos = 0;
    }

    public AlunoHerenca getAluno(int position) {
        return vetorAlunos[position];
    }

    public void setAluno(AlunoHerenca aluno) {
        if (quantidadeAlunos < 40) {
            vetorAlunos[quantidadeAlunos] = aluno;
            quantidadeAlunos++;
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getNumeroTurma() {
        return numeroTurma;
    }

    public void setNumeroTurma(int numeroTurma) {
        this.numeroTurma = numeroTurma;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
}
