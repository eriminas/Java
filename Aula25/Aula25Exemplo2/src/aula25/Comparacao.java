package aula25;
import java.util.Comparator;
public class Comparacao implements Comparator<Produto> {
    @Override
    public int compare(Produto p1, Produto p2) {
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }
}
