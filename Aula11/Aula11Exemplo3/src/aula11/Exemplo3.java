package aula11;
import java.util.Scanner;
public class Exemplo3 {
    public static void main(String[] args) {
        int i;
        int num[] = new int[4];
        Scanner entrada = new Scanner(System.in);        
        for (i=0; i<4; i++) {
            System.out.println("Digite o numero da posicao " + i + " :");
            num[i] = entrada.nextInt();                   
        }        
        int total = num[0] + num[1] + num[2] + num[3];
        System.out.println("A soma dos elementos do vetor eh: " + total);
    }
}




