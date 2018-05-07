package fundamentals;

import java.util.Iterator;

/**
 * FIFO order
 *
 * @param <Item>
 */
public class Queue<Item> implements Iterable<Item> {

    private ListIterator.Node<Item> first;
    private ListIterator.Node<Item> last;
    private int size;

    /**
     * Create an empty queue
     */
    public Queue() {
    }

    /**
     * Add an item
     *
     * @param item an item
     */
    public void enqueue(Item item) {
        ListIterator.Node<Item> oldLast = last;
        last = new ListIterator.Node<>();
        last.item = item;
        last.next = null;
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
        size++;
    }

    /**
     * Remove the least recently added item
     *
     * @return item to be removed
     */
    public Item dequeue() {
        Item item = first.item;
        first = first.next;
        if (isEmpty()) last = null;
        size--;
        return item;
    }

    /**
     * Is the queue empty?
     * @return true if queue is empty
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * number of items in the queuea
     * @return number of items
     */
    public int size() {
        return size;
    }

    /**
     * Returns an iterator
     * @return an iterator
     */
    @Override
    public Iterator<Item> iterator() {
        return new ListIterator<>(last);
    }
}
