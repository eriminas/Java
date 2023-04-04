package aula22;
import java.text.SimpleDateFormat;
import java.util.Date;
public class ProdutoUsado extends Produto {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date dataFabricacao;
    public ProdutoUsado(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.dataFabricacao = manufactureDate;
    }
    public Date getDataFabricacao() {
        return dataFabricacao;
    }
    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }
    @Override
    public String etiquetaPreco() {
        return getNome()
                + " (usado) $ "
                + String.format("%.2f", getPreco())
                + " (Data de Fabricacao: "
                + sdf.format(dataFabricacao)
                + ")";
    }
}
