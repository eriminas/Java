import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class OperacaoSimplesVetorTest {   

    @Test
    public void testFindMin() {
        OperacaoSimplesVetor msao = new OperacaoSimplesVetor();
        int[] array = {10, 2, 3, 10, 1, 0, 2, 3, 16, 0, 2};
        assertEquals(0, msao.findMin(array));
        assertNotEquals(10, msao.findMin(array));
    }
    
//    @Test (IllegalArgumentException.class)
//    public void testFindMinShouldThrowException() {
//        OperacaoSimplesVetor msao = new OperacaoSimplesVetor();
//        msao.findMin(new int[]{});
//    }
    
    @Test
    public void testMultiply() {
        OperacaoSimplesVetor msao = new OperacaoSimplesVetor();
        int[] array = {10, 2, 3, 10, 1, 0, 2, 3, 16, 0, 2};
        msao.multiply(array, 10);
        assertArrayEquals(new int[]{100, 20, 30, 100, 10, 0, 20, 30, 160, 0, 20}, array);
    }
    
//    @Test (IllegalArgumentException.class)
//    public void testMultiplyShouldThrowException() {
//        OperacaoSimplesVetor msao = new OperacaoSimplesVetor();
//        msao.multiply(new int[]{}, 0); //method call with dummy arguments
//    }
    
}
