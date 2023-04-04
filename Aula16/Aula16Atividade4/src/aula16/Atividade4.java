package aula16;
import java.awt.BorderLayout;
import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Produtos prod = new Produtos();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o codigo do produto: ");
        prod.codigo = entrada.nextInt();
        System.out.println("Digite a quantidade de produtos: ");
        prod.quantidade = entrada.nextInt();
        prod.calculo();      
    }    
}
