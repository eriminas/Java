package aula23;
import java.util.Set;
import java.util.TreeSet;
public class Exemplo7 {
    public static void main(String[] args) {
        Set<Produto> set = new TreeSet<>();
        set.add(new Produto("Tv", 900.0));
        set.add(new Produto("Notebook", 1200.0));
        set.add(new Produto("Tablet", 400.0));
        
        for (Produto p : set) {
            System.out.println(p);
        }          
        Produto prod = new Produto("Notebook", 1200.0);
        System.out.println(set.contains(prod));
    }
}
