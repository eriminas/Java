package aula12;
import java.util.Scanner;
public class Atividade6 {
    public static void main(String[] args) {
        int c, i, j, aux;
        int v[] = new int[10];
        Scanner entrada = new Scanner(System.in);

        for (c = 0; c < 10; c++) {
            System.out.println("Digite o " + c + "o. valor: ");
            v[c] = entrada.nextInt();
        }
        for (i = 0; i < 9; i++) {
            for (j = i + 1; j < 10; j++) {
                if (v[i] > v[j]) {
                    aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }                   
            }            
        }  
        System.out.println("-------------------------------");
        System.out.println("Vetor Ordenado: ");
        System.out.println("-------------------------------");
        for (c = 0; c < 10; c++) {
            System.out.println(v[c] + " ");
        }
    }    
    }

    

