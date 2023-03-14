package aula11;
public class Exemplo2 {
    public static void main(String[] args) {       
        int v[] = new int[5];
        v[0] = 1;
        v[1] = 4;
        v[2] = 7;
        v[3] = 9;
        v[4] = 2;        
        for (int c=0; c<5; c++) {
             System.out.println("Na posicao "+ c + ", temos o valor: " + v[c]);                
        }         
        System.out.println("************************************************");   
        
        int n[] = {1, 4, 7, 9, 2};
        for (int i=0; i<5; i++) {
             System.out.println("Na posicao "+ i + ", temos o valor: " + n[i]);            
        } 
         System.out.println(v.length); 
         System.out.println(n.length); 
    }    
}






