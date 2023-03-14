package aula10;
import java.util.Scanner;
public class Atividade1 {
    public static void main(String[] args) {
        int numero, contador, i;
        i = 2;
        contador = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println(" Digite o numero ");
        numero = entrada.nextInt();
        while (i < numero) {           
            if (numero % i == 0)contador++;                            
                i++;            
        }
        if (contador > 0 || numero == 1) {
            System.out.println("nao eh primo " + numero);
        } else {
            System.out.println("eh primo " + numero);
        }
    }
}
