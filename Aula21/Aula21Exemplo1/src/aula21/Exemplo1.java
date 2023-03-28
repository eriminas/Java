package aula21;
public class Exemplo1 {
    public static void main(String[] args) {
        //Animal n = new Animal();
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();          
        System.out.println("----------------------------");   
        
        m.setPeso(35.3f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();
        System.out.println("----------------------------");   
        
        r.setPeso(35.3f);
        r.setCorEscama("verde");
        r.alimentar();
        r.locomover();
        r.emitirSom();
        System.out.println("----------------------------");   
        
        p.setPeso(0.35f);
        p.setCorScama("Cinza");
        p.alimentar();
        p.locomover();
        p.emitirSom();
        System.out.println("----------------------------");   
        
        a.setPeso(0.89f);
        a.setCorPena("Preta");
        a.alimentar();
        a.locomover();
        a.emitirSom();
        a.fazerNinho();  
        System.out.println("----------------------------");   
            
    }    
}
