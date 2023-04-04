package aula20;
public class Atividade1 {
    public static void main(String[] args) {
        Conta conta1 = new Conta(1001, "Jose", 100.0);        
        conta1.deposito(200);
        System.out.println(conta1.toString());
        
        ContaJuridica conta = new ContaJuridica(1002, "Bob", 200.0, 1000.0);
        conta.deposito(1000);
        conta.emprestimo();
        System.out.println(conta.toString());
        System.out.println("Limite de Emprestimo: " + conta.getLimiteEmprestimo());       
    }
}
