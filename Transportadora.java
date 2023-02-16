import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Transportadora implements ImportacaoArquivos {
    private Encomenda[] encomendas;
    private EncomendaExpressa[] encomendasExpressas;
    private int quantidadeEncomenda;
    private int quantidadeEncomendaExpressa;

    public Transportadora() {
        this.encomendas = new Encomenda[1000];
        this.encomendasExpressas = new EncomendaExpressa[1000];
        quantidadeEncomenda = 0;
        quantidadeEncomendaExpressa = 0;
    }

    public String getEncomendas() {
        return encomendas.toString();
    }

    public String getEncomendasExpressas() {
        return encomendasExpressas.toString();
    }

    public Encomenda getEncomenda(int posicao) {
        return encomendas[posicao];
    }

    public void setEncomenda(Encomenda encomenda) {
        if (quantidadeEncomenda < 1000) {
            encomendas[quantidadeEncomenda] = encomenda;
            quantidadeEncomenda++;
        }
    }

    public Encomenda getEncomendaExpressa(int posicao) {
        return encomendasExpressas[posicao];
    }

    public void setEncomendaExpressa(EncomendaExpressa encomendaExpressa) {
        if (quantidadeEncomendaExpressa < 1000) {
            encomendasExpressas[quantidadeEncomendaExpressa] = encomendaExpressa;
            quantidadeEncomendaExpressa++;
        }
    }

    @Override
    public void carregarConfiguracoes(String arquivo) {
        importarDados(arquivo);
    }

    @Override
    public void importarDados(String arquivo) {
        try {
            BufferedReader arquivoLeitura = new BufferedReader(
                    new FileReader(arquivo));
            String linha;
            String[] configuracoes;
            while ((linha = arquivoLeitura.readLine()) != null) {
                configuracoes = linha.split(";");
                String tipoEncomenda = configuracoes[0];
                float precoKG = Float.parseFloat(configuracoes[2]);
                float valorFrete;
                if (configuracoes.length > 3) {
                    int numeroPedido = Integer.parseInt(configuracoes[0]);
                    String dataPostagem = configuracoes[1];
                    tipoEncomenda = configuracoes[2];
                    int prazoEntrega = Integer.parseInt(configuracoes[3]);
                    float peso = Float.parseFloat(configuracoes[4]);
                    String foneContato = configuracoes[5];
                    if (tipoEncomenda.equals("EN")) {
                        Encomenda encomenda = new Encomenda(numeroPedido, dataPostagem, peso);
                        valorFrete = encomenda.calculoFrete(precoKG);
                        this.setEncomenda(encomenda);
                    } else {
                        EncomendaExpressa encomendaExpressa = new EncomendaExpressa(numeroPedido, dataPostagem, peso,
                                prazoEntrega, foneContato);
                        valorFrete = encomendaExpressa.calculoFretePorPrazo(precoKG, prazoEntrega);
                        encomendaExpressa.setValorFrete(valorFrete);
                        this.setEncomendaExpressa(
                                encomendaExpressa);
                    }
                }
            }
            arquivoLeitura.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
