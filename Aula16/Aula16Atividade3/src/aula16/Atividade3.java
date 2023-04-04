package aula16;
import java.util.Scanner;
public class Atividade3 {
    public static void main(String[] args) {
        OperacaoMatematica oper = new OperacaoMatematica();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        oper.N = entrada.nextInt();
        oper.negativoOuPositivo();
        oper.parOuImpar();       
    }    
}
