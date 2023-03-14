package aula06;

import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        num = entrada.nextInt();        
        String msg = num > 10 ? "Numero eh maior que 10"
                : num > 5 ? "Numero eh maior que 5" : "Numero eh menor que 5";
        
        System.out.println(msg);
    }
}
