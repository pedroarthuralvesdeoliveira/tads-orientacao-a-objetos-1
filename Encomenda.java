public class Encomenda {
    protected int numeroPedido;
    protected String dataPostagem;
    protected float peso;
    protected float valorFrete;

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getDataPostagem() {
        return dataPostagem;
    }

    public void setDataPostagem(String dataPostagem) {
        this.dataPostagem = dataPostagem;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float calculoFrete(float precoKG) {
        return this.getPeso() * precoKG;
    }

    public float getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(float valorFrete) {
        this.valorFrete = valorFrete;
    }

    @Override
    public String toString() {
        return numeroPedido + "; " + peso + "; " + valorFrete;
    }

    public Encomenda() {
    }

    public Encomenda(int numeroPedido, float peso) {
        this.numeroPedido = numeroPedido;
        this.peso = peso;
    }
}
