package aula21;
public class Exemplo2 {
    public static void main(String[] args) {
        //Animal n = new Animal();
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();        
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara e = new Arara();
        System.out.println("------------------------------------");
                
        m.setPeso(35.3f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();
        System.out.println("------------------------------------");
        
        p.setPeso(0.35f);
        p.setCorScama("Cinza");
        p.alimentar();
        p.locomover();
        p.emitirSom();
        System.out.println("------------------------------------");
        
        a.setPeso(0.89f);
        a.setCorPena("Preta");
        a.alimentar();
        a.locomover();
        a.emitirSom();
        a.fazerNinho();
        System.out.println("------------------------------------");
        
        c.locomover();
        k.locomover();
        j.locomover();
        t.locomover();
        e.locomover();
        System.out.println("------------------------------------");
    }    
}
