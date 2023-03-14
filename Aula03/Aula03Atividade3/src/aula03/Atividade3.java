package aula03;
import java.util.Scanner;
public class Atividade3 {
    public static void main(String[] args) {
        double base, altura, area;
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite a base: ");
        base = entrada.nextDouble();
        System.out.println("digite a altura: ");
        altura = entrada.nextDouble();
        
        area = (base*altura)/2;
        
        System.out.println(" base = " + base);
        System.out.println(" altura = " + altura);
        System.out.println(" area = " + area);
    }    
}
