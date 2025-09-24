public class LinkedList {
    
    private static class Node {
        int value;
        Node next;

        public Node(int value, Node next) {
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
        if (first == null) {
            first = new Node(value, null);
        } else {
            Node cur = first;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = new Node(value, null);
        }
    }

    /**
     * @return the number of elements in the list
     */
    public int size() {
        if (first == null) {
            return 0;
        } else {
            int counter = 0;
            Node cur = first;
            while (cur.next != null) {
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
        if (first == null) {
            throw IllegalArgumentException();
        }
        Node cur = first;
        for (int i = 0; i <= index; i++) {
            cur = cur.next;
        }
        return cur.value;
    }

    /**
     * Removes the value at <code>index</code> from the list
     * 
     * @param index the index of the element to remove
     * @return the element at <code>index</code>
     */
    public int remove(int index) {
        if (first == null) {
            throw IllegalArgumentException();
        }
        Node prev = first;
        Node cur = prev.next;
        for (int i = 0; i < index; i++) {
            prev = cur;
            cur = cur.next;
        }
        prev.next = cur.next;
        return cur.value;    
    }
}

