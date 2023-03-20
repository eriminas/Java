package aula14;
import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        float massaInicial;
        float massaAtual;
        float tempo = 0;
        float hora, minuto, segundo;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a massa inicial: ");
        massaInicial = entrada.nextFloat();
        massaAtual = massaInicial;

        while (massaAtual >= 0.5) {
            tempo = tempo + 50;
            massaAtual = (float) (massaAtual / 2.0);
        }
        //transforma os segundos
        hora = tempo / 3600;
        minuto = tempo / 60;     

        System.out.println("tempo em segundos: " + tempo + "segundos");
        System.out.println("horas: " + hora + "hs");
        System.out.println("minutos: " + minuto + "min");       
    }
}
