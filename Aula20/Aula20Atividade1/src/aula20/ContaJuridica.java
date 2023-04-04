package aula20;
import java.util.Scanner;
public class ContaJuridica extends Conta {
    private Double emprestimoLimite;
//	public ContaJuridica() {
//		super();
//	}
    public ContaJuridica(int numeroConta, String proprietario, double balanco, double limiteEmprestimo) {
        super(numeroConta, proprietario, balanco);
        this.emprestimoLimite = limiteEmprestimo;
    }

    public Double getLimiteEmprestimo() {
        return emprestimoLimite;
    }

    public void setLimiteEmprestimo(Double limiteEmprestimo) {
        this.emprestimoLimite = limiteEmprestimo;
    }

    public void emprestimo() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com o valor desejado: ");
        double quantidade = entrada.nextDouble();       
        if (quantidade <= emprestimoLimite) {
            balanco += quantidade - 10.0;
        } else {
            System.out.println("Você nao pode pegar o emprestimo.");
            System.out.println("Tente um valor menor. Seu limite eh: " + this.getLimiteEmprestimo());

        }
    }
}
