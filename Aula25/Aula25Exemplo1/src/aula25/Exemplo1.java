package aula25;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Exemplo1 {
    public static void main(String[] args) {
        List<Produto> list = new ArrayList<>();

        list.add(new Produto("Tv", 900.00));
        list.add(new Produto("Notebook", 1200.00));
        list.add(new Produto("Tablet", 450.00));

        Collections.sort(list);

        for (Produto p : list) {
            System.out.println(p);
        }
    }
}



