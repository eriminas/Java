package aula12;
import java.util.Scanner;
public class Atividade4 {
    public static void main(String[] args) {
        int i, j;
        double M[][] = new double[3][3];
        double somaTotal, somaLinha3, somaColuna2, somaDiag;
        Scanner entrada = new Scanner(System.in);
        somaTotal = 0;
        somaLinha3 = 0;
        somaColuna2 = 0;
        somaDiag = 0;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.println("Digite um valor para a Matriz: ");
                M[i][j] = entrada.nextDouble();
                somaTotal = M[i][j] + somaTotal;
                if (i == 3) {
                    somaLinha3 = M[i][j] + somaLinha3;
                }
                if (j == 2) {
                    somaColuna2 = M[i][j] + somaColuna2;
                }
                if (i == j) {
                    somaDiag = M[i][j] + somaDiag;
                }
            }
        }
        System.out.println("A soma total eh: " + somaTotal);
        System.out.println("A soma da linha 3 eh: " + somaLinha3);
        System.out.println("A soma da coluna 2 eh: " + somaColuna2);
        System.out.println("A soma da diagonal Principal eh: " + somaDiag);         
    }       
}
