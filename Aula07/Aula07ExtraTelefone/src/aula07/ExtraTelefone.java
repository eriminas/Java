package aula07;
import java.util.Scanner;
public class ExtraTelefone {
    public static void main(String[] args) { 
        int minutos;
        double conta = 50.0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("O valor de minutos utilizados no mes? ");
        minutos = entrada.nextInt();        
        if (minutos > 100) {
            conta += (minutos - 100) * 2.0;
        }
        System.out.printf("Valor da conta = R$ %.2f%n", conta);
        entrada.close();
    }}




