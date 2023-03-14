package aula04;
import java.util.Scanner;
public class Atividade3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, soma;
        
        System.out.println("Digite o primeiro numero: ");
        num1 = entrada.nextInt();
        System.out.println("Digite o segundo numero: ");
        num2 = entrada.nextInt();

        soma = num1 + num2;

        System.out.println("SOMA = " + soma);
        entrada.close();
    }
}
