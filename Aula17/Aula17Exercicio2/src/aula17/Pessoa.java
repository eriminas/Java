package aula17;
import java.util.Scanner;

public class Pessoa {
    public int incricao;
    public String nome;
    public String sobrenome;
    public Endereco end;
    Scanner entrada = new Scanner(System.in);   
    
    public void apresentar(){
        System.out.println("A pessoa " + this.nome +" "+ this.sobrenome);
        System.out.println("foi inscrita com o numero : " + this.incricao);
        System.out.println("Mora no endereco: " 
                           + this.end.rua 
                           + "," 
                           + this.end.numero
                           + "."
                           + this.end.bairro
                           + ", "
                           + this.end.cidade
                           + ", "
                           + this.end.estado);
        
    }
    
    public void cadastrar(){
        System.out.println("Digite o nome: ");
        nome = entrada.nextLine();
        System.out.println("Digite o sobrenome: ");
        sobrenome = entrada.nextLine();
        System.out.println("Digite a inscricao: ");
        incricao = entrada.nextInt();   
    }   
}
