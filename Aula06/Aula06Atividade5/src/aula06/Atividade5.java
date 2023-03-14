package aula06;
import java.util.Scanner;
public class Atividade5 {
    public static void main(String[] args) {
        double l1, l2, l3;
        boolean T, TEQ, TES, TIS;
        Scanner entrada = new Scanner(System.in);        
        System.out.println("Digite o lado 1: ");
        l1 = entrada.nextDouble();
        System.out.println("Digite o lado 2: ");
        l2 = entrada.nextDouble(); 
        System.out.println("Digite o lado 3: ");
        l3 = entrada.nextDouble();
        
        T = (l1+l2)>l3 && (l2+l3)>l1 && (l1+l3)>l2;
        System.out.println("Pode formar um triangulo: " + T);
        
        TEQ = (l1==l2) && (l2==l3);
        System.out.println("Eh um triangulo equilatero? " + TEQ);
        
        TES = (l1!=l2) && (l2!=l3) && (l1!=l3);
        System.out.println("Eh um triangulo escaleno? " + TES);
        
        TIS = ((l1==l2) && (l1!=l3)) || ((l1==l3) && (l1!=l2)) || ((l2==l3) && (l1!=l3));
        System.out.println("Eh um triangulo isoceles? " + TIS);
        
        System.out.println(T = (l1+l2)<l3 && (l2+l3)<l1 && (l1+l3)<l2);
    }    
}
