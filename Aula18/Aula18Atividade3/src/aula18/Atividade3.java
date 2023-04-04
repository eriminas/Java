package aula18;
public class Atividade3 {
    public static void main(String[] args) {
    LinguagemPrograma linguagem = new LinguagemPrograma();
    linguagem.pessoa("Jose");
    linguagem.linguagemProgramacao("Java");
    linguagem.experiencia(10);
    System.out.println("--------------------------------------------");
    
    LinguagemPrograma linguagem2 = new LinguagemPrograma();
    linguagem2.pessoa("Maria");
    linguagem2.linguagemProgramacao("Python");
    linguagem2.experiencia(15);
    System.out.println("--------------------------------------------");
    
    }    
}
