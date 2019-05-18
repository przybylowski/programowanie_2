package day1;

import org.junit.Assert;
import org.junit.Test;

public class PolskiZlotyTest {

    @Test
    public void test1_toString() {
        Assert.assertEquals("2.00 PLN", new PolskiZloty(2).toString());
        Assert.assertEquals("4.00 PLN", new PolskiZloty(4).toString());
    }

    @Test
    public void test2_toString() {
        Assert.assertEquals("7.50 PLN", new PolskiZloty(7.5).toString());
        Assert.assertEquals("15.25 PLN", new PolskiZloty(15.25).toString());
    }

    @Test
    public void test3_equals() {
        PolskiZloty z1 = new PolskiZloty(7.5);
        PolskiZloty z2 = new PolskiZloty(7.5);

        Assert.assertEquals(z1, z2);
    }

    @Test
    public void test4_notEqual() {
        PolskiZloty z1 = new PolskiZloty(7.5);
        PolskiZloty z2 = new PolskiZloty(7.6);

        Assert.assertNotEquals(z1, z2);
    }

    @Test
    public void test5_substraction() {
        Assert.assertEquals(
                new PolskiZloty(1.03).minus(new PolskiZloty(0.42)),
                new PolskiZloty(0.61));
    }
}
