package aula08;
import java.util.Scanner;
public class Atividade5 {
    public static void main(String[] args) {
        String Resp, nome;
        double salario, salarioReal, salarioNovo;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com o seu nome: ");
        nome = entrada.nextLine();
        System.out.println("Entre com o salário: ");
        salarioReal = entrada.nextDouble();
        salario = (salarioReal / 1212);
        if (salario <= 3) {
            salarioNovo = (salarioReal * 1.20);
        } else {
            if ((salario >= 4) && (salario <= 6)) {
                salarioNovo = (salarioReal * 1.15);
            } else {
                if ((salario >= 7) && (salario <= 9)) {
                    salarioNovo = (salarioReal * 1.12);
                } else {
                    if ((salario>=10) && (salario<=12)) {
                        salarioNovo = (salarioReal*1.10);                        
                    } else {
                        if ((salario>12) && (salario<15)) {
                            salarioNovo = (salarioReal*1.07);                            
                        } else {
                            salarioNovo = salarioReal;                        }
                    }
                }
            }
        }  
        System.out.println(nome + " o seu novo salario eh: " + salarioNovo);
    }  
}
