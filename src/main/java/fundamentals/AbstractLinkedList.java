package fundamentals;

import java.util.Iterator;

public abstract class AbstractLinkedList<Item> {

    public abstract Iterator<Item> iterator();

    public abstract int size();

    /**
     * Is the bag empty?
     * @return true if the stack is empty
     */
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * Copied from AbstractCollection
     * @return representation of the collection in a string
     */
    @Override
    public String toString() {
        Iterator<Item> it = iterator();
        if (! it.hasNext())
            return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (;;) {
            Item e = it.next();
            sb.append(e == this ? "(this Collection)" : e);
            if (! it.hasNext())
                return sb.append(']').toString();
            sb.append(',').append(' ');
        }
    }
}
