package fundamentals;

import java.io.Serializable;
import java.util.Iterator;

/**
 * LIFO order
 * @param <Item>
 */
public class Stack<Item> implements Iterable<Item>, Serializable {

    private ListIterator.Node<Item> first;
    private int size;

    /**
     * Create an empty stack
     */
    public Stack() {

    }

    /**
     * Add an item
     * @param item an item
     */
    public void push(Item item) {
        ListIterator.Node<Item> oldFirst = first;
        first = new ListIterator.Node<>();
        first.item = item;
        first.next = oldFirst;
        size++;
    }

    /**
     * remove the most recently added item
     * @return item removed
     */
    public Item pop() {
        Item item = first.item;
        first = first.next;
        size--;
        return item;
    }

    /**
     * Is the stack empty?
     * @return true if the stack is empty
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Number of items in the stack
     *
     * @return items in the stack
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
        return new ListIterator<>(first);
    }
}