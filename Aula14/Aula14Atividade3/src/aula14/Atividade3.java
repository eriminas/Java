package aula14;
import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {       
        Scanner entrada = new Scanner(System.in);
        Salario sal = new Salario();
        System.out.println("digite o ano atual: ");
        sal.anoAtual = entrada.nextInt();
        System.out.println("digite o valor do salario: ");
        sal.salario = entrada.nextDouble();
//        sal.percentual = (1.5/100);
//        sal.novoSalario = sal.salario + sal.percentual*sal.salario;       
        System.out.println("O novo salario eh: " + sal.salarioAtual());   
        
    }
}
