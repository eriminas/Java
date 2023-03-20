package aula15;
public class Exemplo1 {
    public static void main(String[] args) {       
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.modelo = "Bic";
        c1.carga = 90;
        c1.ponta = 0.7f;
      //  c1.tampada = false;
        c1.rabiscar();
        c1.status();
        c1.destampar();
        System.out.println(" ");
        
        Caneta c2 = new Caneta();
        c2.cor = "Vermelho";
        c2.modelo = "Bic";
        c2.carga = 100;
        c2.ponta = 0.5f;
     //   c2.tampada = true; 
        c2.rabiscar();
        c2.status();
        c2.destampar();
        System.out.println(" ");
    }    
}
