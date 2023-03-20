package aula14;
public class Funcionario {
    String nome;
    double salarioBruto;
    double imposto;

    double salarioLiquido() {
        return salarioBruto - imposto;
    }
    void aumentoSalario(double percentage) {
        salarioBruto += salarioBruto * percentage / 100.0;
    }
    public String toString() {
        return nome + ", R$ " + String.format("%.2f", salarioLiquido());
    }

}
