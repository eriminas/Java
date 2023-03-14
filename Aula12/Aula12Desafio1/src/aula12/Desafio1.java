package aula12;
import java.util.Random;
public class Desafio1 {
    public static void main(String[] args) {
        float total;
        int i, num_lances = 0, cont1, cont2, cont3, cont4, cont5, cont6;
        cont1 = cont2 = cont3 = cont4 = cont5 = cont6 = 0;
        int lances[] = new int[num_lances];
        for (i = 0; i < num_lances; i++) {
            lances[i] = lancarDado();
            switch (lances[i]) {
                case 1:
                    cont1++;
                    break;
                case 2:
                    cont2++;
                    break;
                case 3:
                    cont3++;
                    break;
                case 4:
                    cont4++;
                    break;
                case 5:
                    cont5++;
                    break;
                case 6:
                    cont6++;
                    break;
            }
        }
        System.out.println("Resultados dos lances dos dados: ");
        System.out.printf("Face 1: %d vezes %.2f %%\n", cont1, (float) cont1/num_lances*100);
    }

    private static int lancarDado() {
        Random aleatorio = new Random();
        return aleatorio.nextInt(6) + 1;
    }
}
