package aula05;
public class Exemplo7 {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int c = 5;
        int d = 5;   
        
        System.out.println(a += ++a);
        System.out.println(c = c + ++c);        
       
        System.out.println(b += b++);
        System.out.println(d = d + d++);
    }
}




