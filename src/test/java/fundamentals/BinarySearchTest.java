package fundamentals;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BinarySearchTest {

    private int[] whitelist = new int[]{10, 11, 12, 16, 18, 23, 29, 33, 48, 54, 57, 68, 77, 84, 98};

    @Before
    public void setup() {
        Arrays.sort(whitelist);
    }


    @Test
    public void test_low() {

        int index = BinarySearch.rank(12, whitelist);

        assertEquals(index, 2);
    }

    @Test
    public void test_high() {

        int index = BinarySearch.rank(77, whitelist);

        assertEquals(index, 12);
    }

    @Test
    public void test_mid() {

        int index = BinarySearch.rank(33, whitelist);

        assertEquals(index, 7);
    }

    @Test
    public void test_invalid_low() {

        int index = BinarySearch.rank(13, whitelist);

        assertEquals(index, -1);
    }

    @Test
    public void test_invalid_high() {

        int index = BinarySearch.rank(78, whitelist);

        assertEquals(index, -1);
    }
}
