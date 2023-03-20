package aula15;
import java.util.Locale;
import java.util.Scanner;
public class Atividade2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);           
        System.out.println("DADOS DO PRODUTO");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Preco: ");
        double preco = sc.nextDouble();
        System.out.print("Quantidade em estoque: ");
        int quantidade = sc.nextInt();       
        System.out.println();
        Produto produto = new Produto(nome, preco, quantidade);
        System.out.println("Dados dos Produtos: ");
        produto.status();
        System.out.println();
        System.out.print("Entre com o numero de produtos para adicionar no estoque: ");
        quantidade = sc.nextInt();
        produto.addProdutos(quantidade);
        System.out.println();
        System.out.println("Dados Atualizados: ");
        produto.status();
        System.out.println();
        System.out.print("Entre com o numero de produtos para ser removido do estoque: ");
        quantidade = sc.nextInt();
        produto.removeProdutos(quantidade);
        System.out.println();
        System.out.println("Dados atualizados: ");
        produto.status();
        sc.close();
    }
}
