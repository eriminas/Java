package aula06;
import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b;  
        System.out.println("Digite a variavel: ");              
        a = entrada.nextInt();
        System.out.println("Digite o operando: ");              
        b = entrada.nextInt();        
        
        a /= b;
        
        System.out.println("O resuldato final eh: " + a);      
    }    
}
