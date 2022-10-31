public class Voo {
    private String codigo;
    private String data;
    private Passageiro[] vetorPassageiros;
    private int quantidadePassageiros;

    public Voo() {
        this.vetorPassageiros = new Passageiro[180];
        quantidadePassageiros = 0;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Passageiro getPassageiro(int posicao) {
        return this.vetorPassageiros[posicao];
    }

    public void setPassageiro(Passageiro passageiro) {
        if (quantidadePassageiros < 180) {
            vetorPassageiros[quantidadePassageiros] = passageiro;
            quantidadePassageiros++;
        }
    }

    public int getQuantidadePassageiros() {
        return this.quantidadePassageiros;
    }

    public String infoVoo() {
        String quantidadePassageiros = (this.getQuantidadePassageiros() > 1) ? " passageiros" : " passageiro";
        String mensagemQuantidadePassageiros = "Voo de codigo " + this.getCodigo() + ", a ser realizado na data: "
                + this.getData()
                + ", com " + this.getQuantidadePassageiros() + quantidadePassageiros;
        return mensagemQuantidadePassageiros;
    }
}