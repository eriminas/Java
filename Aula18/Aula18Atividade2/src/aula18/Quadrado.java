package aula18;
import java.util.Scanner;

public class Quadrado implements FiguraGeometrica {
    private int lado;    
    
    Scanner entrada = new Scanner(System.in);

    public int getLado() {           
        return lado;
    }

    public void setLado(int lado) {         
        this.lado = entrada.nextInt();
    }

    public void getArea() {
        int area = 0;
        area = lado * lado;
        System.out.println("A area eh: " + area);
    }

    public void getPerimetro() {
        int perimetro = 0;
        perimetro = lado * 4;
        System.out.println("O perimetro eh: " + perimetro);

    }

    public void getNomeFigura() {
        String nome;
        nome = "quadrado";
        System.out.println("O nome da figura eh: " + nome);
    }
}
