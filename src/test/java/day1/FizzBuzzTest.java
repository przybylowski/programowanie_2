package day1;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;

public class FizzBuzzTest {

    @Test
    public void if_dividedBy3_Fizz() {
        Assert.assertEquals(new FizzBuzz(3).toString(),"Fizz");

    }
    @Test
    public void if_dividedBy5_Buzz(){
        Assert.assertEquals(new FizzBuzz(5).toString(),"Buzz");
    }
    @Test
    public void if_dividedBy3and5_Buzz(){
        Assert.assertEquals(new FizzBuzz(15).toString(),"FizzBuzz");
    }
    @Test
    public void checkValuev1(){
        Instant start = Instant.now();

        for (int i = 0; i < 1_000_000; i++) {
            new FizzBuzz(i).toString();
        }

        Instant end = Instant.now();

        long duration = Duration.between(start,end).toMillis();

        System.out.println("Duration " + duration + " ms");

    }
}
