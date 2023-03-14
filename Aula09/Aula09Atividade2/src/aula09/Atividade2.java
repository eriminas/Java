package aula09;
import java.util.Locale;
import java.util.Scanner;
public class Atividade2 {
    public static void main(String[] args) {
        int alunos;
        String nome;        
        double n1, n2, n3;
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos alunos? ");
        alunos = entrada.nextInt();
        for (int i = 0; i < alunos; i++) {
            System.out.println("Digite o nome: ");
            nome = entrada.next();
            System.out.println("Digite a primeira nota: ");
            n1 = entrada.nextDouble();
            System.out.println("Digite a segunda nota: ");
            n2 = entrada.nextDouble();
            System.out.println("Digite a terceira nota: ");
            n3 = entrada.nextDouble();

            double media = (n1 * 2.0 + n2 * 3.0 + n3 * 5.0) / 10.0;
            System.out.printf("A media de "+ nome +" eh %.1f%n", media);
        }
        entrada.close();
    }
}
