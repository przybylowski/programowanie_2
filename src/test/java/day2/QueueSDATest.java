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
    }

    @Test
    public void isStringPoped() {
        QueueSDA queue = new QueueSDA(10);
        queue.add("Programowanie 1");
        queue.add("Programowanie 2");

        queue.pop();
        queue.pop();
        Assert.assertEquals(queue.getActualSize(),0);

    }
    @Test
    public void isStringPeaked() {
        QueueSDA queue = new QueueSDA(10);
        queue.add("Programowanie 1");
        queue.add("Programowanie 2");

    }

}
