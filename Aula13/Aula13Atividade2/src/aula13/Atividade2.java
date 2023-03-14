package aula13;
public class Atividade2 {
    public static void main(String[] args) {
       Candidato c1 = new Candidato();
       c1.pessoaCandidata = "Ana Beatriz";
       c1.vaga = "TECNOLOGIA";
       c1.pretensaoSalarial = 12000;
       c1.status();
       c1.enviarTesteTecnico();
       System.out.println(" ");
       
       Candidato c2 = new Candidato();
       c2.pessoaCandidata = "Caio Jose";
       c2.vaga = "GERAL";
       c2.pretensaoSalarial = 8000;
       c2.status();
       c2.enviarTesteTecnico();  
       System.out.println(" ");
    }    
}




