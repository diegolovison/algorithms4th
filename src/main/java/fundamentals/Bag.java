package fundamentals;

import java.util.Iterator;

public class Bag<Item> implements Iterable<Item> {

    /**
     * Create an empty bag
     */
    public Bag() {
    }

    /**
     * Add an item
     * @param item an item
     */
    public void add(Item item) {
    }

    /**
     * Is the bag empty?
     * @return true if the stack is empty
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * Number of items in the bag
     *
     * @return number of items in the bag
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
