package aula20;
public abstract class Forma {
    private Cor color;

    public Forma() {
    }
    public Forma(Cor cor) {
        this.color = color;
    }
    public Cor getCor() {
        return color;
    }
    public void setCor(Cor cor) {
        this.color = color;
    }
    public abstract double area();
}
