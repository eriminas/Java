package aula08;
import java.util.Scanner;
public class Atividade4 {
    public static void main(String[] args) {
        float n1, n2, n3, media;       
        String nome;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        nome = entrada.nextLine();
        System.out.println("Digite a primeira nota: ");
        n1 = entrada.nextFloat();
        System.out.println("Digite a segunda nota: ");
        n2 = entrada.nextFloat();
        System.out.println("Digite a terceira nota: ");
        n3 = entrada.nextFloat();
        media = (n1 + n2 + n3) / 3;
        System.out.println("A media de " + nome + " eh: " + media);
        if (media >= 7) {
            System.out.println("Parabens!! Voce esta APROVADO.");
        } else {
            if (media < 5) {
                System.out.println("Sorry!! Voce esta REPROVADO");
            } else {
                System.out.println("Fique atento!! Voce esta de RECUPERACAO");
            }
        }
    }
}
