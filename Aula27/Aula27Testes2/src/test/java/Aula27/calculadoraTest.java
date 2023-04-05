package Aula27;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class calculadoraTest {
    @Test
    public void testSomeMethod() {  
        calculadora calc = new calculadora();
        int soma = calc.somar(3, 7); 
        assertEquals(10, soma);        
    }    
    
    @Test
    public void testSomeMethod2() {  
        calculadora calc = new calculadora();        
        int soma2 = calc.somar(-10, 20); 
        assertEquals(10, soma2); 
    } 
    
    @Test
    public void testSomeMethod3() {  
        calculadora calc = new calculadora();        
        int soma3 = calc.somar(0, 20); 
        assertEquals(20, soma3); 
    } 
}



