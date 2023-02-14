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
}
