package aula18;
import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {        
        Scanner entrada = new Scanner(System.in);
        Quadrado quadrado = new Quadrado();   
        System.out.println("Digite a lado: ");
        quadrado.setLado(0);
        //quadrado.setLado(10);
        quadrado.getNomeFigura();
        quadrado.getPerimetro();
        quadrado.getArea();
        System.out.println("##################################");
       
        
        Triangulo triangulo = new Triangulo();  
        triangulo.setLadoA(12);
        triangulo.setLadoB(9);
        triangulo.setLadoC(11);
        triangulo.setAltura(8);
        triangulo.setBase(12);
        triangulo.getNomeFigura();
        triangulo.getPerimetro();
        triangulo.getArea();
        System.out.println("##################################");
    }    
}
