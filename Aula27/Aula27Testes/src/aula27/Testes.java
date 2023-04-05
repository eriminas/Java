package aula27;
public class Testes {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int soma;  
        
        soma = calc.somar(9, 10);
        System.out.println(soma);
        
        soma = calc.somar(8, 0);
        System.out.println(soma);
        
        soma = calc.somar(-1, 0);
        System.out.println(soma);
        
        soma = calc.somar(3, -1);
        System.out.println(soma);        
    }    
}



