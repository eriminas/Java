package aula09;
import java.util.Scanner;
public class Atividade4 {
    public static void main(String[] args) {
        int quant, nhomens, nmulher;
        double altura, maior;
        char sexo;
        maior = 0;
        nhomens = 0;
        nmulher = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o número de pessoas para avaliar: ");
        quant = entrada.nextInt();
        System.out.println("Digite a altura e o sexo das pessoas:");
        do {
            System.out.println("Altura: ");
            altura = entrada.nextDouble();
            System.out.println("Sexo (m-mulher e h-homem): ");
            sexo = entrada.next().charAt(0);           
            System.out.println("--------------- xxxxxx --------------");           
            quant = quant - 1;
            if (altura > maior) {
                maior = altura;
            }
            if (sexo == 'm') {
                nmulher = nmulher + 1;
            } else {
                nhomens = nhomens + 1;
            }
        }while(quant > 0);
        System.out.println("A maior altura do grupo: " + maior);
        System.out.println("O número de homens: " + nhomens);
    }   
}







