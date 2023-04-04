package aula20;
public class Circulo extends Forma {
    private Double raio;
    
    public Circulo() {
        super();
    }
    public Circulo(Cor cor, Double radius) {
        super(cor);
        this.raio = radius;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * raio * raio;
    }
}
