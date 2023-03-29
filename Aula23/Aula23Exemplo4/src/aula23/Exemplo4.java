package aula23;
import java.util.Scanner;
public class Exemplo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ServicoImpressao<String> ps = new ServicoImpressao<>();
        System.out.print("Quantidade? ");
        int n = sc.nextInt(); 

        //ps.adicionaValor(20);          

        for (int i = 0; i < n; i++) {           
            String value = sc.next();
            ps.adicionaValor(value);
        }        
        ps.imprime();
        String x = ps.primeiro();
        System.out.println("Primeiro: " + x);        
        sc.close();         
    }    
}



