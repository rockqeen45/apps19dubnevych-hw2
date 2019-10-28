package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Stack {
    private ImmutableLinkedList linkS;

    public Stack(){
        this.linkS = new ImmutableLinkedList();
    }

    public Object peek() {
        return linkS.getLast();
    }

    public Object pop() {
        Object last = linkS.getLast();
        linkS = linkS.removeLast();
        return last;
    }

    public void push(Object e) {
        linkS = linkS.addLast(e);
    }
}
