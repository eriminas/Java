package aula10;
import java.util.Scanner;
public class Atividade7 {
    public static void main(String[] args) {
        int i, ano_atual;
        double salario, novo_salario, percentual;
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite o ano atual: ");
        ano_atual = entrada.nextInt();
        System.out.println("digite o valor do salario inicial: ");
        salario = entrada.nextDouble();
        percentual = (1.5 / 100);
        novo_salario = salario + percentual * salario;
        for (i = 2010; i <= ano_atual; i++) {
            percentual = 2 * percentual;
            novo_salario = novo_salario + percentual * novo_salario;
        }
        System.out.println("novo salario: " + novo_salario);   
    }   
}
