package day2;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class QueueSDATest {
    @Test
    public void isCapacityGood() {
        QueueSDA queue = new QueueSDA(10);
        Assert.assertEquals(queue.getSize(), 10);
    }

}
