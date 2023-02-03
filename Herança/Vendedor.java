public class Vendedor {
    public float calcularComissao(float venda) {
        float comissao = (venda * 0.05f) + 20.0f;
        return comissao;
    }

    public float calcularComissao(float venda, float percentual) {
        float comissao = venda * percentual;
        return comissao;
    }
}
