package aula05;
public class Exemplo4 {
    public static void main(String[] args) {
        String nome1 = "Erinaldo";
        String nome2 = "Erinaldo";
        String nome3 = new String("Erinaldo");
        String resultado1;
        String resultado2;
        
        resultado1 = (nome1 == nome3)? "igual":"diferente";
        resultado2 = (nome1.equals(nome3))? "igual":"diferente";
        
        System.out.println(resultado1);
        System.out.println(resultado2);
    }
}
