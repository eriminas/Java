package aula12;
import java.util.Random;
import java.util.Scanner;
public class Atividade7 {
    public static void main(String[] args) {
        int numero, contador, palpite;
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();  
        numero = aleatorio.nextInt(100);
        contador = 0;
        palpite = -1;
        while (palpite != numero) {
            System.out.println("Digite o palpite: ");
            palpite = entrada.nextInt();
            contador++;
            if (palpite > numero) {
                System.out.println("Digite um numero menor: ");                
            } else {if (palpite < numero) {
                System.out.println("Digite um numero maior: ");                    
                } else {
                System.out.println("Parabens!!");
                System.out.println("Voce acertou com " + contador + " tentativas.");
                }
            }            
        }
        entrada.close();
    }    
}
