package math;

import static org.junit.Assert.*;
import org.junit.Test;

public class MyMathTest {

    private static final double delta = 0.0000001;

    @Test
    public void test_2() {

        double value = 2;

        double result = MyMath.log10(value);
        double expected = Math.log10(value);

        assertEquals(expected, result, delta);
    }

    @Test
    public void test_8() {

        double value = 8;

        double result = MyMath.log10(value);
        double expected = Math.log10(value);

        assertEquals(expected, result, delta);
    }

    @Test
    public void test_9() {

        double value = 9;

        double result = MyMath.log10(value);
        double expected = Math.log10(value);

        assertEquals(expected, result, delta);
    }

    @Test
    public void test_10() {

        double value = 10;

        double result = MyMath.log10(value);
        double expected = Math.log10(value);

        assertEquals(expected, result, delta);
    }

    @Test
    public void test_150() {

        double value = 150;

        double result = MyMath.log10(value);
        double expected = Math.log10(value);

        assertEquals(expected, result, delta);
    }

    @Test
    public void test_1500() {

        double value = 1500;

        double result = MyMath.log10(value);
        double expected = Math.log10(value);

        assertEquals(expected, result, delta);
    }

    @Test
    public void test_15000() {

        double value = 15000;

        double result = MyMath.log10(value);
        double expected = Math.log10(value);

        assertEquals(expected, result, delta);
    }
}

