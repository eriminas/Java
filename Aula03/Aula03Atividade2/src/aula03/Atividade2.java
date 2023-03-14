package aula03;
import java.util.Scanner;
public class Atividade2 {
    public static void main(String[] args) {
        double n1, n2, soma, multiplicacao, divisao, subtracao;
        
        Scanner entrada = new Scanner(System.in);        
        System.out.println("digite o primeiro numero: ");
        n1 = entrada.nextDouble();
        System.out.println("digite o segundo numero: ");
        n2 = entrada.nextDouble();
        
        soma = n1 + n2;
        subtracao = n1 - n2;
        multiplicacao = n1*n2;
        divisao = n1/n2;
        
        System.out.println("Primeiro numero = " + n1);
        System.out.println("Segundo número = " + n2);
        System.out.println("Soma = " + soma);
        System.out.println("Subtracao = " + subtracao);        
        System.out.println("Multiplicacao = " + multiplicacao);   
        System.out.println("Divisao = " + divisao);
    }    
}
