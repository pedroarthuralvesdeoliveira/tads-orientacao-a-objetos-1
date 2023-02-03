public class ContaCorrente {
    private String cliente;
    private String numeroConta;
    private float saldo;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public void depositar(float quantia) {
        this.saldo += quantia;
    }

    public void sacar(float quantia) {
        if (this.getSaldo() < quantia)
            return;
        this.saldo -= quantia - (quantia * 0.005f);
    }

    public void sacar(float quantia, float taxa) {
        if (this.getSaldo() < quantia)
            return;
        this.saldo -= quantia - (quantia * taxa);
    }
}
