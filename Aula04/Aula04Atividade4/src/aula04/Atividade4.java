package aula04;
import java.awt.BorderLayout;
import java.util.Locale;
import java.util.Scanner;
public class Atividade4 {
    public static void main(String[] args) {        
        double raio, area;
        double pi = 3.14159;
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o raio: ");
        raio = entrada.nextDouble();

        area = pi*raio*raio;
        System.out.printf("Area = %.2f%n", area);
        System.out.printf("Area = %.4f%n", area);
        entrada.close();
    }
}
