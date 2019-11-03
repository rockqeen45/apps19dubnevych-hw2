package ua.edu.ucu.collections.immutable;

public class Node {
    private Object val;
    private Node next;

    public Node(Object val) {
        this.val = val;
        this.next = null;
    }

    public Object getVal() {
        return val;
    }

    public void setVal(Object value) {
        this.val = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next_n) {
        this.next = next_n;
    }

    public void setNext(Object next_n) {
        this.next = new Node(next_n);
    }
}
