package aula20;
public class Retangulo extends Forma {
    private Double largura;
	private Double altura;	
        
	public Retangulo() {
		super();
	}
	public Retangulo(Cor cor, Double width, Double height) {
		super(cor);
		this.largura = width;
		this.altura = height;
	}
	public Double getLargura() {
		return largura;
	}
	public void setLargura(Double largura) {
		this.largura = largura;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	@Override
	public double area() {
		return largura * altura;
	}    
}
