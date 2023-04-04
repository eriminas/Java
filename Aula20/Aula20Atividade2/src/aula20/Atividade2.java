package aula20;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class Atividade2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);		
		List<Forma> list = new ArrayList<>();		
		System.out.print("Entre com o numero de formas: ");
		int n = entrada.nextInt();		
		for (int i=1; i<=n; i++) {
			System.out.println("Forma #" + i + " Dados:");
			System.out.print("Retangulo ou Circulo (r/c)? ");
			char ch = entrada.next().charAt(0);
			System.out.print("Cor (BLACK/BLUE/RED): ");
			Cor cor = Cor.valueOf(entrada.next());
			if (ch == 'r') {
				System.out.print("Largura: ");
				double width = entrada.nextDouble();
				System.out.print("Altura: ");
				double height = entrada.nextDouble();
				list.add(new Retangulo(cor, width, height));
			}
			else {
				System.out.print("Raio: ");
				double radius = entrada.nextDouble();
				list.add(new Circulo(cor, radius));
			}
		}		
		System.out.println();
		System.out.println("FORMA AREAS:");
		for (Forma forma : list) {
			System.out.println(String.format("%.2f", forma.area()));
		}		
		entrada.close();
    }    
}
