package aula11;
import java.util.Scanner;
public class Exemplo6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com 3 numeros:");
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();
        if (a > b && a > c) {
            System.out.println("Maior = " + a);
        } else if (b > c) {
            System.out.println("Maior = " + b);
        } else {
            System.out.println("Maior = " + c);
        }
        entrada.close();
    }
}




