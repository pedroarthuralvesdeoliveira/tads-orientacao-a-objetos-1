public class ContaEspecial extends ContaCorrente {
    @Override
    public void sacar(float quantia) {
        if (this.getSaldo() < quantia)
            return;
        this.setSaldo(this.getSaldo() - quantia - (quantia * 0.003f));
    }
}
