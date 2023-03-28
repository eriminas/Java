package aula19;
public class Exemplo1 {
    public static void main(String[] args) {
         // Programa Principal        
        Pessoa p1 = new Pessoa();       
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Jose");
        p2.setNome("Maria");
        p3.setNome("Joao");
        p4.setNome("Eliz");
        
        p1.setSexo("M");
        p2.setSexo("F");
        p2.setIdade(18);
        
        p2.setCurso("Informática");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");      
        
        //p1.receberAumento(550.20f);
        p3.receberAumento(550.20f);
        
        //p2.mudaTrabalho();
        p4.mudarTrabalho();         
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
    }    
}
