package aula13;
public class Candidato {
    String vaga, pessoaCandidata;
    double pretensaoSalarial;
    void status() {
        System.out.println("Nome do Candidato: " + this.pessoaCandidata);
        System.out.println("Vaga: " + this.vaga);
        System.out.println("Pretensao Salarial: " + this.pretensaoSalarial);   }

    void enviarTesteTecnico() {
        if (vaga == "TECNOLOGIA") {
            System.out.println("Enviar TESTE de TECNOLOGIA para " + this.pessoaCandidata);

        } else {
            System.out.println("Enviar TESTE de GERAL para " + this.pessoaCandidata);
        }
    }
}
