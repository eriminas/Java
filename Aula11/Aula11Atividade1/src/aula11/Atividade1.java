package aula11;
import java.util.Scanner;
public class Atividade1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);        
        int vetor[] = new int[4]; // Vetor criado.        
        int num = 10; // inicia variavel num com 10.         
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o elemento " + i + " :");
            vetor[i] = entrada.nextInt(); // inicializa o vetor
            num = num + vetor[i]; // soma o valor num com o vetor. 
            System.out.println("Elemento " + i + ": " + num);            
        }        
    }
}



