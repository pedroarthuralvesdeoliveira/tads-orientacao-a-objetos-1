public class Loja {
    public static void main(String[] args) {
        Vendedor v1 = new Vendedor();
        float comissao = v1.calcularComissao(500, 0.15f);
        System.out.println("Comissão da venda: " + comissao);

        comissao = v1.calcularComissao(200.40f);
        System.out.println("\nComissão da venda: " + comissao);
    }
}
