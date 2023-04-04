package aula25;
import java.util.function.Predicate;

public class ProdutoPredicate implements Predicate<Produto> {
    @Override
    public boolean test(Produto p) {
         return p.getPrice() >= 100;         
    }   
}
