import balan.artem.Money;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestMoney {

    @Test
    public void testEquality() {
        assertEquals(Money.dollar(5), Money.dollar(5));
        assertNotEquals(Money.dollar(5), Money.dollar(6));
        assertNotEquals(Money.dollar(5), Money.franc(5));
    }

    @Test
    public void testMultiplication() {
        Money five = Money.dollar(5);
        Money three = Money.franc(3);
        assertEquals(Money.dollar(10), five.times(2));
        assertNotEquals(Money.dollar(15), five.times(4));
        assertEquals(Money.franc(15), three.times(5));
        assertNotEquals(Money.franc(13), three.times(3));
    }

    @Test
    public void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }

    @Test
    public void testSimpleAddition() {
        Money sum = Money.dollar(5).plus(Money.dollar(5));
        assertEquals(Money.dollar(10), sum);
    }
}
