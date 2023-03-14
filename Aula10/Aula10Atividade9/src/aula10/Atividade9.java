package aula10;

import java.util.Scanner;

public class Atividade9 {

    public static void main(String[] args) {
        double massa, massai, massaf;
        int contador, hora, minuto, segundo;
        Scanner entrada = new Scanner(System.in);
        contador = 0;
        massaf = 0;
        System.out.println("Digite a massa inicial: ");
        massa = entrada.nextDouble();
        massai = massa;
        while (massa >= 0.5) {
            massa = massa / 2;
            contador = contador + 60;            
        }
        massaf = massa;         
        minuto = contador/60;
        hora = minuto/60;
        System.out.println("A massa inicial eh: " + massai);
        System.out.println("A massa final eh: " + massaf);
        System.out.println("O tempo gasto foi: "+ hora + " h " + minuto + " m ");
       }
}
