package aula10;
import java.util.Scanner;
public class Atividade4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com a coordenada x: ");
        int x = entrada.nextInt();
        System.out.println("Entre com a coordenada y: ");
        int y = entrada.nextInt();
        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("primeiro quadrante");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo quadrante");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro quadrante");
            } else {
                System.out.println("quarto quadrante");
            }
            System.out.println("###########################");
            System.out.println("Entre com a coordenada x: ");
            x = entrada.nextInt();
            System.out.println("Entre com a coordenada y: ");
            y = entrada.nextInt();
        }
        System.out.println("Algoritmo Interrompido!!");
        entrada.close();
    }
}
