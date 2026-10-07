package school.sptech.entity;

public class Produto {
    private String nome;
    private Double valor;
    private String categoria;
    private Integer estoque;

    public Produto(String nome, Double valor, String categoria, Integer estoque) {
        this.nome = nome;
        this.valor = valor;
        this.categoria = categoria;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }
}
