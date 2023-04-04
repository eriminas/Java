package aula22;
public class FuncionarioTercerizado extends Funcionario {
    private Double despesaAdicional;

//    public FuncionarioTercerizado() {
//        super();
//    }

    public FuncionarioTercerizado(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.despesaAdicional = additionalCharge;
    }

    public Double getDespesaAdicional() {
        return despesaAdicional;
    }

    public void setDespesaAdicional(Double despesaAdicional) {
        this.despesaAdicional = despesaAdicional;
    }

    @Override
    public double pagamento() {
        return super.pagamento() + despesaAdicional * 1.1;
    }
}
