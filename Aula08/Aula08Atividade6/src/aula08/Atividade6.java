package aula08;
import java.util.Scanner;
public class Atividade6 {
    public static void main(String[] args) {
        int doacao;
        double valor = 0;
        System.out.println("---------------------------");
        System.out.println("     PROGRAMA SOLIDÁRIO    ");
        System.out.println("---------------------------");
        System.out.println("Muito obrigado por ajudar");        
        System.out.println(" [1] para doar R$10 ");
        System.out.println(" [2] para doar R$25 ");
        System.out.println(" [3] para doar R$50 ");
        System.out.println(" [4] para doar outros valores ");
        System.out.println(" [5] para cancelar ");
        System.out.println("Digite um numero de 1 a 5 para doar: ");
        Scanner entrada = new Scanner(System.in);
        doacao = entrada.nextInt();
        switch (doacao) {
            case 1:
                valor = 10;
                break;
            case 2:
                valor = 25;
                break;
            case 3:
                valor = 50;
                break;
            case 4:
                System.out.println("Qual o valor da doacao? R$ ");
                valor = entrada.nextDouble();
                break;
            case 5:
                valor = 0;
                break;
            default:
                System.out.println("INVALIDO ");
                break;
        }
        System.out.println("------------------------");
        System.out.println("SUA DOACAO FOI DE R$ " + valor);
        System.out.println("MUITO OBRIGADO!");
        System.out.println("------------------------");      
    }
}
