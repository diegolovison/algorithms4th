package fundamentals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EvaluateTest {

    @Test
    public void evaluate_exp1() {
        Double value = Evaluate.evaluate("( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )");
        assertEquals(101.0, value, 0);
    }

    @Test
    public void evaluate_ext2() {
        Double value = Evaluate.evaluate("( ( 1 + sqrt ( 5.0 ) ) / 2.0 )");
        assertEquals(1.618033988749895, value, 0);
    }
}
