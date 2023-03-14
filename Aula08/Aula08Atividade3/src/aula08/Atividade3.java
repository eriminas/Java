package aula08;
import java.util.Scanner;
public class Atividade3 {
    public static void main(String[] args) {        
        float salario, financiamento, limite;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu salario: ");
        salario = entrada.nextFloat();
        System.out.println("Digite seu financiamento pretendido: ");
        financiamento = entrada.nextFloat();
        limite = 5*salario;
        if (financiamento < limite) {
            System.out.println("Financiamento concedido");
        } else {
            System.out.println("Financiamento negado");
        }  
        System.out.println("Obrigado por nos consultar");
    }    
}
