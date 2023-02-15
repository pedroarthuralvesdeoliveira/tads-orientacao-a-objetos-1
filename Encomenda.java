import java.util.GregorianCalendar;

public class Encomenda {
    private int numeroPedido;
    private GregorianCalendar dataPostagem;
    private float peso;

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public GregorianCalendar getDataPostagem() {
        return dataPostagem;
    }

    public void setDataPostagem(GregorianCalendar dataPostagem) {
        this.dataPostagem = dataPostagem;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float calculoFrete() {

    }

    @Override
    public String toString() {
        return this.getNumeroPedido() + "; " + this.getPeso() + "; ";
    }
}
