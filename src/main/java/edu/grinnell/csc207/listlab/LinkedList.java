package edu.grinnell.csc207.listlab;

/**
 * A linked implementation of the list ADT.
 */
public class LinkedList {
    public static class Node {
        public int value;
        public Node next;
        public Node (int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
    private Node first;

    // public LinkedList() {
    //     first = null;
    // }

    /**
     * Adds <code>value</code> to the end of the list
     * 
     * @param value the value to add to the end of the list
     */
    public void add(int value) {
        if (first == null){
            first = new Node (value, null);
        } else {
            Node cur = first;
            while (cur.next != null){
                cur = cur.next;
            }
            cur.next = new Node (value, null);
        }
    }

    /**
     * @return the number of elements in the list
     */
    public int size() {
        if (first == null){
            return 0;
        } else {
            int counter = 0;
            Node cur = first;
            while (cur != null){
                cur = cur.next;
                counter++;
            }
            return counter;
        }
    }

    /**
     * @param index the index of the element to retrieve
     * @return the value at the specified <code>index</code>
     */
    public int get(int index) {
        if (first == null){
            throw new IllegalArgumentException();
        } else {
            Node cur = first;
            for (int i =0; i < index; i++){
                cur = cur.next;
            }
            return cur.value;
        }
    }

    /**
     * Removes the value at <code>index</code> from the list
     * 
     * @param index the index of the element to remove
     * @return the element at <code>index</code>
     */
    public int remove(int index) {
        if (first == null){
            throw new IllegalArgumentException();
        } else if (index == 0){
            int val = first.value;
            first = first.next;
            return val;
        } else {
            Node cur = first;
            for (int i = 0; i < index - 1; i++){
                cur = cur.next;
            }
            int val = cur.next.value;
            cur.next = cur.next.next;
            return val;

        }
    }
}
