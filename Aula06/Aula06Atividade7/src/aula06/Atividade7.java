package aula06;
import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        // variable declaration
        Scanner entrada = new Scanner(System.in);       
        int n1, n2, res;
        System.out.println("Digite o primeiro numero: ");
        n1 = entrada.nextInt();
        System.out.println("Digite o segundo numero: ");
        n2 = entrada.nextInt();
 
        System.out.println("Primeiro numero: " + n1);
        System.out.println("Segundo numero: " + n2);
 
        // Performing ternary operation
        res = (n1 > n2) ? (n1 + n2) : (n1 - n2);
 
        // Print the largest number
        System.out.println("Resultado = " + res);
    }    
}
