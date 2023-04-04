package aula22;
public class Produto {
    private String nome;
    private Double preco;

    public Produto(String name, Double price) {
        this.nome = name;
        this.preco = price;
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
    public String etiquetaPreco() {
        return nome
                + " $ "
                + String.format("%.2f", preco);
    }
}
