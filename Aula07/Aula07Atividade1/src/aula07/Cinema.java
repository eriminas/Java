package aula07;
import java.util.Scanner;
public class Cinema {
    public static void main(String[] args) {
        int dinheiro;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantia de dinheiro que voce tem:");
        dinheiro = entrada.nextInt();
        if (dinheiro >= 30) {
            System.out.println("Esta liberado pra ir ao cinema!!");
        } else {
            System.out.println("Fique em casa e assista sua TV!!");
    }}}
