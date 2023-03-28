package aula19;
public class Animal {
    private String nome;
    private int idade;
    boolean fome;
    
    public void falar(){
        System.out.println("Eu sou um animal!");    
    }
    
    public void comer(){          
            System.out.println("Estou com fome!!");                        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Animal{" + "nome=" + nome + ", idade=" + idade + ", fome=" + fome + '}';
    }    
}
