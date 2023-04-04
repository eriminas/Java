package aula25;
public class Produto {
    private String name;
    private Double price;

    public Produto(String name, Double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public static boolean StaticProdutoPredicate(Produto p) {
        return p.getPrice() >= 100;
    }    
    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }
}
