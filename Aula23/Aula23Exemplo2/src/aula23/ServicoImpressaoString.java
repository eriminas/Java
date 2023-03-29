package aula23;
import java.util.ArrayList;
import java.util.List;
public class ServicoImpressaoString {
    private List<String> list = new ArrayList<>();
	public void adicionaValor(String value) {
		list.add(value);
	}
	public String primeiro() {
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
