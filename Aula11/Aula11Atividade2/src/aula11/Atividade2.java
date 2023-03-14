package aula11;

public class Atividade2 {
    public static void main(String[] args) {
        int matriza[][] = {{1, 2}, {4, 5}};
        int matrizb[][] = {{7, 8}, {10, 11}};

        int matrizsoma[][] = new int[2][2];
        //int matrizmulti[][] = new int[2][2];
        int matrizmulti[][] = {{0, 0}, {0, 0}};

        //soma
        for (int i = 0; i < matriza.length; i++) { //percorre linha da matriza
            for (int j = 0; j < matriza.length; j++) { //percorre coluna da matriz a
                matrizsoma[i][j] = matriza[i][j] + matrizb[i][j];
            }
        }

        //multi
        for (int i = 0; i < matriza.length; i++) { //percorre linha da matriza
            for (int j = 0; j < matrizb[i].length; j++) { //percorre coluna da matriz a
                //matrizmulti[i][j] = matriza[i][j] * matrizb[i][j];
                for (int k = 0; k < 2; k++) {                    
                    matrizmulti[i][j] += matriza[i][k] * matrizb[k][j];
                }
            }
        }

        //imprimir soma
        for (int i = 0; i < matrizsoma.length; i++) { //percorre linha
            System.out.println("\n");
            for (int j = 0; j < matrizsoma.length; j++) { //percorre coluna
                System.out.print(matrizsoma[i][j] + "\t");
            }
        }
        
        //imprimir multiplicação
            for (int i = 0; i < matrizmulti.length; i++) { //percorre linha
            System.out.println("\n");
            for (int j = 0; j < matrizmulti.length; j++) { //percorre coluna
                System.out.print(matrizmulti[i][j] + "\t");
            }
        }
    }
}
