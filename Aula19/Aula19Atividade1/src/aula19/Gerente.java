package aula19;
public class Gerente extends Funcionario {
    private int senha;

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    public boolean autentica(int testarSenha){
        if(testarSenha == senha){
            System.out.println("Acesso Permitido!!");
            return true;
        }else{
            System.out.println("Acesso Negado!!");
            return false;
        }    
    }    
}


