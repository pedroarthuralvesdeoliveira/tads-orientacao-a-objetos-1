import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Aeroporto 
{
    private Companhia companhia;
    BufferedReader reader;

    public Aeroporto ()
    {
        Companhia companhia = new Companhia();
    }

    public Companhia getCompanhia(int posicao)
    {
        return this.companhia;
    }

    public void setCompanhia(Companhia companhia)
    {
        this.companhia = companhia;
    }

    public static void main(String[] args) throws Exception
    {
        Aeroporto aeroporto = new Aeroporto();
        aeroporto.reader = new BufferedReader(
                new InputStreamReader(System.in)
        );

        aeroporto.cadastrarCompanhia();
    }


    public void cadastrarCompanhia() throws Exception
    {
        System.out.println("\nInforme o CNPJ da empresa: ");
        this.companhia.setCNPJ(this.reader.readLine());

        System.out.println("\nInforme o nome da empresa: ");
        this.companhia.setNome(this.reader.readLine());

        System.out.println("\nInforme o telefone da empresa: ");
        this.companhia.setTelefone(this.reader.readLine());

        this.setCompanhia(this.companhia);
    }

    public void cadastrarVoo() throws Exception
    {
        Voo voo = new Voo();
        System.out.println("[Cadastro de voo]:  ");
        System.out.println("Informe o nº do voo: ");
        voo.setCodigo(this.reader.readLine());

        System.out.println("\nInforme a data do voo: ");
        voo.setData(this.reader.readLine());

        System.out.println("\n-------------Passageiros--------------");
        for (int i = 0; i < 180; i++)
        {
            Passageiro passageiro = new Passageiro();
            System.out.println("Digite o nome do passageiro: ");
            String nome = this.reader.readLine();
            if (nome.isBlank() || nome.isEmpty())
            {
                break;
            }

            passageiro.setNome(nome);

            System.out.println("\nDigite o CPF do passageiro: ");
            passageiro.setCpf(this.reader.readLine());

            System.out.println("\nDigite o telefone do passageiro: ");
            passageiro.setTelefone(this.reader.readLine());

            System.out.println("\nDigite o passaporte do passageiro: ");
            passageiro.setPassaporte(this.reader.readLine());

            voo.setPassageiro(passageiro);
        }
        this.companhia.setVoo(voo);
    }
}