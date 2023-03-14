package aula10;
import java.util.Scanner;
public class Atividade3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com um numero: ");
        int n = entrada.nextInt();
        System.out.println("Os divisores de " + n + " sao: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        entrada.close();
    }
}
