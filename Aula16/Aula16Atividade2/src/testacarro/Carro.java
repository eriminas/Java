package testacarro;
public class Carro {
//Atributos
    public int marcha;
    public boolean ligado;
    public double velocidadeAtual;
    public double velocidadeMaxima;

    public Carro() {
        this.ligado = false;
        this.marcha = 0;        
    }
    
    //Métodos Especiais

    public int getMarcha(int marcha) {
        return marcha;       
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }
    
    public boolean getLigado() {
        return ligado;       
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }    
    
    //Métodos do Encapsulamento
    public void ligar() { 
        this.setLigado(true);
        System.out.println("O carro está ligado ");   
        System.out.println("Está acelerando? " + this.getVelocidadeAtual());               
    }

    public void desligar() {
        System.out.println("O carro está desligado");        
    }

    public void acelerar() {
        double quantidade = 10;
        double velocidadeNova = this.getVelocidadeAtual() + quantidade;
        this.setVelocidadeAtual(velocidadeNova);
        
    }

    public int pegarMarcha() {
        if (this.getVelocidadeAtual() < 0) {
           return -1;
        }
        if (this.getVelocidadeAtual() == 0) {
            return 0;
        }
        if (this.getVelocidadeAtual() > 0 && this.getVelocidadeAtual() < 40) {
            return 1;
        }
        if (this.getVelocidadeAtual() >= 40 && this.getVelocidadeAtual() <= 80) {
            return 2;
        }
        return 3;          
    } 
 }
