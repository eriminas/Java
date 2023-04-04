package aula22;
public class Atividade3 {
    public static void main(String[] args) {
        // Programa Principal
        Cachorro c = new Cachorro();
        c.emitirSom();
        c.reagir("Olá");
        c.reagir(11, 45);
        c.reagir(4, 11);
        c.reagir(false);
        c.reagir(12, 12.5);      
    }    
}
