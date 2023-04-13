import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ConversorTemperaturaTest {
    
    public ConversorTemperaturaTest() {
    }

    @Test
    public void testSomeMethod() {
        ConversorTemperatura ct = new ConversorTemperatura();
        assertEquals(0,ConversorTemperatura.converteFahrenheitParaCelsius(32), 0.0);             
    }
    
    @Test
    public void testSomeMethod2() {
        ConversorTemperatura ct = new ConversorTemperatura();
        assertEquals(10.0,ConversorTemperatura.converteFahrenheitParaCelsius(50.0),10.0);            
    }
}
