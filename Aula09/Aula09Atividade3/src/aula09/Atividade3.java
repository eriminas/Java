package aula09;
import java.util.Scanner;
public class Atividade3 {
    public static void main(String[] args) {
        int contador, numero, fatorial;
        char resp;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("Digite um numero: ");
            numero = entrada.nextInt();
            contador = numero;
            fatorial = 1;
            do {
                fatorial = fatorial * contador;
                contador = contador - 1;
            } while (contador > 1);              
            if (numero==0) {
                fatorial = 1;
            }             
            System.out.println("O fatorial de " + numero + " eh igual a " + fatorial);
            System.out.println("Quer continuar? [S/N]");
            resp = entrada.next().charAt(0);
        } while (resp != 'n');
    }
}


