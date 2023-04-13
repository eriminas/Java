import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MatematicaTest {    
    public MatematicaTest() {
    }
    @Test
    public void testExceptionMult() {
        Matematica test = new Matematica();
        assertThrows(IllegalArgumentException.class, () -> test.multiply(1000, 5));
    }    
    @Test
    public void testMultiply() {
        Matematica tester = new Matematica();
        assertEquals(50, tester.multiply(10, 5), "10 x 5 must be 50");
    } 
    @Test
    public void testExceptionDiv() {
        Matematica test = new Matematica();
        assertThrows(IllegalArgumentException.class, () -> test.divide(10, 0));
    }
    @Test
    public void testExceptionDivMinus() {
        Matematica test = new Matematica();
        assertThrows(IllegalArgumentException.class, () -> test.divide(10, -2));
    }    
    @Test
    public void testDivide() {
        Matematica tester = new Matematica();
        assertEquals(2, tester.divide(10, 5), "10/5 must be 2");
    } 
}
