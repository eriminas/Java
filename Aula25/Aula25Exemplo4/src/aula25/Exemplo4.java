package aula25;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exemplo4 {
    public static void main(String[] args) {
        List<Produto> list = new ArrayList<>();
        list.add(new Produto("TV", 900.00));
        list.add(new Produto("Notebook", 1200.00));
        list.add(new Produto("Tablet", 450.00));
        
        //        Comparator<Produto> comp = new Comparator<Produto>() {
//            @Override
//            public int compare(Produto p1, Produto p2) {
//                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//            }
//        };
//        Comparator<Produto> comp = (p1, p2) -> {
//            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//        };

        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));        
        
        for (Produto p : list) {
            System.out.println(p);
        }
    }
}

//list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

