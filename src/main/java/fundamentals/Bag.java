package fundamentals;

import java.io.Serializable;
import java.util.Iterator;

/**
 * LIFO order, but the order is not relevant
 * @param <Item>
 */
public class Bag<Item> extends AbstractLinkedList<Item> implements Iterable<Item>, Serializable {

    private ListIterator.Node<Item> first;
    private int size;

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
        ListIterator.Node<Item> oldFirst = first;
        first = new ListIterator.Node<>();
        first.item = item;
        first.next = oldFirst;
        size++;
    }

    /**
     * Number of items in the bag
     *
     * @return number of items in the bag
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Returns an iterator
     * @return an iterator
     */
    @Override
    public Iterator<Item> iterator() {
        return new ListIterator<>(first);
    }
}
