package aula07;

import java.util.Scanner;

public class Atividade3Outro {
    public static void main(String[] args) {
       String nome, categoria;
        int idade;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nome do Atleta = ");
        nome = entrada.nextLine();
        System.out.println("Idade do Atleta = ");
        idade = entrada.nextInt();        
        switch (idade) {
            case 5,6,7,8,9,10:
                categoria = "Infantil"; 
                break;
            case 11,12,13,14,15:
                categoria = "Juvenil";  
                break;
            case 16,17,18,19,20:
                categoria = "Junior";    
                break;
            case 21,22,23,24,25:
                categoria = "Profissional";
                break;
            default:
                categoria = "INVALIDO";
                break;
        }
        System.out.println("Categoria = " + categoria);
    }    
}
