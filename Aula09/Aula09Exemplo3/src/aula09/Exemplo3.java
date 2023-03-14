package aula09;
import java.util.Scanner;
public class Exemplo3 {
    public static void main(String[] args) {
        int i, num_inicial, num_final;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o numero inicial: ");
        num_inicial = entrada.nextInt();
        System.out.println("Digite o numero Final: ");
        num_final = entrada.nextInt();
        i = num_inicial;
        while (i<=num_final) {
            System.out.println(i);
            i = i+2;           
        }
        System.out.println("Fim");   
    }    
}



