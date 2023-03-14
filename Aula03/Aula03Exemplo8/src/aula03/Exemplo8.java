package aula03;
import java.util.Scanner;

public class Exemplo8 {
    public static void main(String[] args) {
        double b, B, h, area;        
        Scanner entrada = new Scanner(System.in);         
        
        System.out.println("Digite a base menor: ");     
        b = entrada.nextDouble();
        System.out.println("Digite a base maior: ");
        B = entrada.nextDouble();
        System.out.println("Digite a altura: ");
        h = entrada.nextDouble();
        
        area = (b + B) / 2.0*h ;
        
        System.out.println("Area: " + area);        
    }    
}



