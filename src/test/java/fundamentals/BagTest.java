package fundamentals;

import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

public class BagTest {

    @Test
    public void test_tobe() {
        Bag<String> strings = new Bag<>();
        strings.add("to");  Assert.assertEquals(1, strings.size());
        strings.add("be");  Assert.assertEquals(2, strings.size());
        strings.add("or");  Assert.assertEquals(3, strings.size());
        strings.add("not"); Assert.assertEquals(4, strings.size());
        strings.add("to");  Assert.assertEquals(5, strings.size());
    }

    @Test
    public void test_lifo_order() {
        String[] data = new String[]{"to", "be", "or", "not", "to"};
        Stack<String> strings = new Stack<>();
        strings.push(data[0]);
        strings.push(data[1]);
        strings.push(data[2]);
        strings.push(data[3]);
        strings.push(data[4]);

        Iterator<String> iterator = strings.iterator();
        for (int i = data.length - 1; i >= 0; i--) {
            Assert.assertEquals(data[i], iterator.next());
        }
    }
}
