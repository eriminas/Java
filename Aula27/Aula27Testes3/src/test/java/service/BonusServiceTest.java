package service;
import java.math.BigDecimal;
import java.time.LocalDate;
import modelo.Funcionario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {  
    @Test
    public void testSomeMethod() {
        BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("25000")));
		assertEquals(new BigDecimal("0.00"), bonus);        
    }    
    @Test
    public void testSomeMethod2() {
        BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("2500")));
		assertEquals(new BigDecimal("250.00"), bonus);        
    }    
    @Test
    public void testSomeMethod3() {
        BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("10000")));
		assertEquals(new BigDecimal("1000.00"), bonus);        
    }
}
