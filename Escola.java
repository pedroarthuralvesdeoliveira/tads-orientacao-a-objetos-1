public class Escola {
    private String fone;
    private String nome;
    private int quantidadeTurmas;
    private Turma[] vetorTurmas;

    public Escola()
    {
        vetorTurmas = new Turma[20];
        quantidadeTurmas = 0;
    }

    public String getFone()
    {
        return fone;
    }

    public void setFone(String fone)
    {
        this.fone = fone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Turma getTurma(int position)
    {
        return this.vetorTurmas[position];
    }

    public void setTurma(Turma turma)
    {
        if (quantidadeTurmas < 20)
        {
            vetorTurmas[quantidadeTurmas] = turma;
            quantidadeTurmas++;
        }
    }

    public int getQuantidadeTurmas()
    {
        return this.quantidadeTurmas;
    }
}
