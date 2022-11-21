import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExercicioArquivoCSV {
    BufferedReader reader;
    private Arquivo arquivo;
    private Double margemLucro;

    public Arquivo getArquivo() {
        return arquivo;
    }

    public void setArquivo(Arquivo arquivo) {
        this.arquivo = arquivo;
    }

    public Double getMargemLucro() {
        return this.margemLucro;
    }

    public void setMargemLucro(Double margem) {
        this.margemLucro = margem;
    }

    public static void main(String[] args) throws Exception {
        try {
            ExercicioArquivoCSV exercicio = new ExercicioArquivoCSV();
            exercicio.arquivo = new Arquivo();
            exercicio.reader = new BufferedReader(new InputStreamReader(System.in));
            exercicio.menu();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void menu() {
        try {
            this.leituraArquivo("C:\\Users\\pa\\Downloads\\ex_arquivos\\ex_arquivos\\custo.csv");
            System.out.println("\n\nInsira os dados do arquivo de entrada \n");
            System.out.println("---------------------------");
            System.out.println("\nDigite a margem de lucro a ser aplicada aos produtos: ");
            this.setMargemLucro(Double.parseDouble(this.reader.readLine()));
            for (Item item : this.arquivo.getItens()) {
                item.setPreco(item.getPreco() + (item.getPreco() * (this.getMargemLucro() / 100)));
            }

            System.out.println(
                    "\nInforme as categorias do arquivo separadas por espaço. Exemplo: 'codigo nome preco_venda'");
            this.arquivo.setCategoria(this.reader.readLine().replaceAll(" ", ";"));

            System.out.println("\nInforme o nome do arquivo: ");
            this.arquivo.setNome(this.reader.readLine());
            if (this.arquivo.getNome().isBlank() ||
                    this.arquivo.getNome().isEmpty()) {
                this.arquivo.setNome("venda");
            }

            this.arquivo.setTipo("entrada");

            System.out.println("\nInforme a extensão do arquivo: Exemplo: '.csv' \n");
            this.arquivo.setExtensao(this.reader.readLine().trim());
            this.setArquivo(this.arquivo);
            this.escritaArquivo(this.getArquivo());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void leituraArquivo(String nome) throws IOException {
        BufferedReader arquivoLeitura = new BufferedReader(
                new FileReader(nome));
        Arquivo arquivoSaida = new Arquivo();
        System.out.println("Por favor, informe o nome do arquivo de saida: ");
        arquivoSaida.setNome(this.reader.readLine());
        if (arquivoSaida.getNome().isBlank() ||
                arquivoSaida.getNome().isEmpty()) {
            arquivoSaida.setNome("comprar");
        }
        arquivoSaida.setTipo("saida");
        arquivoSaida.setExtensao(".csv");

        String linha;
        String[] itens;
        try {
            arquivoSaida.setCategoria(arquivoLeitura.readLine());
            while ((linha = arquivoLeitura.readLine()) != null) {
                itens = linha.split(";");
                double preco = Double.parseDouble(itens[3].replaceAll(",", "."));
                Item item = new Item(itens[4], itens[0], Integer.parseInt(itens[1]), itens[2], preco);
                if ((Integer.parseInt(itens[1])) < 10) {
                    arquivoSaida.setItem(item);
                }
                this.getArquivo().setItem(item);
                this.escritaArquivo(arquivoSaida);
            }
            arquivoLeitura.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void escritaArquivo(Arquivo arquivo) throws IOException {
        BufferedWriter arquivoGravacao = new BufferedWriter(
                new FileWriter(arquivo.nomeArquivo()));
        try {
            arquivoGravacao.write(arquivo.getCategoria());
            arquivoGravacao.newLine();
            for (Item item : this.getArquivo().getItens()) {
                if (arquivo.getTipo().equals("saida")) {
                    if (item.getEstoque() < 10)
                    {
                        arquivoGravacao.write(item.toString());
                        arquivoGravacao.newLine();
                    }
                } else {
                    arquivoGravacao.write(item.nomeAbreviado());
                    arquivoGravacao.newLine();
                }
            }
            arquivoGravacao.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
