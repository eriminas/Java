package aula15;
public class Exemplo3 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC", "Vermelho", 0.7f);          
        c1.setTampada(false);             
        c1.status();
        System.out.println(" ");
        
        Caneta c2 = new Caneta("ESPECIAL", "Amarelo", 0.5f);        
        c2.setTampada(true);           
        c2.status();
        System.out.println(" ");
    }    
}
