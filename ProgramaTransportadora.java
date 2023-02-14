import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProgramaTransportadora {   
    private Transportadora transportadora;
    BufferedReader reader;

    public Transportadora getTransportadora() {
        return transportadora;
    }

    public void setTransportadora(Transportadora transportadora) {
        this.transportadora = transportadora;
    }
    
    public static void main(String[] args) throws Exception{
        ProgramaTransportadora programa = new ProgramaTransportadora();
        programa.reader = new BufferedReader(
            new InputStreamReader(System.in));

        programa.transportadora = new Transportadora();

        String opcao = "";
        while (!opcao.equals("4")) {
            System.out.println("---------------------------");
            System.out.println("\n[1] Importar arquivo de encomendas: ");
            System.out.println("\n[2] Exibir a lista de encomendas normais: ");
            System.out.println("\n[3] Exibir a lista de encomendas expressas: ");
            System.out.println("\n[4] Sair: ");

            opcao = programa.reader.readLine();
            switch (opcao) {
                case "1":
                    programa.importarArquivoEncomenda();
                    break;
                case "2":
                    programa.exibirEncomendasNormais();
                    break;
                case "3":
                    programa.exibirEncomendasExpressas();
                    break;
                case "4":
                    break;
                default:
                    break;
            }
        }
    }

    public void exibirEncomendasExpressas() {
        
    }

    public void exibirEncomendasNormais() {
        
    }

    public void importarArquivoEncomenda() {
        
    }
}
