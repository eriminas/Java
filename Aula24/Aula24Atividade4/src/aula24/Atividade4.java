package aula24;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> list = new ArrayList<>();

        // PART 1 - LENDO OS DADOS:
        System.out.print("Quantos funcionarios serão registrados? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Funcionario #" + i + ": ");

            System.out.print("Id: ");
            int id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.print("Id ja existe. Tente novamente: ");
                id = sc.nextInt();
            }

            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salario: ");
            double salary = sc.nextDouble();
            list.add(new Funcionario(id, name, salary));
        }

        // PART 2 - ATUALIZANDO SALARIO DO FUNCIONARIO:
        System.out.println();
        System.out.print("Entre com o Id do funcionario que vai receber aumento: ");
        int id = sc.nextInt();
        Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("Este id nao existe!");
        } else {
            System.out.print("Entre com a porcentagem: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        // PART 3 - LISTANDO FUNCIONARIOS:
        System.out.println();
        System.out.println("Lista de Funcionarios:");
        for (Funcionario obj : list) {
            System.out.println(obj);
        }

        sc.close();
    }

    public static boolean hasId(List<Funcionario> list, int id) {
        Funcionario emp = list.stream()
                           .filter(x -> x.getId() == id)
                           .findFirst()
                           .orElse(null);
        return emp != null;
    }
}
