package aula04;
import java.util.Scanner;
public class Atividade5 {
    public static void main(String[] args) {
        int A, B, C, D, dif;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor de A: ");
        A = sc.nextInt();
        System.out.println("Digite o valor de B: ");
        B = sc.nextInt();
        System.out.println("Digite o valor de C: ");
        C = sc.nextInt();
        System.out.println("Digite o valor de D: ");
        D = sc.nextInt();

        dif = A * B - C * D;

        System.out.println("DIFERENCA = " + dif);
        sc.close();
    }
}
