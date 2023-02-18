import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Transportadora implements ImportacaoArquivos {
    BufferedReader arquivoLeitura;
    private Encomenda[] encomendas;
    private EncomendaExpressa[] encomendasExpressas;
    private int quantidadeEncomenda;
    private int quantidadeEncomendaExpressa;
    private float valorEncomendaNormal;
    private float valorEncomendaExpressa;
    String linha;
    String[] configuracoes;

    public Transportadora() {
        this.encomendas = new Encomenda[1000];
        this.encomendasExpressas = new EncomendaExpressa[1000];
        quantidadeEncomenda = 0;
        quantidadeEncomendaExpressa = 0;
    }

    public void getEncomendas() {
        try {
            for (int i = 0; i < quantidadeEncomenda; i++) {
                System.out.println(getEncomenda(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getEncomendasExpressas() {
        try {
            if (configuracoes != null) {
                for (int i = 0; i < quantidadeEncomendaExpressa; i++) {
                    System.out.println(getEncomendaExpressa(i));
                }
            } else {
                System.out.println("Não há encomendas expressas");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getEncomenda(int posicao) {
        return encomendas[posicao].toString();
    }

    public void setEncomenda(Encomenda encomenda) {
        if (quantidadeEncomenda < 1000) {
            encomendas[quantidadeEncomenda] = encomenda;
            quantidadeEncomenda++;
        }
    }

    public String getEncomendaExpressa(int posicao) {
        return encomendasExpressas[posicao].toString();
    }

    public void setEncomendaExpressa(EncomendaExpressa encomendaExpressa) {
        if (quantidadeEncomendaExpressa < 1000) {
            encomendasExpressas[quantidadeEncomendaExpressa] = encomendaExpressa;
            quantidadeEncomendaExpressa++;
        }
    }

    public float getValorEncomendaNormal() {
        return valorEncomendaNormal;
    }

    public void setValorEncomendaNormal(float valorEncomendaNormal) {
        this.valorEncomendaNormal = valorEncomendaNormal;
    }

    public float getValorEncomendaExpressa() {
        return valorEncomendaExpressa;
    }

    public void setValorEncomendaExpressa(float valorEncomendaExpressa) {
        this.valorEncomendaExpressa = valorEncomendaExpressa;
    }

    @Override
    public void carregarConfiguracoes(String arquivo) {
        try {
            arquivoLeitura = new BufferedReader(
                    new FileReader(arquivo));
            arquivoLeitura.readLine();
            float precoKG;
            while ((linha = arquivoLeitura.readLine()) != null) {
                configuracoes = linha.split(";");
                String siglaTipo = configuracoes[1];
                precoKG = Float.parseFloat(configuracoes[2]);
                if (siglaTipo.equals("EN")) {
                    this.setValorEncomendaNormal(precoKG);
                }
                this.setValorEncomendaExpressa(precoKG);
            }
            arquivoLeitura.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void importarDados(String arquivo) {
        try {
            arquivoLeitura = new BufferedReader(
                    new FileReader(arquivo));

            arquivoLeitura.readLine();
            while ((linha = arquivoLeitura.readLine()) != null) {
                configuracoes = linha.split(";");
                int numeroPedido = Integer.parseInt(configuracoes[0]);
                float peso = Float.parseFloat(configuracoes[4]);
                float valorFrete;
                String dataPostagem = configuracoes[1];
                String tipoEncomenda = configuracoes[2];
                String foneContato = configuracoes[configuracoes.length - 1];
                if (tipoEncomenda.equals("EN")) {
                    Encomenda encomenda = new Encomenda(numeroPedido, peso);
                    valorFrete = encomenda.calculoFrete(this.getValorEncomendaNormal());
                    encomenda.setValorFrete(valorFrete);
                    this.setEncomenda(encomenda);
                } else {
                    int prazoEntrega = Integer.parseInt(configuracoes[3]);
                    EncomendaExpressa encomendaExpressa = new EncomendaExpressa(numeroPedido, dataPostagem, peso,
                            prazoEntrega, foneContato);
                    valorFrete = encomendaExpressa.calculoFretePorPrazo(this.getValorEncomendaExpressa(), prazoEntrega);
                    encomendaExpressa.setValorFrete(valorFrete);
                    this.setEncomendaExpressa(
                            encomendaExpressa);
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
