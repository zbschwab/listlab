package edu.grinnell.csc207.listlab;

/**
 * A linked implementation of the list ADT.
 */
public class LinkedList {
    private static class Node {
        int value;
        Node next;
        public Node (int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node first;

    public LinkedList() {
        first = null; 
    }
    /**
     * Adds <code>value</code> to the end of the list
     * 
     * @param value the value to add to the end of the list
     */
    public void add(int value) {
        Node first = new Node(value, null);
        Node cur = first.next;
        while (cur != null) {

        }
    }

    /**
     * @return the number of elements in the list
     */
    public int size() {
        throw new UnsupportedOperationException("Unimplemented method 'size'");
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
