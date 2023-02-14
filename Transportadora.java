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

    public Encomenda[] getEncomendas() {
        return encomendas;
    }

    public EncomendaExpressa[] getEncomendasExpressas() {
        return encomendasExpressas;
    }
    
    public Encomenda getEncomenda(int posicao) {
        return encomendas[posicao];
    }

    public void setEncomenda(Encomenda encomenda)
    {
        if (quantidadeEncomenda < 100)
        {
            encomendas[quantidadeEncomenda] = encomenda;
            quantidadeEncomenda++;
        }
    }

    public Encomenda getEncomendaExpressa(int posicao) {
        return encomendasExpressas[posicao];
    }

    public void setEncomendaExpressa(EncomendaExpressa encomendaExpressa)
    {
        if (quantidadeEncomendaExpressa < 100)
        {
            encomendasExpressas[quantidadeEncomendaExpressa] = encomendaExpressa;
            quantidadeEncomendaExpressa++;
        }
    }

    @Override
    public void carregarConfiguracoes(String arquivoConfiguração) {
        
    }

    @Override
    public void importarDados(String arquivoDadosEntrada) {
        
    }    
}
