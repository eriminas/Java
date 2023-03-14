package aula12;
import java.util.Scanner;
public class Atividade2 {
    public static void main(String[] args) {
        int i, j, c;
        String time[] = new String[10];
        Scanner entrada = new Scanner(System.in);

        System.out.println("-------------------");
        System.out.println("  COPA DE FUTEBOL  ");
        System.out.println("-------------------");

        for (c = 0; c < 10; c++) {
            System.out.println("Nome do " + c + "o. time: ");
            time[c] = entrada.nextLine();
        }

        System.out.println("-------------------");
        System.out.println("TABELA DAS PARTIDAS");
        System.out.println("-------------------");
        for (i = 0; i < 10; i++){
            for (c=0; c < 10; c++){
               if (i != c) {
                System.out.println(time[i] + "[] x [] " + time[c]);                 
            }           
            }
        }
    }
}
