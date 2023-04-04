package aula18;
import java.util.Locale;
import java.util.Scanner;
public class Atividade1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        Conta conta = null;

        System.out.print("Entre com numero da conta: ");        
        int numero = entrada.nextInt();
        System.out.print("Entre com o nome do proprietario: ");    
        entrada.nextLine();
        String proprietario = entrada.nextLine();       
        
        System.out.print("Deposito inicial(y/n)? ");
        char resposta = entrada.next().charAt(0);
        if (resposta == 'y') {
            System.out.print("Deseja depositar qual valor inicial? ");  
            //conta.depositar();
            double depositoInicial = entrada.nextDouble();
            conta = new Conta(numero, proprietario, depositoInicial);
        } else {
            conta = new Conta(numero, proprietario);
        }

        //System.out.println();
        System.out.println("Dados da Conta:");
        System.out.println(conta);

        //System.out.println();
        System.out.print("Entre com valor do deposito: ");
         //double depositaValor = entrada.nextDouble();  
        conta.depositar();
        //conta.depositar(depositaValor);
        System.out.println("Atualize os dados da conta:");
        System.out.println(conta);

        //System.out.println();
        System.out.print("Entre com o valor do saque: ");
        //double sacaValor = entrada.nextDouble();
        conta.sacar();
        System.out.println("Atualiza os dados da conta:");
        System.out.println(conta);

        entrada.close();
    }  
}

