package com.gwi;

import org.junit.Assert;
import org.junit.Test;

public class DigitLetterConvertTest {

    DigitLetterConvert digitLetterConvert = new DigitLetterConvert();

    @Test
    public void testConvert() {
        Assert.assertEquals("a b c", digitLetterConvert.convert(2));
        Assert.assertEquals("d e f", digitLetterConvert.convert(3));
        Assert.assertEquals("", digitLetterConvert.convert(100));
    }
}
