package aula15;
public class Exemplo2 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();        
        c1.setModelo("BIC");
        c1.setCor("Vermelha");
        c1.setCarga(90);
        c1.setPonta(0.7f);
        c1.setTampada(false);        
        c1.rabiscar();
        c1.status();
        System.out.println(" ");
        
        Caneta c2 = new Caneta();
        c2.setModelo("ESPECIAL");
        c2.setCor("Amarelo");
        c2.setCarga(75);
        c2.setPonta(0.5f);
        c2.setTampada(true);        
        c2.rabiscar();
        c2.status();
        System.out.println(" ");
        
    }    
}
