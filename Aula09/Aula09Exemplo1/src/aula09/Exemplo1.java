package aula09;
import java.util.Scanner;
public class Exemplo1 {
    public static void main(String[] args) {
        float numero, total;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Para finalizar a tarefa digite 0");
        System.out.println("Digite um numero qualquer: ");        
        numero = entrada.nextFloat();
        total = 0;
        while (numero != 0) {
            System.out.println("Digite outro numero: ");
            numero = entrada.nextFloat();
            total = total + numero;
        }
        System.out.println("A Soma total eh: " + total);
       
    }
}
