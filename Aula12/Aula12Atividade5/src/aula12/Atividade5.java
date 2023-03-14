package aula12;
import java.util.Scanner;
public class Atividade5 {
    public static void main(String[] args) {
        int i, j;
        int matriz[][] = new int[3][4];
        Scanner entrada = new Scanner(System.in);
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                System.out.println("Entre com o elemento: " + i + j );
                matriz[i][j] = entrada.nextInt();
            }
        }
        System.out.println("Matriz Principal");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {                
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("Matriz Modificada");

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                if (matriz[i][j] < 0) {
                    matriz[i][j] = 0;
                }
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
