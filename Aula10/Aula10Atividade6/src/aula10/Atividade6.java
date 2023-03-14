package aula10;
import java.util.Scanner;
public class Atividade6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com o valor x: ");
        int x = entrada.nextInt();

        for (int i = 1; i <= x; i++) {
            int primeiro = i;
            int segundo = i * i;
            int terceiro = i * i * i;
            System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
        }
        entrada.close();
    }
}
