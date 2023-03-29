package aula23;
import java.util.Map;
import java.util.TreeMap;
public class Exemplo8 {
    public static void main(String[] args) {
    Map<String, String> cookies = new TreeMap<>();    
    cookies.put("username", "maria");
    cookies.put("email", "maria@gmail.com");
    cookies.put("phone", "99771122");
    //cookies.remove("email");
    //cookies.put("phone", "99771133");
    System.out.println("Contem chave 'phone': " + cookies.containsKey("phone"));
    System.out.println("Numero Phone: " + cookies.get("phone"));
    System.out.println("Email: " + cookies.get("email"));
    System.out.println("Tamanho: " + cookies.size());
    System.out.println(" ");
    System.out.println("TODOS COOKIES:");   
    
    for (String key : cookies.keySet()) {
         System.out.println(key + ": " + cookies.get(key));
        }
    }
}







