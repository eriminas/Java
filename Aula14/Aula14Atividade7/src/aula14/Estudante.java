package aula14;
public class Estudante {
    String nome;
    double grade1;
    double grade2;
    double grade3;

    public double finalGrade() {
        return grade1 + grade2 + grade3;
    }

    public double pontosFaltantes() {
        if (finalGrade() < 60.0) {
            return 60.0 - finalGrade();
        } else {
            return 0.0;
        }
    }

}
