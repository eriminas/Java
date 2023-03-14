package aula11;
import java.util.Scanner;
public class Atividade3 {
    public static void main(String[] args) {
        int x, y;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        x = entrada.nextInt();
        System.out.println("Digite o segundo numero: ");
        y = entrada.nextInt();

        imprima("soma: " + somar(x, y));
        imprima("multiplicacao: " + multiplicar(x, y));
        imprima("dobro do primeiro: " + dobro(x));
        imprima("dobro do segundo: " + dobro(y));

    }

    public static void imprima(String s) {
        System.out.println(s);
    }

    public static int somar(int a, int b) {
        int soma;
        soma = a + b;
        return soma;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dobro(int a) {
        return somar(a, a);
    }

}
