package aula07;

import java.util.Scanner;

public class Semana {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com um numero de 1 a 7: ");
        int x = entrada.nextInt();
        String dia;
        switch (x) {
            case 1:
                dia = "domingo";
                
            case 2:
                dia = "segunda";
                
            case 3:
                dia = "terca";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
               
            case 7:
                dia = "sabado";
               
            default:
                dia = "valor invalido";
                break;
        }
        System.out.println("Dia da semana: " + dia);
    }
}
