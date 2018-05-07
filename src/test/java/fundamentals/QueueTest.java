package fundamentals;

import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

public class QueueTest {

    @Test
    public void test_tobe() {
        Queue<String> strings = new Queue<>();
        strings.enqueue("to");  Assert.assertEquals(1, strings.size());
        strings.enqueue("be");  Assert.assertEquals(2, strings.size());
        strings.enqueue("or");  Assert.assertEquals(3, strings.size());
        strings.enqueue("not");  Assert.assertEquals(4, strings.size());
        strings.enqueue("to");  Assert.assertEquals(5, strings.size());

        Assert.assertEquals("to", strings.dequeue()); Assert.assertEquals(4, strings.size());

        strings.enqueue("be");  Assert.assertEquals(5, strings.size());

        Assert.assertEquals("be", strings.dequeue()); Assert.assertEquals(4, strings.size());
        Assert.assertEquals("or", strings.dequeue()); Assert.assertEquals(3, strings.size());

        strings.enqueue("that");  Assert.assertEquals(4, strings.size());

        Assert.assertEquals("not", strings.dequeue()); Assert.assertEquals(3, strings.size());
        Assert.assertEquals("to", strings.dequeue()); Assert.assertEquals(2, strings.size());
        Assert.assertEquals("be", strings.dequeue()); Assert.assertEquals(1, strings.size());

        strings.enqueue("is");  Assert.assertEquals(2, strings.size());

        Assert.assertEquals("that", strings.dequeue()); Assert.assertEquals(1, strings.size());
        Assert.assertEquals("is", strings.dequeue()); Assert.assertEquals(0, strings.size());
    }

    @Test
    public void test_fifo_order() {
        String[] data = new String[]{"to", "be", "or", "not", "to"};
        Queue<String> strings = new Queue<>();
        strings.enqueue(data[0]);
        strings.enqueue(data[1]);
        strings.enqueue(data[2]);
        strings.enqueue(data[3]);
        strings.enqueue(data[4]);

        int index = 0;
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            Assert.assertEquals(data[index++], iterator.next());
        }
    }
}
