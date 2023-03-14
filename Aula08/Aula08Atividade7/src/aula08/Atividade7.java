package aula08;
import java.util.Scanner;
public class Atividade7 {
    public static void main(String[] args) {
        int op;
        double x, y;
        double soma, subtrai, multiplica, divide;
        Scanner entrada = new Scanner(System.in);
        System.out.println(" == CALCULADORA == ");
        System.out.println(" Digite o primeiro numero: ");
        x = entrada.nextDouble();
        System.out.println(" Digite o segundo numero: ");
        y = entrada.nextDouble();
        soma = x + y;
        subtrai = x - y;
        multiplica = x * y;
        divide = x / y;
        System.out.println(" Escolha uma das opcoes abaixo: ");        
        System.out.println("1 - Soma");
        System.out.println("2 - Subtracao");
        System.out.println("3 - Multiplicacao");
        System.out.println("4 - Divisao");
        System.out.println("Digite o numero da operacao desejada: ");
        op = entrada.nextInt();
        switch (op) {
            case 1:
                System.out.println(" Opcao Selecionada: 1. SOMA");
                System.out.println(" Soma = " + soma);
                break;
            case 2:
                System.out.println(" Opcao Selecionada: 2. SUBTRACAO");
                System.out.println(" subtracao = " + subtrai);
                break;
            case 3:
                System.out.println(" Opcao Selecionada: 1. MUTIPLICACAO");
                System.out.println(" Multiplicacao = " + x * y);
                break;
            case 4:
                System.out.println(" Opcao Selecionada: 1. DIVISAO");
                if (y == 0) {
                    System.out.println("Nao existe divisao por 0");
                } else {
                    System.out.println(" Divisao = " + x / y);
                }
                break;
            default:
                System.out.println("VALOR INVALIDO");
                break;
        }
    }
}
