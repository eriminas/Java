package aula05;
import java.util.Scanner;
public class Atividade1 {
    public static void main(String[] args) {
        int idade;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a idade: ");
        idade = entrada.nextInt();
        
        String voto = ((idade>=16 && idade<18) || (idade>70))? "Eh Opcional":"Nao Eh Opcional";
        System.out.println(voto);
    }    
}


