package aula22;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        List<Funcionario> list = new ArrayList<>();

        System.out.print("Entre com o numero de funcionarios: ");
        int n = entrada.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Funcionario #" + i + " data:");
            System.out.print("Tercerizado (y/n)? ");
            char ch = entrada.next().charAt(0);
            System.out.print("Nome: ");
            entrada.nextLine();
            String nome = entrada.nextLine();
            System.out.print("Horas: ");
            int horas = entrada.nextInt();
            System.out.print("Valor por hora: ");
            double valorPorHora = entrada.nextDouble();
            if (ch == 'y') {
                System.out.print("Despesa Adicional: ");
                double despesaAdicional = entrada.nextDouble();
                list.add(new FuncionarioTercerizado(nome, horas, valorPorHora, despesaAdicional));
            } else {
                list.add(new Funcionario(nome, horas, valorPorHora));
            }
        }
        System.out.println();
        System.out.println("PAGAMENTOS:");
        for (Funcionario emp : list) {
            System.out.println(emp.getNome() + " - $ " + String.format("%.2f", emp.pagamento()));
        }
        entrada.close();
    }
}
