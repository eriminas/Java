package aula08;
import java.util.Date;
import java.util.Scanner;
public class Atividade10 {
    public static void main(String[] args) {
        int duracao;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com a hora inicial: ");
        int horaInicial = sc.nextInt();      
        System.out.println("Entre com a hora final: ");
        int horaFinal = sc.nextInt();    
        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        sc.close();
    }
}
