package aula05;
public class Exemplo5 {
    public static void main(String[] args) {
        boolean r1, r2, r3;
        int x = 4;
        int y = 7;
        int z = 12;
        
        r1 = (x<y && y<z)?true:false;
        r2 = (x<y || y<z)?true:false;
        r3 = (x<y ^ y<z)?true:false;
        
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
}


