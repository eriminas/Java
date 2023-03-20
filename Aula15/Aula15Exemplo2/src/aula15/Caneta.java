package aula15;

public class Caneta {
    public String modelo, cor;
    private float ponta;
    protected int carga;
    public boolean tampada;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    

    public void status() {
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Tamanho da ponta: " + this.getPonta());
        System.out.println("% da carga: " + this.getCarga());
        System.out.println("Esta tampada? " + this.isTampada());
    }

    public void escrever() {
        if (tampada == true) {
            System.out.println("Sorry!! Nao posso ESCREVER.");
        } else {
            System.out.println("Estou ESCREVENDO!!");
        }
    }

    public void rabiscar() {
        if (tampada == true) {
            System.out.println("Sorry!! Nao posso rabiscar.");
        } else {
            System.out.println("Estou RABISCANDO!!");
        }
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
}
