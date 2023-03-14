package aula08;
import java.util.Scanner;
public class Atividade12 {
    public static void main(String[] args) {
        int i;
        double n1, n2, n3, maior, menor, medio;
        Scanner entrada = new Scanner(System.in);
        System.out.println("DIGITE 03 VALORES..");
        n1 = entrada.nextDouble();
        n2 = entrada.nextDouble();
        n3 = entrada.nextDouble();
        System.out.println("DIGITE 1 SE QUISER VER ELES EM ORDEM CRESCENTE.");
        System.out.println("DIGITE 2 SE QUISER VER ELES EM ORDEM DECRESCENTE.");
        System.out.println("DIGITE 3 SE QUISER QUE O MAIOR FIQUE ENTRE OS DOIS.");
        i = entrada.nextInt();
        if ((n1 > n2) && (n1 > n3)) {
            if (n2 > n3) {
                maior = n1;
                medio = n2;
                menor = n3;

            } else {
                maior = n1;
                medio = n3;
                menor = n2;
            }
        } else {
            if ((n2 > n1) && (n2 > n3)) {
                if (n1 > n3) {
                    maior = n2;
                    medio = n1;
                    menor = n3;

                } else {
                    maior = n2;
                    medio = n3;
                    menor = n1;
                }

            } else {
                if (n1 > n2) {
                    maior = n3;
                    medio = n1;
                    menor = n2;

                } else {
                    maior = n3;
                    medio = n2;
                    menor = n1;
                }
            }
        }
        if (i == 1) {
            System.out.println("OS NUMEROS EM ORDEM CRESCENTE SAO:.." + menor + ", " + medio + ", " + maior);
        }
        if (i == 2) {
            System.out.println("OS NUMEROS EM ORDEM DECRESCENTE SAO:.." + maior + ", " + medio + ", " + menor);
        }
        if (i == 3) {
            System.out.println("OS NUMEROS EM QUE O MAIOR FIQUE ENTRE OS DOIS :.." + menor + ", " + maior + ", " + medio);
        }
        if (i == 4) {
            System.out.println("O NUMERO INDICADO NAO EXECUTA A TAREFA");
        }
    }
}
