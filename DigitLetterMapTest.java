package com.gwi;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class DigitLetterMapTest {
    DigitLetterMap map = new DigitLetterMap();

    @Test
    public void testGet(){
        Assert.assertEquals(new ArrayList(),map.get(0));
        Assert.assertEquals(Arrays.asList('a', 'b', 'c'),map.get(2));
    }
}
