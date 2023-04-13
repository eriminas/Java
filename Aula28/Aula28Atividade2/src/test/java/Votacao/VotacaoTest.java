package Votacao;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class VotacaoTest {    
    public VotacaoTest() {
    }

    @Test
    public void test15anosNaoPodeVotar() {
        assertEquals("Maria voce nao pode votar", Votacao.podeVotar("Maria", 2007));       
    }
    
    @Test
    public void test16anosVotoFacultativo() {
        assertEquals("Joao seu voto e facultativo", Votacao.podeVotar("Joao", 2006));       
    }
    
    @Test
    public void test17anosVotoFacultativo() {
        assertEquals("Eliza seu voto e facultativo", Votacao.podeVotar("Eliza", 2005));       
    }
    
    @Test
    public void test18anosVotoObrigatorio() {
        assertEquals("Pedro seu voto e obrigatorio", Votacao.podeVotar("Pedro", 2004));       
    }
    
    @Test
    public void test25anosVotoObrigatorio() {
        assertEquals("Ana seu voto e obrigatorio", Votacao.podeVotar("Ana", 1997));       
    }
    
    @Test
    public void test70anosVotoObrigatorio() {
        assertEquals("Carlos seu voto e obrigatorio", Votacao.podeVotar("Carlos", 1952));       
    }
    
    @Test
    public void test71anosVotoFacultativo() {
        assertEquals("Clara seu voto e facultativo", Votacao.podeVotar("Clara", 1951));       
    }    
}
