package aula14;

import java.util.Locale;
import java.util.Scanner;

public class Atividade6 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Funcionario func = new Funcionario();
        System.out.print("Nome: ");
        func.nome = sc.nextLine();
        System.out.print("Salario Bruto: ");
        func.salarioBruto = sc.nextDouble();
        System.out.print("Imposto: ");
        func.imposto = sc.nextDouble();
        System.out.println();
        System.out.println("Funcionario: " + func);
        System.out.println();
        System.out.print("Qual a porcentagem de aumento salarial? ");
        double percentage = sc.nextDouble();
        func.aumentoSalario(percentage);
        System.out.println();
        System.out.println("Dados atualizados: " + func);
        sc.close();

    }
}
