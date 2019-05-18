package day1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LazySingleton_v1Test {

    @Test
    public void getInstance_v1_true() {

        Assert.assertEquals(LazySingleton_v1.getInstance(), LazySingleton_v1.getInstance());

    }

    @Test
    public void getInstance_false() {

        Assert.assertNotEquals(LazySingleton_v1.getInstance(), LazySingleton_v2.getInstance());

    }

    @Test
    public void getInstance_v2_true() {

        Assert.assertEquals(LazySingleton_v2.getInstance(), LazySingleton_v2.getInstance());

    }
}