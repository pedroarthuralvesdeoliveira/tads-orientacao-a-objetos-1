public class Banco {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        ContaEspecial contaEspecial = new ContaEspecial();
        contaCorrente.setCliente("Pedro");
        // contaCorrente.setSaldo(100.0f);
        contaCorrente.depositar(100.0f);
        contaEspecial.setCliente("Arthur");
        // contaEspecial.setSaldo(100.0f);
        contaEspecial.depositar(100.0f);
        contaCorrente.sacar(25.5f);
        contaCorrente.sacar(10.0f, 0.015f);
        contaEspecial.sacar(20.0f);
        contaEspecial.sacar(15.0f, 0.020f);
        System.out.println("O saldo da conta corrente do cliente " + contaCorrente.getCliente() + " e: "
                + contaCorrente.getSaldo());
        System.out.println("\nO saldo da conta especial do cliente " + contaEspecial.getCliente() + " e: "
                + contaEspecial.getSaldo());
    }
}
