public class EncomendaExpressa  extends Encomenda {
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

    @Override
    public float calculoFrete(float precoKG) {
        float frete = this.getPeso() * precoKG; 
        return frete + (frete * 0.25f);
    }
}
