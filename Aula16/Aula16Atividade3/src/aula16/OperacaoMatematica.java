package aula16;
import java.util.Scanner;
public class OperacaoMatematica {
    protected int N;
    Scanner entrada = new Scanner(System.in);    
    
    public void negativoOuPositivo() {        
        if (N < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NAO NEGATIVO");
        }
    }
    public void parOuImpar() {
        if (N % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
    }
}
