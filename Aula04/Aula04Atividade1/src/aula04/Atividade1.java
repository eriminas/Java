package aula04;
import java.util.Scanner;
public class Atividade1 {
    public static void main(String[] args) {
        String nome;
        int agencia; 
        int conta;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o nome completo:");
        nome = entrada.nextLine();        
        System.out.println("Digite o número da agencia: ");
        agencia = entrada.nextInt();        
        System.out.println("Digite o número da conta corrente: ");
        conta = entrada.nextInt();
        
        System.out.println("Nome: " + nome);
        System.out.println("Agencia: " + agencia);
        System.out.println("Conta: " + conta);      
        
    }
}
