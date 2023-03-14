package aula10;
import java.util.Scanner;
public class Atividade2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);		
		int senha;
                System.out.println("Digite uma sennha: ");
                senha = entrada.nextInt();		
		while (senha != 2023) {
			System.out.println("Senha Invalida");
                        System.out.println("Tente novamente: ");
			senha = entrada.nextInt();
		}		
		System.out.println("Acesso Permitido");	
                System.out.println("Agora voce fazer sua atividade!!");	
		entrada.close();
    }    
}
