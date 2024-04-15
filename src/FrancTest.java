import org.junit.Test;
import static org.junit.Assert.*;
public class FrancTest {
    @Test
    public void testFrancMultiplication() {
//        Franc five = new Franc(5);
//        assertEquals(new Franc(10), five.times(2));
//        assertEquals(new Franc(15), five.times(3));

        Money five = Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }

    @Test
    public void testEquality() {
//        assertTrue(new Franc(5).equals(new Franc(5)));
//        assertFalse(new Franc(5).equals(new Franc(6)));
//        assertFalse(new Franc(5).equals(new Dollar(5)));

        assertTrue(Money.franc(5).equals(Money.franc(5)));
        assertFalse(Money.franc(5).equals(Money.franc(6)));

        assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }
}
