package day2;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class QueueSDATest {
    @Test
    public void isCapacityGood() {
        QueueSDA queue = new QueueSDA(10);
        Assert.assertEquals(queue.getCapacity(), 10);
    }

    @Test
    public void isStringAdded() {
        QueueSDA queue = new QueueSDA(10);
        queue.add("Programowanie 1");
        queue.add("Programowanie 2");
        Assert.assertEquals(queue.getActualSize(),2);

        Assert.assertEquals(queue.pop(),"Programowanie 1");
        Assert.assertEquals(queue.pop(),"Programowanie 2");
    }

}
