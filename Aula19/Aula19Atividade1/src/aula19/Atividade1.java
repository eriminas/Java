package aula19;
public class Atividade1 {
    public static void main(String[] args) {
        Funcionario func = new Funcionario();       
        func.setNome("Jose");
        func.setCpf("08496636798");
        func.setSalario(10.000);
        func.apresentar();
        
        //Funcionario ger = new Gerente();
        
        //Gerente ger = new Funcionario();
        Gerente ger = new Gerente();                
        ger.setNome("Maria");
        ger.setCpf("07796636760");
        ger.setSalario(20000);
        ger.setSenha(10);
        ger.autentica(10);        
        ger.apresentar();        
    }    
}
