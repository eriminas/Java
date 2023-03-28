package aula19;
public class Cachorro extends Animal {
    @Override
    public void falar() {
        System.out.println("Au..Au..Au..");
    }

    @Override
    public void comer() { 
        if (fome == true) {
            System.out.println("Quero Comida");
            System.out.println("Racao e Osso..Racao e Osso");       
        } else {
            System.out.println("Não estou com fome!!");
        } 
    }
}
