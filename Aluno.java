public class Aluno {
    private String nome;
    private String matricula;
    private float nota1;
    private float nota2;
    private float nota3;
    private float nota4;

    public String getNome()
    {
        return this.nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getMatricula()
    {
        return this.matricula;
    }

    public void setMatricula(String matricula)
    {
        this.matricula = matricula;
    }

    public Float getNota1()
    {
        return this.nota1;
    }

    public void setNota1(Float nota1)
    {
        this.nota1 = nota1;
    }

    public Float getNota2()
    {
        return this.nota2;
    }

    public void setNota2(Float nota2)
    {
        this.nota2 = nota2;
    }

    public Float getNota3()
    {
        return this.nota3;
    }
    public void setNota3(Float nota3)
    {
        this.nota3 = nota3;
    }

    public Float getNota4()
    {
        return this.nota4;
    }

    public void setNota4(Float nota4)
    {
        this.nota4 = nota4;
    }

    public float calcularMedia()
    {
        return ( nota1 + nota2 + nota3 + nota4) / 4;
    }
}
