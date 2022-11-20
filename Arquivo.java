import java.util.ArrayList;
import java.util.List;

public class Arquivo {
    private String categoria;
    private String extensao;
    private String nome;
    private String tipo;
    private List<Item> itens;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getExtensao() {
        return extensao;
    }

    public void setExtensao(String extensao) {
        this.extensao = extensao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItem(Item item) {
        this.itens.add(item);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String nomeArquivo() {
        return this.getNome().concat(this.getExtensao());
    }

    public Arquivo() {
        this.itens = new ArrayList<>();
    }
}
