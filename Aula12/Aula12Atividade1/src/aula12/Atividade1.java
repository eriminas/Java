package aula12;
import java.util.Scanner;
public class Atividade1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome[] = new String[5];
        double nota1[] = new double[5];
        double nota2[] = new double[5];
        double media[] = new double[5];
        double SMed = 0, MTurma;
        int i;

        for (i = 0; i < 5; i++) {
            System.out.println("--------------------");
            System.out.println("DADOS DO ALUNO ");
            System.out.println("--------------------");
            System.out.println("Nome: ");
            nome[i] = entrada.next();
            System.out.println("Nota1: ");
            nota1[i] = entrada.nextDouble();
            System.out.println("Nota2: ");
            nota2[i] = entrada.nextDouble();
            System.out.println("Media: ");
            media[i] = (nota1[i] + nota2[i]) / 2;
            System.out.println(media[i]);
            SMed = SMed + media[i];
        }
        MTurma = SMed / 5;
        System.out.println("A media da turma e " + MTurma);
        System.out.println("---------------------------------");
        System.out.println("Alunos que ficaram acima da media");
        System.out.println("---------------------------------");
        for (i = 0; i < 5; i++) {
            if (media[i] > MTurma) {
                System.out.println(nome[i] + "\t" + media[i]);
            }
        }
    }
}
