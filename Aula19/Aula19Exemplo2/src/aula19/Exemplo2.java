package aula19;
public class Exemplo2 {
    public static void main(String[] args) {       
        Aluno a1 = new Aluno();
        a1.setNome("Eri");
        a1.setMatricula(0001);
        a1.setCurso("Data Science");
        a1.setIdade(35);
        a1.setSexo("M");
        a1.pagarMensalidade();
        System.out.println(a1.toString());
        System.out.println("-------------------------------");
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Natalia");
//        b1.setMatricula(0002);
//        b1.setCurso("Data Science");
        b1.setIdade(30);
        b1.setSexo("F");
        b1.setBolsa(12.5f);
        b1.pagarMensalidade();
        System.out.println(b1.toString());
        System.out.println("-------------------------------");
        
       //Pessoa p1 = new Pessoa();        
       //System.out.println(p1.toString()); 
    }    
}
