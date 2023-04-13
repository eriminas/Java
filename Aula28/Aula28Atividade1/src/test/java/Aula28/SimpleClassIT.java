package Aula28;
import Aula28.SimpleClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleClassIT {    
    public SimpleClassIT() {
    }

    @Test
    public void testAddEm() {
        SimpleClass test = new SimpleClass();
        int expected = 3;
        int atual;        
        atual = test.addEm(1, 2);
        assertEquals(expected, atual, "AddEm não funcionou corretamente!!");        
    } 
    
    @Test
    public void testsubEm() {
        SimpleClass test = new SimpleClass();
        int expected = -1;
        int atual;        
        atual = test.subEm(1, 2);
        assertEquals(expected, atual, "SubEm não funcionou corretamente!!");        
    } 
    
    @Test
    public void testdivEm() {
        SimpleClass test = new SimpleClass();
        int expected = (int) 0.5;
        int atual;        
        atual = (int) test.divEm(1, 2);
        assertEquals(expected, atual, "DivEm não funcionou corretamente!!");        
    } 
    
    @Test
    public void testMulEm() {
        SimpleClass test = new SimpleClass();
        int expected = 2;
        int atual;        
        atual = (int) test.MulEm(1, 2);
        assertEquals(expected, atual, "MulEm não funcionou corretamente!!");        
    } 
}
