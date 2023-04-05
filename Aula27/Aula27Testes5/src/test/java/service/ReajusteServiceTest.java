package service;
import java.math.BigDecimal;
import java.time.LocalDate;
import modelo.Desempenho;
import modelo.Funcionario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReajusteServiceTest { 
    @Test
    public void testDesempenhoADesejar() {
        ReajusteService service = new ReajusteService();
        Funcionario func = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000"));
        service.concederReajuste(func, Desempenho.A_DESEJAR);
        assertEquals(new BigDecimal("100.00"), func.getSalario());       
    }      
    @Test
    public void testDesempenhoBom() {
        ReajusteService service = new ReajusteService();
        Funcionario func = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000"));
        service.concederReajuste(func, Desempenho.BOM);
        assertEquals(new BigDecimal("1150.00"), func.getSalario());
    }      
    @Test
    public void testDesempenhoOtimo() {
        ReajusteService service = new ReajusteService();
        Funcionario func = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000"));
        service.concederReajuste(func, Desempenho.OTIMO);
        assertEquals(new BigDecimal("1200.00"), func.getSalario());
    }     
}


