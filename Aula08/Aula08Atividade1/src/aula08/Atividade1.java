package aula08;
import java.util.Scanner;
public class Atividade1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int N = entrada.nextInt();
        if (N % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
        entrada.close();
    }
}
