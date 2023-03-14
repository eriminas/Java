package aula10;
import java.util.Scanner;
public class Atividade5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int produtoA = 0;
        int produtoB = 0;
        int produtoC = 0;
        System.out.println("CODIGO: 1.Produto / A 2.ProdutoB / 3.ProdutoC / 4.Fim");
        System.out.println("Entre com o código do produto: ");
        int tipo = entrada.nextInt();

        while (tipo != 4) {
            if (tipo == 1) {
                produtoA = produtoA + 1;
            } else if (tipo == 2) {
                produtoB = produtoB + 1;
            } else if (tipo == 3) {
                produtoC = produtoC + 1;
            }            
            System.out.println("Entre com o codigo do produto: ");
            tipo = entrada.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Produto A: " + produtoA);
        System.out.println("Produto B: " + produtoB);
        System.out.println("Produto C: " + produtoC);
        entrada.close();
    }
}
