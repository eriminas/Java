package aula20;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {    
       // File file = new File("C:\\temp\\in.txt");
        File file = new File("C:\\Users\\vsterfo\\OneDrive - Venturus\\Área de Trabalho\\in.txt");        
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error opening file: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
            System.out.println("O bloco Finally foi executado");
        }
    }
}

