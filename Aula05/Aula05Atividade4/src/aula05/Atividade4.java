package aula05;
import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        double precoFinal;
        double preco;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o preco do produto): ");
        preco = entrada.nextInt();

        precoFinal = (preco < 30) ? preco-preco*0.10 : preco-preco*0.20;
        
        System.out.println(precoFinal);
    }    
}
