package aula19;

public class Gato extends Animal {

    @Override
    public void falar() {
        System.out.println("Miau...Miau...");
    }

    @Override
    public void comer() {
        if (fome == true) {
            System.out.println("Quero Comida");
            System.out.println("Racao e Leite..Racao e Leite");
        } else {
            System.out.println("Não estou com fome!!");
        }
    }
}
