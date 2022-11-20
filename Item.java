public class Item {
    private String categoria;
    private String codigo;
    private Integer estoque;
    private String nome;
    private Double preco;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Item() {}

    public Item(String categoria, String codigo, Integer estoque, String nome, Double preco)
    {
        this.categoria = categoria;
        this.codigo = codigo;
        this.estoque = estoque;
        this.nome = nome;
        this.preco = preco;
    }

    public Item(String codigo, String nome, Double preco)
    {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public String nomeCompleto() {
        return this.getCodigo() + ";" + this.getEstoque() + ";" + this.getNome() + ";" + this.getPreco() + ";" + this.getCategoria();
    }


    @Override
    public String toString()
    {
        return this.getCodigo() + ";" + this.getNome() + ";" + this.getPreco();
    }
}
