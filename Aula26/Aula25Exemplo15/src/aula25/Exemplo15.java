package aula25;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class Exemplo15 {
    public static void main(String[] args) {        
        List<Integer> list = Arrays.asList(1, 3, 5, 7, 9, 11);    //cria uma lista        
        Stream<Integer> st1 = list.stream()                       //Cria uma Stream a partir de uma lista
                .map(x -> x*10);        
        System.out.println(Arrays.toString(st1.toArray()));      //Imprime(a função array converte a stream para um vetor)        
        
        Stream<String> st2 = Stream.of("Erinaldo", "Isabela", "Maria", "Joao");
        System.out.println(Arrays.toString(st2.toArray()));        
        
        Stream<Integer> st3 = Stream.iterate(0, x -> x + 3);
        System.out.println(Arrays.toString(st3.limit(10).toArray()));
     }    
}



