package aula08;
import java.util.Locale;
import java.util.Scanner;
public class Atividade13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        double imposto;
        double salario;
        System.out.println("Digite o salario: ");
        salario = entrada.nextDouble();
        if (salario <= 1903.98){
            imposto = 0.0;
        } else if (salario <= 2826.65){
            imposto = salario* 0.075;
        } else if (salario <= 3751.05 ){
            imposto = salario* 0.15;
        }else if (salario <= 4664.68){
            imposto = salario*0.225;
        } else{
            imposto = salario*0.275;
        }
        if (imposto == 0.0) {
            System.out.println("Isento");
        } else {            
            System.out.printf(" Esta eh a quantia de imposto a pagar: R$ %.2f%n", imposto);
        }
        entrada.close();
    }
}
