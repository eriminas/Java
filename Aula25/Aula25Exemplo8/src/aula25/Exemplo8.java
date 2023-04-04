package aula25;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Exemplo8 {
    public static void main(String[] args) {
        List<Produto> list = new ArrayList<>();
        list.add(new Produto("Tv", 900.00));
        list.add(new Produto("Mouse", 50.00));
        list.add(new Produto("Tablet", 350.50));
        list.add(new Produto("HD Case", 80.90));

//        Predicate<Produto> pred = p -> p.getPrice() >= 100;
//        list.removeIf(pred);
        
        list.removeIf(p -> p.getPrice() >= 100);  
        
        for (Produto p : list) {
            System.out.println(p);
        }
    }
}
