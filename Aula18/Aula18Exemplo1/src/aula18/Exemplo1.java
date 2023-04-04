package aula18;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        
        System.out.println("Fim odo programa");
        sc.close();
    }
}

