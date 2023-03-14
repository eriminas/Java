package aula06;
import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //int a = 4;
        float a = 4;
        double b = 3.3;        
        a %= b;
        System.out.println("O resuldato final é: " + a);
    }    
}
