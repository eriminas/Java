package aula09;
import java.util.Scanner;
public class Exemplo2 {
    public static void main(String[] args) {
       int contador, numero, salto;
       contador = 0;
       Scanner entrada = new Scanner(System.in);
        System.out.println("Ate qual numero voce quer contar? ");
        numero = entrada.nextInt();
        System.out.println("Voce quer contar saltando de quanto em quanto? ");
        salto = entrada.nextInt();        
        while (contador <= numero) {
            System.out.println(contador);
            contador = contador + salto;            
        }
        System.out.println("Terminei de contar!!");       
    }    
}




