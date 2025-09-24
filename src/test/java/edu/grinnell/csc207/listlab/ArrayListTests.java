package edu.grinnell.csc207.listlab;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.constraints.IntRange;

public class ArrayListTests {
    @Test
    public void emptyListTest() {
        ArrayList list = new ArrayList();
        assertEquals(0, list.size());
    }

    @Test
    public void listAddSize10() {
        ArrayList list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        assertEquals(10, list.size());
    }

    @Test
    public void listGetIndex10() {
        ArrayList list = new ArrayList();
        for (int i = 0; i < 4; i++) {
            list.add(i);
        }
        assertEquals(1, list.get(1));
    }

    @Test
    public void listRemoveLast() {
        ArrayList list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        assertEquals(3, list.remove(3));
    }

    @Property
    public boolean listAddSize(@ForAll @IntRange(min = 0, max = 1000) int sz) {
        ArrayList list = new ArrayList();
        for (int i = 0; i < sz; i++) {
            list.add(i);
        }
        return list.size() == sz;
    }

    @Property
    public boolean listRemove1(@ForAll @IntRange(min = 0, max = 1000) int sz) {
        ArrayList list = new ArrayList();
        for (int i = 0; i < sz; i++) {
            list.add(i);
        }
        list.remove(1);
        return list.size() == (sz-1);
    }
}
