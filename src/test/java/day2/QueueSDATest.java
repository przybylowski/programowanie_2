package day2;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class QueueSDATest {
    @Test
    public void isCapacityGood() {
        Assert.assertEquals(queueCapacity(10), 10);
    }

}
