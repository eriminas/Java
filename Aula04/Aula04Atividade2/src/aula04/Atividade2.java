package aula04;
import java.util.Scanner;
public class Atividade2 {
    public static void main(String[] args) {
        int anoAtual, anoNasc, idade;          
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o ano atual: ");
        anoAtual = entrada.nextInt();       
        System.out.println("Digite o ano de nascimento: ");    
        anoNasc = entrada.nextInt();
        
        idade = anoAtual - anoNasc;
        
        System.out.println("A sua idade eh: " + idade);       
    }
}
