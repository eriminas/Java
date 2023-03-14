package aula11;
import java.util.Scanner;
public class Exemplo5 {
    public static void main(String[] args) {
        int N[][] = new int[2][2];
        N[0][0] = 1;
        N[0][1] = 4;
        N[1][0] = 7;
        N[1][1] = 9;             
        System.out.println(N[0][0] + "\t" + N[0][1]); 
        System.out.println(N[1][0] + "\t" + N[1][1]); 
        System.out.println();          
        
        int M[][] = new int[2][2];
        Scanner entrada = new Scanner(System.in);
        for (int i=0; i<2; i++) {
            for (int j=0; j<2; j++) {
                System.out.println("M["+ i +"]" + "M[" + j + "]:");
                M[i][j]= entrada.nextInt();                 
            }               
        } 
        for (int i=0; i<2; i++) {
            System.out.println("\n");
            for (int j=0; j<2; j++) {                
            System.out.print(M[i][j] + "\t");              
            }              
        }  
         
        System.out.println(); 
        System.out.println("comprimento dos arrays: ");
        System.out.println(N.length);
        System.out.println(M.length); 
        
    }      
}



