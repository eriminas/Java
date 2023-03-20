package aula14;
import java.util.Locale;
import java.util.Scanner;
public class Atividade2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Qual eh o preco do dolar? ");
        double precoDolar = entrada.nextDouble();
        System.out.print("Quantos dolares vai comprar? ");
        double quantidade = entrada.nextDouble();        
        double resultado = Conversor.dolarParaReal(quantidade, precoDolar);
        System.out.printf("A quantidade que vai pagar em reais = %.2f%n", resultado);
        entrada.close();
    }
}
