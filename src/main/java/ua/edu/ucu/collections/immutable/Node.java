package ua.edu.ucu.collections.immutable;

public class Node {
    private Object val;
    private Node next;

    public Node(Object val){
        this.val = val;
        this.next = null;
    }

    public Object getVal() {
        return val;
    }

    public void setVal(Object val) {
        this.val = val;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setNext(Object next) {
        this.next = new Node(next);
    }
}
