package fundamentals;

import java.util.Iterator;

public class Queue<Item> implements Iterable<Item> {

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
    }

    /**
     * Remove the least recently added item
     *
     * @return item to be removed
     */
    public Item dequeue() {
        return null;
    }

    /**
     * Is the queue empty?
     * @return true if queue is empty
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * number of items in the queuea
     * @return number of items
     */
    public int size() {
        return 0;
    }

    /**
     * Returns an iterator
     * @return an iterator
     */
    @Override
    public Iterator<Item> iterator() {
        return null;
    }
}
