package edu.grinnell.csc207.listlab;

import java.util.Arrays;

/**
 * An array-based implementation of the list ADT.
 */
public class ArrayList {
    private int[] arrlist;
    private int size = 0;

    public ArrayList () {
        this.arrlist = new int[10];
        this.size = arrlist.length;
    }
    
    /**
     * Adds <code>value</code> to the end of the list
     * 
     * @param value the value to add to the end of the list
     */
    public void add(int value) {
        if (size == arrlist.length) {
            arrlist = Arrays.copyOf(arrlist, arrlist.length * 2);
        }
        arrlist[size] = value;
    }

    /**
     * @return the number of elements in the list
     */
    public int size() {
        
        return size;
    }

    /**
     * @param index the index of the element to retrieve
     * @return the value at the specified <code>index</code>
     */
    public int get(int index) {
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    /**
     * Removes the value at <code>index</code> from the list
     * 
     * @param index the index of the element to remove
     * @return the element at <code>index</code>
     */
    public int remove(int index) {
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }
}
