package aula05;
import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        int numeroDias;
        String quinzena;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o dia do Mês que estamos (1 a 31): ");
        numeroDias = entrada.nextInt();

        quinzena = (numeroDias <= 15) ? "Primeira quinzena" : "Segunda quinzena";
        
        System.out.println(quinzena);
    }
}
