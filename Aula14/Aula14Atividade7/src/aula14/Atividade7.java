package aula14;
import java.util.Locale;
import java.util.Scanner;
public class Atividade7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Estudante estudante = new Estudante();
        System.out.println("Digite o nome do aluno: ");
        estudante.nome = sc.nextLine();
        System.out.println("Primeira Nota: ");
        estudante.grade1 = sc.nextDouble();
        System.out.println("Segunda Nota: ");
        estudante.grade2 = sc.nextDouble();
        System.out.println("Terceira Nota: ");
        estudante.grade3 = sc.nextDouble();
        System.out.printf("FINAL GRADE: %.2f%n", estudante.finalGrade());
        if (estudante.finalGrade() < 60.0) {
            System.out.println("REPROVADO");
            System.out.printf("FALTANDO %.2f PONTOS%n", estudante.pontosFaltantes());
        } else {
            System.out.println("APROVADO");
        }
        sc.close();
    }

}
