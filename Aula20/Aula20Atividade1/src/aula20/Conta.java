package aula20;
public class Conta {
    private int numeroConta;
    private String proprietario;
    protected Double balanco;

//    public Conta() {
//    }

    public Conta(int number, String holder, Double balance) {
        this.numeroConta = number;
        this.proprietario = holder;
        this.balanco = balance;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer number) {
        this.numeroConta = number;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String holder) {
        this.proprietario = holder;
    }

    public Double getBalanco() {
        return balanco;
    }

    public void saque(double amount) {
        balanco -= amount;
    }

    public void deposito(double amount) {
        balanco += amount;
    }

    @Override
    public String toString() {
        return "Conta{" + "numeroConta=" + numeroConta + ", proprietario=" + proprietario + ", balanco=" + balanco + '}';
    }
    
}
