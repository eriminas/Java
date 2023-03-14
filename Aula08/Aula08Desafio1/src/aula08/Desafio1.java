package aula08;
import java.util.Scanner;
public class Desafio1 {
    public static void main(String[] args) {
        double preco;
        int situacao, categoria;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o preco: ");
        preco = entrada.nextDouble();
        System.out.println("Escolha a categoria: ");
        System.out.println("1. Limpeza");
        System.out.println("2. Alimentacao");
        System.out.println("3. Vestuario");
        categoria = entrada.nextInt();
        System.out.println("Escolha a situacao: ");
        System.out.println("1. Refrigeracao");
        System.out.println("2. Sem Refrigeracao");
        situacao = entrada.nextInt();
        switch (categoria) {
            case 1:
                if (preco <= 25) {
                    preco = preco + (preco * 5 / 100);
                } else {
                    preco = preco + (preco * 12 / 100);
                }
                System.out.println("Preco com aumento: " + preco);
                break;
            case 2:
                if (preco <= 25) {
                    preco = preco + (preco * 8 / 100);
                } else {
                    preco = preco + (preco * 15 / 100);
                }
                System.out.println("Preco com aumento: " + preco);
                break;
            case 3:
                if (preco <= 25) {
                    preco = preco + (preco * 10 / 100);
                } else {
                    preco = preco + (preco * 18 / 100);
                }
                System.out.println("Preco com aumento: " + preco);
                break;
            default:
                System.out.println("INVALIDO");
                break;
        }
        if (categoria == 2 || situacao == 1) {
            preco = preco - (preco * 5 / 100);
            System.out.println("Preco Atualizado: " + preco);
        } else {
            preco = preco - (preco * 8 / 100);
            System.out.println("Preco Atualizado: " + preco);            
            }
        
        if (preco <= 50) {
                System.out.println("Barato");
            } else {
                if (preco < 120) {
                    System.out.println("Normal");
                } else {
                    System.out.println("Caro");
                }
        }
    }
}
