package aula23;
import java.util.ArrayList;
import java.util.List;
public class ServicoImpressao {    
    private List<Integer> list = new ArrayList<>();
    
	public void adicionaValor(Integer value) {
		list.add(value);                
	}
	public Integer primeiro() {
		if (list.isEmpty()) {
			throw new IllegalStateException("Lista está vazia");
		}
		return list.get(0);
	}
	public void imprime() {
		System.out.print("[");
		if (!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println("]");    
        }
}
