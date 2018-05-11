package fundamentals;

import java.io.Serializable;
import java.util.Iterator;

public class ListIterator<Item> implements Iterator<Item> {

    private Node<Item> current;

    public ListIterator(Node<Item> item) {
        this.current = item;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public Item next() {
        Item item = current.item;
        current = current.next;
        return item;
    }

    static class Node<Item> implements Serializable {
        Item item;
        Node<Item> next;
    }
}
