public class EncomendaExpressa extends Encomenda {
    private int prazoEntrega;
    private String contatoRecebedor;

    public int getPrazoEntrega() {
        return prazoEntrega;
    }

    public void setPrazoEntrega(int prazoEntrega) {
        this.prazoEntrega = prazoEntrega;
    }

    public String getContatoRecebedor() {
        return contatoRecebedor;
    }

    public void setContatoRecebedor(String contatoRecebedor) {
        this.contatoRecebedor = contatoRecebedor;
    }

    public float calculoFretePorPrazo(float precoKG, int prazoEntrega) {
        if (prazoEntrega > 3) {
            return super.calculoFrete(precoKG);
        }
        float frete = this.getPeso() * precoKG;
        return frete + (frete * 0.25f);
    }

    public EncomendaExpressa() {

    }

    public EncomendaExpressa(int numeroPedido, String dataPostagem, float peso, int prazoEntrega,
            String contatoRecebedor) {
        super(numeroPedido, peso);
        this.prazoEntrega = prazoEntrega;
        this.contatoRecebedor = contatoRecebedor;
        this.dataPostagem = dataPostagem;
    }
}
