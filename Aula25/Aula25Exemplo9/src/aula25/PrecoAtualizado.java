package aula25;
import java.util.function.Consumer;
public class PrecoAtualizado implements Consumer<Produto> {
    @Override
    public void accept(Produto p) {
     p.setPrice(p.getPrice()*1.1);     
    }    
}
