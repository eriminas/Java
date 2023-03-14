package aula12;
import java.util.Random;
public class Atividade8 {
    public static void main(String[] args) {
        int i, j, aux;
        Random aleatorio = new Random();
        int dezena[] = new int[6];
        aux = 0;
        for (i=0; i<dezena.length; i++ ) {
            dezena[i] = aleatorio.nextInt(60) + 1;
        }
        for (i=0; i<dezena.length-1; i++) {
            for (j=i+1; j<dezena.length; j++) {
                if (dezena[i] > dezena[j]) {
                    aux = dezena[i];
                    dezena[i] = dezena[j];
                    dezena[j] = aux;                  
                }                
            }
        }    
        System.out.println("Dezenas da Mega Sena: ");
        for ( int x:dezena ) {
            System.out.printf("%02d", x);  
            System.out.println(" ");
        }        
    }   
}
