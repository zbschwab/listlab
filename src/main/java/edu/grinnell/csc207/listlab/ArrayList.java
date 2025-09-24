package edu.grinnell.csc207.listlab;

/**
 * An array-based implementation of the list ADT.
 */
public class ArrayList {
    private int[] arrlist;
    private int size;

    public ArrayList () {
        this.arrlist = new int[10];
        this.size = 0;
    }

    /**
     * Adds <code>value</code> to the end of the list
     * 
     * @param value the value to add to the end of the list
     */
    public void add(int value) {
        if (size == arrlist.length) {
            int[] arr = new int[size * 2];
            System.arraycopy(arrlist, 0, arr, 0, size);
            arrlist = arr;
        }
        arrlist[size] = value;
        size++;
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
        return arrlist[index];
    }

    /**
     * Removes the value at <code>index</code> from the list
     * 
     * @param index the index of the element to remove
     * @return the element at <code>index</code>
     */
    public int remove(int index) {
        int temp = arrlist[index];
        arrlist[index] = 0;
        System.arraycopy(arrlist, index+1, arrlist, index, arrlist.length-index-1);
        size--;

        return temp;
    }
}
