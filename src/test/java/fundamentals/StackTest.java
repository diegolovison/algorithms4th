package fundamentals;

import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

public class StackTest {

    @Test
    public void test_tobe() {
        Stack<String> strings = new Stack<>();
        strings.push("to");  Assert.assertEquals(1, strings.size());
        strings.push("be");  Assert.assertEquals(2, strings.size());
        strings.push("or");  Assert.assertEquals(3, strings.size());
        strings.push("not"); Assert.assertEquals(4, strings.size());
        strings.push("to");  Assert.assertEquals(5, strings.size());

        Assert.assertEquals("to", strings.pop()); Assert.assertEquals(4, strings.size());

        strings.push("be");  Assert.assertEquals(5, strings.size());

        Assert.assertEquals("be", strings.pop()); Assert.assertEquals(4, strings.size());
        Assert.assertEquals("not", strings.pop()); Assert.assertEquals(3, strings.size());

        strings.push("that");  Assert.assertEquals(4, strings.size());

        Assert.assertEquals("that", strings.pop()); Assert.assertEquals(3, strings.size());
        Assert.assertEquals("or", strings.pop()); Assert.assertEquals(2, strings.size());
        Assert.assertEquals("be", strings.pop()); Assert.assertEquals(1, strings.size());

        strings.push("is");  Assert.assertEquals(2, strings.size());

        Assert.assertEquals("is", strings.pop()); Assert.assertEquals(1, strings.size());
        Assert.assertEquals("to", strings.pop()); Assert.assertEquals(0, strings.size());
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

        int index = 5;
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            Assert.assertEquals(data[--index], iterator.next());
        }
    }
}
