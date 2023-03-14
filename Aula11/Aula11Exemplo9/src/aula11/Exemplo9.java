package aula11;
public class Exemplo9 {
    public static void main(String[] args) {
        //Using multidimensional array literal
        int arr_lit[][] = {
            {
                1,
                2,
                3
            },
            {
                4,
                5,
                6
            },
            {
                7,
                8,
                9
            }
        };
        //using multidimensional array object
        int val = 1;
        int matrix[][] = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = val;
                val++;
            }
        }
        //printing the matrix
        System.out.println("The matrix is");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            //adding a blank line after every row
            System.out.println("");
        }
    }
}


