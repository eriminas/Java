package aula02;
import java.util.Locale;

public class Atividade1 {
    public static void main(String[] args) {        
        Locale loc = Locale.getDefault();
        System.out.println("O idioma do seu sistema está configurado para: ");
        System.out.println (loc.getDisplayLanguage()); // imprime "Português"
        System.out.println (loc.getLanguage()); // imprime "pt"          
        
        System.getProperties(); //uma outra forma
        System.out.println(System.getProperty("user.language"));
    }    
}
