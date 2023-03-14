package aula03;
import java.util.Scanner;
public class Atividade4 {
    public static void main(String[] args) {
        String nome;
        int idade;
        double nota1, nota2, nota3, nota4, media;
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite o nome do aluno: ");
        nome = entrada.next();
        System.out.println("digite a idade do aluno: ");
        idade = entrada.nextInt();
        System.out.println("digite a nota 1:  ");
        nota1 = entrada.nextDouble();
        System.out.println("digite a nota 2:  ");
        nota2 = entrada.nextDouble();
        System.out.println("digite a nota 3:  ");
        nota3 = entrada.nextDouble();
        System.out.println("digite a nota 4:  ");
        nota4 = entrada.nextDouble();
        
        media = (nota1 + nota2 + nota3 + nota4)/4;
        
        System.out.println(" nome = " + nome);
        System.out.println(" idade = " + idade);
        System.out.println(" media = " + media);
        System.out.println(" nota1 = " + nota1);
        System.out.println(" nota2 = " + nota2);
        System.out.println(" nota3 = " + nota3);
        System.out.println(" nota4 = " + nota4);      
    }    
}
