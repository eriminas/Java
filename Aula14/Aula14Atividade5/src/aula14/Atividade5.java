package aula14;

import java.util.Locale;
import java.util.Scanner;
public class Atividade5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        Retangulo rect = new Retangulo();
        System.out.println("Entre com a largura e altura do retangulo:");
        rect.largura = entrada.nextDouble();
        rect.altura = entrada.nextDouble();
        System.out.printf("AREA = %.2f%n", rect.area());
        System.out.printf("PERIMETRO = %.2f%n", rect.perimetro());
        System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());
        entrada.close();
    }

}
