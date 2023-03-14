package aula04;
import java.util.Locale;
import java.util.Scanner;
public class Atividade6 {
    public static void main(String[] args) {
        int numero, horas;
        double valorHora, salario;
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o numero do funcionario: ");
        numero = entrada.nextInt();
        System.out.println("Digite as horas trabalhadas no mes: ");
        horas = entrada.nextInt();
        System.out.println("Digite o valor da hora de trabalho: ");
        valorHora = entrada.nextDouble();

        salario = valorHora * horas;

        System.out.println("Numero = " + numero);
        System.out.printf("Salario = R$ %.2f%n", salario);
        entrada.close();
    }
}
