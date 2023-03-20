package aula14;

public class Salario {

    int i, anoAtual;
    double salario;
    double percentual;
    double novoSalario;

    public double salarioAtual() {
        percentual = (1.5 / 100);
        novoSalario = salario + percentual*salario;

        for (i = 2018; i <= anoAtual; i++) {
            percentual = 2 * percentual;
            novoSalario = novoSalario + percentual*novoSalario;           
        }
        return novoSalario;
    }
}
