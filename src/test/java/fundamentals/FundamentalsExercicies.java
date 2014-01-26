package fundamentals;

import math.MyMath;
import org.junit.Test;
import org.springframework.util.ClassUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static org.junit.Assert.*;

public class FundamentalsExercicies {

    /**
     * Give the value of each of the following expressions
     */
    @Test
    public void exer_1_1_1() {

        assertSame(Integer.valueOf((0 + 15 ) / 2), 7);
        assertEquals(2.0e-6 * 100000000.1, 200.0000002, 0);
        assertTrue(true && false || true && true);
    }

    /**
     * Give the type and value of each of the following expressions:
     */
    @Test
    public void exer_1_1_2() {

        assertEquals(ClassUtils.getDescriptiveType((1 + 2.236) / 2), Double.class.getName());
        assertEquals((1 + 2.236)/2, 1.618, 0);

        assertEquals(ClassUtils.getDescriptiveType(1 + 2 + 3 + 4.0), Double.class.getName());
        assertEquals(1 + 2 + 3 + 4.0, 10.0, 0);

        assertEquals(ClassUtils.getDescriptiveType(4.1 >= 4), Boolean.class.getName());
        assertTrue(4.1 >= 4);

        assertEquals(ClassUtils.getDescriptiveType(1 + 2 + "3"), String.class.getName());
        assertEquals(1 + 2 + "3", "33");
    }

    /**
     * Write a program that takes three integer command-line arguments and prints
     * equal if all three are equal, and not equal otherwise.
     */
    @Test
    public void exer_1_1_3_are_equal() {

        int[] values = new int[]{1, 1, 1};

        assertTrue(hasSameValues(values));
    }

    private boolean hasSameValues(int[] values) {

        if (values.length == 0) {
            return false;
        }

        int temp = values[0];
        for (int i=1; i<values.length; i++) {
            if (temp != values[i]) {
                return false;
            }
        }

        return true;
    }

    /**
     * Write a program that takes three integer command-line arguments and prints
     * equal if all three are equal, and not equal otherwise.
     */
    @Test
    public void exer_1_1_3_are_not_equal() {

        int[] values = new int[]{1, 2, 2};

        assertFalse(hasSameValues(values));
    }

    /**
     * What (if anything) is wrong with each of the following statements?
     */
    @Test
    public void exer_1_1_4() {

        int a = 0;
        int b = 0;
        int c = 0;

        if (a > b) c = 0;

        if (a > b) { c = 0; }

        if (a > b) c = 0;

        if (a > b) c = 0; else b = 0;
    }

    /**
     * Write a code fragment that prints true if the double variables x and y are both
     * strictly between 0 and 1 and false otherwise.
     */
    @Test
    public void exer_1_1_5_are_strictly_between() {

        double x = 0.9;
        double y = 0.1;

        assertTrue(isStrictlyBetween(x, y));
    }

    private boolean isStrictlyBetween(double x, double y) {

        return (x > 0 && x < 1) && (y > 0 && y < 1);
    }


    /**
     * Write a code fragment that prints true if the double variables x and y are both
     * strictly between 0 and 1 and false otherwise.
     */
    @Test
    public void exer_1_1_5_are_not_strictly_between() {

        double x = 0;
        double y = 1;

        assertFalse(isStrictlyBetween(x, y));
    }

    /**
     * What does the following program print?
     *
     * A non recursive solution for Fibonacci :)
     */
    @Test
    public void exer_1_1_6() {

        int[] result = new int[16];

        int f = 0;
        int g = 1;

        for (int i = 0; i <= 15; i++) {

            result[i] = f;

            f = f + g;
            g = f - g;
        }

        int[] solution = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};

        assertArrayEquals(result, solution);
    }

    /**
     * Give the value printed by each of the following code fragments:
     */
    @Test
    public void exer_1_1_7() {

        double t = 9.0;
        while (Math.abs(t - 9.0/t) > .001)
            t = (9.0/t + t) / 2.0;
        assertEquals(String.format(Locale.US, "%.5f", t), "3.00009");

        int sum = 0;
        for (int i = 1; i < 1000; i++)
            for (int j = 0; j < i; j++)
                sum++;
        assertEquals(sum, 499500);

        sum = 0;
        for (int i = 1; i < 1000; i *= 2)
            for (int j = 0; j < 15; j++)
                sum++;
        assertEquals(sum, 150);
    }

    /**
     * Write a code fragment that prints the contents of a two-dimensional boolean
     * array, using * to represent true and a space to represent false. Include row and column
     * numbers.
     */
    @Test
    public void exer_1_1_11() {

        List<String> result = new ArrayList<String>();
        boolean[][] array = new boolean[][]{{false, true}, {true, true}, {true, false}};

        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array[i].length; j++) {
                result.add(i + "," + j + "=" + (array[i][j] ? "*" : " "));
            }
        }

        assertEquals(result.toString(), "[0,0= , 0,1=*, 1,0=*, 1,1=*, 2,0=*, 2,1= ]");
    }

    /**
     * Write a code fragment to print the transposition (rows and columns changed)
     * of a two-dimensional array with M rows and N columns.
     */
    @Test
    public void exer_1_1_13() {

        int m = 4;
        int n = 4;

        int[][] matrix = new int[m][n];

        // fill
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                matrix[i][j] = i;
            }
        }

        // transposition
        for (int i=0; i<m-1; i++) {
            for (int j=i+1; j<n; j++) {

                int temp = matrix[i][j];

                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // expected
        int[][] expected = new int[m][n];
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                expected[j][i] = i;
            }
        }

        assertArrayEquals(expected, matrix);
    }

    /**
     * Write a static method lg() that takes an int value N as argument and returns
     * the largest int not larger than the base-2 logarithm of N. Do not use Math.
     *
     * I will use math for pow.
     */
    @Test
    public void exer_1_1_14() {

        int n = 9;

        double result = MyMath.log10(n) / MyMath.log10(2);

        assertEquals(Math.log10(n)/Math.log10(2), result, 0.000001);

        assertEquals(3, (int)result);
    }

    /**
     * Write a static method histogram() that takes an array a[] of int values and
     * an integer M as arguments and returns an array of length M whose ith entry is the number
     * of times the integer i appeared in the argument array. If the values in a[] are all
     * between 0 and M–1, the sum of the values in the returned array should be equal to
     * a.length.
     */
    @Test
    public void exer_1_1_15() {

        int[] a = new int[]{0,1,2,3,4};
        int m = 5;

        int[] result = new int[m];
    }

}
