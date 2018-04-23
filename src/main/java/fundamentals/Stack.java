package fundamentals;

import java.util.Iterator;

public class Stack<Item> implements Iterable<Item> {

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

    }

    /**
     * remove the most recently added item
     * @return item removed
     */
    public Item pop() {
        return null;
    }

    /**
     * Is the stack empty?
     * @return true if the stack is empty
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * Number of items in the stack
     *
     * @return items in the stack
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