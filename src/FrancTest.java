import org.junit.Test;
import static org.junit.Assert.*;
public class FrancTest {
    @Test
    public void testFrancMultiplication() {
        Franc five = new Franc(5);
        assertEquals(new Franc(10).amount, five.times(2));
        assertEquals(new Franc(15).amount, five.times(3));
    }

    @Test
    public void testEquality() {
        assertTrue(new Franc(5).equals(new Franc(5)));
        assertFalse(new Franc(5).equals(new Franc(6)));
    }
}