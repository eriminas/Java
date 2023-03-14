package aula13;
public class Carro {
    Double velocidade, velocidadeAtual;
    String modelo, cor;
    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Velocidade: " + this.velocidade);        
    }
    void acelerar() {
        if (velocidade < 20) {            
            velocidadeAtual = this.velocidade + 10;   
            System.out.println("Acelerando");
            System.out.println("Velocidade Atual: " + this.velocidadeAtual);
        } else {
            if (velocidade > 60) {
                System.out.println("Acima do limite!!");                
            } else {
                System.out.println("Dentro do limite!!");
            }
        }
    }
    void frear() {
        if (velocidade > 60) {  
            velocidadeAtual = this.velocidade - 10;             
            System.out.println("Freando");            
            System.out.println("Velocidade Atual: " + velocidadeAtual);
        } else {
            if (velocidade < 20) {
                System.out.println("Abaixo do limite!!");
            } else {
                System.out.println("Dentro do limite!!");
            }
        }
    }
    void acenderFarol() {
        if (velocidade == 0) {
           System.out.println("Farol Apagado!!");
        } else {            
            System.out.println("Farol Aceso!!");
        }
    }
}
