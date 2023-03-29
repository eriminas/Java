package aula23;
import java.util.Scanner;
public class Exemplo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ServicoImpressao ps = new ServicoImpressao();
        System.out.print("Quantidade? ");
        int n = sc.nextInt();     
        
        //ps.adicionaValor("Maria");  
        
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();            
            ps.adicionaValor(value);
        }  
        ps.imprime();  
        int x = (int)ps.primeiro();
        System.out.println("Primeiro: " + x);  
        sc.close();  
        
        //int x = (int) ps.primeiro();
        //System.out.println("Primeiro: " + x);  
    }
}






