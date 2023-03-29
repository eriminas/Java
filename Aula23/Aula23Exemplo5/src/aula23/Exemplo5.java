package aula23;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exemplo5 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Tv");
        set.add("Tablet");
        set.add("Notebook");  
        
        System.out.println(set.contains("Notebook"));
        //System.out.println(set.remove("Tv"));
        //set.removeIf(x -> x.length() >= 3);
        set.removeIf(x -> x.charAt(0) == 'T');  
        
        for (String p : set) {
            System.out.println(p);
        }
        
        
        
        
       
        
        
    }
}
