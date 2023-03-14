package aula04;
import java.util.Locale;
import java.util.Scanner;
public class Atividade7 {
    public static void main(String[] args) {
        int cod1, cod2, qte1, qte2;
        double preco1, preco2, total;        
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o codigo: ");
        cod1 = entrada.nextInt();
        System.out.println("Digite a quantidade: ");
        qte1 = entrada.nextInt();
        System.out.println("Digite o preco: ");
        preco1 = entrada.nextDouble();
        
        System.out.println("Digite o codigo: ");
        cod2 = entrada.nextInt();
        System.out.println("Digite a quantidade: ");
        qte2 = entrada.nextInt();
        System.out.println("Digite o preco: ");
        preco2 = entrada.nextDouble();

        total = preco1 * qte1 + preco2 * qte2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
        entrada.close();
    }
}
