public class Companhia 
{
    private String CNPJ;
    private String nome;
    private String telefone;
    private Voo[] vetorVoos;
    private int quantidadeVoos;

    public Companhia()
    {
        vetorVoos = new Voo[100];
        quantidadeVoos = 0;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Voo getVoo(int posicao)
    {
        return this.vetorVoos[posicao];
    }

    public void setVoo(Voo voo)
    {
        if (quantidadeVoos < 100)
        {
            vetorVoos[quantidadeVoos] = voo;
            quantidadeVoos++;
        }
    }

    public int getQuantidadeVoos()
    {
        return this.quantidadeVoos;
    }
}