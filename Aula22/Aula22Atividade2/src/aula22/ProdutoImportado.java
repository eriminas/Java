package aula22;
public class ProdutoImportado extends Produto {
    private Double taxaAlfandega;

	public ProdutoImportado(String name, Double price, Double customsFee) {
		super(name, price);
		this.taxaAlfandega = customsFee;
	}
	public Double getTaxaAlfandega() {
		return taxaAlfandega;
	}
	public void setTaxaAlfandega(Double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}	
	public Double totalPreco() {
		return getPreco() + taxaAlfandega;
	}	
	@Override
	public String etiquetaPreco() {
		return getNome() 
				+ " $ " 
				+ String.format("%.2f", totalPreco())
				+ " (Taxa Alfandega $ " 
				+ String.format("%.2f", taxaAlfandega)
				+ ")";
	}    
}
