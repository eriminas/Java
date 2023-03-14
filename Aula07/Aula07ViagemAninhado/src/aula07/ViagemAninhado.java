package aula07;
import java.util.Scanner;
public class ViagemAninhado {
    public static void main(String[] args) {
        int saldo;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual saldo voce possui no momento? ");
        saldo = entrada.nextInt();

        if (saldo > 10000) {
            System.out.println(" Parabens!! Voce pode viajar pela Europa.");
        } else if(saldo <= 4000){
            System.out.println("Fique em casa e descanse nas ferias!!");
        }else{
        System.out.println("Com essa quantia voce pode viajar pelo Brasil!!");
        }}}



