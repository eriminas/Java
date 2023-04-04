package testacarro;
public class Atividade2 {

    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.velocidadeAtual = -20;
        c1.velocidadeMaxima = 80;

        // liga e acelera o carro
        c1.ligar();        
        c1.acelerar();
        c1.pegarMarcha();
        
        System.out.println("A velocidade atual eh: " + c1.velocidadeAtual);
        System.out.println("A marcha atual eh " + c1.pegarMarcha());

    }
}
