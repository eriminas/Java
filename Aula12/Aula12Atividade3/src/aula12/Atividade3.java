package aula12;
import java.util.Scanner;
public class Atividade3 {
    public static void main(String[] args) {        
      Scanner scan = new  Scanner(System.in);  
      System.out.print("Digite o numero:");      
      int  num = scan.nextInt();        
      procuraParOuImpar(num);  
}  
    
public static void  procuraParOuImpar(int  num) {     
   if(num% 2 == 0 )  
      System.out.println(num + " eh par" );  
   else    
      System.out.println(num + " eh impar" );  
    }    
}


